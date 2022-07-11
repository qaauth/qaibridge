package com.iBridge.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CandidateEmailVerification;
import com.iBridge.pageobject.CandidateLogin;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InitiateCaseIndividuallyExtended;
import com.iBridge.pageobject.InitiateCasesIndividually;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.utilities.RandomStrings;

public class TC_InitiateCaseIndividuallyExtended_01 extends BaseClass {
	String firstName;
	String middleName;
	
	// Initiate Case Individually Extended
	@Test(enabled = true, testName = "Initiate Case Individually Extended", priority = 1)
	public void initiateCaseIndividuallyExtended() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
//		loginPage.login(username, password);
		logger.info("Email and Password has Entered Successfully!");
//		if (loginPage.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
//			Assert.assertTrue(true);
//			logger.info("BT Client has logged Successfully!");
//		} else {
//			logger.info("BT Client has not logged Successfully! Successfully!");
//			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
//			Assert.assertTrue(false);
//		}
		
		// Initiate Via Candidate(IVC)
		inCaseInExtended.sidebarExpandBtn();
		logger.info("Clicked on bar expand");

		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		// Step 3 - Candidate Summary (Add Candidate Information)
		InitiateCasesIndividually iCasesIndividually = new InitiateCasesIndividually(driver);
		firstName = RandomStrings.randomeStringCandidateFirstName();
		iCasesIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		iCasesIndividually.candidateMiddleName(middleName);
		Thread.sleep(1000);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		iCasesIndividually.candidateLastName(lastName);

		iCasesIndividually.addCandidateInformation("8009744341", "04-04-1991");

		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		iCasesIndividually.candidateEmail(email);
		logger.info("Entered Candidated information!");
		Thread.sleep(1000);

