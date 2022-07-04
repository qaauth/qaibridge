package com.iBridge.sme.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.BridgeLoginPage;
import com.iBridge.pageobject.InsufficientBridge;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.sme.pageobject.InitiateSelfCaseSme;
import com.iBridge.sme.pageobject.InsufficientBridgeSme;
import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.RandomStrings;

public class TC_InitiateSelfCaseSmeExtended_01 extends BaseClass {
	String firstName;
	String middleName;
	String lastName;
	String arsNumber[];

	InitiateSelfCaseSme advanced = new InitiateSelfCaseSme(driver);

	// Initiate Self SME New Case--
	@Test(enabled = true, testName = "Initiate Self SME New Case", priority = 1)
	public void initiateSelfCaseSme() throws InterruptedException, IOException {
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
//		String amount = advanced.getamount();
		
		InitiateSelfCaseSme initiateSelfCase = new InitiateSelfCaseSme(driver);
		initiateSelfCase.initiateNewCase();
		logger.info("Initiate Self name has clicked Succesfully!");

		initiateSelfCase.buyChecksPackagesSelection();
		logger.info("Buy Checks Selection Packages have been Checked Successfully!");

		// Please Enter Candidate Name-- Initiate Case
		firstName = RandomStrings.randomeStringCandidateFirstName();
		initiateSelfCase.candidateFirstName(firstName);

		middleName = RandomStrings.randomeStringCandidateMiddleName();
		initiateSelfCase.candidateMiddleName(middleName);

		lastName = RandomStrings.randomeStringCandidateLastName();
		initiateSelfCase.candidateLastName(lastName);

		initiateSelfCase.initiateSelfCaseCustom((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate name and number of verifications package details!");

		if (initiateSelfCase.verifyInstructionsBackgroundVerificationText()
				.contains("Instructions to Fill Background Verification Form")) {
			Assert.assertTrue(true);
			logger.info("Instructions to Fill Background Verification Form.!");
		} else {
			logger.info("Instructions to Fill Background Verification Form!");
			captureScreen(driver, "verifyInstructionsBackgroundVerificationText");
			Assert.assertTrue(false);
		}
	}

	// Profile Details--Filling --Candidate Profile
	@Test(enabled = true, testName = "Candidate profile details filled", priority = 2, dependsOnMethods = {
			"initiateSelfCaseSme" })
	public void candidateProfileDetailsFilling() throws InterruptedException, IOException {
		InitiateSelfCaseSme profileDetails = new InitiateSelfCaseSme(driver);
		profileDetails.candidateProfileDetails("Aman Kumar", "04-0401991", "Delhi", "raju.yadav@authbridge.com",
				"7042718794", "7007299642", "Ankit Kumar", "8009744341");
		logger.info("Candidate profile details have been filled Successfully!");

		profileDetails.candidatePanCardNumberDetails("AACCM3174A",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -PAN Card has been added Successfully!");

		profileDetails.candidateVoterIdCardDetails("NTV4022182",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -Voter Card has been added Successfully!");

		profileDetails.currentAddressVerificationDetails("233422", "hi", "Delhi", "2362", "2", "Mayur Vihar",
				"04-04-2018", "04-04-2020");
		logger.info("Candidate Current Address Verification details has been added Successfully!");

		profileDetails.permanentAddressVerificationDetails("233422", "hi", "Delhi", "8090", "Gita Colony",
				"Mayur Vihar", "04-04-1991", "01-01-2008");
		logger.info("Candidate Permanent Address Verification details has been added Successfully!");

		profileDetails.candidateEducationDetails("6784", "95%", "6784", "Bundelkhand University, Jhansi",
				"Computer Science & Engineering", "Jhansi");
		logger.info("Candidate Education Details has been added Successfully!");

		profileDetails.currentEmploymentVerificationDetails("AuthBridge", "Senior QA", "Gurugram", "8009744341",
				"Gurugram", "18-11-2020", "15-02-2021", "Engineering", "700000", "6098", "1B",
				"Learn new things to improve the skills", "Preparing for get new job", "Raju", "Kumar", "Yadav",
				"Senior QA", "7042718794", "raju.yadav@authbridge.com", "12:00 PM", "Rana", "Kumar", "Jaydev",
				"Senior Manager", "Agami Technologies", "8009744341", "rana.kum@agamitechnologies.com");
		logger.info("Candidate Current Employment Details has been added Successfully!");

		profileDetails.previousEmploymentVerification("HCL Technologies", "Quality Analyst", "Noida", "7042718794",
				"A Block-Sector 1 Noida", "01-02-2018", "17-11-2020", "Engineering", "500000", "6098", "1B",
				"Looking large company", "Prepartion Java programing", "Anil", "Kumar", "Singh", "Senior QA",
				"8009744341", "hcl.raman@gmail.com", "12:00 PM", "Ajit", "Kumar", "Singh", "Senior Hr",
				"Agami Technologies", "8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Previous Employment Details has been added Successfully!");

		profileDetails.professionalReferenceDetails("Abhishek", "Senior Software Engineer", "8009744341",
				"abhishek.ku@gmail.com", "12:00 PM", "Sunil", "Network Engineer", "7042718794", "sunil@gmail.com",
				"12:00 PM");
		logger.info("Professional Reference Details have been added Successfully!");

		profileDetails.personalReferenceDetails("Prakash", "Brother", "8009744341", "prakashku@gmail.com", "Hariom",
				"Nephew", "7042718794", "hariomku@gmail.com");
		logger.info("Personal Reference Details have been added Successfully!");

		if (profileDetails.verifyAuthorizationReleaseNoteText().contains("Authorization Release Note")) {
			Assert.assertTrue(true);
			logger.info("Authorization Release Note Text verification has been completed.!");
		} else {
			logger.info("Authorization Release Note Text verification has Not been completed.!");
			captureScreen(driver, "verifyAuthorizationReleaseNoteText");
			Assert.assertTrue(false);
		}
	}

	// Thank you for completing payment,Authorization Release Note
	@Test(enabled = true, testName = "Verify Thank you for completing payment", priority = 3, dependsOnMethods = {
			"candidateProfileDetailsFilling" })
	public void verifyAuthorizationRelease() throws IOException, InterruptedException {
		InitiateSelfCaseSme authorizationRelease = new InitiateSelfCaseSme(driver);
		authorizationRelease.authorizationReleaseNote((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Authorization Release Note has added Successfully!");

		Thread.sleep(2000);
		if (authorizationRelease.verifyThankYouCompletingPaymentSuccessMsg()
				.contains("Thank you for completing payment")) {
			Assert.assertTrue(true);
			logger.info("Thank you for completing payment has been Successfully!");
		} else {
			logger.info("Thank you for completing payment has not been Successfully!");
			captureScreen(driver, "verifyThankYouCompletingPaymentSuccessMsg");
			Assert.assertTrue(false);
		}
		
	}

	// Verify case status in WIP bucket
	@Test(enabled = true, testName = "Verify case status in WIP bucket", priority = 4, dependsOnMethods = {
			"verifyAuthorizationRelease" })
	public void verifyWorkInProgressCases() throws InterruptedException, IOException {
		InitiateSelfCaseSme workInProgressCases = new InitiateSelfCaseSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		arsNumber = data.split(" ");
		workInProgressCases.dashboardWorkInProgressCases(arsNumber[0], firstName);
		logger.info("Work In Progress Cases has been Verified Successfully!");

//		if (workInProgressCases.verifyInitiateSelfCaseCandidateName().contains(firstName)) {
//			Assert.assertTrue(true);
//			logger.info("Initiate Self Case Candidate Name has been Successfully!");
//		} else {
//			logger.info("Initiate Self Case Candidate Name not been Successfully!");
//			captureScreen(driver, "verifyInitiateSelfCaseCandidateName");
//			Assert.assertTrue(false);
//		}
		
	}

	// Verify after logged in bridge portal and search Ars Number in Case List
	@Test(enabled = true, testName = "Verify after logged in bridge portal and search Ars Number in Case List", priority = 5, dependsOnMethods = {
			"verifyWorkInProgressCases" })
	public void searchClientArsNoCaseList() throws InterruptedException, IOException {
		driver.get(bridgeURL);
		logger.info("Bridge Url is opened");
		BridgeLoginPage bridgeLogin = new BridgeLoginPage(driver);
		bridgeLogin.loginBridgeAccount(bridgeEmail, bridgeUserPassword);
		logger.info("Bridge account Logged successfully!");

		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		String arsNumber[] = data.split(" ");
		// System.out.println(arsNumber[0]);
		bridgeLogin.arsNumberSearch(arsNumber[0]);
		logger.info("Client Case List shown successfully!");

		BridgeLoginPage verifyFnameInBridge = new BridgeLoginPage(driver);
		if (verifyFnameInBridge.verifyCandidateArsNumberInBridge().contains(arsNumber[0])) {
			Assert.assertTrue(true);
			logger.info("Candidate Ars Number has Verified Successfully in the Case List - Search Result!");
		} else {
			logger.info("Candidate Ars Number has Not Verified Successfully in the Case List - Search Result!");
			captureScreen(driver, "verifyCandidateArsNumberInBridge");
			Assert.assertTrue(false);
		}
	}

	// Verify Docs Qc Allocator role and All selected cases successfully allocated
	// to QC Team Member
	@Test(enabled = true, testName = "Verify Docs Qc Allocator role and All selected cases successfully allocated to QC Team Member", priority = 6, dependsOnMethods = {
			"searchClientArsNoCaseList" })
	public void verifyInsufficientDocsQcAllocator() throws InterruptedException, IOException {
		InsufficientBridge insuffDocsQcAllocator = new InsufficientBridge(driver);
		// insuffDocsQcAllocator.superAdminDocsQcAllocator();
		insuffDocsQcAllocator.superSmeAdminDocsQcAllocator();
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

	// Verify Docs Quality role and The Case was successfully released for
	// Verification.
	@Test(enabled = true, testName = "Verify Docs Quality role and The Case was successfully released for Verification.", priority = 7, dependsOnMethods = {
			"verifyInsufficientDocsQcAllocator" })
	public void verifyInsufficientDocsQuality() throws InterruptedException, IOException {
		InsufficientBridgeSme insuffDocsQualitySme = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
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

	// Verify Checks are successfully allocated to Shariq Abbas
	@Test(enabled = true, testName = "Verify Checks are successfully allocated to Shariq Abbas", priority = 8, dependsOnMethods = {
			"verifyInsufficientDocsQuality" })
	public void verifyInsufficientAllocator() throws IOException, InterruptedException {
		InsufficientBridgeSme insuffAllocatorSme = new InsufficientBridgeSme(driver);
		String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
		arsNumber = data.split(" ");
		insuffAllocatorSme.superAdminAllocator(arsNumber[0], "Allocator check Comments has entered successfully");
		// arsNumber = advanced.getArsNumber();
		if (insuffAllocatorSme.verifyChecksSuccessfullyMsg()
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
