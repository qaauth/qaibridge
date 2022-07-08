package com.iBridge.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.InitiateCasesIndividually;
import com.iBridge.pageobject.PrepaidCandidateEmailVerification;
import com.iBridge.pageobject.PrepaidCandidateFulfillInformation;
import com.iBridge.pageobject.PrepaidEnpAdmin;
import com.iBridge.pageobject.PrepaidInitiateNewCase;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.utilities.RandomStrings;

public class TC_PrepaidInitiateCaseIndividuallyExtended_01 extends BaseClass {
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
		/*if (enpAdminLogin.verifyCaseSubmissionSummaryName().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("Case Submission Summary Name has Verified Successfully!");
		} else {
			logger.info("Case Submission Summary Name has Not Verified Successfully!");
			captureScreen(driver, "verifyCaseSubmissionSummaryName");
			Assert.assertTrue(false);
		}*/
	}

	// Initiate Cases Individually
	@Test(enabled = true, testName = "Verify Initiate Cases Individually", priority = 2, dependsOnMethods = {
			"verifyEnpAdminLoginAccount" })
	public void verifyInitiateNewCaseForIvc() throws InterruptedException, IOException {
		PrepaidInitiateNewCase prepaidInNewCase = new PrepaidInitiateNewCase(driver);
		prepaidInNewCase.initiateNewCaseForIvc();
		logger.info("Initiate new case for Ivc has successfully!");
		prepaidInNewCase.selectPackageCheckWise();
		logger.info("Select the package or check(s) to initiate case(s) has successfully!");
		// Step 3 - Candidate Summary (Add Candidate Information)
		InitiateCasesIndividually iCasesIndividually = new InitiateCasesIndividually(driver);
		firstName = RandomStrings.randomeStringCandidateFirstName();
		iCasesIndividually.candidateFirstName(firstName);
		middleName = RandomStrings.randomeStringCandidateMiddleName();
		iCasesIndividually.candidateMiddleName(middleName);
		Thread.sleep(1000);
		String lastName = RandomStrings.randomeStringCandidateLastName();
		iCasesIndividually.candidateLastName(lastName);
		prepaidInNewCase.addCandidateInformation();
		logger.info("Candidate's DOB and mobile number Information have Added Successfully!");
		email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		iCasesIndividually.candidateEmail(email);
		logger.info("Entered Candidated information!");
		Thread.sleep(1000);

		// Additional Field(s)
		prepaidInNewCase.additionFieldInfo();
		logger.info("Additional Informations have Entered Successfully!");
		prepaidInNewCase.initiateCaseBtn();
		logger.info("Initiated for candidate(s) successfully!");
		Thread.sleep(2000);
		if (prepaidInNewCase.verifyCongratulationsMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("1 case(s) has Initiated for candidate(s) successfully!");
		} else {
			logger.info("1 case(s) has Not Initiated for candidate(s) successfully!");
			captureScreen(driver, "verifyCongratulationsMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Pending Case in Submission Verification Bucket
	@Test(enabled = true, testName = "Verify Pending Case in Submission Verification Bucket", priority = 2, dependsOnMethods = {
			"verifyInitiateNewCaseForIvc" })
	public void verifyPendingCaseSubmissionVerification() throws InterruptedException, IOException {
		PrepaidInitiateNewCase pendingSubBucket = new PrepaidInitiateNewCase(driver);
		pendingSubBucket.pendingSubmissionBucket();
		logger.info("Pending Submission Bucket has verified successfully!");
		if (pendingSubBucket.verifyPendingSubmissionBucket().contains(email)) {
			Assert.assertTrue(true);
			logger.info("Candidate Email Id 'Pending Submission list' has verified Successfully!");
		} else {
			logger.info("Candidate Email Id 'Pending Submission list' has Not verified Successfully!");
			captureScreen(driver, "pendingSubmission");
			Assert.assertTrue(false);
		}
	}

	// Candidate Email Verification and Get candidate username and password--
	// Mailinator.com
	@Test(enabled = true, testName = "Verify Candidate Email Verification", priority = 3, dependsOnMethods = {
			"verifyPendingCaseSubmissionVerification" })
	public void candidateEmailVerification() throws IOException, InterruptedException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		PrepaidCandidateEmailVerification verification = new PrepaidCandidateEmailVerification(driver);
		if (verification.verifyMailinatorMailSubject().contains("Pre-Joining Formalities for Delhivery Pvt. Ltd.")) {
			Assert.assertTrue(true);
			logger.info("Mailinator Mail Subject has got successfully!");
		} else {
			logger.info("Mailinator Mail Subject has Not got successfully!");
			captureScreen(driver, "verifyMailinatorMailSubject");
			Assert.assertTrue(false);
		}

		verification.mailinatorVerificationMail();
		logger.info("Mailinator Mail has Verified Successfully!");

		verification.getUserNameAndPassword();
		logger.info("Get Username and Password!");
	}

	// Verify Candidate fill in all information to complete the journey.
	@Test(enabled = true, testName = "Verify Candidate fill in all information to complete the journey.", priority = 4, dependsOnMethods = {
			"candidateEmailVerification" })
	public void verifyCandidateFullfillAllFormDetails() throws InterruptedException, ParseException, IOException {
		PrepaidEnpAdmin candidateLogout = new PrepaidEnpAdmin(driver);
		driver.get(EnpAdminURL);
		logger.info("Prepaid Candidate Url has opened Successfully");
		candidateLogout.verifyPrepaidCandidateLogout();
		logger.info("Prepaid Candidate Account has Logged Out Successfully");
		driver.get(candidatePrepaidUrl);
		logger.info("Prepaid Candidate Login Url Has opened Successfully");
		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
		String data = new String(Files.readAllBytes(Paths.get("output.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		enpAdminLogin.loginEnpAdminAccount(userAndPassword[0], userAndPassword[1]);
		logger.info("Entered User Id and Password!");
		PrepaidCandidateFulfillInformation candidateFulfillDetails = new PrepaidCandidateFulfillInformation(driver);
		if (candidateFulfillDetails.verifyDashboardCandidateSummaryText().contains("Step 3 - Candidate Summary")) {
			Assert.assertTrue(true);
			logger.info("Step 3 - Candidate Summary Text has Verified successfully!");
		} else {
			logger.info("Step 3 - Candidate Summary Text has Not Verified successfully!");
			captureScreen(driver, "verifyDashboardCandidateSummaryText");
			Assert.assertTrue(false);
		}

		// Step 3 - Candidate Summary
		candidateFulfillDetails.candidateAuthorization();
		logger.info("Prepaid Digital signature successfully!");
		candidateFulfillDetails.candidateProfile("7042718793", "Prakash Yadav");
		logger.info("Prepaid Candidate Profile Details Setup successfully!");

//		// ADDRESS--Step 3 - Candidate Summary
		candidateFulfillDetails.candidateAddress("23", "Mayur Vihar", "01-01-2022", "323233", "hi", "Delhi",
				"Mayur Vihar", "Delhi", "1234", "Mayur Vihar", "04-04-2020", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Prepaid Candidate Address details Setup Successfully!!");
//
//		// Education Details--Step 3 - Candidate Summary
//		candidateFulfillDetails.prepaidEducationInformation("Bund");
//		logger.info("Prepaid Candidate Education details Setup successfully!");
//
//		// Employment(Current Employment Details)--Step 3 - Candidate Summary
//		candidateFulfillDetails.prepaidCurrentEmploymentDetails("Authbridge");
//		logger.info("Candidate Current Employment details Setup successfully!");
//
//		candidateFulfillDetails.prepaidPreviousEmploymentDetails("Agami");
//		logger.info("Candidate Previous Employment details Setup successfully!");
//		logger.info("Filled Employment/Education To Employment Gap and clicked On Submit Button!");
//
//		// PROFESSIONAL REFERENCE--Professional Reference Check
//		candidateFulfillDetails.prepaidProfessionalReferenceCheck();
//		logger.info("Professional Reference1 and Reference2 has Setup Successfully!");
//
//		if (candidateFulfillDetails.verifyInitiatedCaseThankYouMessage().contains("THANK YOU!")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually Extended has Verified successfully!");
//		} else {
//			logger.info("Initiate Case Individually Extended has not Verified successfully!!");
//			captureScreen(driver, "verifyInitiatedCaseThankYouMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Payment Amount Payable
	@Test(enabled = true, testName = "Verify Payment Amount Payable", priority = 5, dependsOnMethods = {
			"verifyCandidateFullfillAllFormDetails" })
	public void verifyPrepaidAmountPayableValue() throws InterruptedException, IOException {
//		driver.get(EnpAdminURL);
//		logger.info("Prepaid Enp Admin Url has opened Successfully!");
//		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
//		enpAdminLogin.loginEnpAdminAccount(candidateUsername, candidatePrePassword);
//		logger.info("Prepaid Candidate account has Logged successfully!");
		PrepaidCandidateFulfillInformation verifyPaymentPendingCase = new PrepaidCandidateFulfillInformation(driver);
		verifyPaymentPendingCase.prepaidPaymentPendingCases();
		logger.info("Payment Pending Case has verified Successfully!");
		
//		if (verifyPaymentPendingCase.verifyAmountPayableValue().contains(" 212")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually has Amount Payable Verified successfully!");
//		} else {
//			logger.info("Initiate Case Individually has Not Amount Payable Verified successfully!");
//			captureScreen(driver, "verifyAmountPayableValue");
//			Assert.assertTrue(false);
//		}
	}
	
	// Verify Payment Pending Cases Bucket
		@Test(enabled = true, testName = "Verify Payment Pending Cases Bucket", priority = 6, dependsOnMethods = {
				"verifyPrepaidAmountPayableValue" })
		public void verifyPrepaidPaymentPendingCases() throws InterruptedException, IOException {
			PrepaidCandidateFulfillInformation verifyPaymentPendingCase = new PrepaidCandidateFulfillInformation(driver);
			verifyPaymentPendingCase.prepaidPaymentPendingCaseCompleted();
			logger.info("Payment Pending Case has verified Successfully!");
			
			if (verifyPaymentPendingCase.verifyPaymentCompletedMessage().contains("Payment Completed.")) {
				Assert.assertTrue(true);
				logger.info("Initiate Case Individually has Payment Completed successfully!");
			} else {
				logger.info("Initiate Case Individually has Not Payment Completed successfully!");
				captureScreen(driver, "verifyPaymentCompletedMessage");
				Assert.assertTrue(false);
			}
		}

	// Submitted For Verification Bucket
	@Test(enabled = true, testName = "Verify Payment Pending Cases Bucket", priority = 7, dependsOnMethods = {
			"verifyPrepaidPaymentPendingCases" })
	public void verifysubmittedForVerificationBucket() throws InterruptedException, IOException {
		PrepaidCandidateFulfillInformation verifySubmittedVerification = new PrepaidCandidateFulfillInformation(driver);
		verifySubmittedVerification.submittedForVerificationBucket();
		logger.info("Submitted For Verification Bucket Has Verified Successfully!");
		if (verifySubmittedVerification.verifyPrepaidCandidateName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("IVC Submitted For Verification Bucket First Name has Verified successfully!");
		} else {
			logger.info("IVC Submitted For Verification Bucket First Name has Not Verified successfully!");
			captureScreen(driver, "verifyPaymentCompletedMessage");
			Assert.assertTrue(false);
		}
	}
	
	// Verify WIP Cases in Submitted Case(s) Tracker
		@Test(enabled = true, testName = "Verify Case in WIP bucket", priority = 8, dependsOnMethods = {
				"verifysubmittedForVerificationBucket" })
		public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
			PrepaidCandidateFulfillInformation caseTrackerWip = new PrepaidCandidateFulfillInformation(driver);
			caseTrackerWip.submittedCasesTrackerWipCases(firstName,middleName);
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
		
		// Verify Ars Number in Bridge Portal
		@Test(enabled = true, testName = "Verify Client Ars Number after login bridge portal in Case List", priority = 9, dependsOnMethods = {
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
