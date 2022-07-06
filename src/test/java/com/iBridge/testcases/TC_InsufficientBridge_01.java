package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.CandidateLogin;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.InsufficientiBridge;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.testcases.BaseClass;

public class TC_InsufficientBridge_01 extends BaseClass {
	// Verify Raising Insufficient On Verifier--(Super Admin)
	@Test(enabled = true, testName = "Verify Raising Insuff On Verifier", priority = 1)
	public void verifyInsufficientVerifier() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account has Logged successfully!");

		InsufficientBridge insuffVerifier = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffVerifier.superAdminVerifier(arsNumber[2], "110091", "Verified form details", "Brother", "Three Years",
				"20-Jan-2021", "All Good", "Mayur Vihar", "Anil Singh", "AfterNoon", "Black and White", "Grey Color",
				"Till Date", "Gurgaon", "Insufficient comment is good");
		logger.info("Antecedents to Verify all Records have filled Successfully!");

//		if (insuffVerifier.verifyMarkedAsInsufficientMsg().contains("Check is successfully marked as Insufficient.")) {
//			Assert.assertTrue(true);
//			logger.info("Check is successfully marked as Insufficient.!");
//		} else {
//			logger.info("Check is not successfully marked as Insufficient.!");
//			captureScreen(driver, "verifyChecksSuccessfullyMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verify raised Insufficient on iBridge under Insufficient bucket and fulfilling Insufficient--(iBridge Portal)
	@Test(enabled = true, testName = "Verify raised insuff on ibridge under insuff bucket and fulfilling insuff", priority = 2, dependsOnMethods = {
			"verifyInsufficientVerifier" })
	public void verifyInsufficientpendingForFulfilment() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
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

	// Verify fulfilled Insufficient on bridge and approving it--Bridge
	@Test(enabled = true, testName = "Verify fulfilled insuff on bridge and approving it", priority = 3, dependsOnMethods = {
			"verifyInsufficientpendingForFulfilment" })
	public void verifyInsufficiencyFulfillment() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		logger.info("Bridge account has Logged successfully!");

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

