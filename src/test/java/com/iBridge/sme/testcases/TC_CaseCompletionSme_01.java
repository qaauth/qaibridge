package com.iBridge.sme.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CaseCompletion;
import com.iBridge.sme.pageobject.CaseCompletionSme;
import com.iBridge.testcases.BaseClass;

import database.connection.DatabaseConnection_01;

public class TC_CaseCompletionSme_01 extends BaseClass {
	// Checks Summary (Close By Client)-- Case Summary Details
	@Test(enabled = true, testName = "Verify Checks Summary Close By Client", priority = 1)
	public void checksSummaryClosedByClient() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		// bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		logger.info("Bridge account has Logged successfully!");

		CaseCompletionSme checksSummaryClosedByClient = new CaseCompletionSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		checksSummaryClosedByClient.userAdminChecksSummaryClosedByClient(arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good", arsNumber[0], "Close By Client comment is good", arsNumber[0],
				"Close By Client comment is good");
		logger.info("Check is successfully marked as Closed by Client.!");

		if (checksSummaryClosedByClient.verifyProfessionalReferenceCheckClosedByClientMsg()
				.contains("Professional Reference Check ( Closed by Client )")) {
			Assert.assertTrue(true);
			logger.info("All Checks Summary are successfully marked as Closed by Client.!");
		} else {
			logger.info("All Checks Summary are not successfully marked as Closed by Client.!");
			captureScreen(driver, "verifySuccessfullyMarkedAsClosedByClientMsg");
			Assert.assertTrue(false);
		}

		checksSummaryClosedByClient.bridgeAccountLoggedOut();
		logger.info("Bridge Account Logged Out has Successfully!");
	}

	// Current Address Verification (Verifier --(Super Admin)) --Checks Summary
	@Test(enabled = true, testName = "Verify Current Address Verification Check Summary", priority = 2, dependsOnMethods = {
			"checksSummaryClosedByClient" })
	public void educationWCheckCloseVerification() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		CaseCompletionSme currentAddressVerification = new CaseCompletionSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
