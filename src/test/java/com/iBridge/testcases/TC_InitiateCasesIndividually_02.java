package com.iBridge.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.iBridge.pageobject.InitiateCasesIndividually;

public class TC_InitiateCasesIndividually_02 extends BaseClass {
	@Test(priority=1)
	public void initiateCasesIndividually() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		InitiateCasesIndividually iCasesIndividually = new InitiateCasesIndividually(driver);
		iCasesIndividually.login(username, password);
		logger.info("Entered email and Password!");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			System.out.println("Current Url Found Successfully");
			Thread.sleep(2000);
		} else {
			System.out.println("Current Url Not Found Successfully");
			captureScreen(driver, "initiateCasesIndividually");
		}
	}

	// Initiate Via Candidate(IVC)
	@Test(priority=2)
	public void iViaCandidate() throws InterruptedException {
		InitiateCasesIndividually candidate = new InitiateCasesIndividually(driver);
		candidate.sidebarExpandBtn();
		logger.info("Clicked on bar expand");
		Thread.sleep(3000);
		//candidate.clickUnCheckWiseSelect();
		logger.info("Clicked on Initiate Via Candidate");
		Thread.sleep(2000);
	}

}
