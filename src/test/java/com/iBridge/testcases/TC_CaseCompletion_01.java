package com.iBridge.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CaseCompletion;
import com.iBridge.pageobject.LoginPage;

import database.connection.DatabaseConnection_01;

public class TC_CaseCompletion_01 extends BaseClass {

	// Checks Summary (Close By Client)-- Case Summary Details
	@Test(enabled = true, testName = "Verify Checks Summary Close By Client", priority = 1)
	public void checksSummaryClosedByClient() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		// bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		logger.info("Bridge account has Logged successfully!");

		CaseCompletion checksSummaryyClosedByClient = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		checksSummaryyClosedByClient.userAdminChecksSummaryClosedByClient(arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good", arsNumber[2], "Close By Client comment is good", arsNumber[2],
				"Close By Client comment is good");
		logger.info("Check is successfully marked as Closed by Client.!");

		if (checksSummaryyClosedByClient.verifyProfessionalReferenceCheckClosedByClientMsg()
				.contains("Professional Reference Check ( Closed by Client )")) {
			Assert.assertTrue(true);
			logger.info("All Checks Summary are successfully marked as Closed by Client.!");
		} else {
			logger.info("All Checks Summary are not successfully marked as Closed by Client.!");
			captureScreen(driver, "verifyProfessionalReferenceCheckClosedByClientMsg");
			Assert.assertTrue(false);
		}

