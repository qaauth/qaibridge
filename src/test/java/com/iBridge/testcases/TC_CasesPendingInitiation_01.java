package com.iBridge.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.iBridge.pageobject.CasesSubmissionSummary;
import com.iBridge.pageobject.InitiateCaseIndividuallyExtended;
import com.iBridge.pageobject.InitiateCasesIndividually;
import com.iBridge.pageobject.LoginPage;
import com.iBridge.utilities.RandomStrings;

public class TC_CasesPendingInitiation_01 extends BaseClass {
	String firstName;
	// Cases Submission Summary
	@Test(enabled = true, testName = "Cases Submission Summary", priority = 1)
	public void casesSubmissionSummary() throws InterruptedException, IOException, ParseException, AWTException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		InitiateCasesIndividually pendingInitiation = new InitiateCasesIndividually(driver);
		pendingInitiation.login(username, password);
		logger.info("Entered email and Password!");
		LoginPage loginPage = new LoginPage(driver);
		
		if (loginPage.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("BT Client has logged Successfully!");
		} else {
			logger.info("BT Client has not logged Successfully! Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}
		
		// Case(s) Submission Summary--(Pending Initiation)
		// Initiate Via Candidate(IVC)
		InitiateCaseIndividuallyExtended inCaseInExtended = new InitiateCaseIndividuallyExtended(driver);
		inCaseInExtended.sidebarExpandBtn();
		logger.info("Clicked on bar expand");

		inCaseInExtended.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1", "1", "1");
		logger.info("Clicked on Initiate Via Candidate");

		// Step 3 - Candidate Summary (Add Candidate Information)
		firstName = RandomStrings.randomeStringCandidateFirstName();
		pendingInitiation.candidateFirstName(firstName);

		String middleName = RandomStrings.randomeStringCandidateMiddleName();
		pendingInitiation.candidateMiddleName(middleName);

		String lastName = RandomStrings.randomeStringCandidateLastName();
		pendingInitiation.candidateLastName(lastName);

		pendingInitiation.addCandidateInformation("8009744341", "04-04-1991");
		logger.info("Added Candidate information mobile number and Date of Birth!");

		String email = RandomStrings.randomeStringCandidateEmail() + "@mailinator.com";
		pendingInitiation.candidateEmail(email);
		logger.info("Entered condidated information!");
		Thread.sleep(1000);

		// Upload CV Documents
		inCaseInExtended.additionFieldInfo((System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Uploaded cv document!");
		Thread.sleep(2000);
		// Additional Field(s)
		pendingInitiation.additionFieldInfo("rajucs@gmail.com","12345", "04/04/1991", "1100", "Quality Analyst", "Raju Yadav", "Senior QA",
				"12345", "raju12@gmail.com", "10-12-2019", "6098", "SKPAY123", "Aman kumar", "hrd@gmail.com", "Scott",
				"6098", "Gurgaow");
		logger.info("Entered Additional Informations has successfully!");	
		
		CasesSubmissionSummary pendingInitiationList = new CasesSubmissionSummary(driver);
		pendingInitiationList.addToQueueBtn();
		logger.info("Clicked on add to Queue Button has Successfully!");
		
		if (pendingInitiationList.verifySaveLaterToastMsg().contains("Case(s) have been saved for later successfully.")) {
			Assert.assertTrue(true);
			logger.info("Clicked on Save Later button has Successfully!");
		} else {
			logger.info("Clicked on Save Later button has Not Successfully!");
			captureScreen(driver, "verifySaveLaterToastMsg");
			Assert.assertTrue(false);
		}
	}

	// Case(s) Submission Summary--(Pending Initiation)
	@Test(enabled = true, testName = "Pending Cases Initiation", priority = 2, dependsOnMethods = {"casesSubmissionSummary" })
	public void pendingCasesInitiation() throws InterruptedException, IOException {

		// Case(s) Submission Summary--(Pending Initiation)
		CasesSubmissionSummary pendingInitiationList = new CasesSubmissionSummary(driver);
		pendingInitiationList.pendingCaseInitiation();
		logger.info("Pending Case Initiation has verified list successfully!");
		
		if (pendingInitiationList.verifyCasePendingInitiationFname().contains(firstName)) {
			Assert.assertTrue(true);
			logger.info("Case Pending Initiation Candidate First name Has Verified Successfully!");
		} else {
			logger.info("Case Pending Initiation Candidate First name Has Not Verified Successfully!");
			captureScreen(driver, "pendingCasesInitiation");
			Assert.assertTrue(false);
		}
	}
}
