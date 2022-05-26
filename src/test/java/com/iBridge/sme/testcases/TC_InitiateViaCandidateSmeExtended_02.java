package com.iBridge.sme.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.sme.pageobject.CandidateEmailVeificationSme;
import com.iBridge.sme.pageobject.CandidateSubmitProfileSme;
import com.iBridge.sme.pageobject.InitiateSelfCaseSme;
import com.iBridge.sme.pageobject.InitiateViaCandidateSme;
import com.iBridge.sme.pageobject.InsufficientBridgeSme;
import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.RandomStrings;

public class TC_InitiateViaCandidateSmeExtended_02 extends BaseClass {
	String firstName;
	String middleName;
	String lastName;
	int totalPaymentPendingCount;

	// Initiate Via Candidate SME --New Case
	@Test(enabled = true, testName = "Verify Initiate Via Candidate SME New Case", priority = 1)
	public void initiateViaCandidateCaseSme() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);

		if (loginPage.verifySmeDashboardText().contains("Dashboard")) {
			Assert.assertTrue(true);
			logger.info("SME Candidate Account has logged Successfully !");
		} else {
			logger.info("SME Candidate Account has Not logged Successfully !");
			captureScreen(driver, "verifySmeDashboardText");
			Assert.assertTrue(false);
		}

		InitiateViaCandidateSme InitiateViaCandidateCase = new InitiateViaCandidateSme(driver);
		InitiateViaCandidateCase.initiateViaCandidateNewCase();
		logger.info("Initiate Via Candidate name has clicked Succesfully!");

		InitiateViaCandidateCase.buyChecksPackagesSelectionCustom();
		logger.info("Buy Checks Selection Packages have been Checked Successfully!");

		// Please Enter Candidate Name-- Initiate Case
		firstName = RandomStrings.randomeStringCandidateFirstName();
		InitiateViaCandidateCase.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		InitiateViaCandidateCase.candidateMiddleName(middleName);

		lastName = RandomStrings.randomeStringCandidateLastName();
		InitiateViaCandidateCase.candidateLastName(lastName);

		String emailAddress = RandomStrings.randomeStringEmailAddress() + "@mailinator.com";
		InitiateViaCandidateCase.candidateEmailAddress(emailAddress);

		InitiateViaCandidateCase.initiateViaCandidateCaseCustom("7878767676",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate mobile Number and Cv have been uploaded successfully!");

		if (InitiateViaCandidateCase.verifyThankYouMessage().contains("Thank you")) {
			Assert.assertTrue(true);
			logger.info("A mail has been sent to the candidate(s).!");
		} else {
			logger.info("A mail has not been sent to the candidate(s).");
			captureScreen(driver, "verifyInstructionsBackgroundVerificationText");
			Assert.assertTrue(false);
		}
	}

	// Total Case Raised-- Form Not Submitted Case
	@Test(enabled = true, testName = "Verify Form Not Submitted Case", priority = 2, dependsOnMethods = {
			"initiateViaCandidateCaseSme" })
	public void verifyFormNotSubmittedCaseList() throws IOException, InterruptedException {

		InitiateViaCandidateSme formSubmittedCase = new InitiateViaCandidateSme(driver);
		formSubmittedCase.formNotSubmittedCaseList();
		if (formSubmittedCase.verifyCandidateNameInFormNotSubmittedList().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Candidate Name has been verified successfully in Form Not Submitted List!");
		} else {
			logger.info("Candidate Name has not been verified successfully in Form Not Submitted List!");
			captureScreen(driver, "verifyCandidateNameInFormNotSubmittedList");
			Assert.assertTrue(false);
		}
	}

	// Candidate Email Verification-- Mailinator.com
	@Test(enabled = true, testName = "Verify Initiate Via Candidate Email Verification", priority = 3, dependsOnMethods = {
			"verifyFormNotSubmittedCaseList" })
	public void candidateSmeEmailVerification() throws IOException, InterruptedException {
		String smeRandomString = new String(Files.readAllBytes(Paths.get("candidateSmeRandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + smeRandomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		CandidateEmailVeificationSme verificationSme = new CandidateEmailVeificationSme(driver);
		if (verificationSme.verifyMailinatorSmeMailSubject().contains(
				"Pre-Joining Formalities for MOTHER DAIRY FRUIT & VEGETABLE PRIVATE LIMITED")) {
			Assert.assertTrue(true);
			logger.info("Mailinator Mail Subject has got successfully!");
		} else {
			logger.info("Mailinator Mail Subject has Not got successfully!");
			captureScreen(driver, "verifyMailinatorMailSubject");
			Assert.assertTrue(false);
		}

		verificationSme.mailinatorVerificationMailSme();
		logger.info("Mailinator Mail has Verified Successfully!");

		verificationSme.getUserNameAndPasswordSme();
		logger.info("Get Username and Password!");
	}

	// Small medium enterprise Candidate Login and Fill all details of the case
	// details.
	@Test(enabled = true, testName = "Verify Small medium enterprise Candidate Login Account", priority = 4, dependsOnMethods = {
			"candidateSmeEmailVerification" })
	public void candidateSmeAccountLogin() throws InterruptedException, ParseException, IOException {
		CandidateSubmitProfileSme submitProfileSme = new CandidateSubmitProfileSme(driver);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		submitProfileSme.smeUserAccountLogout();
		logger.info("Sme Account has logged out successfully!");
		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
		String data = new String(Files.readAllBytes(Paths.get("candidateUserPassSme.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		submitProfileSme.candidateSmeLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("SME User Id and Password have entered Successfully!");

		if (submitProfileSme.verifyInstructionsFillBackgroundMsg()
				.contains("Instructions to Fill Background Verification Form")) {
			Assert.assertTrue(true);
			logger.info("Instructions to Fill Background Verification Form has Verified successfully!");
		} else {
			logger.info("Instructions to Fill Background Verification Form has Not Verified successfully!!");
			captureScreen(driver, "verifyInstructionsFillBackgroundMsg");
			Assert.assertTrue(false);
		}

		submitProfileSme.candidateSmeProfileDetails("Aman Kumar", "04-04-1991", "Delhi", "7042718794", "Ankit Kumar",
				"7007299642");
		logger.info("Candidate Profile details Have been filled successfully!");
	}

	// Profile Details--Filling --Candidate Profile
	@Test(enabled = true, testName = "Verify Candidate profile details has filled", priority = 5, dependsOnMethods = {
			"candidateSmeAccountLogin" })
	public void candidateProfileDetailsFilling() throws InterruptedException, IOException {
		InitiateSelfCaseSme profileDetails = new InitiateSelfCaseSme(driver);

		profileDetails.candidatePanCardNumberDetails("AACCM3174A",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -PAN Card has been added Successfully!");

		profileDetails.candidateVoterIdCardDetails("NTV4022182",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -Voter Card has been added Successfully!");

		CandidateSubmitProfileSme submitProfileSme = new CandidateSubmitProfileSme(driver);
		submitProfileSme.currentCandidateAddressVerificationDetails("233422", "hi", "Delhi", "2362", "2", "Mayur Vihar",
				"04-04-2018", "04-04-2020");
		logger.info("Candidate Current Address Verification details has been added Successfully!");

		submitProfileSme.permanentCandidateAddressVerificationDetails("233422", "hi", "Delhi", "8090", "Gita Colony",
				"Mayur Vihar", "04-04-1991", "01-01-2008");
		logger.info("Candidate Permanent Address Verification details has been added Successfully!");

		submitProfileSme.educationcandidateDetails("6784", "95%", "6784", "Bundelkhand University, Jhansi",
				"Computer Science & Engineering", "Jhansi");
		logger.info("Candidate Education Details has been added Successfully!");

		submitProfileSme.currentCandidateEmploymentVerificationDetails("AuthBridge", "Senior QA", "Gurugram",
				"8009744341", "Gurugram", "18-11-2020", "15-02-2021", "Engineering", "700000", "6098", "1B",
				"Learn new things to improve the skills", "Preparing for get new job", "Raju", "Kumar", "Yadav",
				"Senior QA", "7042718794", "raju.yadav@authbridge.com", "12:00 PM", "Rana", "Kumar", "Jaydev",
				"Senior Manager", "Agami Technologies", "8009744341", "rana.kum@agamitechnologies.com");
		logger.info("Candidate Current Employment Details has been added Successfully!");

		submitProfileSme.previousCandidateEmploymentVerification("HCL Technologies", "Quality Analyst", "Noida",
				"7042718794", "A Block-Sector 1 Noida", "01-02-2018", "17-11-2020", "Engineering", "500000", "6098",
				"1B", "Looking large company", "Prepartion Java programing", "Anil", "Kumar", "Singh", "Senior QA",
				"8009744341", "hcl.raman@gmail.com", "12:00 PM", "Ajit", "Kumar", "Singh", "Senior Hr",
				"Agami Technologies", "8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Previous Employment Details has been added Successfully!");

		submitProfileSme.professionalCandidateReferenceDetails("Abhishek", "Senior Software Engineer", "8009744341",
				"abhishek.ku@gmail.com", "12:00 PM", "Sunil", "Network Engineer", "7042718794", "sunil@gmail.com",
				"12:00 PM");
		logger.info("Professional Reference Details have been added Successfully!");

		submitProfileSme.personalCandidateReferenceDetails("Prakash", "Brother", "8009744341", "prakashku@gmail.com",
				"Hariom", "Nephew", "7042718794", "hariomku@gmail.com");
		logger.info("Personal Reference Details have been added Successfully!");

		if (submitProfileSme.verifyAuthorizationReleaseNoteTextMsg().contains("Authorization Release Note")) {
			Assert.assertTrue(true);
			logger.info("Authorization Release Note Text verification has been completed.!");
		} else {
			logger.info("Authorization Release Note Text verification has Not been completed.!");
			captureScreen(driver, "verifyAuthorizationReleaseNoteText");
			Assert.assertTrue(false);
		}
	}

	// Authorization Release Note
	@Test(enabled = true, testName = "Verify Authorization Release Note", priority = 6, dependsOnMethods = {
			"candidateProfileDetailsFilling" })
	public void verifyAuthorizationRelease() throws IOException, InterruptedException {
		CandidateSubmitProfileSme submitProfileSme = new CandidateSubmitProfileSme(driver);
		submitProfileSme.candidateAuthorizationReleaseNote();
		logger.info("Authorization Signature has completed Successfully!");

		if (submitProfileSme.verifyThankYouCompletingProfileMsg().contains("Thank you for completing your profile")) {
			Assert.assertTrue(true);
			logger.info("Thank you for completing your profile!");
		} else {
			logger.info("Thank you for Not completing your profile!");
			captureScreen(driver, "verifyThankYouCompletingProfileMsg");
			Assert.assertTrue(false);
		}
	}

	// Payment Pending Cases-- Initiate Via Candidate Case
	@Test(enabled = true, testName = "Verify Payment Pending Cases- Initiate Via Candidate Case", priority = 7, dependsOnMethods = {
			"verifyAuthorizationRelease" })
	public void verifyInitiateViaCandidateCasePaymentPending() throws IOException, InterruptedException {
		Thread.sleep(3000);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("Sme Account has been logged successfully!");

		CandidateSubmitProfileSme submitProfileSme = new CandidateSubmitProfileSme(driver);
		submitProfileSme.clickOnSmeDashboardModule();
		logger.info("The SME Dashboard Module has clicked Successfully!");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		submitProfileSme.getPaymentPendingCountNumber();
		totalPaymentPendingCount = Integer.parseInt(submitProfileSme.getPaymentPendingCountNumber());
		submitProfileSme.candidatePaymentPendingCases();
		logger.info("Payment Pending Case has been completed Successfully!");

		if (submitProfileSme.verifyThankYouCompletedPaymentMsg().contains("Thank you for completing payment")) {
			Assert.assertTrue(true);
			logger.info("Thank you for completing payment has successfully!");
		} else {
			logger.info("Thank you for completing payment has Not successfully!");
			captureScreen(driver, "verifyThankYouCompletedPaymentMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Form Submitted Bucket- Copy ARS Number
	@Test(enabled = true, testName = "Verify Form Submitted Bucket and Copy ARS Number", priority = 8, dependsOnMethods = {
			"verifyInitiateViaCandidateCasePaymentPending" })
	public void verifyFormSubmittedBucket() throws InterruptedException, IOException {
		CandidateSubmitProfileSme formSubmittedBucket = new CandidateSubmitProfileSme(driver);
		formSubmittedBucket.formSubmittedBucket();
		logger.info("Initiate via candidate case Ars Number has copied successfully!");
		if (formSubmittedBucket.verifyCandidateFirstName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Initiate via candidate new case first name has verified successfully!");
		} else {
			logger.info("Initiate via candidate new case first name has not verified successfully!");
			captureScreen(driver, "verifyCandidateFirstName");
			Assert.assertTrue(false);
		}
	}

	// Verify Payment Pending Cases Bucket
	@Test(enabled = true, testName = "Verify Payment Pending Cases Bucket", priority = 9, dependsOnMethods = {
			"verifyFormSubmittedBucket" })
	public void verifyPaymentPendingBucket() throws InterruptedException, IOException {
		CandidateSubmitProfileSme paymentPendingCases = new CandidateSubmitProfileSme(driver);
		paymentPendingCases.paymentPendingBucket();
		logger.info("Initiate via candidate case payment Pending Bucket has verified successfully!");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		int totalPaymentPendingNo = Integer.parseInt(paymentPendingCases.getPaymentPendingCountNumber());
		if (totalPaymentPendingNo < totalPaymentPendingCount) {
			Assert.assertTrue(true);
			logger.info("Payment pending Count number have verified successfully!");
		} else {
			logger.info("Payment pending Count number have Not verified successfully!");
			captureScreen(driver, "verifyPaymentPendingCountNumber");
			Assert.assertTrue(false);
		}
	}

	// Work In Progress Bucket to be checked
	@Test(enabled = true, testName = "Verify Work In Progress Bucket", priority = 10, dependsOnMethods = {
			"verifyPaymentPendingBucket" })
	public void verifyWorkInProgressBucket() throws InterruptedException, IOException {
		CandidateSubmitProfileSme workInProgressBucket = new CandidateSubmitProfileSme(driver);
		workInProgressBucket.workInProgressBucket();
		logger.info("Initiate via Candidate case has been Verified successfully!");

		if (workInProgressBucket.verifyWipCandidateFullName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Initiate via Candidate First name has been Verified successfully!");
		} else {
			logger.info("Initiate via Candidate First name has not been Verified successfully!");
			captureScreen(driver, "verifyWipCandidateFullName");
			Assert.assertTrue(false);
		}
	}

	// Once payment is done then it would be checked whether concerned case is
	// appearing in total case sent list
	@Test(enabled = true, testName = "Once payment is done and Case Appearing in total case sent list", priority = 11, dependsOnMethods = {
			"verifyWorkInProgressBucket" })
	public void verifyCaseAppearingInTotalCaseSentList() throws InterruptedException, IOException {
		CandidateSubmitProfileSme submitProfileSme = new CandidateSubmitProfileSme(driver);
		submitProfileSme.appearingInTotalCaseSentList();
		logger.info("IVC case successfully has Appeared in total case sent list!");

		if (submitProfileSme.verifyCandidateFirstNameIvcCase().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Initiate via candidate new case first name has verified successfully!");
		} else {
			logger.info("Initiate via candidate new case first name has not verified successfully!");
			captureScreen(driver, "verifyCandidateFirstNameIvcCase");
			Assert.assertTrue(false);
		}
	}

	// Verify Search Client Ars Number Case List(Ars Number) by login Bridge Account
	@Test(enabled = true, testName = "Verify Search Client Ars Number Case List", priority = 12, dependsOnMethods = {
			"verifyCaseAppearingInTotalCaseSentList" })
	public void searchClientArsNoCaseList() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account Logged successfully!");

		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		// System.out.println(arsNumber[2]);
		bridgeLogin.arsNumberSearch(arsNumber[0]);
		logger.info("Client Case List shown successfully!");

		if (bridgeLogin.verifyCandidateBulkArsNumberInBridge().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info(
					"Initiate Via Candidate case Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info(
					"Initiate Via Candidate case Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCandidateBulkArsNumberInBridge");
			Assert.assertTrue(false);
		}
	}

	// Verify Docs Qc Allocator-- Bridge Portal
	@Test(enabled = true, testName = "Verify Docs Qc Allocator and All selected cases were successfully allocated to QC Team Member", priority = 13, dependsOnMethods = {
			"searchClientArsNoCaseList" })
	public void verifyInsufficientDocsQcAllocator() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQcAllocator = new InsufficientBridge(driver);
		//insuffDocsQcAllocator.superAdminDocsQcAllocator();
		insuffDocsQcAllocator.superCandidateSmeAdminDocsQcAllocator();
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

	// Verify Docs Quality-- Bridge Portal
	@Test(enabled = true, testName = "Verify Docs Quality, Case QC Review Ars Number has verified successfully", priority = 14, dependsOnMethods = {
			"verifyInsufficientDocsQcAllocator" })
	public void verifyInsufficientDocsQuality() throws InterruptedException, IOException {
		InsufficientBridgeSme insuffDocsQualitySme = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffDocsQualitySme.superAdminDocsQuality(arsNumber[0]);
		if (insuffDocsQualitySme.verifyCaseQCReviewArsNumber().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Case QC Review Ars Number has verified successfully!");
		} else {
			logger.info("Case QC Review Ars Number has Not verified successfully!");
			captureScreen(driver, "verifyDocsQcAllocatorCase");
			Assert.assertTrue(false);
		}

		insuffDocsQualitySme.verifyQcDoneChecksSummary("Case level comments are good", "1",
				"Case level comments are good");
		if (insuffDocsQualitySme.verifyReleasedForVerificationMsg()
				.contains("The Case was successfully released for Verification.")) {
			Assert.assertTrue(true);
			logger.info("The Case was successfully released for Verification.!");
		} else {
			logger.info("The Case was Not successfully released for Verification.!");
			captureScreen(driver, "verifyQcDoneChecksSummary");
			Assert.assertTrue(false);
		}
	}

	// Verify Insufficient Allocator-- Bridge portal
	@Test(enabled = true, testName = "Verify Insufficient Allocator and Checks are successfully allocated to Shariq Abbas", priority = 15, dependsOnMethods = {
			"verifyInsufficientDocsQuality" })
	public void verifyInsufficientAllocator() throws IOException, InterruptedException {
		InsufficientBridge insuffAllocator = new InsufficientBridge(driver);
		String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		insuffAllocator.superAdminAllocator(arsNumber[0], "Allocator check Comments has entered successfully");
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
}
