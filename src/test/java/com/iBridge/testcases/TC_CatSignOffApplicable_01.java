package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.CatSignOffApplicable;
import com.iBridge.pageobject.InitiateCaseIndividuallyExtended;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.pageobject.PrepaidEnpAdmin;
import com.iBridge.pageobject.SubmitCaseIndividually;
import com.iBridge.pageobject.SubmitCaseIndividuallyExtended;
import com.iBridge.utilities.RandomStrings;

import freemarker.log.Logger;

public class TC_CatSignOffApplicable_01 extends BaseClass {
	String firstName;
	String middleName;

	// Route to candidate tests starts here
	// Verify iBridge Cat Login Functionality
	@Test(enabled = true, testName = "Verify iBridge Cat Login Functionality", priority = 1)
	public void verifyiBridgeCatLoginDetails() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		if (bridgeCatLogin.verifyClientListingName().contains("Client Listing")) {
			Assert.assertTrue(true);
			logger.info("iBridge Cat Account has Logged In Successfully!");
		} else {
			logger.info("iBridge Cat Account has Not Logged In Successfully!!");
			captureScreen(driver, "verifyClientListingName");
			Assert.assertTrue(false);
		}

	}

	// Verify British Client SignOff Applicable Yes
	@Test(enabled = true, testName = "Verify British Client SignOff Applicable Yes", priority = 2, dependsOnMethods = {
			"verifyiBridgeCatLoginDetails" })
	public void verifyBritishClientSignOffApplicableYes() throws InterruptedException, IOException, ParseException {
		CatSignOffApplicable SignOffApplicableYes = new CatSignOffApplicable(driver);
		SignOffApplicableYes.britishClientSignOffApplicableYes();
		logger.info("SignOff Applicable Yes has configured Successfully!");
		if (SignOffApplicableYes.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Initiate Case Individually Extended
	@Test(enabled = true, testName = "Verify Initiate Case Individually Extended", priority = 3, dependsOnMethods = {
			"verifyBritishClientSignOffApplicableYes" })
	public void verifyInitiateCaseIndividuallyExtended()
			throws InterruptedException, IOException, ParseException, AWTException {
		TC_InitiateCaseIndividuallyExtended_01 initiateCaseIndividuallyExtended = new TC_InitiateCaseIndividuallyExtended_01();
		initiateCaseIndividuallyExtended.initiateCaseIndividuallyExtended();
		logger.info("Initiate Case Individually Initiated has Successfully!");
		// Candidate Email Verification and Get candidate username and password--
		// Mailinator.com
		initiateCaseIndividuallyExtended.candidateEmailVerification();
		logger.info("Mailinator Mail URL has Successfully and Get Username and Password!");
		// Candidate account Login and Fill all details of the candidate case.
		initiateCaseIndividuallyExtended.candidateLoginAccount();
		logger.info("Candidate account Login and full Fill all details of the candidate of the case.");
	}

	// Verify Pending Sign-Off Bucket--Case(s) Submission Summary--(Pending
	// Sign-Off)
	@Test(enabled = true, testName = "Verify Pending Sign-Off Bucket", priority = 4, dependsOnMethods = {
			"verifyInitiateCaseIndividuallyExtended" })
	public void verifyPendingSignOffBucket() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		logger.info("Email and Password has Entered Successfully!");
		CatSignOffApplicable pendingSignOff = new CatSignOffApplicable(driver);
		pendingSignOff.pendingSignOffBucket();
		logger.info("Pending Sign-Off Bucket has verified Successfully!");
		String data = new String(Files.readAllBytes(Paths.get("CandidateFirstName.txt")));
		String firstName[] = data.split(" ");
//		if (pendingSignOff.PendingSignOffBucketListCandidateFname().contains(firstName[0])) {
//			Assert.assertTrue(true);
//			logger.info("Candidate First Name 'Pending Sign-Off' has Verified Successfully!");
//		} else {
//			logger.info("Candidate First Name 'Pending Sign-Off' has not Verified Successfully!");
//			captureScreen(driver, "PendingSignOffBucketListCandidateFname");
//			Assert.assertTrue(false);
//		}
		pendingSignOff.logoutBritishTelecomAccount();
		logger.info("British Telecom Account Has Logged Out Successfully!");
	}

	// Verify British Client SignOff Applicable No
	@Test(enabled = true, testName = "Verify British Client SignOff Applicable No", priority = 5, dependsOnMethods = {
			"verifyPendingSignOffBucket" })
	public void verifyBritishClientSignOffApplicableNo() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable SignOffApplicableNo = new CatSignOffApplicable(driver);
		SignOffApplicableNo.britishClientSignOffApplicableNo();
		logger.info("SignOff Applicable Yes has configured Successfully!");
		if (SignOffApplicableNo.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");

	}

	// Submit Case Individually Extended
	@Test(enabled = true, testName = "Verify Submit Case Individually Extended", priority = 6, dependsOnMethods = {
			"verifyBritishClientSignOffApplicableNo" })
	public void submitCaseIndividuallyExtended()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		logger.info("Email and Password has Entered Successfully!");
		TC_SubmitCaseIndividuallyExtended_03 caseDiyIndividuallyExtended = new TC_SubmitCaseIndividuallyExtended_03();
		caseDiyIndividuallyExtended.submitCaseIndividuallyExtended();
		logger.info("Submit Case Individually Initiated has Successfully!");
		// Case(s) Submission Summary--(Submitted for Verification)
		caseDiyIndividuallyExtended.submittedForVerification();
		logger.info("Candidate First Name 'Case Submitted For Verification list' has Verified Successfully!");
		CatSignOffApplicable pendingSignOff = new CatSignOffApplicable(driver);
		pendingSignOff.logoutBritishTelecomAccount();
		logger.info("British Telecom Account Has Logged Out Successfully!");
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable SignOffApplicableYes = new CatSignOffApplicable(driver);
		SignOffApplicableYes.britishClientSignOffApplicableNo();
		logger.info("SignOff Applicable Yes has configured Successfully!");
		if (SignOffApplicableYes.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");

	}
	// Sign-off applicable tests ends here

	// Route to Candidate Applicable tests starts here
	// Verify British Client Route to Candidate Applicable Yes
	@Test(enabled = true, testName = "Verify British Client lient Route to Candidate Yes", priority = 7, dependsOnMethods = {
			"submitCaseIndividuallyExtended" })
	public void verifyBritishClientRouteToCandidateApplicableYes()
			throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable routeToCandidateApplicableYes = new CatSignOffApplicable(driver);
		routeToCandidateApplicableYes.routeToCandidateApplicableYes();
		logger.info("SignOff Applicable Yes has configured Successfully!");
		if (routeToCandidateApplicableYes.verifyClientUpdatedSuccessfullyMsg()
				.contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Initiate Case Individually Extended
	@Test(enabled = true, testName = "Verify Initiate Case Individually Extended", priority = 8, dependsOnMethods = {
			"verifyBritishClientRouteToCandidateApplicableYes" })
	public void candidateInitiateCaseIndividuallyExtended()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		logger.info("Email and Password has Entered Successfully!");
		TC_InitiateCaseIndividuallyExtended_01 caseIndividuallyExtended = new TC_InitiateCaseIndividuallyExtended_01();
		caseIndividuallyExtended.initiateCaseIndividuallyExtended();
		logger.info("1 case(s) Initiated for candidate(s) successfully");
		// Case(s)Submission Summary--(Submitted for Verification)
		caseIndividuallyExtended.pendingCaseSubmissionVerification();
		logger.info("Candidate First Name 'Pending Submission list' has verified Successfully!");
		caseIndividuallyExtended.candidateEmailVerification();
		logger.info("Mailinator Mail Subject has got successfully!");
		caseIndividuallyExtended.candidateLoginAccount();
		logger.info("Initiate Case Individually Extended has Verified successfully!");
		caseIndividuallyExtended.submittedForVerification();
		logger.info("Case Submitted For Verification' list has Verified Successfully!");
		caseIndividuallyExtended.submittedCasesTrackerWipCases();
		logger.info("WIP Candidate First name Has Verified Successfully!");
		caseIndividuallyExtended.searchClientArsNoCaseList();
		logger.info("Candidate Ars Number has Verified Successfully in the Case List - Search Result!");
		caseIndividuallyExtended.verifyInsufficientDocsQcAllocator();
		logger.info("All selected cases were successfully allocated to QC Team Member.!");
		caseIndividuallyExtended.verifyInsufficientDocsQuality();
		logger.info("The Case was successfully released for Verification.!");
		caseIndividuallyExtended.verifyInsufficientAllocator();
		logger.info("Checks are successfully allocated to Shariq Abbas!");

	}

	// Verify Raising Insufficient On Verifier
	@Test(enabled = true, testName = "Verify Raising Insufficient On Verifier", priority = 9, dependsOnMethods = {
			"candidateInitiateCaseIndividuallyExtended" })
	public void routeToCandidateRaiseInsuffAndFulfil()
			throws InterruptedException, IOException, ParseException, AWTException {
		TC_InsufficientBridge_01 insufficientBridge = new TC_InsufficientBridge_01();
		insufficientBridge.verifyInsufficientVerifierPanCheck();
		logger.info("Check is successfully marked as Insufficient.!");
		insufficientBridge.verifyInsufficientpendingForPanNumberFulfilment();
		logger.info("Insufficient details have Submitted successfully.");
		insufficientBridge.verifyInsufficiencyPartiallyApproveFulfillment();
		logger.info("Insufficient details have Submitted successfully.");
		insufficientBridge.verifyInsufficientPartiallyApproveCasesPresentOrNot();
		logger.info("Pending - Referred Back text has verified successfully.");
		insufficientBridge.verifyInsufficientVerifierIndianDatabaseCheck();
		logger.info("Check is successfully marked as Insufficient.!");
		insufficientBridge.verifyInsufficientpendingForIndianDatabaseFulfilment();
		logger.info("Insufficient details have Submitted successfully.");
		insufficientBridge.verifyInsufficiencyRejectedFulfillment();
		logger.info("Insufficient details have Submitted successfully.");
		insufficientBridge.verifyInsufficientRejectedCasesPresentOrNot();
		logger.info("Fulfilled - Referred Back text has got successfully.");
		insufficientBridge.verifyRoutedToCandidate();
		logger.info("Check(s) routed to the candidate has successfully.");
		insufficientBridge.verifyGetRouteToCandidateUserNameAndPassword();
		logger.info("Background Check for British Telecom Additional information required has successfully.");
		insufficientBridge.verifyRouteToCandidateDetails();
		logger.info("Welcome! Please login to your account has got successfully!");
		insufficientBridge.verifyRouteToCandidatefullfilInsuffBucket();
		logger.info("Route To Candidate Insuff details has Submitted successfully.");
		CatSignOffApplicable pendingSignOff = new CatSignOffApplicable(driver);
		pendingSignOff.logoutBritishTelecomAccount();
		logger.info("British Telecom Account Has Logged Out Successfully!");
	}

	// Route to Candidate Applicable (No)
	@Test(enabled = true, testName = "Verify British Client lient Route to Candidate No", priority = 10, dependsOnMethods = {
			"routeToCandidateRaiseInsuffAndFulfil" })
	public void verifyrouteToCandidateApplicableNo() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable routeToCandidateApplicableNo = new CatSignOffApplicable(driver);
		routeToCandidateApplicableNo.routeToCandidateApplicableNo();
		logger.info("SignOff Applicable Yes has configured Successfully!");
		if (routeToCandidateApplicableNo.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Route to Candidate Button present or Not
	@Test(enabled = true, testName = "Verify Route to Candidate Button present or Not", priority = 11, dependsOnMethods = {
			"verifyrouteToCandidateApplicableNo" })
	public void verifyrouteToCandidateButtonPresentOrNot()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");
		CatSignOffApplicable routeToCandidateBtn = new CatSignOffApplicable(driver);
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		routeToCandidateBtn.verifyInsufficientCaseRejectedArsNumber(arsNumber[2]);
		logger.info("Fulfilled - Referred Back text has got successfully.");
		routeToCandidateBtn.verifyRouteToCandidateButtonPresentOrNot();
		logger.info("Route To Candidate Button Has Not Present Successfully!");
		CatSignOffApplicable pendingSignOff = new CatSignOffApplicable(driver);
		pendingSignOff.logoutBritishTelecomAccount();
		logger.info("British Telecom Account Has Logged Out Successfully!");
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable routeToCandidateApplicableYes = new CatSignOffApplicable(driver);
		routeToCandidateApplicableYes.routeToCandidateApplicableYes();
		logger.info("Route to Candidate Applicable Yes has configured Successfully!");
		if (routeToCandidateApplicableYes.verifyClientUpdatedSuccessfullyMsg()
				.contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Route to Candidate Applicable tests ends here

	// NID Dropdown Settings tests starts here
	// Verify Nid Passport DropDown

	// NID Dropdown Settings-- Check Passport CheckBox
	@Test(enabled = true, testName = "Verify NID Dropdown Settings and Check Passport CheckBox", priority = 12, dependsOnMethods = {
			"verifyrouteToCandidateButtonPresentOrNot" })
	public void verifyBritishClientNidPassport() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable nidDropDownSettings = new CatSignOffApplicable(driver);
		nidDropDownSettings.nidPanCardAndPassportDropdownSettings();
		logger.info("Nid Passport DropDown Settings has configured Successfully!");
		if (nidDropDownSettings.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Verify Nid Passport DropDown
	@Test(enabled = true, testName = "Verify Nid Passport DropDown", priority = 13, dependsOnMethods = {
			"verifyBritishClientNidPassport" })
	public void verifyNidPassportDropDown() throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password has Successfully!");

		// Do It Yourself(DIY)--Extended
		SubmitCaseIndividually subCaseIndividually = new SubmitCaseIndividually(driver);
		subCaseIndividually.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");
		subCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");
		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Profile(Candidate Information)--
		// Step 3 - Candidate Summary
		firstName = RandomStrings.randomeStringCandidateFirstName();
		subCaseIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		subCaseIndividually.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		subCaseIndividually.candidateLastName(lastName);

		subCaseIndividually.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		subCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");

		submitCaseInExtended.uploadCvDocument((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Cv has been Uploaded Successfully!");

		subCaseIndividually.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA",
				"Raju Yadav", "CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123",
				"Amit Kumar", "hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		CatSignOffApplicable nationalIdentity = new CatSignOffApplicable(driver);
		nationalIdentity.passpotNationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"Raju123", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");
		nationalIdentity.verifyPassportNidInDropdownList();
		logger.info("Nid Passport DropDown has listed successfully! ");
		CatSignOffApplicable btAccountLogOut = new CatSignOffApplicable(driver);
		btAccountLogOut.logoutBritishTelecomAccount();
		logger.info("British Telecom account has Logout Successfully!");
		if (btAccountLogOut.verifyWelcomNameBt().contains("Welcome! Please login to your account")) {
			Assert.assertTrue(true);
			logger.info("Welcome! Please login to your account has Verified Successfully!");
		} else {
			logger.info("Welcome! Please login to your account has Not Verified Successfully!");
			captureScreen(driver, "verifyWelcomNameBt");
			Assert.assertTrue(false);
		}

	}

	// NID Dropdown Settings-- Check Passport,Pan Card CheckBox
	@Test(enabled = true, testName = "verify Nid Passport And Pan Card", priority = 14, dependsOnMethods = {
			"verifyNidPassportDropDown" })
	public void verifyBritishClientNidPassportAndPanCard() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable bridgeCatLogin = new CatSignOffApplicable(driver);
		bridgeCatLogin.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		CatSignOffApplicable nidDropDownSettings = new CatSignOffApplicable(driver);
		nidDropDownSettings.nidPanCardAndPassportDropdownSettings();
		logger.info("Nid Passport and Pan Card DropDown Settings has configured Successfully!");
		if (nidDropDownSettings.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		bridgeCatLogin.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Verify Nid Passport DropDown
	@Test(enabled = true, testName = "Verify Nid Passport DropDown", priority = 15, dependsOnMethods = {
			"verifyBritishClientNidPassportAndPanCard" })
	public void verifyNidVoterIdAndDrivingLicenseDropDown()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password have Successfully!");

		// Do It Yourself(DIY)--Extended
		SubmitCaseIndividually subCaseIndividually = new SubmitCaseIndividually(driver);
		subCaseIndividually.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		subCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");

		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Profile (Candidate Information)--Step 3 - Candidate Summary
		firstName = RandomStrings.randomeStringCandidateFirstName();
		subCaseIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		subCaseIndividually.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		subCaseIndividually.candidateLastName(lastName);

		subCaseIndividually.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		subCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");

		submitCaseInExtended.uploadCvDocument((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Cv has been Uploaded Successfully!");

		subCaseIndividually.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA",
				"Raju Yadav", "CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123",
				"Amit Kumar", "hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		CatSignOffApplicable nationalIdentity = new CatSignOffApplicable(driver);
		nationalIdentity.passpotNationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"Raju123", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");
		nationalIdentity.voterIdAndDrivingLicenseNidInDropdownList();
		logger.info("Nid VoterId And Driving License DropDown have listed successfully! ");
	}

	// NID Dropdown Settings tests ends here

	// Gap Reason Applicable tests Starts here
	// Verify Gap Reason Applicable(No)
	@Test(enabled = true, testName = "Verify Gap Reason Applicable No", priority = 16, dependsOnMethods = {
			"verifyNidVoterIdAndDrivingLicenseDropDown" })
	public void verifyGapReasonApplicableNo() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable gapReasonNo = new CatSignOffApplicable(driver);
		gapReasonNo.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		gapReasonNo.gapReasonApplicableYes();
		logger.info("Gesture Signature Type On Arn has configured Successfully!");
		if (gapReasonNo.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		gapReasonNo.iBridgeCatLogout();
		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Verify Gap Reason Gap Reason Form Not Present
	@Test(enabled = true, testName = "Verify Gap Reason Gap Reason form Present or not", priority = 17, dependsOnMethods = {
			"verifyGapReasonApplicableNo" })
	public void verifyGapReasonApplicableFormNotPresent()
			throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		logger.info("Entered Username and password!");

		// Do It Yourself(DIY)--Extended
		SubmitCaseIndividually subCaseIndividually = new SubmitCaseIndividually(driver);
		subCaseIndividually.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		subCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");

		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Step 3 - Candidate Summary Profile (Candidate Information)--
		firstName = RandomStrings.randomeStringCandidateFirstName();
		subCaseIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		subCaseIndividually.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		subCaseIndividually.candidateLastName(lastName);

		subCaseIndividually.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		subCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");

		submitCaseInExtended.uploadCvDocument((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Cv has been Uploaded Successfully!");

		subCaseIndividually.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA",
				"Raju Yadav", "CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123",
				"Amit Kumar", "hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		submitCaseInExtended.nationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"Raju123", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		subCaseIndividually.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");

		// Education Details--Step 3 - Candidate Summary
		subCaseIndividually.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi",
				"Bund", "Jhansi", "Enroll1234", "65%", "07/2010", "06/2014", "Good");
		logger.info("Candidate Education details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		subCaseIndividually.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "Information Technologies", "01-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Current Employment details Setup successfully!");

		subCaseIndividually.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Noida", "Engineering", "10-01-2018", "20-12-2019", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

		// inCaseInExtended.educationToEmploymentGap("Preparation for the entrance
		// examination");
		logger.info("Filled Education To Employment Gap and clicked On Submit Button!");
		CatSignOffApplicable gapReasonNo = new CatSignOffApplicable(driver);
		gapReasonNo.verifyEducationToEmpGapFoormPresentNot();
		logger.info("Enter Gap Reason Text Field Has Not Present Successfully!!");

	}

	// Verify Gap Reason Applicable(Yes)
	@Test(enabled = true, testName = "Verify Gap Reason Applicable No", priority = 18, dependsOnMethods = {
			"verifyNidVoterIdAndDrivingLicenseDropDown" })
	public void verifyGapReasonApplicableYes() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		CatSignOffApplicable gapReasonNo = new CatSignOffApplicable(driver);
		gapReasonNo.ibridgeCatLoginDetails(iBridgeCatUsername, iBridgeCatPassword);
		logger.info("iBridge Cat account has Logged successfully!");
		gapReasonNo.gapReasonApplicableYes();
		logger.info("Gesture Signature Type On Arn has configured Successfully!");
		if (gapReasonNo.verifyClientUpdatedSuccessfullyMsg().contains("Client updated Successfully")) {
			Assert.assertTrue(true);
			logger.info("Client updated has Successfully!");
		} else {
			logger.info("Client updated Has Not Successfully!");
			captureScreen(driver, "verifyClientUpdatedSuccessfullyMsg");
			Assert.assertTrue(false);
		}
		gapReasonNo.iBridgeCatLogout();

		logger.info("iBridge Cat Account has logged Successfully!");
	}

	// Verify Gap Reason Gap Reason Form Present
	@Test(enabled = true, testName = "Verify Gap Reason Gap Reason Form Present", priority = 17, dependsOnMethods = {
			"verifyGapReasonApplicableNo" })
	public void verifyGapReasonApplicableFormPresent()
			throws InterruptedException, IOException, ParseException, AWTException {

		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		//LoginPage login = new LoginPage(driver);
		//login.login(username, password);
		logger.info("Entered Username and password!");
		// Do It Yourself(DIY)--Extended
		SubmitCaseIndividually subCaseIndividually = new SubmitCaseIndividually(driver);
		subCaseIndividually.sidebarExpandBtn();
		logger.info("Clicked on Side bar expand");

		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		subCaseIndividually.authorizationDiy(System.getProperty("user.dir") + "/documents/ARN.pdf");
		logger.info("Upload Individual's Authorization Successfully!");

		SubmitCaseIndividuallyExtended submitCaseInExtended = new SubmitCaseIndividuallyExtended(driver);
		// Profile (Candidate Information)-- Step 3 - Candidate Summary firstName =
		RandomStrings.randomeStringCandidateFirstName();
		subCaseIndividually.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		subCaseIndividually.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		subCaseIndividually.candidateLastName(lastName);

		subCaseIndividually.candidateProfile("04-04-2000", "8009744341", "7042718794", "Rajesh Yadav");
		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		subCaseIndividually.setEmail(email);
		logger.info("Candidate Information Setup Successfully!");

		submitCaseInExtended.uploadCvDocument((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Cv has been Uploaded Successfully!");

		subCaseIndividually.candidateAdditionalInfo("EIN123", "18-01-2021", "04-04-1991", "Unit Bussines", "QA",
				"Raju Yadav", "CR0012", "Entity Code", "raju.yadav1@authbridge.com", "Provisonal", "12345", "ALKG123",
				"Amit Kumar", "hrdp@authbridge.com", "Raju Yadav", "Agami035", "Mayur Vihar Delhi");
		logger.info("Candidate Additional Information Setup Successfully!");

		submitCaseInExtended.nationalIdentity((System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav",
				"Raju123", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Raju Yadav", "123456");
		logger.info("Candidate National Identity Details Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		subCaseIndividually.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				"1234", "Mayur Vihar", "04-04-2019", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");

		// Education Details--Step 3 - Candidate Summary
		subCaseIndividually.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi",
				"Bund", "Jhansi", "Enroll1234", "65%", "07/2010", "06/2014", "Good");
		logger.info("Candidate Education details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		subCaseIndividually.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341",
				"Greater Noida", "Information Technologies", "01-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com", (System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Current Employment details Setup successfully!");

		subCaseIndividually.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Noida", "Engineering", "10-01-2018", "20-12-2019", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"),
				(System.getProperty("user.dir") + "/documents/ARN.pdf"), "Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

		// inCaseInExtended.educationToEmploymentGap("Preparation for the entrance
		// examination");
		logger.info("Filled Education To Employment Gap and clicked On Submit Button!");
		CatSignOffApplicable gapReasonYes = new CatSignOffApplicable(driver);
		// EDUCATION TO EMPLOYMENT GAP-- Fulfil
		gapReasonYes.verifyEnterGapReasonEducationAndEmp();

		logger.info("Filled Education To Employment Gap  have Successfully!");
	}

	// Gap Reason Applicable tests ends here

	// Client Configuration tests Starts here
	// Verify Enp Admin Account Login
	@Test(enabled = true, testName = "Verify Enp Admin Account Login", priority = 18, dependsOnMethods = {
			"verifyGapReasonApplicableFormPresent" })
	public void verifyEnpAdminLoginAccount() throws IOException, InterruptedException {
		driver.get(EnpAdminURL);
		logger.info("Prepaid Enp Admin Url has opened Successfully!");
		CatSignOffApplicable enpAdminLogin = new CatSignOffApplicable(driver);
		enpAdminLogin.loginEnpAdminAccount(enpAdminUsername, enpAdminPassword);
		logger.info("Prepaid Enp Admin account has Logged successfully!");
		if (enpAdminLogin.verifyClientListingText().contains("Client Listing")) {
			Assert.assertTrue(true);
			logger.info("Client Listing Name has Verified Successfully!");
		} else {
			logger.info("Client Listing Name has Not Verified Successfully!");
			captureScreen(driver, "verifyClientListingText");
			Assert.assertTrue(false);
		}
	}

	// Client Configuration tests ends here

}
