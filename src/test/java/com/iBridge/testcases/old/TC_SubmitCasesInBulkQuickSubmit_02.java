package com.iBridge.testcases.old;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.iBridge.pageobject.SubmitCasesInBulkQuickSubmit;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_SubmitCasesInBulkQuickSubmit_02 extends BaseClass {

	@Test(enabled = true, testName = "Submit Cases In Bulk Quick Submit", priority = 1)
	public void submitCasesInBulkQuickSubmit() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		SubmitCasesInBulkQuickSubmit quickSubmit = new SubmitCasesInBulkQuickSubmit(driver);
		quickSubmit.login(username, password);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("iBridge Url Successfully -Passed!");
		} else {
			captureScreen(driver, "submitCasesInBulkQuickSubmit");
			logger.info("iBridge Url UnSuccessfully -Failed!");
		}

		// Do It Yourself(DIY)
		quickSubmit.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		// Step 3 - Candidate Summary (Add Candidate Information)
		String firstName = randomeStringCandidateFirstName() + "r";
		quickSubmit.candidateFirstName(firstName);

		String middleName = randomeStringCandidateMiddleName() + "m";
		quickSubmit.candidateMiddleName(middleName);

		String lastName = randomeStringCandidateLastName() + "l";
		quickSubmit.candidateLastName(lastName);

		String email = randomeStringCandidateEmail() + "@mailinator.com";
		quickSubmit.candidateEmail(email);
		System.out.println("Email id of candidate=>" + email);
		logger.info("Entered condidated information!");

		// Additional Field(s)===========================================
		quickSubmit.quickSubmitForm("04-04-1991", "8009744341", "1234", "04-05-2020", "08-11-2000", "10023",
				"Quality Analyst", "Anit", "2563", "Legal Entity", "bt@malinator.com", "03-12-1996", "12367",
				"ANFG1234", "Raju", "Raju@mailinator.com", "Larry", "AGM1234", "New Delhi");
		logger.info("Fill all the details of the candidate and Additional details!");

		quickSubmit.clickOnSaveBtn((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Browse Document Uploaded Successfully!!");

		if (driver.getPageSource().contains("1 case(s)")) {
			Assert.assertTrue(true);
			logger.info("Case initiated Successfully Passed!");
		} else {
			captureScreen(driver, "submitCasesInBulkQuickSubmit");
			logger.info("Case initiated UnSuccessfully Failed!");
		}
	}

	public String randomeStringCandidateFirstName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateMiddleName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateLastName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(6);
		return (generateString);
	}
}
