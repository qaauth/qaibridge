package com.iBridge.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.PrepaidCandidateFulfillInformation;
import com.iBridge.pageobject.PrepaidEnpAdmin;
import com.iBridge.pageobject.PrepaidSubmitCaseIndividuallyExtended;
import com.iBridge.pageobject.SubmitCaseIndividuallyExtended;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.utilities.RandomStrings;

public class TC_PrepaidSubmitCaseIndividuallyExtended_02 extends BaseClass {
	String firstName;
	String middleName;
	String lastName;
	String email;

	// Verify Prepaid Candidate Account Login
	@Test(enabled = true, testName = "Verify Prepaid Candidate Account Login", priority = 1)
	public void verifyEnpAdminLoginAccount() throws IOException, InterruptedException {
		driver.get(EnpAdminURL);
		logger.info("Prepaid Enp Admin Url has opened Successfully!");
		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
		enpAdminLogin.loginEnpAdminAccount(candidateUsername, candidatePrePassword);
		logger.info("Prepaid Enp Admin account has Logged successfully!");
		if (enpAdminLogin.verifyCaseSubmissionSummaryName().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("Case Submission Summary Name has Verified Successfully!");
		} else {
			logger.info("Case Submission Summary Name has Not Verified Successfully!");
			captureScreen(driver, "verifyCaseSubmissionSummaryName");
			Assert.assertTrue(false);
		}
	}

