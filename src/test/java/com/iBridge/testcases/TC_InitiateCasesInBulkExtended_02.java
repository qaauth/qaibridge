package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CandidateBulkEmailVerification;
import com.iBridge.pageobject.CandidateBulkLogin;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InitiateCaseIndividuallyExtended;
import com.iBridge.pageobject.InitiateCasesInBulk;
import com.iBridge.pageobject.InitiateCasesInBulkExtended;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.InsufficientiBridge;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.SubmittedCasesTracker;
import com.iBridge.testdata.UpdateCandidateRecordsXlsSheet;

public class TC_InitiateCasesInBulkExtended_02 extends BaseClass {
	// Initiate Cases Individually Bulk Extended
	@Test(enabled = true, testName = "Initiate Cases Individually Bulk Extended", priority = 1)
	public void initiateCasesInBulkExtended() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
		if (login.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully! Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}

		// Initiate Via Candidate(IVC-Bulk)
		InitiateCasesInBulkExtended inBulkInExtended = new InitiateCasesInBulkExtended(driver);
		inBulkInExtended.sidebarExpandBtn();
		logger.info("Clicked on bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");
		
		// Update the value of cell of the Bulk upload format XLS
		UpdateCandidateRecordsXlsSheet candidateXlsSheetUpdated = new UpdateCandidateRecordsXlsSheet();
		candidateXlsSheetUpdated.updateCandidateRecord();
		logger.info("Candidate First, Middle name, and email id have updated successfully of the Xls sheet!.");
		
