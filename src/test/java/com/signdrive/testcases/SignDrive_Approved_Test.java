package com.signdrive.testcases;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.RandomStrings;
import com.signdrive.pageobject.Email_Verification_page;
import com.signdrive.pageobject.Initiate_newcase_page;

public class SignDrive_Approved_Test extends BaseClass {

	String firstName;
	String middleName;
	String lastName;

	public Initiate_newcase_page newCase;
	public Email_Verification_page email;

	public SignDrive_Approved_Test() {
		
		firstName = RandomStrings.randomeStringCandidateFirstName();
		middleName = RandomStrings.randomeStringCandidateMiddleName();
		lastName = RandomStrings.randomeStringCandidateLastName();
	}

	// SignDrive Login functionality
	
	@Test(enabled = true, testName = "SignDriveLogin", priority = 1)
	public void signDriveLogin() throws InterruptedException, IOException {
		
		driver.get(SignDrivebaseUrl);
		logger.info("URL is opened");
		newCase = new Initiate_newcase_page(driver, firstName, middleName, lastName);
		newCase.loginSignDriveAccount(iBridgeSignDriveUsername, iBridgeSignDrivePassword);
		logger.info("SignDrive Logged In");
		
		if (newCase.verifyDashboardCaseSubmissionSummaryText().contains("CASE SUBMISSION SUMMARY")) {
			Assert.assertTrue(true);
			logger.info("User has logged Successfully!");
		} else {
			logger.info("User has not logged Successfully!");
			captureScreen(driver, "verifyDashboardCaseSubmissionSummaryText");
			Assert.assertTrue(false);
		}
	}
	

	// Initiate Via Candidate(IVC)
	
	@Test(enabled = true, testName = "Initiate New Case", priority = 2, dependsOnMethods = "signDriveLogin")
	public void initiateViaCandidate() throws InterruptedException, ParseException {

		// Initiate new case
		newCase.sidebarExpandBtn();
		logger.info("Clicked on expand bar and initiate new case");
		

		// Package Selection
		newCase.clickUnCheckWiseSelect("1", "1", "1", "1", "1", "1");
		logger.info("Clicked on checkwise and fill the checkwise counts");

		// Add Candidate Information
		newCase.candidateFirstName(firstName);
		newCase.candidateMiddleName(middleName);
		newCase.candidateLastName(lastName);
		newCase.addCandidateDOBEmailAndMobile("8009744341", "04-04-1991");
		logger.info("Candidate information added");

		// Additional Fields
		newCase.selectLocationFromDropDown();
		newCase.enterEmployeeIDAndClientName();
		

		// Initiate Case
		newCase.addToQueue();
		logger.info("Additional fields added");
	}

	// Upload file
	
	@Test(enabled = true, testName = "UploadFile", priority = 3, dependsOnMethods = "initiateViaCandidate")
	public void uploadCTCFile() throws InterruptedException {

		// CTC File upload
		newCase.fileUpload((System.getProperty("user.dir") + "/documents/ctc_excel_formate.xls"));

		// Verify CTC file upload
		Assert.assertTrue(newCase.verifyCTCUploaded());
		logger.info("CTC File uploaded");
	}
	
	// Candidate receive the OL link after checker review the OL
	
	@Test(enabled = true, testName = "emailVerification", priority = 4, dependsOnMethods = "uploadCTCFile")
	public void emailVerification() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(GmailUrl);
		logger.info("url is opened");
		email = new Email_Verification_page(driver);
		email.loginGmailAccount(GmailUserNameSignDrive, GmailPasswordSignDrive);
		logger.info("Gmail account logged in");
		Email_Verification_page mail = new Email_Verification_page(driver);
		