		// Upload CV Documents
		inCaseInExtended.additionFieldInfo((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Uploaded cv document!");
		Thread.sleep(2000);
		// Additional Field(s)
		iCasesIndividually.additionFieldInfo("rajucs@gmail.com", "12345", "04/04/1991", "1100", "Quality Analyst",
				"Raju Yadav", "Senior QA", "12345", "raju12@gmail.com", "10-12-2019", "6098", "SKPAY123", "Aman kumar",
				"hrd@gmail.com", "Scott", "6098", "Gurgaow");
		logger.info("Entered Additional Informations!");

		iCasesIndividually.initiateCaseBtn();
		logger.info("Initiated for candidate(s) successfully!");

		InitiateCasesIndividually messageCongrats = new InitiateCasesIndividually(driver);
		if (messageCongrats.verifyInitiateCaseTextMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("1 case(s) Initiated for candidate(s) successfully");
		} else {
			logger.info("1 case(s) has not Initiated for candidate(s) successfull");
			captureScreen(driver, "InitaiteCaseIndividually");
			Assert.assertTrue(false);
		}
	}

	// Verify Pending Case Submission Verification.
	@Test(enabled = true, testName = "Pending Case Submission Verification", priority = 2, dependsOnMethods = {
			"initiateCaseIndividuallyExtended" })
	public void pendingCaseSubmissionVerification() throws InterruptedException, IOException {
		CasesSubmissionSummary pendingCaseSub = new CasesSubmissionSummary(driver);
		pendingCaseSub.pendingCaseSubmission();
		if (pendingCaseSub.pendingCaseVerificationCandidateName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Candidate First Name 'Pending Submission list' has verified Successfully!");
		} else {
			logger.info("Candidate First Name 'Pending Submission list' has Not verified Successfully!");
			captureScreen(driver, "pendingSubmission");
			Assert.assertTrue(false);
		}
	}

	// Candidate Email Verification and Get candidate username and password-- Mailinator.com
	@Test(enabled = true, testName = "Candidate Email Verification", priority = 3, dependsOnMethods = {
			"pendingCaseSubmissionVerification" })
	public void candidateEmailVerification() throws IOException, InterruptedException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		CandidateEmailVerification verification = new CandidateEmailVerification(driver);
		if (verification.verifyMailinatorMailSubject()
				.contains("Pre-Joining Formalities for British Telecom")) {
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

	// Candidate account Login and Fill all details of the candidate case.
	@Test(enabled = true, testName = "Candidate Login Account", priority = 4, dependsOnMethods = {
			"candidateEmailVerification" })
	public void candidateLoginAccount() throws InterruptedException, ParseException, IOException {
		CasesSubmissionSummary summary = new CasesSubmissionSummary(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		summary.btFiveLogout();
		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
		CandidateLogin candidateLogin = new CandidateLogin(driver);
		String data = new String(Files.readAllBytes(Paths.get("output.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		candidateLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("Entered User Id and Password!");
		if (candidateLogin.verifyDashboardCandidateSummaryText().contains("Step 3 - Candidate Summary")) {
			Assert.assertTrue(true);
			logger.info("Step 3 - Candidate Summary Text has Verified successfully!");
		} else {
			logger.info("Step 3 - Candidate Summary Text has Not Verified successfully!");
			captureScreen(driver, "verifyDashboardCandidateSummaryText");
			Assert.assertTrue(false);
		}

		// Step 3 - Candidate Summary
		candidateLogin.candidateAuthorization();
		logger.info("Digital signature successfully!");

		InitiateCaseIndividuallyExtended caseInExtended = new InitiateCaseIndividuallyExtended(driver);
		candidateLogin.candidateProfile("7042718794", "Prakash Yadav");
		logger.info("Candidate Profile Details Setup successfully!");
		
		caseInExtended.nationalIdentity((System.getProperty("user.dir") + "/documents/PanCard.pdf"), "Raju Yadav",
				"Bropc2345P", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		candidateLogin.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address details Setup Successfully!!");

		// Education Details--Step 3 - Candidate Summary
		candidateLogin.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bund",
				"Jhansi", "Enroll1234", "65%", "08/2010", "08/2014", "Good");
		logger.info("Candidate Education details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		candidateLogin.candidateEmployment("Other", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "raju.yadav@authbridge.com","Information Technologies", "10-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675567", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Current Employment details Setup successfully!");

		// Employment(Previous Employment Details)--Step 3 - Candidate Summary
		candidateLogin.candidatePreviousEmployment("Other", "Quality Analyst", "Noida", "8009744341",
				"Noida", "agami.raju@agamitechnologies.com", "Engineering", "10-01-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com", "07-12-2020",
				"Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");
		
		//inCaseInExtended.educationToEmploymentGap("Preparation for the entrance examination");
		logger.info("Filled Education To Employment Gap and clicked On Submit Button!");

		// PROFESSIONAL REFERENCE--Professional Reference Check
		caseInExtended.professionalReference("Authbridge Private Limited", "Krishna Kumar", "Senior QA", "8009744341", "krishnaKant@gmail.com",
				"Abhishek Kumar", "Project Manager", "7042718794", "abhishekKumar@gmail.com");
		logger.info("Professional Reference1 and Reference2 has Setup Successfully!");

		InitiateCaseIndividuallyExtended thankYouMsg = new InitiateCaseIndividuallyExtended(driver);
		if (thankYouMsg.verifyInitiateCaseThankYouMsg().contains("THANK YOU!")) {
			Assert.assertTrue(true);
			logger.info("Initiate Case Individually Extended has Verified successfully!");
		} else {
			logger.info("Initiate Case Individually Extended has not Verified successfully!!");
			captureScreen(driver, "verifyInitiateCaseThankYouMsg");
			Assert.assertTrue(false);
		}

		caseInExtended.CandidteLogout();
		logger.info("Candidate logout Successfully!");
	}

	// Verify Case(s) Submission Summary--(Submitted for Verification)
	@Test(enabled = true, testName = "Veirfy submitted for verification bucket", priority = 5, dependsOnMethods = {
			"candidateLoginAccount" })
	public void submittedForVerification() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage btLogin = new LoginPage(driver);
		btLogin.login(username, password);
		logger.info("BT Candidate Account has logged Successfully !");
//		if (btLogin.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
//			Assert.assertTrue(true);
//			logger.info("BT Client has logged Successfully!");
//		} else {
//			logger.info("BT Client has not logged Successfully! Successfully!");
//			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
//			Assert.assertTrue(false);
//		}

		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submissionSum = new CasesSubmissionSummary(driver);
		submissionSum.submittedForVerification();
		CasesSubmissionSummary verifyCandidateFname = new CasesSubmissionSummary(driver);
//		if (verifyCandidateFname.submittedForVerificationCandidateFname().contains(firstName)) {
//			Assert.assertTrue(true);
//			logger.info("Case Submitted For Verification' list has Verified Successfully!");
//		} else {
//			logger.info("Case 'Submitted For Verification' list Has Not Verified Successfully!");
//			captureScreen(driver, "submittedForVerification");
//			Assert.assertTrue(false);
//		}
	}

	// Verify WIP Cases in Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Verify Case in WIP bucket", priority = 6, dependsOnMethods = {
			"submittedForVerification" })
	public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
		SubmittedCasesTracker caseTrackerWip = new SubmittedCasesTracker(driver);
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
	@Test(enabled = true, testName = "Verify Client Ars Number in Case List", priority = 7, dependsOnMethods = {
			"submittedCasesTrackerWipCases" })
	public void searchClientArsNoCaseList() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account Logged successfully!");

		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		// System.out.println(arsNumber[2]);
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

	// Verify Docs Qc Allocator-- Bridge Portal
	@Test(enabled = true, testName = "Verify Docs Qc Allocator", priority = 8, dependsOnMethods = {
			"submittedCasesTrackerWipCases" })
	public void verifyInsufficientDocsQcAllocator() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQcAllocator = new InsufficientBridge(driver);
		insuffDocsQcAllocator.superAdminDocsQcAllocator();
		logger.info("Select Docs Qc Allocator has Successfully!");
		//insuffDocsQcAllocator.verifyDocsQcAllocator();
		logger.info("Super admin have done Docs Qc Allocator Successfully!");
		if (insuffDocsQcAllocator.verifyCaseSuccessAllocatedMsg()
				.contains("All selected cases were successfully allocated to QC Team Member.")) {
			Assert.assertTrue(true);
			logger.info("All selected cases were successfully allocated to QC Team Member.!");
		} else {
			logger.info("All selected cases were Not successfully allocated to QC Team Member.!");
			captureScreen(driver, "verifyDocsQcAllocatorCase");
			Assert.assertTrue(false);
		}
	}

	// Verify Docs Quality-- Bridge Portal
	@Test(enabled = true, testName = "Verify Docs Quality", priority = 9, dependsOnMethods = {
			"verifyInsufficientDocsQcAllocator" })
	public void verifyInsufficientDocsQuality() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQuality = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffDocsQuality.superAdminDocsQuality(arsNumber[2]);
//		if (insuffDocsQuality.verifyCaseQCReviewArsNumber().contains(arsNumber[2])) {
//			Assert.assertTrue(true);
//			logger.info("Case QC Review Ars Number has verified successfully!");
//		} else {
//			logger.info("Case QC Review Ars Number has Not verified successfully!");
//			captureScreen(driver, "verifyDocsQcAllocatorCase");
//			Assert.assertTrue(false);
//		}

		insuffDocsQuality.verifyQcDoneChecksSummary("Case level comments are good", "1",
				"Case level comments are good");
		if (insuffDocsQuality.verifyReleasedForVerificationMsg()
				.contains("The Case was successfully released for Verification.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully released for Verification.!");
		} else {
			logger.info("The Case was Not successfully released for Verification.!");
			captureScreen(driver, "verifyQcDoneChecksSummary");
			Assert.assertTrue(false);
		}
	}

	// Verify Allocator-- Bridge Portal
	@Test(enabled = true, testName = "Verify Case Allocation", priority = 10, dependsOnMethods = {
			"verifyInsufficientDocsQuality" })
	public void verifyInsufficientAllocator() throws IOException, InterruptedException {
		InsufficientBridge insuffAllocator = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffAllocator.superAdminAllocator(arsNumber[2], "Allocator check Comments has entered successfully");
		if (insuffAllocator.verifyChecksSuccessfullyMsg()
				.contains("Checks are successfully allocated to Shariq Abbas")) {
			Assert.assertTrue(true);
			logger.info("Checks are successfully allocated to Shariq Abbas!");
		} else {
			logger.info("Checks are Not successfully allocated to Shariq Abbas!");
			captureScreen(driver, "verifyChecksSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}
}
