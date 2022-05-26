package com.iBridge.testcases.old;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.SubmitCaseInBulkExcelUpload;
import com.iBridge.testcases.BaseClass;

public class TC_SubmitCaseInBulkExcelUpload_01 extends BaseClass {
	@Test(enabled = true, testName = "Submit Case In Bulk Excel Upload", priority = 1)
	public void submitCaseInBulkExcelUpload() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		SubmitCaseInBulkExcelUpload submitCaseInBulkExcelUpload = new SubmitCaseInBulkExcelUpload(driver);
		submitCaseInBulkExcelUpload.login(username, password);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("iBridge Url Successfully -Passed!");
		} else {
			captureScreen(driver, "submitCaseInBulkExcelUpload");
			logger.info("iBridge Url UnSuccessfully -Failed!");
		}
		
		// Do It Yourself(DIY)
		submitCaseInBulkExcelUpload.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");
		
		// Option selection--(Excel Upload) (Submit cases in bulk using MS Excel consisting candidate info)
		submitCaseInBulkExcelUpload.submitExcelUploadBulk((System.getProperty("user.dir") + "/src/test/java/com/iBridge/testdata/bulk_upload_format_diy.xls"));
		logger.info("Submit Excel Uploaded Successfully!");
		
		submitCaseInBulkExcelUpload.previewUploadDocuments((System.getProperty("user.dir") + "/documents/ARN.pdf"), (System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Upload Documents Successfully!");
		Thread.sleep(2000);
		 if(driver.getPageSource().contains("2 case(s)")) {
			 Assert.assertTrue(true);
			 System.out.println("Successfully Passed!");
		 }else {
			 captureScreen(driver, "submitCaseInBulkExcelUpload");
			 Assert.assertTrue(false);
			 System.out.println("Successfully Not Passed!");
		 }
	}
	

}