		// Verify email receives by the candidate
		if (email.verifyCandidateReceiveOLLink() == true) {

			// verify Offer Letter Signed By the candidate
			mail.offerLetterSignedByCandidate();
			logger.info("Offer Letter Signed By Candidate");
		}
	}

	// Verify OL Accepted By Candidate and hit the cron
	
	@Test(enabled = true, testName = "verifyOLAcceptedByCandidate", priority = 5, dependsOnMethods = "emailVerification")
	public void verifyOLAcceptedByCandidate() throws InterruptedException {

		// Hit the Cron
		newCase.cronHit();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		logger.info("Hit the cron");
		newCase.verifySignedReviewOfferLetter();
		logger.info("verify pending review");

		// Approve Offer Letter Enterprise user
		newCase.approveOfferLetter();
		logger.info("Approve Offer Letter");

		// Verify Review status Enterprise User
		newCase.completeReviewStatus();
		logger.info("Verify Review status Enterprice User ");
	}

	// BGV link/ Pre-Joining formalities link trigger to candidate
	
	@Test(enabled = true, testName = "BGV Login", priority = 6, dependsOnMethods = "verifyOLAcceptedByCandidate")
	public void bgvLogin() throws InterruptedException {

		// Get BGV credentials
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(GmailUrl);
		logger.info("Gmail URL is opened");
		email = new Email_Verification_page(driver);
		ArrayList<String> bgvCredentil = email.getBGVCredentials();
		String bgvUserName = bgvCredentil.get(0);
		String bgvPassword = bgvCredentil.get(1);

		// Login BGV link receive by candidate with credentials
		
		Thread.sleep(20000);
		driver.navigate().to(bgvUrl);
//		driver.get(bgvUrl);
		logger.info("BGV URL is opened");
		Assert.assertTrue(newCase.bgvLogin(bgvUserName, bgvPassword), "BGV not Logged In");
		logger.info("BGV Logged In");
	}

	// Fill & submit the BGV form
	
	@Test(enabled = true, testName = "Fill & submit the BGV form", priority = 7, dependsOnMethods = "bgvLogin")
	public void fillAndSumitForm() throws InterruptedException, ParseException {

		newCase.candidateSubmitForm();
		newCase.addOtherPersonalDetails();
		logger.info("Add personal details successfully");

		// Bank Account Details & Address & Gratuity
		newCase.bankAccountDetails();
		logger.info("bank account details add successfully");

		// Address Details
		newCase.candidateAddress("23", "Mayur Vihar", "04-04-2009", "323233", "hi", "Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address details Setup Successfully!!");

		// OnboaedingDetails
		newCase.onboardingDetails();
		logger.info("onboarding details add successfully");

		// International worker & GRATUITY DETAIL
		newCase.internationalGratuity();
		logger.info("international worker details add successfully");

		// Candidate logout

		// Verify Thank you Msg
		newCase.verifyInitiateCaseThankYouMsg();
		logger.info("Verifed thankyou msg successfully");

		// Candidate logout
		newCase.CandidateLogout();
		logger.info("Candidate logged out successfully");
	}

	// Case move to pending sign off bucket
	
	@Test(enabled = true, testName = "Case move to pending sign off bucket", priority = 8, dependsOnMethods = "fillAndSumitForm")
	public void pendingSignOffBucket() throws InterruptedException {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		newCase.caseMoveToTheSignOffBucket();

		// Case Migrates to submitted for verification bucket, WIP Bucket, and Documents
		// for signature Bucket
		newCase.caseMigrates();
		logger.info(
				"Case Migrates to submitted for verification bucket, WIP Bucket, and Documents for signature Bucket");
	}

	// Verify new link trigger for instaForm based on assertion message
	
	@Test(enabled = true, testName = "Verify new link trigger for instaform based on assertion message", priority = 9, dependsOnMethods = "pendingSignOffBucket")
	public void verifyInstaform() throws InterruptedException {

		// New link trigger for InstaForm to candidate
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(GmailUrl);
		logger.info("Gmail URL is opened");
		email = new Email_Verification_page(driver);
		Email_Verification_page mail1 = new Email_Verification_page(driver);
		mail1.verifyCandidateReceiveOLLink();
		logger.info("New link trigger for InstaForm to candidate successfully");
	}

	// InstaForm functionality
	
	@Test(enabled = true, testName = "instaform", priority = 10, dependsOnMethods = "verifyInstaform")
	public void instaform() throws InterruptedException {

		email.instaform();
		logger.info("fill the instaform suceessfully");

		// Hit the CRON
		newCase.cronhit();
		logger.info("Hit the cron");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();

		// Review & Approve the InstaForm by user
		newCase.approveInstaFormLink();
		logger.info("Approve the insta form link");
	}
}