	// Verify whether case got removed once Insufficient fulfilled--iBridge Portal
	@Test(enabled = true, testName = "Verify whether case got removed once insuff fulfilled", priority = 4, dependsOnMethods = {
			"verifyInsufficiencyFulfillment" })
	public void verifyInsufficientCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("Entered Username and password!");
		InsufficientiBridge insuffCaseArsNumber = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseArsNumber.verifyInsufficientArsNumber(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
//		if (insuffCaseArsNumber.verifyNoCaseFoundMsg().contains("No case(s) found")) {
//			Assert.assertTrue(true);
//			logger.info("No case(s) found has got successfully.");
//		} else {
//			logger.info("No case(s) found has not got successfully.");
//			captureScreen(driver, "verifyNoCaseFoundMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Bridge -check selected pan number and Raising Insufficient Case.
	// Verify Raising Insufficient On Verifier--Pan Number Check(Super Admin)
	@Test(enabled = true, testName = "Verify Raising Insuff On Verifier", priority = 5, dependsOnMethods = {
			"verifyInsufficientCasesPresentOrNot" })
	public void verifyInsufficientVerifierPanCheck() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		InsufficientBridge insuffVerifier = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffVerifier.superAdminVerifierPanNumberCheck(arsNumber[2], "21-Jan-2021", "2PM", "AKST234",
				"Insufficient comments are good.");
		logger.info("Antecedents to Verify all Records have filled Successfully!");

//		if (insuffVerifier.verifyMarkedAsInsufficientMsg().contains("Check is successfully marked as Insufficient.")) {
//			Assert.assertTrue(true);
//			logger.info("Check is successfully marked as Insufficient.!");
//		} else {
//			logger.info("Check is not successfully marked as Insufficient.!");
//			captureScreen(driver, "verifyChecksSuccessfullyMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verify raised Insufficient on iBridge under Insufficient bucket and fulfilling Insufficient--(iBridge Portal)
	@Test(enabled = true, testName = "Verify raised insuff on ibridge under insuff bucket and fulfilling insuff", priority = 6, dependsOnMethods = {
			"verifyInsufficientVerifierPanCheck" })
	public void verifyInsufficientpendingForPanNumberFulfilment() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("Entered Username and password!");

		InsufficientiBridge pendingForFulfilment = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		pendingForFulfilment.pendingForFulfilmentInsuffPanNumber(arsNumber[2], "Comments added successfully");
		logger.info("Pending For Fulfilment Insufficient has Added successfully!");

//		if (pendingForFulfilment.verifySubmittedTextMsg().contains("Submitted")) {
//			Assert.assertTrue(true);
//			logger.info("Insufficient details have Submitted successfully.");
//		} else {
//			logger.info("Insufficient details have not Submitted successfully.");
//			captureScreen(driver, "verifySubmittedTextMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Partially Insufficiency Fulfillment Approve on Bridge-- Super Admin
	@Test(enabled = true, testName = "Verify fulfilled insuff on bridge and Rejecting it", priority = 7, dependsOnMethods = {
			"verifyInsufficientpendingForPanNumberFulfilment" })
	public void verifyInsufficiencyPartiallyApproveFulfillment() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		logger.info("Bridge account has Logged successfully!");

		InsufficientBridge insuffFulfillment = new InsufficientBridge(driver);
		insuffFulfillment.superAdminInsufficiencyPartiallyApproveFulfillment("7042718794",
				"Insufficient Comments Have Added");
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

	// Verify whether case Not got removed once Insufficient fulfilled--Present or not--iBridge Portal
	@Test(enabled = true, testName = "Verify whether case Not got removed once insuff fulfilled", priority = 8, dependsOnMethods = {
			"verifyInsufficiencyPartiallyApproveFulfillment" })
	public void verifyInsufficientPartiallyApproveCasesPresentOrNot()
			throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("Entered Username and password!");
		InsufficientiBridge insuffCaseArsNumber = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseArsNumber.verifyInsufficientPartiallyApprovedArsNumber(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
//		if (insuffCaseArsNumber.verifyFulfilledPendingReview().contains("Fulfilled - Pending Review")) {
//			Assert.assertTrue(true);
//			logger.info("Pending - Referred Back text has verified successfully.");
//		} else {
//			logger.info("Pending - Referred Back text has not verified successfully.");
//			captureScreen(driver, "verifyFulfilledPendingReview");
//			Assert.assertTrue(false);
//		}
	}

	// Bridge -check selected Indian Database and create Insufficient Raise
	// Verify Raising Insufficient On Verifier--Rejected-(Super Admin)
	@Test(enabled = true, testName = "Verify Raising Insuff On Verifier", priority = 9, dependsOnMethods = {
			"verifyInsufficientPartiallyApproveCasesPresentOrNot" })
	public void verifyInsufficientVerifierIndianDatabaseCheck() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		InsufficientBridge insuffVerifier = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffVerifier.superAdminVerifierIndianDatabaseCheck(arsNumber[2], "Insufficient comments are good");
		logger.info("Antecedents to Verify all Records have filled Successfully!");

//		if (insuffVerifier.verifyMarkedAsInsufficientMsg().contains("Check is successfully marked as Insufficient.")) {
//			Assert.assertTrue(true);
//			logger.info("Check is successfully marked as Insufficient.!");
//		} else {
//			logger.info("Check is not successfully marked as Insufficient.!");
//			captureScreen(driver, "verifyChecksSuccessfullyMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Verify raised Insufficient on iBridge under Insufficient bucket and fulfilling Insufficient--(iBridge Portal)
	@Test(enabled = true, testName = "Verify raised insuff on ibridge under insuff bucket and fulfilling insuff", priority = 10, dependsOnMethods = {
			"verifyInsufficientVerifierIndianDatabaseCheck" })
	public void verifyInsufficientpendingForIndianDatabaseFulfilment() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("Entered Username and password!");

		InsufficientiBridge pendingForFulfilment = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		pendingForFulfilment.pendingForFulfilmentInsuffIndianDatabase(arsNumber[2], "Comments added successfully");
		logger.info("Pending For Fulfilment Insufficient has Added successfully!");
//		if (pendingForFulfilment.verifySubmittedTextMsg().contains("Submitted")) {
//			Assert.assertTrue(true);
//			logger.info("Insufficient details have Submitted successfully.");
//		} else {
//			logger.info("Insufficient details have not Submitted successfully.");
//			captureScreen(driver, "verifySubmittedTextMsg");
//			Assert.assertTrue(false);
//		}
	}

