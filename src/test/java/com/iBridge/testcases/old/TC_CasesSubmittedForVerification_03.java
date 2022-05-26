package com.iBridge.testcases.old;

import java.awt.AWTException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.SubmitCaseIndividually;
import com.iBridge.testcases.BaseClass;

public class TC_CasesSubmittedForVerification_03 extends BaseClass {
	@Test(enabled = true, testName = "Cases Submitted For Verification", priority = 1)
	public void casesSubmittedForVerification() throws IOException, InterruptedException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		Thread.sleep(2000);
		SubmitCaseIndividually diyLogin = new SubmitCaseIndividually(driver);
		diyLogin.login(username, password);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("Current Url Found Successfully!");
		} else {
			captureScreen(driver, "submitCaseIndividually");
			logger.info("Current Url Not Found Successfully!");
		}

		// Submit Case Individually --(DIY)=====================================
		CasesSubmissionSummary logout = new CasesSubmissionSummary(driver);
		logout.diyLogout();
		Thread.sleep(2000);
		logger.info("Bt Five Logout Successfully!");
		Thread.sleep(2000);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		Thread.sleep(2000);
		SubmitCaseIndividually diyLogin1 = new SubmitCaseIndividually(driver);
		diyLogin1.login(username, password);
		Thread.sleep(2000);
		String url4 = driver.getCurrentUrl();
		if (url4.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("Current Url Found Successfully!");
		} else {
			captureScreen(driver, "submitCaseIndividually");
			logger.info("Current Url Not Found Successfully!");
		}

		// Do It Yourself(DIY)
		diyLogin1.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		diyLogin1.clickUnCheckWiseSelect("1");
		logger.info("Clicked on Initiate Via Candidate");

		diyLogin1.checkWiseSelect("1");
		logger.info("Select checkBox Accounding to requirements");

		diyLogin1.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");

		diyLogin1.nationalIdentity("Aman Kumar", "Aman123");
		logger.info("Candidate National Identity Details Setup successfully!");

		// Profile (Candidate Information)-- Step 3 - Candidate Summary
		String firstName = randomeStringCandidateFirstName() + "r";
		diyLogin1.candidateFirstName(firstName);

		String middleName = randomeStringCandidateMiddleName() + "m";
		diyLogin1.candidateMiddleName(middleName);

		String lastName = randomeStringCandidateLastName() + "l";
		diyLogin1.candidateLastName(lastName);

		diyLogin1.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = randomeStringCandidateEmail() + "@mailinator.com";
		diyLogin1.setEmail(email);
		System.out.println("Email id of candidate=>" + email);
		logger.info("Candidate Information Setup Successfully!");

		diyLogin1.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA", "Raju Yadav",
				"CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123", "Amit Kumar",
				"hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		diyLogin1.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar", "1234",
				"Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");

		// Education Details--Step 3 - Candidate Summary
		diyLogin1.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bund",
				"Jhansi", "Enroll1234", "65%", "08/2010", "06/2014", "Good");
		logger.info("Candidate Eductaion details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		diyLogin1.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "Information Technologies", "01-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com",(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Employment details Setup successfully!");

		diyLogin1.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341", "Noida",
				"Engineering", "10-01-2018", "20-12-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com",(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				"Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

		diyLogin1.candidateCasePreview();
		Thread.sleep(3000);
		if (driver.getPageSource().contains("Thank You!")) {
			Assert.assertTrue(true);
			logger.info("Candidate profile has been submitted for verification.!");
		} else {
			captureScreen(driver, "CandidateCasePreview");
			Assert.assertTrue(false);
			logger.info("Candidate profile has not been submitted for verification.!");
		}
		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submissionSum = new CasesSubmissionSummary(driver);
		submissionSum.submittedForVerification();
		Thread.sleep(2000);
		if (driver.getPageSource().contains("email")) {
			Assert.assertTrue(true);
			logger.info("Verify Pending Submission list Successfully!");
		} else {
			captureScreen(driver, "submittedForVerification");
			Assert.assertTrue(false);
			logger.info("Verify Pending Submission list Not Successfully!");
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
		try {

			File output = new File("RandomMail.txt");
			FileWriter writer = new FileWriter(output);

			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (generateString);
	}

}
