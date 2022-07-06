package com.iBridge.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.SubmitCaseInBulkExcelUpload;
import com.iBridge.pageobject.SubmitCaseInFolderSubmit;
import com.iBridge.pageobject.SubmitCasesInBulkQuickSubmit;
import com.iBridge.testdata.UpdateCandidateDiyRecordsXlsSheet;
import com.iBridge.utilities.RandomStrings;

public class TC_SubmitCasesInBulkExtended_04 extends BaseClass {
	String firstName;
	String middleName;
	String Firstname1;
	String Firstname2;
	String middleName2;
	int totalFolderSubmitCases;
    // Verify Submit Cases In Bulk Extended
	@Test(enabled = true, testName = "Submit Cases In Bulk Extended", priority = 1)
	public void submitCasesInBulkExtended() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage btLogin = new LoginPage(driver);
		btLogin.login(username, password);
		logger.info("Entered email and Password!");

		if (btLogin.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully! Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}

		UpdateCandidateDiyRecordsXlsSheet updateCandidateDiyRecords = new UpdateCandidateDiyRecordsXlsSheet();
		updateCandidateDiyRecords.updateCandidateRecords();
		logger.info("Candidate First, Middle name, and email id have updated successfully of the Xls sheet!.");
	}

	// Excel Upload-- Submit Case In Bulk Excel Upload
	@Test(enabled = true, testName = "Verify Submit Case In Bulk Excel Upload", priority = 2, dependsOnMethods = {
			"submitCasesInBulkExtended" })
	public void submitCaseInBulkExcelUpload() throws InterruptedException, IOException {
		SubmitCaseInBulkExcelUpload excelUpload = new SubmitCaseInBulkExcelUpload(driver);
		// Do It Yourself(DIY)
		excelUpload.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		// Option selection--(Excel Upload) (Submit cases in bulk using MS Excel
		// consisting candidate info)
		excelUpload.submitExcelUploadBulk((System.getProperty("user.dir")
				+ "/src/test/java/com/iBridge/testdata/bulk_upload_format_ExcelDiy.xls"));
		logger.info("Bulk Candidate records Excel sheet have been Uploaded Successfully!");

		excelUpload.previewUploadDocuments((System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Upload Documents Successfully!");

		if (excelUpload.verifysubmitCaseInBulkExcelUploadMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("2 case(s) initiated for candidate(s) successfully.");
		} else {
			logger.info("2 case(s) initiated for candidate(s) has not got successfully.");
			captureScreen(driver, "verifyCongratulationMsg");
			Assert.assertTrue(false);
		}
	}

	// Case(s) Submission Summary--(Submitted for Verification)
	@Test(enabled = true, testName = "Verify Submitted For Verification", priority = 3, dependsOnMethods = {
			"submitCaseInBulkExcelUpload" })
	public void submittedForVerificationExcelUpload() throws IOException, InterruptedException {
		// Case(s) Submission Summary--(Submitted for Verification)
		SubmitCaseInBulkExcelUpload subForVerification = new SubmitCaseInBulkExcelUpload(driver);
		subForVerification.submittedForVerification();
		String data = new String(Files.readAllBytes(Paths.get("firstName2.txt")));
		String firstName[] = data.split(" ");
		if (subForVerification.submittedForVerificationCandidateFname().contains(firstName[0])) {
			Assert.assertTrue(true);
			logger.info("Case Submitted For Verification' list has Verified Successfully!");
		} else {
			logger.info("Case 'Submitted For Verification' list Has Not Verified Successfully!");
			captureScreen(driver, "submittedForVerification");
			Assert.assertTrue(false);
		}
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Verify Submitted Cases Tracker Wip", priority = 4, dependsOnMethods = {
			"submittedForVerificationExcelUpload" })
	public void submittedCasesTrackerExcelUploadWipCases() throws InterruptedException, IOException {
		SubmitCaseInBulkExcelUpload caseTrackerWip = new SubmitCaseInBulkExcelUpload(driver);
		String data = new String(Files.readAllBytes(Paths.get("firstName2.txt")));
		String firstName[] = data.split(" ");
		String middleName2 = new String(Files.readAllBytes(Paths.get("middleName2.txt")));
		String middleName[] = middleName2.split(" ");
		caseTrackerWip.submittedCasesTrackerWipCases(firstName[0], middleName[0]);
		logger.info("Entered Fistname and Middle name Successfully!");

		if (caseTrackerWip.getCandidateFNameWip().contains(firstName[0])) {
			Assert.assertTrue(true);
			logger.info("WIP Candidate First name Has Verified Successfully!");
		} else {
			logger.info("WIP Candidate First name Has not Verified Successfully!");
			captureScreen(driver, "getCandidateFName");
			Assert.assertTrue(false);
		}
	}

	// Verify Search Client Ars Number Case List(Ars Number) by login Bridge Account
	@Test(enabled = true, testName = "Verify Client Search Ars Number In Case List", priority = 5, dependsOnMethods = {
			"submittedCasesTrackerExcelUploadWipCases" })
	public void searchExcelUploadClientArsNo() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Email and Password has Entered Successfully!");
		String data = new String(Files.readAllBytes(Paths.get("outputArsExcelWip.txt")));
		String arsNumber[] = data.split(" ");
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

	// Quick Submit--Submit Cases In Bulk Quick Submit
	@Test(enabled = true, testName = "Verify Quick Submit Cases In Bulk", priority = 6, dependsOnMethods = {
			"searchExcelUploadClientArsNo" })
	public void submitCasesInBulkQuickSubmit() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		SubmitCasesInBulkQuickSubmit bulkQuickSubmit = new SubmitCasesInBulkQuickSubmit(driver);

		// Do It Yourself(DIY)
		bulkQuickSubmit.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand button");

		// Step 3 - Candidate Summary (Add Candidate Information)
		firstName = RandomStrings.randomeStringCandidateFirstName();
		bulkQuickSubmit.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		bulkQuickSubmit.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		bulkQuickSubmit.candidateLastName(lastName);

		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		bulkQuickSubmit.candidateEmail(email);
		logger.info("Entered Candidate information!");

		// Additional Field(s)
		bulkQuickSubmit.quickSubmitForm("04-04-1991", "8009744341", "1234", "04-05-2020", "08-11-2000", "10023",
				"Quality Analyst", "Anit", "2563", "Legal Entity", "bt@malinator.com", "03-12-1996", "12367",
				"ANFG1234", "Raju", "Raju@mailinator.com", "Larry", "AGM1234", "New Delhi");
		logger.info("Fill all the details of the candidate and Additional details!");

		bulkQuickSubmit.clickOnSaveBtn((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Browse Document Uploaded Successfully!!");

		if (bulkQuickSubmit.submitCasesInBulkQuickSubmitMsg().contains("CONGRATULATIONS!")) {
			Assert.assertTrue(true);
			logger.info("1 case(s) have been initiated successfully.");
		} else {
			logger.info("1 case(s) have not been initiated successfully.");
			captureScreen(driver, "verifyCongratulationMsg");
			Assert.assertTrue(false);
		}
	}

	// Case(s) Submission Summary--(Submitted for Verification)
	@Test(enabled = true, testName = "Verify Submitted For Verification bucket for Quick Submit Cases", priority = 7, dependsOnMethods = {
			"submitCasesInBulkQuickSubmit" })
	public void submittedForVerificationQuickSubmit() throws InterruptedException, IOException {
		// Case(s) Submission Summary--(Submitted for Verification)
		CasesSubmissionSummary submissionSum = new CasesSubmissionSummary(driver);
		submissionSum.submittedForVerification();

//		if (submissionSum.candidateBulkFnameSubmittedForVerification().contains(firstName)) {
//			Assert.assertTrue(true);
//			logger.info("Candidate Bulk First name 'Submitted For Verification' has Verified Successfully!");
//		} else {
//			logger.info("Candidate Bulk First name 'Submitted For Verification' has not Verified Successfully!");
//			captureScreen(driver, "candidateBulkFnameSubmittedForVerification");
//			Assert.assertTrue(false);
//		}
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	@Test(enabled = true, testName = "Verify Submitted Cases Tracker for Quick Submit case in Wip bucket", priority = 8, dependsOnMethods = {
			"submittedForVerificationQuickSubmit" })
	public void submittedCasesTrackerQuickSubmitWipCases() throws InterruptedException, IOException {
		// (WIP Cases)--Submitted Case(s) Tracker
		SubmitCasesInBulkQuickSubmit caseTrackerQuickSubmitWip = new SubmitCasesInBulkQuickSubmit(driver);
		caseTrackerQuickSubmitWip.submittedCasesTrackerWipCases(firstName, middleName);

		if (caseTrackerQuickSubmitWip.getCandidateFName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("WIP Candidate First name Has Verified Successfully!");
		} else {
			logger.info("WIP Candidate First name Has not Verified Successfully!");
			captureScreen(driver, "getCandidateBulkFName");
			Assert.assertTrue(false);
		}
	}

	// Verify Search Client Ars Number Case List(Ars Number) by login Bridge Account
	@Test(enabled = true, testName = "Verify Client has logged in bridge and Search Ars Number in Case List", priority = 9, dependsOnMethods = {
			"submittedCasesTrackerQuickSubmitWipCases" })
	public void searchClientArsNoCaseQuickSubmit() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArsQuickSubmitWip.txt")));
		String arsNumber[] = data.split(" ");
		// System.out.println(arsNumber[2]);
		bridgeLogin.arsNumberSearch(arsNumber[2]);
		logger.info("Client Case List shown successfully!");

		SubmitCasesInBulkQuickSubmit arsNoVerification = new SubmitCasesInBulkQuickSubmit(driver);
		if (arsNoVerification.verifyQuickSubmitBulkArsNumberInBridge().contains(arsNumber[2])) {
			Assert.assertTrue(true);
			logger.info("Candidate Bulk Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info("Candidate Bulk Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCandidateBulkArsNumberInBridge");
			Assert.assertTrue(false);
		}
	}

	// Verify Login Bridge Account Get Folder Cases Count
	@Test(enabled = true, testName = "Verify Login Bridge Account Get Folder Cases Count", priority = 10, dependsOnMethods = {
			"searchClientArsNoCaseQuickSubmit" })
	public void loginBridgeAccountGetFolderCasesCount() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		SubmitCaseInFolderSubmit casesFolderSubmit = new SubmitCaseInFolderSubmit(driver);
		casesFolderSubmit.selectDocumentProcessor();
		logger.info("Document Processor Index has selected Successfully!");

		casesFolderSubmit.verifyBritishTelecomNewCasesCountNo();
		totalFolderSubmitCases = Integer.parseInt(casesFolderSubmit.verifyBritishTelecomNewCasesCountNo());
		logger.info("British Telecom New Cases Count Number have Verified successfully!");
	}

	// Verify Submit Case In Folder Submit
	@Test(enabled = true, testName = "Verify Submit Case In Folder Submit", priority = 11, dependsOnMethods = {
			"loginBridgeAccountGetFolderCasesCount" })
	public void submitCaseInFolderSubmit() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		SubmitCaseInFolderSubmit folderSubmit = new SubmitCaseInFolderSubmit(driver);
		// Do It Yourself(DIY)
		folderSubmit.sidebarExpandBtn();
		logger.info("Clicked on bar expand");

		// Folder Submit Form--Step 3 - Candidate Summary
		folderSubmit.folderCaseSubmit("Check", "Bangalore",
				(System.getProperty("user.dir") + "/documents/Submit_Case_Folder.zip"));
		logger.info("Folder Case Submit Successfuly!");

//		if (folderSubmit.verifySubmitCaseInFolderSubmitMsg().contains("CONGRATULATIONS!")) {
//			Assert.assertTrue(true);
//			logger.info("1 case(s) have been initiated successfully.");
//		} else {
//			logger.info("1 case(s) have not been initiated successfully.");
//			captureScreen(driver, "verifyCongratulationMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Folder Cases Count In Bridge Portal
	@Test(enabled = true, testName = "Verify Folder Cases Count In Bridge Portal", priority = 12, dependsOnMethods = {
			"submitCaseInFolderSubmit" })
	public void verifyFolderCasesCountInBridge() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		SubmitCaseInFolderSubmit casesFolderSubmit = new SubmitCaseInFolderSubmit(driver);
		casesFolderSubmit.selectDocumentProcessor();
		logger.info("Document Processor Index has selected Successfully!");

		int TotalTempCases = Integer.parseInt(casesFolderSubmit.verifyBritishTelecomNewCasesCountNo());
		if (TotalTempCases > totalFolderSubmitCases) {
			logger.info("British Telecom New Cases Count Number have Verified successfully!");
		} else {
			logger.info("British Telecom New Cases Count Number have Not Verified successfully!");
			captureScreen(driver, "verifyBritishTelecomNewCasesCountNo");
		}
	}
}
