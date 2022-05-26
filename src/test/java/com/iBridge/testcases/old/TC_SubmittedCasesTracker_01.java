package com.iBridge.testcases.old;

import java.io.IOException;

import org.testng.annotations.Test;

import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.testcases.BaseClass;

public class TC_SubmittedCasesTracker_01 extends BaseClass {
	@Test(enabled = true, testName = "Submitted Cases Tracker Wip", priority = 1)
	public void submittedCasesTracker() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);

		login.login(username, password);
		logger.info("Entered Username and password!");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("Current Url Found Successfully!");
		} else {
			captureScreen(driver, "loginTest");
			logger.info("Current Url Not Found Successfully!");
		}
		
		// (WIP Cases)--Submitted Case(s) Tracker 
		SubmittedCasesTracker caseTrackerWip = new SubmittedCasesTracker(driver);
		caseTrackerWip.submittedCasesTrackerWipCases("cscd dc vcd","sdsd dd wewe");
		logger.info("ARS number print successfully");
		Thread.sleep(3000);
		
	}

}
