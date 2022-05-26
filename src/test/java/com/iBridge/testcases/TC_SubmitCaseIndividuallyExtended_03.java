package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InitiateCaseIndividuallyExtended;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.SubmitCaseIndividually;
import com.iBridge.pageobject.SubmitCaseIndividuallyExtended;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.utilities.RandomStrings;

import junit.framework.Assert;

public class TC_SubmitCaseIndividuallyExtended_03 extends BaseClass {
	String firstName;
	String middleName;
    // Submit Case Individually Extended
	@Test(enabled = true, testName = "Submit Case Individually Extended", priority = 1)
	public void submitCaseIndividuallyExtended()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");

		LoginPage loginPage = new LoginPage(driver);
		if (loginPage.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}

		// Do It Yourself(DIY)--Extended
		SubmitCaseIndividually subCaseIndividually = new SubmitCaseIndividually(driver);
		subCaseIndividually.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		subCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");

		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Profile (Candidate Information)-- Step 3 - Candidate Summary
		firstName = RandomStrings.randomeStringCandidateFirstName();
		subCaseIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		subCaseIndividually.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		subCaseIndividually.candidateLastName(lastName);

		subCaseIndividually.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		subCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");

		submitCaseInExtended.uploadCvDocument((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Cv has been Uploaded Successfully!");

		subCaseIndividually.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA",
				"Raju Yadav", "CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123",
				"Amit Kumar", "hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		submitCaseInExtended.nationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"Raju123", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");
		
		// ADDRESS--Step 3 - Candidate Summary
		subCaseIndividually.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");

		// Education Details--Step 3 - Candidate Summary
		subCaseIndividually.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi",
				"Bund", "Jhansi", "Enroll1234", "65%", "08/2010", "06/2014", "Good");
		logger.info("Candidate Education details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		subCaseIndividually.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "Information Technologies", "01-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Current Employment details Setup successfully!");

		subCaseIndividually.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Noida", "Engineering", "10-01-2018", "20-12-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

		// inCaseInExtended.educationToEmploymentGap("Preparation for the entrance
		// examination");
		logger.info("Filled Education To Employment Gap and clicked On Submit Button!");

		// PROFESSIONAL REFERENCE--Professional Reference Check
		submitCaseInExtended.professionalReference("Krishna Kumar", "Senior QA", "8009744341", "krishnaKant@gmail.com",
				"Abhishek Kumar", "Project Manager", "7042718794", "abhishekKumar@gmail.com");
		logger.info("Professional Reference1 and Reference2 has Setup Successfully!");

		if (submitCaseInExtended.verifyInitiateCaseThankYouMsg().contains("THANK YOU!")) {
			Assert.assertTrue(true);
			logger.info("Candidate profile has been submitted for verification.!");
		} else {
			logger.info("Candidate profile has not been submitted for verification.!");
			captureScreen(driver, "verifyInitiateCaseThankYouMsg");
			Assert.assertTrue(false);
		}
	}

	// Case(s) Submission Summary--(Submitted for Verification)
	@Test(enabled = true, testName = "Submitted For Verification", priority = 2, dependsOnMethods = {
			"submitCaseIndividuallyExtended" })
	public void submittedForVerification() throws InterruptedException, IOException {
		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submissionSum = new CasesSubmissionSummary(driver);
		submissionSum.submittedForVerification();

		if (submissionSum.submittedForVerificationCandidateFname().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Candidate First Name 'Case Submitted For Verification list' has Verified Successfully!");
		} else {
			logger.info("Candidate First Name 'Case Submitted For Verification list' has not Verified Successfully!");
			captureScreen(driver, "submittedForVerificationFname");
			Assert.assertTrue(false);
		}
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Submitted Cases Tracker Wip", priority = 3, dependsOnMethods = {
			"submittedForVerification" })
	public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
		// (WIP Cases)--Submitted Case(s) Tracker
		SubmittedCasesTracker caseTrackerWip = new SubmittedCasesTracker(driver);
		caseTrackerWip.submittedCasesTrackerWipCases(firstName,middleName);
		logger.info("ARS number print successfully");

		SubmittedCasesTracker candidateFname = new SubmittedCasesTracker(driver);
		if (candidateFname.getCandidateFName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("WIP Candidate First name Has Verified Successfully!");
		} else {
			logger.info("WIP Candidate First name Has not Verified Successfully!");
			captureScreen(driver, "getCandidateFName");
			Assert.assertTrue(false);
		}
	}

	// Verify Ars Number by login Bridge Account
	@Test(enabled = true, testName = "Search Client Ars Number Case List", priority = 4, dependsOnMethods = {
			"submittedCasesTrackerWipCases" })
	public void searchClientArsNoCaseList() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account Logged successfully!");

		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		bridgeLogin.arsNumberSearch(arsNumber[2]);
		logger.info("Client Case List shown successfully!");

		BridgeLoginPage verifyFnameInBridge = new BridgeLoginPage(driver);
		if (verifyFnameInBridge.verifyCandidateArsNumberInBridge().contains(arsNumber[2])) {
			Assert.assertTrue(true);
			logger.info("Candidate Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info("Candidate Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCandidateArsNumberInBridge");
			Assert.assertTrue(false);
		}
	}

	// Stop Case Close By Client--The case has been successfully marked as Closed By
	// (iBridge Portal)
	@Test(enabled = true, testName = "Verify Stop Case Close By Client", priority = 5, dependsOnMethods = {
			"searchClientArsNoCaseList" })
	public void verifyStopCaseCloseByClient() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("iBridge account Logged successfully!");

		SubmittedCasesTracker stopCaseCloseByClient = new SubmittedCasesTracker(driver);
		stopCaseCloseByClient.submittedCasesTrackerWipCases(firstName,middleName);
		logger.info("Candidate name had shown Successfully!");

		stopCaseCloseByClient.stopCaseCloseByClient("Background verification is not required");
		logger.info("Stop Case has been done by Close By Client Successfully");

		if (stopCaseCloseByClient.verifySuccessfullyMarkedAsClosedByMsg()
				.contains("The case has been successfully marked as Closed By Client")) {
			Assert.assertTrue(true);
			logger.info("The case has been successfully marked as Closed By!");
		} else {
			logger.info("The case has Not been successfully marked as Closed By!");
			captureScreen(driver, "verifySuccessfullyMarkedAsClosedByMsg");
			Assert.assertTrue(false);
		}

		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		stopCaseCloseByClient.currentStatusSearchResult(arsNumber[2]);
		logger.info("Candidate Case has been Stopped Sucessfully!");

		if (stopCaseCloseByClient.verifyCurrentStatusMsg().contains("Current Status: Closed by Client")) {
			Assert.assertTrue(true);
			logger.info("Current Status: Closed by Client has shown Successfully!");
		} else {
			logger.info("Current Status: Closed by Client has not shown Successfully!");
			captureScreen(driver, "verifyCurrentStatusMsg");
			Assert.assertTrue(false);
		}
	}
}
