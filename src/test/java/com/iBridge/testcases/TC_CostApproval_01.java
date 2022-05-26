package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.InsufficientiBridge;
import com.iBridge.pageobject.LoginPage;

public class TC_CostApproval_01 extends BaseClass {
	// Verify Insufficient Verifier--(Super Admin)
	@Test(enabled = true, testName = "Verify Raising Insuff On Verifier", priority = 1)
	public void verifyCostApprovalVerifier() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account has Logged successfully!");

		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		InsufficientBridge insuffVerifier = new InsufficientBridge(driver);
		insuffVerifier.superAdminVerifierCostApproval(arsNumber[2], "Ashish Kumar", "Cost Approval", "40");
		logger.info("Mark Insufficiency Cost Approval Required has filled Successfully!");

		if (insuffVerifier.verifyMarkedAsInsufficientMsg().contains("Check is successfully marked as Insufficient.")) {
			Assert.assertTrue(true);
			logger.info("Mark Insufficiency Cost Approval Required Successfully!");
		} else {
			logger.info("Mark Insufficiency Cost Approval has not Required Successfully!");
			captureScreen(driver, "verifyCostApprovalVerifier");
			Assert.assertTrue(false);
		}
	}

	// Verify Cost Approval Case On Hold Bucket Or Not-- Appearing(iBridge Portal)
	@Test(enabled = true, testName = "Verify Raising cost approval On hold Cases Bucket", priority = 2, dependsOnMethods = {
			"verifyCostApprovalVerifier" })
	public void apprringCostApprovalCaseOnHoldBucketOrNot() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
		InsufficientiBridge insuffOnHoldCase = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffOnHoldCase.verifyCostApprovalCaseOnHoldBucketOrNot(arsNumber[2]);
		logger.info("Mark Insufficiency Cost Approval Required has filled Successfully!");

		if (insuffOnHoldCase.verifyCandidateNameAppearingCostApprovalCase().contains("Bangalore")) {
			Assert.assertTrue(true);
			logger.info("Candidate FirstName has Verified Successfully!");
		} else {
			logger.info("Candidate FirstName has Not Verified Successfully!");
			captureScreen(driver, "verifyCandidateNameAppearingCostApprovalCase");
			Assert.assertTrue(false);
		}
	}

	// Verify Cost Approval Verifier-- On Hold Cases(iBridge Portal)
	@Test(enabled = true, testName = "Verify Raising cost approval On hold Cases Bucket, Approved Successfully", priority = 3, dependsOnMethods = {
			"apprringCostApprovalCaseOnHoldBucketOrNot" })
	public void verifyCostApprovalOnHoldCases() throws InterruptedException, IOException {
		InsufficientiBridge insuffOnHoldCase = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffOnHoldCase.submittedCasesTrackerOnHoldCases(arsNumber[2],
				"On hold cases has been Commented Successfully");
		logger.info("Mark Insufficiency Cost Approval Required has filled Successfully!");

		if (insuffOnHoldCase.verifyOnHoldCaseApprovedMsg().contains("Your Check has been Approved Successfully")) {
			Assert.assertTrue(true);
			logger.info("Your Check has been Approved Successfully!");
		} else {
			logger.info("Your Check has Not been Approved Successfully!");
			captureScreen(driver, "verifyOnHoldCaseApprovedMsg");
			Assert.assertTrue(false);
		}
	}

	// Insufficient Cases-- Verify--Present or not--iBridge Portal
	@Test(enabled = true, testName = "Verify whether case got removed once insuff fulfilled", priority = 4, dependsOnMethods = {
			"verifyCostApprovalOnHoldCases" })
	public void verifyInsufficientCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		InsufficientiBridge insuffCaseArsNumber = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseArsNumber.verifyOnHoldCasePresentOrNot(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
		if (insuffCaseArsNumber.verifyNoCaseFoundMsg().contains("No case(s) found")) {
			Assert.assertTrue(true);
			logger.info("No case(s) found message Has Got Successfully!");
		} else {
			logger.info("No case(s) found message has not Got succesfully.");
			captureScreen(driver, "verifyOnHoldBucketNoCaseFoundMsg");
			Assert.assertTrue(false);
		}
	}
}
