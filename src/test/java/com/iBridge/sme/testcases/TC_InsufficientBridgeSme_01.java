package com.iBridge.sme.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.sme.pageobject.InsufficientBridgeSme;
import com.iBridge.sme.pageobject.InsufficientiBridgeSme;
import com.iBridge.testcases.BaseClass;

public class TC_InsufficientBridgeSme_01 extends BaseClass {
	int totalInsufficienciesCount;
	int totalApprovalRequiredCount;
	int totalCasesOnHoldCountNumber;

	// Validation is being done for insuf getting raised on check from verfier role on bridge for the case.
	@Test(enabled = true, testName = "Marking Insuf by Verifier", priority = 1)
	public void verifyInsufficientVerifier() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account has Logged successfully!");
		InsufficientBridgeSme insuffVerifierSme = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffVerifierSme.superAdminVerifier(arsNumber[0], "24-Feb-2021", "12 PM", "Insufficient comment is good");
		logger.info("Antecedents to Verify all Records have filled Successfully!");
		if (insuffVerifierSme.verifyMarkedAsInsufficientMsg()
				.contains("Check is successfully marked as Insufficient.")) {
			Assert.assertTrue(true);
			logger.info("Check is successfully marked as Insufficient.!");
		} else {
			logger.info("Check is not successfully marked as Insufficient.!");
			captureScreen(driver, "verifyChecksSuccessfullyMsg");
			Assert.assertTrue(false);
		}

		insuffVerifierSme.clickOnVerifierLogoutBtn();
		logger.info("Bridge Account has logged out Successfully!");
	}

	// Test whether insuff is appearing on iBridge or not for the case
	@Test(enabled = true, testName = "Verify insuff is appearing on iBridge Insuff Bucket", priority = 2, dependsOnMethods = {
			"verifyInsufficientVerifier" })
	public void verifyInsufficientAppearingOniBridge() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		InsufficientiBridgeSme insuffAppearingiBridgeBucket = new InsufficientiBridgeSme(driver);
		insuffAppearingiBridgeBucket.insuffRaiseInInsufficienciesBucket();
		logger.info("Insufficiencies insuff case Status is appearing on iBridge Bucket Successfully!");
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		if (insuffAppearingiBridgeBucket.verifyCaseStatusInsufficienciesArsNumber().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Case status Insufficient has appeared successfully In iBridge insuff bucket!.");
		} else {
			logger.info("Case status Insufficient has Not appeared successfully In iBridge insuff bucket!.");
			captureScreen(driver, "verifyCaseStatusInsufficientTextName");
			Assert.assertTrue(false);
		}
		driver.navigate().back();
	}

	// Validating whether Insufficiencies insuff getting fulfilled on iBridge under insuff section
	@Test(enabled = true, testName = "Insufficiencies Insuf fulfillment on ibridge", priority = 3, dependsOnMethods = {
			"verifyInsufficientAppearingOniBridge" })
	public void verifyInsufficientpendingForFulfilment() throws IOException, InterruptedException {
		InsufficientiBridgeSme pendingForFulfilmentSme = new InsufficientiBridgeSme(driver);
		Thread.sleep(2000);
		pendingForFulfilmentSme.verifyInsufficienciesCountNumber();
		totalInsufficienciesCount = Integer.parseInt(pendingForFulfilmentSme.verifyInsufficienciesCountNumber());
		pendingForFulfilmentSme.pendingInsuffRaisedByAuthbridge((System.getProperty("user.dir") + "/documents/ARN.pdf"),
				"Comments added successfully");
		logger.info("Pending For Fulfilment Insufficient has Added successfully!");
		if (pendingForFulfilmentSme.verifyInsuffsentForReviewMsg().contains("Insuff has been sent for review!")) {
			Assert.assertTrue(true);
			logger.info("Insufficient details have been sent successfully for review!.");
		} else {
			logger.info("Insufficient details have not been sent successfully for review!..");
			captureScreen(driver, "verifyInsuffsentForReviewMsg");
			Assert.assertTrue(false);
		}

		pendingForFulfilmentSme.clickOnLogoutSmeBtn();
		logger.info("SME Account has Logged Out Successfully!");
	}

	// Validating Insufficiencies insuff getting fulfilled on bridge portal.
	@Test(enabled = true, testName = "Insufficiencies Insuff fulfillment on bridge by CAT", priority = 4, dependsOnMethods = {
			"verifyInsufficientpendingForFulfilment" })
	public void verifyInsufficiencyFulfillment() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		logger.info("Bridge account has Logged successfully!");
		InsufficientBridgeSme insuffFulfillment = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffFulfillment.userAdminInsufficiencyFulfillment(arsNumber[0], "Insufficient comments are good",
				"Insufficient Comments Have Added");
		logger.info("Insufficiency Fulfillment details have added Successfully!");
		if (insuffFulfillment.checkinsufficiencySuccessfullyFulfilledMsg()
				.contains("Check insufficiency is successfully fulfilled.")) {
			Assert.assertTrue(true);
			logger.info("Check insufficiency is successfully fulfilled.");
		} else {
			logger.info("Check insufficiency is Not successfully fulfilled.");
			captureScreen(driver, "verifyUpdatedSuccessfullyMessage");
			Assert.assertTrue(false);
		}

		insuffFulfillment.clickOnVerifierLogoutBtn();
		logger.info("Bridge Account has logged out Successfully!");
	}

	// Verify whether case got removed once Insufficiencies fulfilled iBridge Bucket Or Not.
	@Test(enabled = true, testName = "Verify whether case got removed once Insufficiencies insuff fulfilled iBridge", priority = 5, dependsOnMethods = {
			"verifyInsufficiencyFulfillment" })
	public void verifyInsufficientCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("SME Account has logged Successfully!");
		Thread.sleep(1000);
		InsufficientiBridgeSme insuffRaisedCasesAuthSme = new InsufficientiBridgeSme(driver);