		InitiateCasesInBulk iCasesInBulk = new InitiateCasesInBulk(driver);
		// Drag & Drop file here or browse file to upload
		iCasesInBulk.browseFileToUpload(
				(System.getProperty("user.dir") + "/src/test/java/com/iBridge/testdata/bulk_upload_format .xls"));
		logger.info("Xls spreadsheet document has uploaded successfully!");
		// Uploaded sheet data saved successfully
		if (iCasesInBulk.verifySheetDataSavedSuccessToastMsg().contains("Uploaded sheet data saved successfully")) {
			Assert.assertTrue(true);
			logger.info("The toast message has verified successfully 'Uploaded sheet data saved successfully.'");
		} else {
			logger.info("The toast message has Not verified successfully 'Uploaded sheet data saved successfully.'");
			captureScreen(driver, "verifyCongratulationMsg");
			Assert.assertTrue(false);
		}
	}

	// Drag & Drop file here or browse file to upload
	@Test(enabled = true, testName = "Drag & Drop file here or browse file to upload", priority = 2, dependsOnMethods = {
			"initiateCasesInBulkExtended" })
	public void dragDropBrowse() throws InterruptedException, IOException {
		InitiateCasesInBulk iCasesInBulk = new InitiateCasesInBulk(driver);
		iCasesInBulk.clickOnContinueBtn();
		logger.info("Clicked on countinue button,and Uploaded sheet data saved successfully");

		// Step 5 - Confirmation--2 Case(s) with missing mandatory information were
		// found!
		iCasesInBulk.uploadCandidateCv((System.getProperty("user.dir") + "/documents/ARN.pdf"), (System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate have uploaded Cv Document successfully!");
		
		iCasesInBulk.clickOnInitiateBtn();
		if (iCasesInBulk.verifyCongratulationMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("2 case(s) initiated for candidate(s) successfully.");
		} else {
			logger.info("2 case(s) initiated for candidate(s) has not successfully.");
			captureScreen(driver, "verifyCongratulationMsg");
			Assert.assertTrue(false);
		}
	}

	// Candidate Email Verification
	@Test(enabled = true, testName = "Candidate Email Verification", priority = 3, dependsOnMethods = {
			"dragDropBrowse" })
	public void candidateEmailVerification() throws IOException, InterruptedException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomBulkMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		CandidateBulkEmailVerification verification = new CandidateBulkEmailVerification(driver);
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

	// Candidate Login and Fill all details of the case details.
	@Test(enabled = true, testName = "Candidate Login Account", priority = 4, dependsOnMethods = {
			"candidateEmailVerification" })
	public void candidateLoginBulkAccount() throws IOException, InterruptedException, ParseException {
		// Candidate Login and Fill all details of the case details.
		CasesSubmissionSummary summary = new CasesSubmissionSummary(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		summary.btFiveLogout();
		logger.info("Bt Five account has logged out successfully!");

		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
		Thread.sleep(1000);
		CandidateBulkLogin candidateBulkLogin = new CandidateBulkLogin(driver);
		String data = new String(Files.readAllBytes(Paths.get("output1.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		candidateBulkLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("UserName and Password have Entered Succesfully!");

		if (candidateBulkLogin.verifyDashboardCandidateSummaryText().contains("Step 3 - Candidate Summary")) {
			Assert.assertTrue(true);
			logger.info("Step 3 - Candidate Summary Text has Verified successfully!");
		} else {
			logger.info("Step 3 - Candidate Summary Text has Not Verified successfully!");
			captureScreen(driver, "verifyDashboardCandidateSummaryText");
			Assert.assertTrue(false);
		}
		
		// Step 3 - Candidate Summary
		candidateBulkLogin.candidateAuthorization();
		logger.info("Digital signature has Passed successfully!");

		InitiateCasesInBulkExtended caseInBulkExtended = new InitiateCasesInBulkExtended(driver);
		candidateBulkLogin.candidateProfile("7042718793", "Prakash Yadav");
		logger.info("Candidate Profile Details has Setup successfully!");
		
		caseInBulkExtended.nationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"BROPC2345P", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details has Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		candidateBulkLogin.condidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address has setup successfully!");

		// Education Details--Step 3 - Candidate Summary
		candidateBulkLogin.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bun",
				"Bundelkhand University, Jhansi", "Jhansi", "Enroll1234", "65%", "08/2010", "08/2014", "Good");
		logger.info("Candidate Education details has Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		candidateBulkLogin.candidateEmployment("Other", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "Information Technologies", "10-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675676", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Employment details has Setup successfully!");

		candidateBulkLogin.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Noida", "Engineering", "10-01-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "152897308325", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com", "07-12-2020",
				"Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details has Setup successfully!");

		// inCaseInExtended.educationToEmploymentGap("Preparation for the entrance
		// examination");
//		logger.info("Filled 'Education To Employment Gap', and clicked On Submit Button!");
		
		// PROFESSIONAL REFERENCE--Professional Reference Check
		/*caseInBulkExtended.professionalReference("Krishna Kumar", "Senior QA", "8009744341", "krishnaKant@gmail.com",
				"Abhishek Kumar", "Project Manager", "7042718794", "abhishekKumar@gmail.com");
		logger.info("Professional Reference1 and Reference2 has Setup Successfully!");*/

//		if (caseInBulkExtended.verifyInitiateCaseThankYouMsg().contains("THANK YOU!")) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Case Individually Bulk Extended has Verified successfully!");
//		} else {
//			logger.info("Initiate Case Individually Bulk Extended has not Verified successfully!!");
//			captureScreen(driver, "verifyInitiateCaseThankYouMsg");
//			Assert.assertTrue(false);
//		}

		caseInBulkExtended.candidteSuccessLogout();
		logger.info("Candidate Account has logged Out Successfully!");
	}

	// Case(s) Submission Summary--(Submitted for Verification)
	@Test(enabled = true, testName = "Submitted For Verification", priority = 5, dependsOnMethods = {
			"candidateLoginBulkAccount" })
	public void submittedForVerification() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage btLogin = new LoginPage(driver);
		btLogin.login(username, password);
		logger.info("Entered email and Password ,and logged account Successfully!");
		
		if (btLogin.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully! Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}

		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submissionSum = new CasesSubmissionSummary(driver);
		submissionSum.submittedForVerification();

		String data = new String(Files.readAllBytes(Paths.get("Firstname2.txt")));
		String firstName[] = data.split(" ");
		if (submissionSum.candidateBulkFnameSubmittedForVerification().contains(firstName[0])) {
			Assert.assertTrue(true);
			logger.info("Candidate Bulk First name 'Submitted For Verification' has Verified Successfully!");
		} else {
			logger.info("Candidate Bulk First name 'Submitted For Verification' has not Verified Successfully!");
			captureScreen(driver, "candidateBulkFnameSubmittedForVerification");
			Assert.assertTrue(false);
		}
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Submitted Cases Tracker Wip", priority = 6, dependsOnMethods = {
			"submittedForVerification" })
	public void submittedCasesTrackerWipCases() throws InterruptedException, IOException {
		// (WIP Cases)--Submitted Case(s) Tracker
		SubmittedCasesTracker caseTrackerWip = new SubmittedCasesTracker(driver);
		String data = new String(Files.readAllBytes(Paths.get("Firstname2.txt")));
		String firstName[] = data.split(" ");
		//String middleName2 = new String(Files.readAllBytes(Paths.get("middleName2.txt")));
		//String middleName[] = middleName2.split(" ");
		caseTrackerWip.submittedCasesTrackerWipCases(firstName[0],firstName[0]);

		if (caseTrackerWip.getCandidateBulkFName().contains(firstName[0])) {
			Assert.assertTrue(true);
			logger.info("WIP Candidate First name Has Verified Successfully!");
		} else {
			logger.info("WIP Candidate First name Has not Verified Successfully!");
			captureScreen(driver, "getCandidateBulkFName");
			Assert.assertTrue(false);
		}
	}

	// Verify Search Client Ars Number Case List(Ars Number) by login Bridge Account
	@Test(enabled = true, testName = "Search Client Ars Number Case List", priority = 7, dependsOnMethods = {
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

		if (bridgeLogin.verifyCandidateBulkArsNumberInBridge().contains(arsNumber[2])) {
			Assert.assertTrue(true);
			logger.info("Candidate Bulk Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info("Candidate Bulk Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCandidateBulkArsNumberInBridge");
			Assert.assertTrue(false);
		}
	}

	// Verify Docs Qc Allocator
	@Test(enabled = true, testName = "Verify Docs Qc Allocator", priority = 8, dependsOnMethods = {
			"searchClientArsNoCaseList" })
	public void verifyInsufficientDocsQcAllocator() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQcAllocator = new InsufficientBridge(driver);
		insuffDocsQcAllocator.superAdminDocsQcAllocator();
		logger.info("Select Docs Qc Allocator has Successfully!");

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

	// Verify Docs Quality
	@Test(enabled = true, testName = "Verify Docs Quality", priority = 9, dependsOnMethods = {
			"verifyInsufficientDocsQcAllocator" })
	public void verifyInsufficientDocsQuality() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQuality = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffDocsQuality.superAdminDocsQuality(arsNumber[2]);
		if (insuffDocsQuality.verifyCaseQCReviewArsNumber().contains(arsNumber[2])) {
			Assert.assertTrue(true);
			logger.info("Case QC Review Ars Number has verified successfully!");
		} else {
			logger.info("Case QC Review Ars Number has Not verified successfully!");
			captureScreen(driver, "verifyDocsQcAllocatorCase");
			Assert.assertTrue(false);
		}

		insuffDocsQuality.verifyQcDoneChecksSummary("Case level comments are good", "1",
				"Case level comments are good");
		if (insuffDocsQuality.verifyReleasedForVerificationMsg()
				.contains("The Case was successfully released for Verification.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully released for Verification.!");
		} else {
			logger.info("The Case was not successfully released for Verification.!");
			captureScreen(driver, "verifyQcDoneChecksSummary");
			Assert.assertTrue(false);
		}
	}

	// Verify Allocator
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
			logger.info("Checks are not successfully allocated to Shariq Abbas!");
			captureScreen(driver, "verifyChecksSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Verifier
	// Reason for insufficiency --Both (Select Insufficiency Reason)
	@Test(enabled = true, testName = "Verify Raising Insuff On Verifier", priority = 11, dependsOnMethods = {
			"verifyInsufficientAllocator" })
	public void verifyInsufficientVerifier() throws InterruptedException, IOException {
		InsufficientBridge insuffVerifier = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffVerifier.superAdminInsuffTypeBoth(arsNumber[2], "110091", "Verified form details", "12 PM",
				"Three Years", "20-Jan-2021", "All Good", "Mayur Vihar", "Anil Singh", "AfterNoon", "Black and White",
				"Grey Color", "Till Date", "Gurgaon", "Insufficient comment is good", "Both type Insuff", "40");
		logger.info("Antecedents to Verify all Records have filled Successfully!");

		if (insuffVerifier.verifyMarkedAsInsufficientMsg().contains("Check is successfully marked as Insufficient.")) {
			Assert.assertTrue(true);
			logger.info("Check is successfully marked as Insufficient.!");
		} else {
			logger.info("Check is not successfully marked as Insufficient.!");
			captureScreen(driver, "verifyChecksSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Insufficient Pending For Fulfillment--(iBridge Portal)
	@Test(enabled = true, testName = "Verify raised insuff on ibridge under insuff bucket and fulfilling insuff", priority = 12, dependsOnMethods = {
			"verifyInsufficientVerifier" })
	public void verifyInsufficientpendingForFulfilment() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		InsufficientiBridge pendingForFulfilment = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		pendingForFulfilment.pendingForFulfilmentInsufficient(arsNumber[2], "Comments added successfully");
		logger.info("Pending For Fulfilment Insufficient has Added successfully!");

//		if (pendingForFulfilment.verifySubmittedTextMsg().contains("Submitted")) {
//			Assert.assertTrue(true);
//			logger.info("Insufficient details have Submitted successfully.");
//		} else {
//			logger.info("Insufficient details have Not Submitted successfully.");
//			captureScreen(driver, "verifySubmittedTextMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Insufficiency Fulfillment --Bridge
	@Test(enabled = true, testName = "Verify fulfilled insuff on bridge and approving it", priority = 13, dependsOnMethods = {
			"verifyInsufficientpendingForFulfilment" })
	public void verifyInsufficiencyFulfillment() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		InsufficientBridge insuffFulfillment = new InsufficientBridge(driver);
		insuffFulfillment.superAdminInsufficiencyFulfillment("7042718794", "Insufficient Comments Have Added");
		logger.info("Insufficiency Fulfillment details have added Successfully!");
//		if (insuffFulfillment.verifyUpdatedSuccessfullyMessage().contains("Updated Successfully")) {
//			Assert.assertTrue(true);
//			logger.info("Insufficient details have Submitted successfully.");
//		} else {
//			logger.info("Insufficient details have not Submitted successfully.");
//			captureScreen(driver, "verifyUpdatedSuccessfullyMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Cost Approval Verifier-- On Hold Cases(iBridge Portal)
	@Test(enabled = false, testName = "Verify Raising cost approval On hold Cases Bucket", priority = 14, dependsOnMethods = {
			"verifyInsufficiencyFulfillment" })
	public void verifyCostApprovalOnHoldCases() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		InsufficientiBridge insuffOnHoldCase = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffOnHoldCase.submittedCasesTrackerOnHoldCases(arsNumber[2],
				"On hold cases has been Commented Successfully");
		logger.info("Mark Insufficiency Cost Approval Required has filled Successfully!");

//		if (insuffOnHoldCase.verifyOnHoldCaseApprovedMsg().contains("Your Check has been Approved Successfully")) {
//			Assert.assertTrue(true);
//			logger.info("Your Check has been Approved Successfully!");
//		} else {
//			logger.info("Your Check has not been Approved Successfully!");
//			captureScreen(driver, "verifyOnHoldCaseApprovedMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Insufficient Cases-- Verify--Present or not--iBridge Portal
	@Test(enabled = false, testName = "Verify whether case got removed once insuff fulfilled", priority = 15, dependsOnMethods = {
			"verifyCostApprovalOnHoldCases" })
	public void verifyInsufficientCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		InsufficientiBridge insuffCaseArsNumber = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseArsNumber.verifyInsufficientArsNumber(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
//		if (insuffCaseArsNumber.verifyNoCaseFoundMsg().contains("No case(s) found")) {
//			Assert.assertTrue(true);
//			logger.info("No case(s) found has got successfully!");
//		} else {
//			logger.info("No case(s) found message has not got successfully!");
//			captureScreen(driver, "verifyNoCaseFoundMsg");
//			Assert.assertTrue(false);
//		}
	}
}