		checksSummaryyClosedByClient.bridgeAccountLoggedOut();
		logger.info("Bridge Account Logged Out has Successfully!");
	}

	// Education Verification W --Checks Summary -- Case Summary Details
	@Test(enabled = true, testName = "Verify Education Verification W Check Summary", priority = 2, dependsOnMethods = {
			"checksSummaryClosedByClient" })
	public void educationWCheckCloseVerification() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		CaseCompletion eductionWCloseVerification = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		eductionWCloseVerification.educationWChecksSummaryVerification(arsNumber[2], "Jhansi",
				"Computer Science and Engineering", "12345", "Ankit", "Yes", "12PM");
		logger.info("Education Verification W Antecedents to Verify details have been filled successfully!");

		if (eductionWCloseVerification.verifyEducationVerificationWCompletedTextName()
				.contains("Education Verification W ( Completed )")) {
			Assert.assertTrue(true);
			logger.info("Education Verification W Check is successfully marked as Closed by Client.!");
		} else {
			logger.info("Education Verification W Check is not successfully marked as Closed by Client.!");
			captureScreen(driver, "verifyEducationVerificationWCompletedTextName");
			Assert.assertTrue(false);
		}
	}

	// Verification Quality Allocator--Check List - Search Result - (14 records)
	@Test(enabled = true, testName = "Verify Verification Quality Allocator--Check List", priority = 3, dependsOnMethods = {
			"educationWCheckCloseVerification" })
	public void verificationQualityAllocator() throws IOException, InterruptedException {
		CaseCompletion verificationQualityAllocator = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		verificationQualityAllocator.superAdminVerificationQualityAllocator(arsNumber[2],
				"Verification Quality Allocator Comments are good");
		logger.info("Verification Quality Allocator details has been filled Successfully!");

		if (verificationQualityAllocator.verificationQualityAllocatorSuccessfullyMsg()
				.contains("The selected checks were successfully released for report.")) {
			Assert.assertTrue(true);
			logger.info("Checks are successfully allocated to Shariq Abbas.!");
		} else {
			logger.info("Checks are Not successfully allocated to Shariq Abbas.!");
			captureScreen(driver, "verificationQualityAllocatorSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	/*// Verification Quality-- Check List - Search Result - (14 records)
	@Test(enabled = true, testName = "Verification Quality Released for Report", priority = 4, dependsOnMethods = {
			"verificationQualityAllocator" })
	public void verificationQualityReleasedForReport() throws IOException, InterruptedException {
		CaseCompletion verificationQualityReleasedForReport = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		verificationQualityReleasedForReport.superAdminVerificationQuality(arsNumber[2],
				"Verification Quality Released for report Comments are good");
		logger.info("Verification Quality details have been filled Successfully!");

		if (verificationQualityReleasedForReport.verifyReleasedForReportSuccessfullyMsg()
				.contains("The check was successfully released for report.")) {
			Assert.assertTrue(true);
			logger.info("The check was successfully released for report.!");
		} else {
			logger.info("The check was Not successfully released for report.!");
			captureScreen(driver, "verifyReleasedForReportSuccessfullyMsg");
			Assert.assertTrue(false);
		}

		verificationQualityReleasedForReport.bridgeAccountLoggedOut();
		logger.info("Bridge Account Logged Out has Successfully!");
	}

	// CAT-- (Forward For Report) Case List - Search Result
	@Test(enabled = true, testName = "Verification CAT-- (Forward For Report) Case List", priority = 5, dependsOnMethods = {
			"verificationQualityReleasedForReport" })
	public void verifyCatForwarForReport() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		// bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		CaseCompletion forwardForReport = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		forwardForReport.superAdminforwardForReportCat(arsNumber[2], "Forward for report comments are good");
		logger.info("Forward for report details have been completed successfully!");

		if (forwardForReport.verifySuccessfullyForwardForReportMsg()
				.contains("The Case was successfully forwarded for the report.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully forwarded for the report.!");
		} else {
			logger.info("The Case was Not successfully forwarded for the report.!");
			captureScreen(driver, "verifySuccessfullyForwardForReportMsg");
			Assert.assertTrue(false);
		}

		forwardForReport.bridgeAccountLoggedOut();
		logger.info("Bridge Account Logged Out has Successfully!");
	}
*/
	// Reports Manager -- Search Report
	@Test(enabled = true, testName = "Verify Reports Manager Search Report", priority = 4, dependsOnMethods = {
			"verificationQualityAllocator" })
	public void verifyReportsManager() throws InterruptedException, IOException {
		//driver.get(bridgeURL);
		//logger.info("Bridge Url is opened");
		//BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		//bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		CaseCompletion reportManager = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		reportManager.superAdminReportsManager(arsNumber[2]);
		logger.info("Manager Reports details have been filled Successfully!");

		if (reportManager.verifyReportSuccessReviewedMsg().contains("Report Successfully Reviewed.")) {
			Assert.assertTrue(true);
			logger.info("The Report has been Reviewed Successfully!");
		} else {
			logger.info("The Report has Not been Reviewed Successfully!");
			captureScreen(driver, "verifyReportSuccessfullyReviewedMsg");
			Assert.assertTrue(false);
		}
	}

	// Generate Case Report By Crone URL hit
	@Test(enabled = true, testName = "Generated case Report and download Pdf", priority = 5, dependsOnMethods = {
			"verifyReportsManager" })
	public void generateCaseReportPdf() throws IOException, InterruptedException, ClassNotFoundException, SQLException {
		CaseCompletion caseReportPdf = new CaseCompletion(driver);
		String randomString = new String(Files.readAllBytes(Paths.get("copyGenerateCode.txt")));
		String generateReportCode[] = randomString.split("/");
		String reportGenerateUrl = "http://35.154.153.79/bridge_aws_multi/reports/generate_case_report2/"
				+ generateReportCode[7];
		Thread.sleep(2000);
		driver.get(reportGenerateUrl);
		logger.info("Chrone URL hasbeen hitted Successfully!");
		Thread.sleep(2000);
		driver.get(reportGenerateUrl);
		logger.info("The Case Report Id has not found Successfully!");
		Thread.sleep(2000);
		driver.get("http://35.154.153.79/bridge_aws_multi/reports/");
		logger.info("The Report Url has been Launched Successfully!");
		if (caseReportPdf.verifyReportStatusVerified().contains("Final")) {
			Assert.assertTrue(true);
			logger.info("The Report Status has been Verified Successfully!");
		} else {
			logger.info("The Report Status has not been Verified Successfully!");
			captureScreen(driver, "verifyReportStatusVerified");
			Assert.assertTrue(false);
		}

		// caseReportPdf.clickOnGeneratedPdfIcon();
		logger.info("Report Generated has been Downloaded Successfully!");
		Thread.sleep(2000);

		caseReportPdf.bridgeAccountLoggedOut();
		logger.info("Bridge Account Logged Out has Successfully!");
		// Database Connection--
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		DatabaseConnection_01 database = new DatabaseConnection_01();
		database.databaseConection(arsNumber[2]);
		logger.info("Database conection and queries has been executed successfully!");
	}

	// Verify Completed Case --(iBridge Portal)
	@Test(enabled = true, testName = "Verify Completed Case in iBridge Bucket", priority = 6, dependsOnMethods = {
			"generateCaseReportPdf" })
	public void verifyCompletedCasePresentOrNot() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		logger.info("BT Candidate Account has logged Successfully !");
		CaseCompletion completedCase = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		completedCase.verifyCompletedCaseInBucketPresentOrNot(arsNumber[2]);
		logger.info("Verify the completed case present or not in the Completed Case Bucket!");

		if (completedCase.verifyCompletedCaseAsMarkCompleted().contains("Completed")) {
			Assert.assertTrue(true);
			logger.info("Completed case Status has been Verified Successfully!");
		} else {
			logger.info("Completed case Status has Not been Verified Successfully!");
			captureScreen(driver, "verifyCompletedCaseAsMarkCompleted");
			Assert.assertTrue(false);
		}
	}

	// Verify Completed Case --(Bridge Portal)
	@Test(enabled = true, testName = "Verify Completed Case in iBridge Bucket", priority = 7, dependsOnMethods = {
			"verifyCompletedCasePresentOrNot" })
	public void reOpenCompletedCase() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		// bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		CaseCompletion reOpenCompletedCase = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		reOpenCompletedCase.verifyReOpenCompletedCase(arsNumber[2], "Reopened Comment Has added Successfully",
				"Reopened Comment Has added Successfully");
		logger.info("Completed case has been Re-opened Successfully!");
		if (reOpenCompletedCase.verifyCaseSuccessReopenedMsg().contains("The Case was successfully reopened.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully Re-opened!");
		} else {
			logger.info("The Case was Not successfully Re-opened!");
			captureScreen(driver, "verifyCaseSuccessReopenedMsg");
			Assert.assertTrue(false);
		}
	}

	// Reopen Case Verify in Wip Bucket---iBridge Portal
	@Test(enabled = true, testName = "Verify Completed Case in iBridge Bucket", priority = 8, dependsOnMethods = {
			"reOpenCompletedCase" })
	public void verifyReOpenedCaseInWip() throws IOException, InterruptedException {
		CaseCompletion reopenCaseWip = new CaseCompletion(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("BT Candidate Account has logged Successfully !");
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		reopenCaseWip.verifyReOpenedCasesInReopenedWip(arsNumber[2]);
		logger.info("Completed case has been Re-opened Successfully!");
		if (reopenCaseWip.verifyReopenedWipToolTipText().contains("Reopened - WIP")) {
			Assert.assertTrue(true);
			logger.info("The Reopened case has come in the Wip Bucket Successfully!");
		} else {
			logger.info("The Reopened case has come in the Wip Bucket Successfully!");
			captureScreen(driver, "verifyReopenedWipToolTipText");
			Assert.assertTrue(false);
		}
	}
}
