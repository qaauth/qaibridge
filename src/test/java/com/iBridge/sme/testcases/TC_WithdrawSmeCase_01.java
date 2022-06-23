package com.iBridge.sme.testcases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.sme.pageobject.CandidateEmailVeificationSme;
import com.iBridge.sme.pageobject.CandidateSubmitProfileSme;
import com.iBridge.sme.pageobject.InitiateSelfCaseSme;
import com.iBridge.sme.pageobject.InitiateViaCandidateSme;
import com.iBridge.sme.pageobject.WithdrawnSmeCase;
import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.RandomStrings;

public class TC_WithdrawSmeCase_01 extends BaseClass {
	String firstName;
	String middleName;
	String lastName;

	// Form Not Submitted case marking withdrawn
	@Test(enabled = true, testName = "Verify Form Not Submitted case making withdrawn", priority = 1)
	public void verifyFormNotSubmittedCaseWithdraw() throws IOException, InterruptedException {
		Thread.sleep(2000);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("The Sme Account has logged Successfully!");

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
		WithdrawnSmeCase withdrawCaseSme = new WithdrawnSmeCase(driver);
		withdrawCaseSme.formNotSubmittedCaseWithdraw();
		logger.info("Form Not Submitted case have been withdrawn successfully!");
		if (withdrawCaseSme.verifyWithdraSuccessfullyMsg().contains("Case has been withdrawn Successfully !")) {
			Assert.assertTrue(true);
			logger.info("Case has been withdrawn Successfully !");
		} else {
			logger.info("Case has Not been withdrawn Successfully !");
			captureScreen(driver, "verifyWithdraSuccessfullyMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify Withdraw case has presented in Withdrawn/Disabled bucket or Not.
	@Test(enabled = true, testName = "Verify Withdrawn/Disabled Case presented Or Not in Withdrawn Bucket", priority = 2, dependsOnMethods = {
			"verifyFormNotSubmittedCaseWithdraw" })
	public void verifyCandidateNameInWithdrawnBucket() throws IOException, InterruptedException {
		WithdrawnSmeCase withdrawCandidateNameSme = new WithdrawnSmeCase(driver);
		withdrawCandidateNameSme.verifyCandidateNameInWithdrawnBucket();
		logger.info("Form Not Submitted case have been withdrawn successfully!");

		if (withdrawCandidateNameSme.verifyWithdrawCandidateFullName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Case has been withdrawn Successfully !");
		} else {
			logger.info("Case has Not been withdrawn Successfully !");
			captureScreen(driver, "verifyWithdrawCandidateFullName");
			Assert.assertTrue(false);
		}
	}

	// SME IVC Case has Withdrawn from Work In Progress Bucket or not.
	@Test(enabled = true, testName = "Verify IVC SME Case has Withdrawn from Work In Progress bucket or Not", priority = 3, dependsOnMethods = {
			"verifyCandidateNameInWithdrawnBucket" })
	public void verifyInitiateViaCandidateCaseWithdraw() throws IOException, InterruptedException {
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

		// Candidate Email Verification-- Mailinator.com
		String smeRandomString = new String(Files.readAllBytes(Paths.get("candidateSmeRandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + smeRandomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Mailinator Mail URL has Successfully!");
		CandidateEmailVeificationSme verificationSme = new CandidateEmailVeificationSme(driver);
		verificationSme.mailinatorVerificationMailSme();
		logger.info("Mailinator Mail has Verified Successfully!");

		verificationSme.getUserNameAndPasswordSme();
		logger.info("Get Username and Password!");

		// Small medium enterprise Candidate Login and Fill all details of the case
		// details.
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
		submitProfileSme.candidateSmeProfileDetails("Aman Kumar", "04-04-1991", "Delhi", "7042718794", "Ankit Kumar",
				"7007299642");
		logger.info("Candidate Profile details Have been filled successfully!");
		// Profile Details--Filling --Candidate Profile
		InitiateSelfCaseSme profileDetails = new InitiateSelfCaseSme(driver);

		profileDetails.candidatePanCardNumberDetails("AACCM3174A",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -PAN Card has been added Successfully!");

		profileDetails.candidateVoterIdCardDetails("NTV4022182",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Profile Details -Voter Card has been added Successfully!");

		CandidateSubmitProfileSme CandidateSubmitProfile = new CandidateSubmitProfileSme(driver);
		CandidateSubmitProfile.currentCandidateAddressVerificationDetails("233422", "hi", "Delhi", "2362", "2",
				"Mayur Vihar", "04-04-2018", "04-04-2020");
		logger.info("Candidate Current Address Verification details has been added Successfully!");

		CandidateSubmitProfile.permanentCandidateAddressVerificationDetails("233422", "hi", "Delhi", "8090",
				"Gita Colony", "Mayur Vihar", "04-04-1991", "01-01-2008");
		logger.info("Candidate Permanent Address Verification details has been added Successfully!");

		CandidateSubmitProfile.educationcandidateDetails("6784", "95%", "6784", "Bundelkhand University, Jhansi",
				"Computer Science & Engineering", "Jhansi");
		logger.info("Candidate Education Details has been added Successfully!");

		CandidateSubmitProfile.currentCandidateEmploymentVerificationDetails("AuthBridge", "Senior QA", "Gurugram",
				"8009744341", "Gurugram", "18-11-2020", "15-02-2021", "Engineering", "700000", "6098", "1B",
				"Learn new things to improve the skills", "Preparing for get new job", "Raju", "Kumar", "Yadav",
				"Senior QA", "7042718794", "raju.yadav@authbridge.com", "12:00 PM", "Rana", "Kumar", "Jaydev",
				"Senior Manager", "Agami Technologies", "8009744341", "rana.kum@agamitechnologies.com");
		logger.info("Candidate Current Employment Details has been added Successfully!");

		CandidateSubmitProfile.previousCandidateEmploymentVerification("HCL Technologies", "Quality Analyst", "Noida",
				"7042718794", "A Block-Sector 1 Noida", "01-02-2018", "17-11-2020", "Engineering", "500000", "6098",
				"1B", "Looking large company", "Prepartion Java programing", "Anil", "Kumar", "Singh", "Senior QA",
				"8009744341", "hcl.raman@gmail.com", "12:00 PM", "Ajit", "Kumar", "Singh", "Senior Hr",
				"Agami Technologies", "8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Previous Employment Details has been added Successfully!");

		CandidateSubmitProfile.professionalCandidateReferenceDetails("Abhishek", "Senior Software Engineer",
				"8009744341", "abhishek.ku@gmail.com", "12:00 PM", "Sunil", "Network Engineer", "7042718794",
				"sunil@gmail.com", "12:00 PM");
		logger.info("Professional Reference Details have been added Successfully!");

		CandidateSubmitProfile.personalCandidateReferenceDetails("Prakash", "Brother", "8009744341",
				"prakashku@gmail.com", "Hariom", "Nephew", "7042718794", "hariomku@gmail.com");
		logger.info("Personal Reference Details have been added Successfully!");

		// Authorization Release Note
		CandidateSubmitProfileSme releaseNote = new CandidateSubmitProfileSme(driver);
		releaseNote.candidateAuthorizationReleaseNote();
		logger.info("Authorization Signature has completed Successfully!");

		// Payment Pending Cases-- Initiate Via Candidate Case
		Thread.sleep(3000);
		driver.get(baseURL);
		logger.info("iBridge Url is opened");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(usernameSme, passwordSme);
		logger.info("Sme Account has been logged successfully!");
		CandidateSubmitProfileSme submitProfile = new CandidateSubmitProfileSme(driver);
		submitProfile.clickOnSmeDashboardModule();
		logger.info("The SME Dashboard Module has clicked Successfully!");
		submitProfile.candidatePaymentPendingCases();
		logger.info("Payment Pending Case has been completed Successfully!");

		WithdrawnSmeCase withdrawWorkInProgress = new WithdrawnSmeCase(driver);
		withdrawWorkInProgress.withdrawWorkInProgressBucket();
		logger.info("Ivc Sme case has withdrawn successfully!");

		if (withdrawWorkInProgress.verifySuccessfullyUpdatedMsg().contains("Case has been successfully Updated.")) {
			Assert.assertTrue(true);
			logger.info("Case has been successfully Updated.!");
		} else {
			logger.info("Case has Not been successfully Updated.!");
			captureScreen(driver, "verifySuccessfullyUpdatedMsg");
			Assert.assertTrue(false);
		}
	}

	// Verify IVC Withdrawn case Present in Closed By Client Bucket or Not.
	@Test(enabled = true, testName = "Verify Ivc Sme Case present in Closed By Client Bucket Or Not", priority = 4, dependsOnMethods = {
			"verifyInitiateViaCandidateCaseWithdraw" })
	public void verifyclosedByClientBucket() throws InterruptedException, IOException {
		WithdrawnSmeCase withdrawWorkInProgress = new WithdrawnSmeCase(driver);
		withdrawWorkInProgress.closedByClientBucket();
		logger.info("Ivc Sme case has withdrawn successfully!");

		if (withdrawWorkInProgress.verifyClosedByClientCandidateFullName().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Candidate name has been verified successfully!");
		} else {
			logger.info("Candidate name has Not been verified successfully!");
			captureScreen(driver, "verifyClosedByClientCandidateFullName");
			Assert.assertTrue(false);
		}
	}
}