//		currentAddressVerification.currentAddressVerificationCheck(arsNumber[0], "110091", "Yes", "Ankit Kumar",
//				"Two Years", "24-Feb-2021", "Good Comments", "Delhi", "Shariq Abbas", "12 PM", "White", "White Color",
//				"Gurugram");
//		logger.info("Current Address Verification Antecedents to Verify details have been filled successfully!");
//
//		if (currentAddressVerification.verifyCurrentAddressVerificationCompletedTextName()
//				.contains("Current Address Verification ( Completed )")) {
//			Assert.assertTrue(true);
//			logger.info("Current Address Verification Check is successfully marked as Closed by Client.!");
//		} else {
//			logger.info("Current Address Verification Check is not successfully marked as Closed by Client.!");
//			captureScreen(driver, "verifyCurrentAddressVerificationCompletedTextName");
//			Assert.assertTrue(false);
//		}
	}

	// Verification Quality Allocator--Check List - Search Result - (14 records)

	@Test(enabled = true, testName = "Verify Verification Quality Allocator--Check List", priority = 3, dependsOnMethods = {
			"educationWCheckCloseVerification" })
	public void verificationQualityAllocator() throws IOException, InterruptedException {
		CaseCompletion verificationQualityAllocator = new CaseCompletion(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		verificationQualityAllocator.superAdminVerificationQualityAllocator(arsNumber[0],
				"Verification Quality Allocator Comments are good");
		logger.info("Verification Quality Allocator details has been filled Successfully!");

		if (verificationQualityAllocator.verificationQualityAllocatorSuccessfullyMsg()
				.contains("The selected checks were successfully released for report.")) {
			Assert.assertTrue(true);
			logger.info("The selected checks were successfully released for report.!");
		} else {
			logger.info("The selected checks were Not successfully released for report.!");
			captureScreen(driver, "verificationQualityAllocatorSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Verification Quality-- Check List - Search Result - (14 records)

	@Test(enabled = true, testName = "Verification Quality Released for Report", priority = 4, dependsOnMethods = {
			"verificationQualityAllocator" })
	public void verificationQualityReleasedForReport() throws IOException, InterruptedException {
		CaseCompletionSme verificationQualityReleasedForReport = new CaseCompletionSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
//		verificationQualityReleasedForReport.superAdminVerificationQuality(arsNumber[0],
//				"Verification Quality Released for report Comments are good");
//		logger.info("Verification Quality details have been filled Successfully!");
//
//		if (verificationQualityReleasedForReport.verifyReleasedForReportSuccessfullyMsg()
//				.contains("The check was successfully released for report.")) {
//			Assert.assertTrue(true);
//			logger.info("The check was successfully released for report.!");
//		} else {
//			logger.info("The check was Not successfully released for report.!");
//			captureScreen(driver, "verifyReleasedForReportSuccessfullyMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verification Quality Allocator--Check List - Search Result - (14 records)
	@Test(enabled = true, testName = "Verify Verification Quality Allocator for Report--Check List", priority = 4, dependsOnMethods = {
			"verificationQualityReleasedForReport" })
	public void verificationQualityAllocatorForReport() throws IOException, InterruptedException {
//		CaseCompletionSme verificationQualityReleasedForReports = new CaseCompletionSme(driver);
//		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
//		String arsNumber[] = data.split(" ");
//		verificationQualityReleasedForReports.superAdminVerificationQualityAllocators(arsNumber[0],
//				"Verification Quality Allocator Comments are good");
//		logger.info("Verification Quality Allocator details has been filled Successfully!");
//
//		if (verificationQualityReleasedForReports.verificationQualityAllocatorSuccessMsg()
//				.contains("The selected checks were successfully released for report.")) {
//			Assert.assertTrue(true);
//			logger.info("The selected checks were successfully released for report..!");
//		} else {
//			logger.info("The selected checks were not successfully released for report.!");
//			captureScreen(driver, "verificationQualityAllocatorSuccessMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Reports Manager -- Search Report
	@Test(enabled = true, testName = "Verify Reports Manager Search Report", priority = 5, dependsOnMethods = {
			"verificationQualityAllocatorForReport" })
	public void verifyReportsManager() throws InterruptedException, IOException {
		CaseCompletionSme reportManager = new CaseCompletionSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		reportManager.superAdminReportManager(arsNumber[0]);
		logger.info("Manager Reports details have been filled Successfully!");

//		if (reportManager.reportSuccessfullyReviewedMessage().contains("Report Successfully Reviewed.")) {
//			Assert.assertTrue(true);
//			logger.info("The Report has been Reviewed Successfully!");
//		} else {
//			logger.info("The Report has Not been Reviewed Successfully!");
//			captureScreen(driver, "reportSuccessfullyReviewedMessage");
//			Assert.assertTrue(false);
//		}
	}

	// Generate Case Report By Crone URL hit
	@Test(enabled = true, testName = "Generated case Report and download Pdf", priority = 6, dependsOnMethods = {
			"verifyReportsManager" })
	public void generateCaseReportPdf() throws IOException, InterruptedException, ClassNotFoundException, SQLException {
		CaseCompletion caseReportPdf = new CaseCompletion(driver);
		String randomString = new String(Files.readAllBytes(Paths.get("copySmeReportGenerateCode.txt")));
		String generateReportCode[] = randomString.split("/");
		String reportGenerateUrl = "http://35.154.153.79/bridge_aws_multi/reports/generate_case_report2/"
				+ generateReportCode[7];
		Thread.sleep(2000);
		driver.get(reportGenerateUrl);
		logger.info("Chrone URL has been hitted Successfully!");
		Thread.sleep(2000);
		driver.get(reportGenerateUrl);
		logger.info("The Case Report Id has not found Successfully!");
		Thread.sleep(2000);
		driver.get("http://35.154.153.79/bridge_aws_multi/reports/");
		logger.info("The Report Url has been Launched Successfully!");
		if (caseReportPdf.verifyReportStatusVerified().contains("Final")) {
			Assert.assertTrue(true);
			logger.info("The Report Status has been Verified Successfully!");
			Thread.sleep(20000);
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
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		DatabaseConnection_01 database = new DatabaseConnection_01();
		database.databaseConection(arsNumber[0]);
		logger.info("Database conection and queries has been executed successfully!");
		Thread.sleep(5000);
	}
}