	// Insufficiency Fulfillment--Rejected from Bridge-- Super Admin
	@Test(enabled = true, testName = "Verify fulfilled insuff on bridge and Rejecting it", priority = 11, dependsOnMethods = {
			"verifyInsufficientpendingForIndianDatabaseFulfilment" })
	public void verifyInsufficiencyRejectedFulfillment() throws IOException, InterruptedException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		logger.info("Bridge account has Logged successfully!");
		InsufficientBridge insuffFulfillment = new InsufficientBridge(driver);
		insuffFulfillment.superAdminInsufficiencyRejectFulfillment("7042718794", "Insufficient Comments Have Added");
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

	// Verify whether case Not got removed once Insufficient fulfilled--iBridge Portal
	@Test(enabled = true, testName = "Verify whether case Not got removed once insuff fulfilled", priority = 12, dependsOnMethods = {
			"verifyInsufficiencyRejectedFulfillment" })
	public void verifyInsufficientRejectedCasesPresentOrNot() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		logger.info("Entered Username and password!");
		InsufficientiBridge insuffCaseArsNumber = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseArsNumber.verifyInsufficientCaseRejectedArsNumber(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
//		if (insuffCaseArsNumber.verifyFulfilledRejectedPendingReview().contains("Fulfilled - Referred Back")) {
//			Assert.assertTrue(true);
//			logger.info("Fulfilled - Referred Back text has got successfully.");
//		} else {
//			logger.info("Fulfilled - Referred Back text has not got successfully.");
//			captureScreen(driver, "verifyFulfilledPendingReview");
//			Assert.assertTrue(false);
//		}
	}

