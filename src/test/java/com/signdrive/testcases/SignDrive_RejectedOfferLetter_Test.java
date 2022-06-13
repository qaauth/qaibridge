package com.signdrive.testcases;

import java.text.ParseException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.RandomStrings;
import com.signdrive.pageobject.Email_Verification_page;
import com.signdrive.pageobject.Initiate_newcase_page;

public class SignDrive_RejectedOfferLetter_Test extends BaseClass {
	String firstName;
	String middleName;
	String lastName;

	public Initiate_newcase_page newCase;
	public Email_Verification_page email;

	public SignDrive_RejectedOfferLetter_Test() {

		firstName = RandomStrings.randomeStringCandidateFirstName();
		middleName = RandomStrings.randomeStringCandidateMiddleName();
		lastName = RandomStrings.randomeStringCandidateLastName();
	}

	// SignDrive Login functionality

	@Test(enabled = true, testName = "SignDriveLogin", priority = 1)
	public void signDriveLogin() throws InterruptedException {

		driver.get(SignDrivebaseUrl);
		logger.info("URL is opened");
		newCase = new Initiate_newcase_page(driver, firstName, middleName, lastName);
		newCase.loginSignDriveAccount(iBridgeSignDriveUsername, iBridgeSignDrivePassword);
		logger.info("SignDrive Logged In");
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
		logger.info("Initiate new case");
	}

	// Upload CTC File

	@Test(enabled = true, testName = "Upload CTC File", priority = 3, dependsOnMethods = "initiateViaCandidate")
	public void uploadCtcFile() throws InterruptedException {
		
		// CTC File upload
		newCase.fileUpload((System.getProperty("user.dir") + "/documents/ctc_excel_formate.xls"));

		// Checker review the OL
		Assert.assertTrue(newCase.verifyCTCUploaded());
		logger.info("CTC File uploaded");
	}

	// Candidate receive OL link

	@Test(enabled = true, testName = "Upload CTC File", priority = 4, dependsOnMethods = "uploadCtcFile")
	public void candidateReceiveLink() throws InterruptedException {

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

			mail.olRejectbyCandidate();
			logger.info("Offer Letter Reject by candidate");

			// Hit the Cron

			newCase.cron();
			ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
			driver.navigate().refresh();
		}
	}
}
