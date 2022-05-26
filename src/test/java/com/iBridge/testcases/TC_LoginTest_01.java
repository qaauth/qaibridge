package com.iBridge.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {
	@Test(enabled = true, testName = "Login Test", priority = 1)
	public void loginTest() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
		Thread.sleep(2000);
		if (login.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}
	}
}