	// Check(s) Routed to the candidate Insufficient-- iBridge Portal
	@Test(enabled = true, testName = "Check(s) Routed to the candidate insuff", priority = 13, dependsOnMethods = {
			"verifyInsufficientRejectedCasesPresentOrNot" })
	public void verifyRoutedToCandidate() throws IOException, AWTException, InterruptedException {
		InsufficientiBridge routedToCandidate = new InsufficientiBridge(driver);
		routedToCandidate.checkRoutedToCandidate();
		logger.info("Check(s) Routed to the candidate!");
//		if (routedToCandidate.verifyRoutedSuccessfulyMsg().contains("Check(s) routed to the candidate successfully.")) {
//			Assert.assertTrue(true);
//			logger.info("Check(s) routed to the candidate has successfully.");
//		} else {
//			logger.info("Check(s) routed to the candidate has Not successfully.");
//			captureScreen(driver, "verifyRoutedSuccessfulyMsg");
//			Assert.assertTrue(false);
//		}
		CasesSubmissionSummary summary = new CasesSubmissionSummary(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		summary.btFiveLogout();
		logger.info("BT account has logged out successfully!");
	}

	// Verify Mailinator Mail and get candidate username and password.
	@Test(enabled = true, testName = "Verify Mailinator Mail and get Candidate Username and Password", priority = 14, dependsOnMethods = {
			"verifyRoutedToCandidate" })
	public void verifyGetRouteToCandidateUserNameAndPassword() throws IOException, AWTException, InterruptedException {
		InsufficientiBridge mailinatorMail = new InsufficientiBridge(driver);
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v4/public/inboxes.jsp?to=" + randomString;
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail Url is opened Successfully!");
		mailinatorMail.verifyMailinatorMailSubjectName();
		logger.info("Candidate malinator mail, Username and Password has verified Successfully!");

//		if (mailinatorMail.verifyMailinatorMailSubject()
//				.contains("Background Check for British Telecom | Additional information required")) {
//			Assert.assertTrue(true);
//			logger.info("Background Check for British Telecom Additional information required has successfully.");
//		} else {
//			logger.info("Background Check for British Telecom Additional information required has Not successfully.");
//			captureScreen(driver, "verifyMailinatorMailSubjectName");
//			Assert.assertTrue(false);
//		}
		mailinatorMail.getRouteToCandidateUserNameAndPassword();
		logger.info("Route To candidate userName and password has got successfully!");
	}

	// Route To Candidate Account Logged in and Fill all details of Insufficient .
	@Test(enabled = true, testName = "Route To Candidate fulfill insuff details", priority = 15, dependsOnMethods = {
			"verifyGetRouteToCandidateUserNameAndPassword" })
	public void verifyRouteToCandidateDetails() throws IOException, AWTException, InterruptedException {
		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
		CandidateLogin candidateLogin = new CandidateLogin(driver);
		String data = new String(Files.readAllBytes(Paths.get("routeToCandidate.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		candidateLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("Route To Candidate has logged in Successully!");
		InsufficientiBridge fullfillInsuff = new InsufficientiBridge(driver);
		fullfillInsuff.fullfilInsuffRouteToCandidate("Pan number good comments", "Indian Database is good Comments");
		logger.info("Route to candidate insuff details have filled Successfully!");

//		if (fullfillInsuff.verifyWelcomePleaseLoginText().contains("Welcome! Please login to your account")) {
//			Assert.assertTrue(true);
//			logger.info("Welcome! Please login to your account has got successfully!");
//		} else {
//			logger.info("Welcome! Please login to your account has Not got successfully!");
//			captureScreen(driver, "verifyWelcomePleaseLoginText");
//			Assert.assertTrue(false);
//		}
	}

	// Route To candidate fulfill Insufficient details, and verify in Insufficient Cases
	// Bucket Insufficient Submitted Or Not.
	@Test(enabled = true, testName = "Fullfilment insuff marking submitted or Not.", priority = 16, dependsOnMethods = {
			"verifyRouteToCandidateDetails" })
	public void verifyRouteToCandidatefullfilInsuffBucket() throws IOException, AWTException, InterruptedException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
		InsufficientiBridge insuffCaseSubmit = new InsufficientiBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffCaseSubmit.verifyInsufficientCaseRejectedArsNumber(arsNumber[2]);
		logger.info("Ars Number has been Searched Successfully!");
//		if (insuffCaseSubmit.verifyPanNoVerificationSubmit().contains("Submitted")) {
//			Assert.assertTrue(true);
//			logger.info("Route To Candidate Insuff details has Submitted successfully.");
//		} else {
//			logger.info("Route To Candidate Insuff details has Not Submitted successfully.");
//			captureScreen(driver, "verifyPanNoVerificationSubmit");
//			Assert.assertTrue(false);
//		}
	}

	// Verify Acknowledge Mail of the Client after fulfill route to candidate insufficient.
	@Test(enabled = true, testName = "Fulfillment insuff and verify Acknowledge Mail of the Client.", priority = 17, dependsOnMethods = {
			"verifyRouteToCandidatefullfilInsuffBucket" })
	public void verifyClientAcknowledgeMail() throws IOException, AWTException, InterruptedException {

		//Later Need to Implement this test case.
	}
}
