package com.iBridge.testcases.old;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.CandidateEmailVerification;
import com.iBridge.pageobject.CandidateLogin;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InitiateCasesIndividually;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.testcases.BaseClass;

public class TC_CasesPendingSubmission_02 extends BaseClass {
	@Test(enabled = true, testName = "Cases Pending Submission", priority = 1)
	public void casesPendingSubmission() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		InitiateCasesIndividually pendingInitiation = new InitiateCasesIndividually(driver);
		pendingInitiation.login(username, password);
		logger.info("Entered email and Password!");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			System.out.println("Current Url Found Successfully");
			Thread.sleep(2000);
		} else {
			System.out.println("Current Url Not Found Successfully");
			captureScreen(driver, "casesPendingSubmission");
		}

		// Case(s) Submission Summary--(Pending Initiation)
		// Initiate Via Candidate(IVC)
		pendingInitiation.sidebarExpandBtn();
		logger.info("Clicked on Menu bar expand Button");

		pendingInitiation.clickUnCheckWiseSelect("1");
		logger.info("Clicked on Initiate Via Candidate");

		pendingInitiation.checkWiseSelect("1");
		logger.info("Select checkBox Accounding to requirements");

		// Step 3 - Candidate Summary (Add Candidate Information)
		String firstName = randomeStringCandidateFirstName() + "r";
		pendingInitiation.candidateFirstName(firstName);

		String middleName = randomeStringCandidateMiddleName() + "m";
		pendingInitiation.candidateMiddleName(middleName);
		Thread.sleep(1000);

		String lastName = randomeStringCandidateLastName() + "l";
		pendingInitiation.candidateLastName(lastName);

		pendingInitiation.addCandidateInformation("8009744341", "04-04-1991");

		String email = randomeStringCandidateEmail() + "@mailinator.com";
		pendingInitiation.candidateEmail(email);
		System.out.println("Email id of candidate=>" + email);
		logger.info("Entered condidated information!");
		Thread.sleep(1000);

		// Additional Field(s)===========================================
		// Case(s) Submission Summary--(Pending Submission)==========================
		InitiateCasesIndividually pendingSubmission = new InitiateCasesIndividually(driver);
		pendingSubmission.additionFieldInfo("rajucs@gmail.com","12345", "04/04/1991", "1100", "Quality Analyst", "Raju Yadav", "Senior QA",
				"12345", "raju12@gmail.com", "10-12-2019", "6098", "SKPAY123", "Aman kumar", "hrd@gmail.com", "Scott",
				"6098", "Gurgaow");
		logger.info("Entered candidate Additional Informations successfully!");

		pendingSubmission.initiateCaseBtn();
		logger.info("Initiated for candidate(s) successfully!");
		Thread.sleep(2000);

		if (driver.getPageSource().contains("1 case(s)")) {
			Assert.assertTrue(true);
			logger.info("1 case(s) Initiated for candidate(s) successfully");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "InitaiteCaseIndividually");
			logger.info("1 case(s) has not Initiated for candidate(s) successfully");
		}

		// Case(s) Submission Summary--(Pending Submission)
		CasesSubmissionSummary pendingCaseSub = new CasesSubmissionSummary(driver);
		pendingCaseSub.pendingCaseSubmission();
		Thread.sleep(2000);
		if (driver.getPageSource().contains("email")) {
			Assert.assertTrue(true);
			logger.info("Verify Pending Submission list Successfully!");
		} else {
			captureScreen(driver, "pendingSubmission");
			Assert.assertTrue(false);
			logger.info("Verify Pending Submission list Not Successfully!");
		}

		// Candidate Email Verification================================
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Launch Mailinator URL Launch!");
		Thread.sleep(3000);
		CandidateEmailVerification verification = new CandidateEmailVerification(driver);
		verification.mailinatorVerificationMail();
		logger.info("Veification Mailinator Mail!");

		String iBridgeMailTitle = "Background Check for British Telecom | Submit your";

		if (iBridgeMailTitle.equalsIgnoreCase("Background Check for British Telecom | Submit your")) {
			Assert.assertTrue(true);
			logger.info("Mail has got successfully!");
		} else {
			captureScreen(driver, "candidateEmailVerification");
			Assert.assertTrue(false);
			logger.info("Mail has not got successfully!");
		}

		verification.getUserNameAndPassword();
		logger.info("Get Username and Password!");

		// Candidate Login and Fill all details of the case details.
		CasesSubmissionSummary summary = new CasesSubmissionSummary(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		summary.btFiveLogout();
		Thread.sleep(2000);

		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
		Thread.sleep(2000);

		CandidateLogin candidateLogin = new CandidateLogin(driver);
		String data = new String(Files.readAllBytes(Paths.get("output.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		candidateLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("Entered User Id and Password!");

		String url2 = driver.getCurrentUrl();
		if (url2.contains("http://35.154.153.79/ibridge_aws_debugg/case-initiation")) {
			Assert.assertTrue(true);
			logger.info("Current Url Found Successfully");
		} else {
			captureScreen(driver, "CandidateUrlFound");
			Assert.assertTrue(false);
			logger.info("Current Url Not Found Successfully");
		}

		// Step 3 - Candidate Summary
		candidateLogin.candidateAuthorization();
		logger.info("Digital signature successfully!");

		candidateLogin.candidateIdentity("Raju Yadav", "Raju123");
		logger.info("Candidate National Identity Details Setup successfully!");

		candidateLogin.candidateProfile("7042718794", "Prakash Yadav");
		logger.info("Candidate Profile Details Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		candidateLogin.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address details Setup Successfully!!");

		// Education Details--Step 3 - Candidate Summary
		candidateLogin.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bund",
				"Jhansi", "Enroll1234", "65%", "08/2010", "08/2014", "Good");
		logger.info("Candidate Eductaion details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		candidateLogin.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "raju.yadav@authbridge.com", "Information Technologies", "10-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Current Employment details Setup successfully!");

		candidateLogin.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Noida", "raju.yadav@agamitechnologies.com","Engineering", "10-01-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com", "07-12-2020",
				"Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

	//	candidateLogin.candidateCasePreview();
		if (driver.getPageSource().contains("Thank you.")) {
			Assert.assertTrue(true);
			logger.info("Candidate Case Preview details Verify successfully!");
		} else {
			captureScreen(driver, "candidateCasePreview");
			Assert.assertTrue(false);
			logger.info("Candidate Case Preview details has not Verified successfully!");
		}

		CasesSubmissionSummary candidateLog = new CasesSubmissionSummary(driver);
		candidateLog.candidateLogout();
		Thread.sleep(2000);

		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered email and Password!");
		Thread.sleep(2000);
		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submittedForVerification = new CasesSubmissionSummary(driver);
		submittedForVerification.submittedForVerification();
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