//		driver.navigate().refresh();
		Thread.sleep(5000);
		//insuffRaisedCasesAuthSme.verifyInsufficienciesCountNumber();
//		int totalInsufficienciesCountNo = Integer.parseInt(insuffRaisedCasesAuthSme.verifyInsufficienciesCountNumber());
//		if (totalInsufficienciesCountNo < totalInsufficienciesCount) {
//			Assert.assertTrue(true);
//			logger.info("Insufficiencies insuff Bucket Case has Removed successfully.");
//		} else {
//			logger.info("Insufficiencies insuff Bucket Case has Not Removed successfully.");
//			captureScreen(driver, "verifyNoCaseFoundMsg");
//			Assert.assertTrue(false);
//		}

		insuffRaisedCasesAuthSme.insuffRaisedCasesByAuthbridge();
		logger.info("Verify Insuffient Case has been Filled Successfully!");
		insuffRaisedCasesAuthSme.clickOnLogoutSmeBtn();
		logger.info("SME Account has Logged Out Successfully!");
	}

	// Verify --Cost Approval Required Insufficient Raised By-- Bridge Portal Verifier.
	@Test(enabled = true, testName = "Cost Approval Required Insufficient Raised By Bridge Portal", priority = 6, dependsOnMethods = {
			"verifyInsufficientCasesPresentOrNot" })
	public void verifyCostApprovalRequiredInsufficient() throws IOException, AWTException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Entered Username and password!");
		InsufficientBridgeSme insuffCostApprovalRequired = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCostApprovalRequired.costApprovalInsuffFulfillment(arsNumber[0], "31-Mar-2021","12 PM","Verifier Comments good", "25-Feb-2021", "12 PM", "Raju Yadav",
				"Insuff Comments Are Good", "40");
		logger.info("Cost Approval Required mark insufficient have filled Successfully!");
		if (insuffCostApprovalRequired.verifySsuccessfullyMarkedInsuffMessage()
				.contains("Check is successfully marked as Insufficient.")) {
			Assert.assertTrue(true);
			logger.info("Check is successfully marked as Insufficient.");
		} else {
			logger.info("Check is Not successfully marked as Insufficient.");
			captureScreen(driver, "verifySsuccessfullyMarkedInsuffMessage");
			Assert.assertTrue(false);
		}

		insuffCostApprovalRequired.clickOnVerifierLogoutBtn();
		logger.info("Bridge Account has logged out Successfully!");
	}

	// Verify Cost Approval Required Bucket,Cost Approval Insuff Case got or Not--
	// iBridge SME
	@Test(enabled = true, testName = "Verify Cost Approval Required Insuff Case got or Not", priority = 7, dependsOnMethods = {
			"verifyCostApprovalRequiredInsufficient" })
	public void verifycostApprovalRequiredInsuffCasePresentOrNot() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("SME Account has logged Successfully!");
		InsufficientiBridgeSme costApprovalRequiredCase = new InsufficientiBridgeSme(driver);
		costApprovalRequiredCase.costApprovalRequiredInsuffCasePresentOrNot();
		logger.info("Approval Required Insuff bucket Case number has clicked successfully!");
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		if (costApprovalRequiredCase.verifyApprovalReqBucketActionApprove().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Approval Required Insuff case Ars Number has been Verified Successfully.");
		} else {
			logger.info("Approval Required Insuff case Ars Number has Not been Verified Successfully.");
			captureScreen(driver, "verifyApprovalReqBucketActionApprove");
			Assert.assertTrue(false);
		}
		driver.navigate().back();
	}

	// Verify Cost Approval Required Bucket-- Insuff Case Approved -- iBridge SME
	@Test(enabled = true, testName = "Verify Approval Required Insuff Case Approved", priority = 8, dependsOnMethods = {
			"verifycostApprovalRequiredInsuffCasePresentOrNot" })
	public void verifyApprovalRequiredInsufficient() throws IOException, AWTException, InterruptedException {
		InsufficientiBridgeSme costApprovalRequiredSme = new InsufficientiBridgeSme(driver);
		Thread.sleep(2000);
		costApprovalRequiredSme.approvalRequiredCountNo();
		totalApprovalRequiredCount = Integer.parseInt(costApprovalRequiredSme.approvalRequiredCountNo());
		logger.info("Verify Total approval required Insuff Case count Number Successfully!");
		costApprovalRequiredSme.approvalRequiredInsufficient();
		logger.info("Cost Approval Required mark insufficient have filled Successfully!");
		if (costApprovalRequiredSme.verifyCheckApprovedSuccessfullyMsg()
				.contains("Your Check has been Approved Successfully")) {
			Assert.assertTrue(true);
			logger.info("Your Check has been Approved Successfully");
		} else {
			logger.info("Your Check has not been Approved Successfully");
			captureScreen(driver, "verifyCheckApprovedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Test cost approval given then whether case getting removed or not from cost
	// approval bucket .
	@Test(enabled = true, testName = "Verify whether case got removed once insuff fulfilled", priority = 9, dependsOnMethods = {
			"verifyApprovalRequiredInsufficient" })
	public void verifycostApprovalRequiredRemovedOrNot() throws IOException, InterruptedException {
		InsufficientiBridgeSme costApprovalRequiredBucket = new InsufficientiBridgeSme(driver);
		costApprovalRequiredBucket.costApprovalRequiredRemovedOrNot();
		logger.info("Approval Required bucket has checked insuff case removed Successfully!.");
		driver.navigate().refresh();
		Thread.sleep(2000);
		int totalApprovalRequiredNo = Integer.parseInt(costApprovalRequiredBucket.approvalRequiredCountNo());
		if (totalApprovalRequiredNo < totalApprovalRequiredCount) {
			logger.info("Approval required insuff case has removed Successfully");
		} else {
			logger.info("Approval required insuff case has Not Removed Successfully");
			captureScreen(driver, "verifyApprovalReqCaseRemoved");
			Assert.assertTrue(false);
		}
		costApprovalRequiredBucket.clickOnApprovalReqCountNumber();
		logger.info("Clicked On approval Required bucket Has Successfully!");
		costApprovalRequiredBucket.clickOnLogoutSmeBtn();
		logger.info("SME Account has Logged Out Successfully!");
	}

	// Validating whether both type insuff getting raised on bridge.
	@Test(enabled = true, testName = "Both type raised by verifier", priority = 10, dependsOnMethods = {
			"verifycostApprovalRequiredRemovedOrNot" })
	public void verifyAdminUserReasonInsufficientBoth() throws IOException, AWTException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Entered Username and password!");
		InsufficientBridgeSme reasonInsufficientBoth = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		reasonInsufficientBoth.adminUserReasonInsufficientBoth(arsNumber[0], "25-Feb-2021", "12 PM",
				"Insufficient is good Comments", "40");
		logger.info("Approval Required mark insufficient have filled Successfully!");
		if (reasonInsufficientBoth.verifyMarkAsInsufficientMessage()
				.contains("Check is successfully marked as Insufficient.")) {
			Assert.assertTrue(true);
			logger.info("Check is successfully marked as Insufficient.");
		} else {
			logger.info("Check is Not successfully marked as Insufficient.");
			captureScreen(driver, "verifyMarkAsInsufficientMessage");
			Assert.assertTrue(false);
		}

		reasonInsufficientBoth.clickOnVerifierLogoutBtn();
		logger.info("Bridge Account has logged out Successfully!");
	}

	// Verify Cost Approval Required Insuff Case Bucket has Case Approved -- iBridge
	// SME
	@Test(enabled = true, testName = "Approval Required Insuff Case has Approved", priority = 11, dependsOnMethods = {
			"verifyAdminUserReasonInsufficientBoth" })
	public void verifyApprovalRequiredAndInsufficientBoth() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("SME Account has logged Successfully!");
		InsufficientiBridgeSme costApprovalRequiredBoth = new InsufficientiBridgeSme(driver);
		Thread.sleep(2000);
//		driver.navigate().refresh();
		Thread.sleep(2000);
//		costApprovalRequiredBoth.approvalRequiredCountNo();
//		totalApprovalRequiredCount = Integer.parseInt(costApprovalRequiredBoth.approvalRequiredCountNo());
		
		// Approval Required -iBridge SME --Overview Action Required
		costApprovalRequiredBoth.approvalRequiredInsufficient();
		logger.info("Cost Approval Required mark insufficient have filled Successfully!");
		if (costApprovalRequiredBoth.verifyCheckApprovedSuccessfullyMsg()
				.contains("Your Check has been Approved Successfully")) {
			Assert.assertTrue(true);
			logger.info("Your Check has been Approved Successfully");
		} else {
			logger.info("Your Check has not been Approved Successfully");
			captureScreen(driver, "verifyCheckApprovedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Test whether Insufficiencies insuff case has approved on iBridge-- iBridge
	// SME
	@Test(enabled = true, testName = "Insufficiencies insuff case has Approved", priority = 12, dependsOnMethods = {
			"verifyApprovalRequiredAndInsufficientBoth" })
	public void verifyApprovalRequiredInsuffPresentOrNot() throws InterruptedException, IOException {
		InsufficientiBridgeSme costApprovalRequired = new InsufficientiBridgeSme(driver);
		costApprovalRequired.clickOnDashboardVerifyInsufficientCase();
		logger.info("Click On Dashboard Module and Verify Insufficient Cases.");
		Thread.sleep(2000);
//		driver.navigate().refresh();
		Thread.sleep(2000);
		costApprovalRequired.verifyInsufficienciesCountNumber();
		totalInsufficienciesCount = Integer.parseInt(costApprovalRequired.verifyInsufficienciesCountNumber());
		// Insufficiency Both-- Action Required -iBridge Portal
		InsufficientiBridgeSme reasonInsufficientBothSme = new InsufficientiBridgeSme(driver);
		reasonInsufficientBothSme.approvalRequiredAndInsufficientBoth();
		logger.info("Approval Required mark insufficient have filled Successfully!");
		if (reasonInsufficientBothSme.checkHasBeenApprovedSuccess()
				.contains("Your Check has been Approved Successfully")) {
			Assert.assertTrue(true);
			logger.info("Your Check has been Approved Successfully");
		} else {
			logger.info("Your Check has Not been Approved Successfully");
			captureScreen(driver, "checkHasBeenApprovedSuccess");
			Assert.assertTrue(false);
		}
	}

	// Test cost approval given then whether case getting removed or not from cost
	// approval bucket
	@Test(enabled = true, testName = "Verify whether case got removed once insuff fulfilled", priority = 13, dependsOnMethods = {
			"verifyApprovalRequiredInsuffPresentOrNot" })
	public void verifyApprovalRequiredInsuffBothRemovedOrNot() throws IOException, InterruptedException {
		InsufficientiBridgeSme costApprovalRequiredBucket = new InsufficientiBridgeSme(driver);
		costApprovalRequiredBucket.costApprovalRequiredRemovedOrNot();
		logger.info("Approval Required bucket has checked insuff case removed Successfully!.");
		Thread.sleep(2000);
//		driver.navigate().refresh();
		Thread.sleep(2000);
		int totalApprovalRequiredNo = Integer.parseInt(costApprovalRequiredBucket.approvalRequiredCountNo());
		if (totalApprovalRequiredNo < totalApprovalRequiredCount) {
			Assert.assertTrue(true);
			logger.info("Cost Approval Required insuff case has removed Successfully!");
		} else {
			logger.info("Cost Approval Required insuff case has Not removed Successfully!");
			captureScreen(driver, "verifyApprovalReqInsuffRemoved");
			Assert.assertTrue(false);
		}
		driver.navigate().back();
	}

	// Test Insufficiencies insuff given then whether case getting removed or not
	// from Insufficiencies bucket.
	@Test(enabled = true, testName = "Verify whether case got removed once Insufficiencies insuff fulfilled", priority = 14, dependsOnMethods = {
			"verifyApprovalRequiredInsuffBothRemovedOrNot" })
	public void verifyInsufficientBothCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		InsufficientiBridgeSme insuffRaisedCasesAuthSme = new InsufficientiBridgeSme(driver);
		insuffRaisedCasesAuthSme.costApprovalRequiredRemovedOrNot();
		driver.navigate().refresh();
		Thread.sleep(2000);
		insuffRaisedCasesAuthSme.verifyInsufficienciesCountNumber();
		int totalInsufficienciesCountNo = Integer.parseInt(insuffRaisedCasesAuthSme.verifyInsufficienciesCountNumber());
		if (totalInsufficienciesCountNo < totalInsufficienciesCount) {
			Assert.assertTrue(true);
			logger.info("Insufficiencies insuff bucket case has removed successfully.");
		} else {
			logger.info("Insufficiencies insuff bucket case has Not removed successfully.");
			captureScreen(driver, "verifyInsufficienciesInsuffCaseRemoved");
			Assert.assertTrue(false);
		}
		insuffRaisedCasesAuthSme.insuffRaisedCasesByAuthbridge();
		logger.info("Verify Insuffient Case ahs been Filled Successfully!");
	}

	// CAT Role- Insuff Raised for 'Cases On Hold' by selecting Action 'Put On
	// Hold'-- Bridge Portal.
	@Test(enabled = true, testName = "Raising insuff for Case on hold Bucket", priority = 15, dependsOnMethods = {
			"verifyInsufficientBothCasesPresentOrNot" })
	public void verifyAdminUserInsuffRaisedCasesOnHold() throws IOException, AWTException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(catRoleUsername, catRolePassword);
		logger.info("Bridge account has Logged successfully!");
		InsufficientBridgeSme insuffRaisedCasesOnHold = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffRaisedCasesOnHold.adminUserInsuffRaisedCasesOnHold(arsNumber[0], "Case On hold comments are good");
		logger.info("Insufficient Cases on hold has raised successfully!");

		if (insuffRaisedCasesOnHold.verifySuccessfullyPutOnHoldMsg()
				.contains("The Case was successfully put on hold.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully put on hold.");
		} else {
			logger.info("The Case was Not successfully put on hold.");
			captureScreen(driver, "verifySuccessfullyPutOnHoldMsg");
			Assert.assertTrue(false);
		}
		insuffRaisedCasesOnHold.clickOnVerifierLogoutBtn();
		logger.info("Bridge Account has logged out Successfully!");
	}

	// Verify Cases on hold Ars Number present in Case on hold Bucket or Not.
	@Test(enabled = true, testName = "Verify whether case got once Cases on hold insuff bucket", priority = 16, dependsOnMethods = {
			"verifyAdminUserInsuffRaisedCasesOnHold" })
	public void verifyInsuffCasesOnHoldPresentOrNot() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		// LoginPage loginPage = new LoginPage(driver);
		// loginPage.login(usernameSme, passwordSme);
		logger.info("SME Account has logged Successfully!");
		InsufficientiBridgeSme insuffRaisedCaseOnHold = new InsufficientiBridgeSme(driver);
		insuffRaisedCaseOnHold.getCasesOnHoldTotalCountNumber();
		totalCasesOnHoldCountNumber = Integer.parseInt(insuffRaisedCaseOnHold.getCasesOnHoldTotalCountNumber());
		insuffRaisedCaseOnHold.casesOnHoldBucketGoahed();
		logger.info("The Cases on hold bucket have clicked on successfully!");
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		if (insuffRaisedCaseOnHold.verifyCasesOnHoldListArsNumber().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Cases On Hold Insuff case Ars Number has been Verified Successfully.");
		} else {
			logger.info("Cases On Hold Insuff case Ars Number has Not been Verified Successfully.");
			captureScreen(driver, "verifyCasesOnHoldListArsNumber");
			Assert.assertTrue(false);
		}
		driver.navigate().back();
	}

	// Verify insuff case removed Successfully from case on hold bucket or Not.
	@Test(enabled = true, testName = "Verify whether case got once Cases on hold insuff bucket", priority = 17, dependsOnMethods = {
			"verifyInsuffCasesOnHoldPresentOrNot" })
	public void verifyInsuffCasesOnHoldRemovedOrNot() throws IOException, AWTException, InterruptedException {
		InsufficientiBridgeSme insuffCaseOnHoldRemoved = new InsufficientiBridgeSme(driver);
		insuffCaseOnHoldRemoved.selectGoAheadActionCaseOnHold();
		logger.info("Cases on hold case has performed Go ahead Action successfully!");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		insuffCaseOnHoldRemoved.getCasesOnHoldTotalCountNumber();
		int totalInsuffCaseOnHoldCountNo = Integer.parseInt(insuffCaseOnHoldRemoved.getCasesOnHoldTotalCountNumber());
		if (totalInsuffCaseOnHoldCountNo < totalCasesOnHoldCountNumber) {
			Assert.assertTrue(true);
			logger.info("Cases On Hold insuff bucket case has removed successfully.");
		} else {
			logger.info("Cases On Hold insuff bucket case has Not removed successfully.");
			captureScreen(driver, "verifyCasesOnHoldInsuffCaseRemoved");
			Assert.assertTrue(false);
		}
	}

	// Verify Case Status -Closed By Client-iBridge SME
	@Test(enabled = true, testName = "Verify Case Status -Closed By Client SME", priority = 18, dependsOnMethods = {
			"verifyInsuffCasesOnHoldRemovedOrNot" })
	public void verifywithdrawCaseStatusClosedByClient() throws IOException, AWTException, InterruptedException {
		InsufficientiBridgeSme withdrawCaseStatus = new InsufficientiBridgeSme(driver);
		withdrawCaseStatus.withdrawCaseStatusClosedByClient();
		logger.info("Candidate Case Status have marked as Closed By Client Successfully!");

		// Verify-- Case Status -Closed By Client
		if (withdrawCaseStatus.verifyCaseStatusTextMsg().contains("Closed By Client")) {
			Assert.assertTrue(true);
			logger.info("Case status has marked as Closed By Client Successfully!");
		} else {
			logger.info("Case status has Not marked as Closed By Client Successfully!");
			captureScreen(driver, "verifyCaseStatusTextMsg");
			Assert.assertTrue(false);
		}
		withdrawCaseStatus.clickOnLogoutSmeBtn();
		logger.info("SME Account has Logged Out Successfully!");
	}

}