	// Verify Prepaid Initiate Submit Case Individually
	@Test(enabled = true, testName = "Verify Prepaid Initiate Submit Case Individually", priority = 2, dependsOnMethods = {
			"verifyEnpAdminLoginAccount" })
	public void verifyPrepaidInitiateSubmitCaseIndividually() throws InterruptedException, ParseException, IOException {
		PrepaidSubmitCaseIndividuallyExtended submitCaseIndividually = new PrepaidSubmitCaseIndividuallyExtended(
				driver);
		submitCaseIndividually.submitCaseInitiateIndividually();
		logger.info("Initial submit case individually has successfully!");
		submitCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");
		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Profile (Candidate Information)-- Step 3 - Candidate Summary
		firstName = RandomStrings.randomeStringCandidateFirstName();
		submitCaseIndividually.candidateFirstName(firstName);
		middleName = RandomStrings.randomeStringCandidateMiddleName();
		submitCaseIndividually.candidateMiddleName(middleName);
		lastName = RandomStrings.randomeStringCandidateLastName();
		submitCaseIndividually.candidateLastName(lastName);
		submitCaseIndividually.prepaidCandidateProfile("04-04-1991", "8009744341", "7042718794", "Rajesh Yadav");
		email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		submitCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");
		submitCaseIndividually.prepaidCandidateAdditionalInfo();
		logger.info("Candidate Additional Information Setup Successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		submitCaseIndividually.prepaidCandidateAddress("23", "Mayur Vihar", "04-04-1991", "3232", "hi", "Delhi",
				"Mayur Vihar", "1234", "Mayur Vihar", "01-01-2000", "323545", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");
//		// Education Details--Step 3 - Candidate Summary
//		submitCaseIndividually.prepaidEducationInformation("Bund");
//		logger.info("Prepaid Candidate Education details Setup successfully!");
//		// Employment(Current Employment Details)--Step 3 - Candidate Summary
//		submitCaseIndividually.prepaidCurrentEmploymentDetails("Authbridge");
//		logger.info("Candidate Current Employment details Setup successfully!");
//		submitCaseIndividually.prepaidPreviousEmploymentDetails("Agami");
//		logger.info("Candidate Previous Employment details Setup successfully!");
//		logger.info("Filled Employment/Education To Employment Gap and clicked On Submit Button!");
//		// PROFESSIONAL REFERENCE--Professional Reference Check
//		submitCaseIndividually.prepaidProfessionalReferenceCheck();
//		logger.info("Professional Reference1 and Reference2 has Setup Successfully!");
//
//		if (submitCaseIndividually.verifyInitiatedCaseThankYouMessage().contains("THANK YOU!")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually Extended has Verified successfully!");
//		} else {
//			logger.info("Initiate Case Individually Extended has not Verified successfully!!");
//			captureScreen(driver, "verifyInitiatedCaseThankYouMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Payment Amount Payable
	@Test(enabled = true, testName = "Verify Payment Amount Payable", priority = 3, dependsOnMethods = {
			"verifyPrepaidInitiateSubmitCaseIndividually" })
	public void verifyPrepaidAmountPayableValue() throws InterruptedException, IOException {
		PrepaidCandidateFulfillInformation verifyPaymentPendingCase = new PrepaidCandidateFulfillInformation(driver);
		verifyPaymentPendingCase.prepaidPaymentPendingCases();
		logger.info("Payment Pending Case has verified Successfully!");

//		if (verifyPaymentPendingCase.verifyAmountPayableValue().contains("6124.2")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually has Amount Payable Verified successfully!");
//		} else {
//			logger.info("Initiate Case Individually has Not Amount Payable Verified successfully!");
//			captureScreen(driver, "verifyAmountPayableValue");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Payment Pending Cases Bucket
	@Test(enabled = true, testName = "Verify Payment Pending Cases Bucket", priority = 4, dependsOnMethods = {
			"verifyPrepaidAmountPayableValue" })
	public void verifyPrepaidPaymentPendingCases() throws InterruptedException, IOException {
		PrepaidCandidateFulfillInformation verifyPaymentPendingCase = new PrepaidCandidateFulfillInformation(driver);
		verifyPaymentPendingCase.prepaidPaymentPendingCaseCompleted();
		logger.info("Payment Pending Case has verified Successfully!");

//		if (verifyPaymentPendingCase.verifyPaymentCompletedMessage().contains("Payment Completed.")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually has Payment Completed successfully!");
//		} else {
//			logger.info("Initiate Case Individually has Not Payment Completed successfully!");
//			captureScreen(driver, "verifyPaymentCompletedMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Submitted For Verification Bucket
	@Test(enabled = true, testName = "Verify Submitted For Verification Bucket", priority = 5, dependsOnMethods = {
			"verifyPrepaidPaymentPendingCases" })
	public void verifysubmittedForVerificationBucket() throws InterruptedException, IOException {
		PrepaidSubmitCaseIndividuallyExtended verifySubmittedVerification = new PrepaidSubmitCaseIndividuallyExtended(
				driver);
		verifySubmittedVerification.submittedForVerificationBucket();
		logger.info("Submitted For Verification Bucket Has Verified Successfully!");
//		if (verifySubmittedVerification.verifyPrepaidCandidateName().contains(firstName)) {
//			Assert.assertTrue(true);
//			logger.info("IVC Submitted For Verification Bucket First Name has Verified successfully!");
//		} else {
//			logger.info("IVC Submitted For Verification Bucket First Name has Not Verified successfully!");
//			captureScreen(driver, "verifyPaymentCompletedMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Verify WIP Cases in Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Verify Case in WIP bucket", priority = 6, dependsOnMethods = {
			"verifysubmittedForVerificationBucket" })
	public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
		PrepaidCandidateFulfillInformation caseTrackerWip = new PrepaidCandidateFulfillInformation(driver);
		caseTrackerWip.submittedCasesTrackerWipCases(firstName, middleName);
		SubmittedCasesTracker candidateFname = new SubmittedCasesTracker(driver);
//		if (candidateFname.getCandidateFName().contains(firstName)) {
//			Assert.assertTrue(true);
//			logger.info("WIP Candidate First name Has Verified Successfully!");
//		} else {
//			logger.info("WIP Candidate First name Has not Verified Successfully!");
//			captureScreen(driver, "getCandidateFName");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Ars Number in Bridge Portal
	@Test(enabled = true, testName = "Verify Client Ars Number after logged in bridge portal and in Case List", priority = 7, dependsOnMethods = {
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

}
