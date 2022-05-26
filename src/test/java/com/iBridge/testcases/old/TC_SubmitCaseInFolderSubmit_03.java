package com.iBridge.testcases.old;

import java.io.IOException;

import org.testng.annotations.Test;

import com.iBridge.pageobject.SubmitCaseInFolderSubmit;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_SubmitCaseInFolderSubmit_03 extends BaseClass {
	@Test(enabled = true, testName = "Submit Case In Folder Submit", priority = 1)
	public void submitCaseInFolderSubmit() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		
		SubmitCaseInFolderSubmit folderSubmit = new SubmitCaseInFolderSubmit(driver);
		folderSubmit.login(username, password);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("iBridge Url Successfully -Passed!");
		} else {
			captureScreen(driver, "submitCaseInFolderSubmit");
			logger.info("iBridge Url UnSuccessfully -Failed!");
		}

		// Do It Yourself(DIY)
		folderSubmit.sidebarExpandBtn();
		logger.info("Clicked on bar expand");
		
		// Folder Submit Form--Step 3 - Candidate Summary
		folderSubmit.folderCaseSubmit("Check","Bangalore",(System.getProperty("user.dir") + "/documents/Submit_Case_Folder.zip"));
		logger.info("Folder Case Submit Successfuly!");
		Thread.sleep(3000);

		if (driver.getPageSource().contains("1 case(s)")) {
			Assert.assertTrue(true);
			logger.info("Case Initiated Successfully Passed!");
		} else {
			captureScreen(driver, "submitCaseInFolderSubmit");
			logger.info("Case Initiated UnSuccessfully Failed!");
		}
	}

}
