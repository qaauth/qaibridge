package com.iBridge.testcases.old;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.InitiateCasesInBulk;
import com.iBridge.testcases.BaseClass;

public class TC_InitiateCasesInBulk_01 extends BaseClass {
	@Test(enabled = true, testName = "Intiate Cases In Bulk", priority = 1)
	public void intiateCasesInBulk() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		InitiateCasesInBulk iCasesInBulk = new InitiateCasesInBulk(driver);
		iCasesInBulk.login(username, password);
		logger.info("Entered email and Password!");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.contains("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			Assert.assertTrue(true);
			logger.info("Current Url Found Successfully!");

		} else {
			captureScreen(driver, "intiateCasesInBulk");
			Assert.assertTrue(false);
			logger.info("Current Url Not Found Successfully!");
		}

		// Initiate Via Candidate(IVC)--Bulk
		iCasesInBulk.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		iCasesInBulk.clickUnCheckWiseSelect("1");
		logger.info("Clicked on Initiate Via Candidate");

		iCasesInBulk.checkWiseSelect("1");
		logger.info("Select checkBox Accounding to requirements");

		// Update the value of cell of the Bulk upload format xls
		iCasesInBulk.updateCandidateRecords();
		logger.info("Candidate Records updated");

		// Drag & Drop file here or browse file to upload
		iCasesInBulk.browseFileToUpload(
				(System.getProperty("user.dir") + "/src/test/java/com/iBridge/testdata/bulk_upload_format.xls"));
		logger.info("Uploaded document successfully!");

		// Uploaded sheet data saved successfully
		iCasesInBulk.clickOnContinueBtn();
		logger.info("Clicked on countinue button");

		// Step 5 - Confirmation--2 Case(s) with missing mandatory information were found!
		iCasesInBulk.clickOnInitiateBtn();

		if (driver.getPageSource().contains("2 case(s)")) {
			Assert.assertTrue(true);
			logger.info("Case initiated message verify successfully!");
		} else {
			captureScreen(driver, "candidateCasePreview");
			Assert.assertTrue(false);
			logger.info("Case has not initiated successfully!");
		}
	}

}
