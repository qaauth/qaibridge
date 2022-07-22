package com.iBridge.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.utilities.JavaScriptManuplator;

public class CaseCompletion {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CaseCompletion(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// CAT-- (Super Admin) Bridge
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserCurrentRoleCat;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[1]/h4[2]/a")
	WebElement clickOnCATLoadResultLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Cases Status')]")
	WebElement verifyNotificationAlertsCasesStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCompleteSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCompleteSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnArsNumber;

	// Credit Default --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Credit Default')]")
	WebElement clickOnCreditDefault;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCaseCheckVerification;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCaseCheckCommentCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnClosedByClientBtn;

	// Criminal Records Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCriminalRecordsClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCriminalRecordSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCriminalRecordSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCriminalRecordArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Criminal Records Verification')]")
	WebElement clickOnCriminalRecordsVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCriminalRecordsCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCriminalCommentCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCriminalSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCriminalClosedByClientBtn;

	// Current Address Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCurrentAddressClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCurrentAddressSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCurrentAddressSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCurrentAddressArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Current Address Verification')]")
	WebElement clickOnCurrentAddressVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCurrentAddressCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCurrentAddressCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCurrentAddressSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCurrentAddressClosedByClientBtn;

	// Current Employment Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCurrentEmploymentClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCurrentEmploymentSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCurrentEmploymentSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCurrentEmploymentArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Current Employment Verification')]")
	WebElement clickOnCurrentEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCurrentEmploymentCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCurrentEmploymentCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCurrentEmploymentSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCurrentEmploymentClosedByClientBtn;

	// CV Validation --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCvValidationClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCvValidationSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCvValidationSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCvValidationArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'CV Validation')]")
	WebElement clickOnCvValidationVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCvValidationCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCvValidationCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCvValidationSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCvValidationClosedByClientBtn;

	// Global Database Check --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGlobalDatabaseClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGlobalDatabaseSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGlobalDatabaseSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGlobalDatabaseArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Global Database Check')]")
	WebElement clickOnGlobalDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGlobalDatabaseCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGlobalDatabaseCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGlobalDatabaseSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGlobalDatabaseClosedByClientBtn;

	// India Court Record Check through Law Firm --Checks Summary -- Case Summary
	// Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCourtClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCourtRecordSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCourtRecordSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCourtRecordArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Check through Law Firm')]")
	WebElement clickOnIndiaCourtRecordCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCourtRecordCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCourtRecordCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCourtRecordSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCourtRecordClosedByClientBtn;

	// Indian Database Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndianDatabaseClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndianDatabaseSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndianDatabaseSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndianDatabaseArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Indian Database Verification')]")
	WebElement clickOnIndianDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndianDatabaseCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndianDatabaseCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndianDatabaseSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndianDatabaseClosedByClientBtn;

	// National Identity Check --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyNationalIdentityClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtNationalIdentitySearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnNationalIdentitySearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnNationalIdentityArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'National Identity Check')]")
	WebElement clickOnNationalIdentityCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectNationalIdentityCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectNationalIdentityCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtNationalIdentitySpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnNationalIdentityClosedByClientBtn;

	// PAN No Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPanANNoClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPanVerificationSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPanVerificationSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPanVerificationArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification')]")
	WebElement clickOnPanVerificationCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPanVerificationCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPanVerificationCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPanVerificationSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPanVerificationClosedByClientBtn;

	// Permanent Address Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPermanentAddressClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPermanentAddressSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPermanentAddressSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPermanentAddressArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Permanent Address Verification')]")
	WebElement clickOnPermanentAddressCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPermanentAddressCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPermanentAddressCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPermanentAddressSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPermanentAddressClosedByClientBtn;

	// Previous Employment Verification --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPreviousEmploymentClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPreviousEmploymentSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPreviousEmploymentSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPreviousEmploymentArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Previous Employment Verification')]")
	WebElement clickOnPreviousEmploymentCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPreviousEmploymentCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPreviousEmploymentCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPreviousEmploymentSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPreviousEmploymentClosedByClientBtn;

	// Professional Reference Check --Checks Summary -- Case Summary Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyProfessionalReferenceClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtProfessionalReferenceSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnProfessionalReferenceSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnProfessionalReferenceArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Professional Reference Check')]")
	WebElement clickOnProfessionalReferenceCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectProfessionalReferenceCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectProfessionalReferenceCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtProfessionalReferenceSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnProfessionalReferenceClosedByClientBtn;

	// Verification Text for the Assertion
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Professional Reference Check ( Closed by Client )')]")
	WebElement verifyProfessionalReferenceCheckClosedbyClient;

	// Logout Raju Yadav Account for Cat Role -- Bridge.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickOnBridgeLogoutBtn;

	// Education Verification W --Checks Summary -- Case Summary Details
	// Verifier --(Super Admin)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectSuperAdminVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Digital Verification')]")
	WebElement verifyDigitalVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEducationVerificationWSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnEducationVerificationWSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnEducationVerificationWArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Education Verification W')]")
	WebElement clickOnEducationVerificationW;

	// Antecedents to Verify
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='chk_copy_stated']")
	WebElement checkCopyStatedChekBox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/center[1]/table[1]/tbody[1]/tr[1]/td[3]/textarea[1]")
	WebElement txtCollegeLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[9]/tbody[1]/tr[9]/td[3]/select[1]")
	WebElement selectModeOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='Save_Data']")
	WebElement clickOnSaveVerifiedDataBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCloseVerificationAction;

	// Case Check - Close Verification --
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFICATIONPROCEDURE']")
	WebElement selectVerifiedViaEmail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFICATIONCOUNTRYID']")
	WebElement selectFinalVerificationCountry;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERTYPE']")
	WebElement selectVerificationTypeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[2]/thead/tr[4]/td/table/tbody/tr[45]/td[1]/div/span/input")
	WebElement checkCheckBox533UnableToVerify;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='close_verify_btn']")
	WebElement clickOnCloseVerification;

	// Verify -- Education Verification W(Completed) --Check is successfully marked
	// as "Completed".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Education Verification W ( Completed )')]")
	WebElement verifyEducationVerificationWCompletedText;

	// Verification Quality Allocator--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserRoleVerificationQualityAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts')]")
	WebElement verifyNotificationAlerts;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEnterArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnArsNoSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[11]/a")
	WebElement clickOnVerifiedCountNumber;

	// Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/thead[1]/tr[1]/th[1]/input[2]")
	WebElement checkOnCheckBoxCheckListAll;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckBULKACTIONTAKEN']")
	WebElement selectActionAllocateToVqc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlChecksAssignedToRelease']")
	WebElement selectTeamMemberName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='check_comments']")
	WebElement txtCheckComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoBtn;

	// Verification Quality Allocator Successfully Message--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyQualityAllocatorSuccessMsg;

	// Verification Quality-- Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Education Verification W')]")
	WebElement clickOnEductaionVerificationWCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectActionReviewForQuality;

	// Review Check for Quality
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='review_comment']")
	WebElement txtRemarksComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='action_taken']")
	WebElement selectActionReviewStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[4]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnReviewBtn;

	// The check was successfully released for report.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifySuccessfullyReleasedForReportMsg;

	// CAT-- (Forward For Report) Case List - Search Result
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserRoleCAT;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEnterArsNumberField;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnArsNumberSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[13]/select[1]")
	WebElement selectActionForwardForReport;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='report_type']")
	WebElement selectActionRequestType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='report_sub_name']")
	WebElement selectActionReportSubName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCasesComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btnSubmit']")
	WebElement clickOnSubmitBtn;

	// The Case was successfully forwarded for the report.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifySuccessForwardReportMsg;

	// Reports Manager -- Search Report
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserRoleReportsManager;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Reports Status')]")
	WebElement verifyNotificationAlertsReportsStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")
	WebElement clickOnReportsManagerReports;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='CaseReportCASEARSNO']")
	WebElement txtArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search Report')]")
	WebElement clickOnSearchReportBtn;

	// Report List - Search Result -- Single Window Review Report
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[14]/select[1]")
	WebElement selectActionWindowReviewReport;

	// Criminal Records Verification-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnCriminalRecordsSubmitBtn;

	// National Identity Check -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnNationalIdentitySubmitBtn;

	// Credit Default -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnCreditDefaultSubmitBtn;

	// PAN No Verification -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnPanNoSubmitBtn;

	// Indian Database Verification-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnIndianDatabaseSubmitBtn;

	// Global Database Check-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnGlobalDatabaseSubmitBtn;

	// CV Validation -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnCvValidationSubmitBtn;

	// Current Address Verification-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[10]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnCurrentAddressSubmitBtn;

	// Permanent Address Verification-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[11]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnPermanentAddressSubmitBtn;

	// India Court Record Check through Law Firm -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnIndiaCourtSubmitBtn;

	// Education Verification W-- Completed
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnEducationVerificationWSubmitBtn;

	// Professional Reference Check -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[14]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnProfessionalReferenceSubmitBtn;

	// Current Employment Verification-- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnCurrentEmploymentSubmitBtn;

	// Previous Employment Verification -- Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[16]/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/button[1]")
	WebElement clickOnPreviousEmploymentSubmitBtn;

	// Report Review--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='report_severity']")
	WebElement selectReportSeverity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='standard_comment']")
	WebElement selectStandardComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='final_form_btn']")
	WebElement clickOnReportReviewBtn;

	// Report Successfully Reviewed.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyReportSuccessReviewedMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Report Successfully Reviewed.')]")
	WebElement verifyReportSuccessReviewMsg;

	// Crone URL hit--Case Report not found. Case Report Id: 5030200
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]")
	WebElement verifyCaseReportIdNotFound;

	// Generate Pdf Report has been Verified Successfully.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[13]/a[1]/img[1]")
	WebElement verifyGenerateReportPdf;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[13]/a[1]/img[1]")
	WebElement clickOnGenerateReportPdf;

	// Verified --Report Status- Report List - Search Result
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Final')]")
	WebElement verifyReportStatusVerifiedText;

	// Verify Completed Case (iBridge Portal)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement clickOnSubmittedCasesTracker;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='search-box']")
	WebElement clickOnArcsSearchBox;

	// Verify Completed Text name of the Completed Case.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/span[2]")
	WebElement verifyCompletedTextName;

	// Reopen Case ---Bridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='case_action']")
	WebElement selectCaseLevelActions;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[11]/td[8]/input[1]")
	WebElement checkEduVerificationWReopenStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[12]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectReopenReason;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[12]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectReopenScenarios;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[12]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[4]/textarea[1]")
	WebElement txtReopenCaseComments;

	// Case Reopen
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseMasterREOPENREASON']")
	WebElement SelectReOpenReason;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseMasterREOPENSCENERIO']")
	WebElement selectReopenScenario;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[5]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[4]/textarea[1]")
	WebElement txtReopenCaseComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btnSubmit']")
	WebElement clickOnCaseReopenSubmitBtn;

	// The Case was successfully reopened.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCaseSuccessReopened;

	// Reopen Case ---iBridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSu;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement clickOnSubmittedCasesTrackerReOpen;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsNumber;

	// Verify Reopened Case----
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/i[1]")
	WebElement verifyReopenedImage;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Reopened - WIP')]")
	WebElement verifyReopenedWipToolTipText;

	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Checks Summary (Close By Client)-- Case Summary Details
	public void userAdminChecksSummaryClosedByClient(String creditArsNumber, String creditSpecialComments,
			String criminalArsNo, String criminalComments, String currentAddrArsNo, String currentAddrComments,
			String currentEmpArsNo, String currentEmpComments, String cvValidationArsNo, String cvValidationComments,
			String globalArsNo, String globalComments, String indianCourtArsNo, String indianCourtComments,
			String indianDbArsNo, String indianDbComments, String nationalArsNo, String nationalComments,
			String panNoArsNo, String panNoComments, String perAddrArsNo, String perAddressComments, String preEmpArsNo,
			String preEmpComments, String professionalArsNo, String professionalComments)
			throws InterruptedException, IOException {
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(selectUserCurrentRoleCat));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserCurrentRoleCat, "CAT");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 420);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsCasesStatus));
		txtCompleteSearchNo.sendKeys(creditArsNumber);
		clickOnCompleteSearchBtn.click();
		Thread.sleep(1000);
		clickOnArsNumber.click();
		Thread.sleep(1000);
		// Credit Default-- Checks Summary -- Case Summary Details--1
		wait = new WebDriverWait(ldriver, 420);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditDefault));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCreditDefault);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditDefault));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCreditDefault);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCaseCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseCheckVerification));
		JavaScriptManuplator.selectOptionFromDropDown(selectCaseCheckVerification, "Close By Client");
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseCheckCommentCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCaseCheckCommentCategory, "As per client instruction");
		Thread.sleep(1000);
		txtSpecialComments.sendKeys(creditSpecialComments);
		clickOnClosedByClientBtn.click();

		// Criminal Records Verification --Checks Summary -- Case Summary Details--2
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCriminalRecordsClosedByClientSuccessfullyMsg));
		txtCriminalRecordSearchNo.sendKeys(criminalArsNo);
		clickOnCriminalRecordSearchBtn.click();
		clickOnCriminalRecordArsNumber.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCriminalRecordsVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCriminalRecordsVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCriminalRecordsVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCriminalRecordsCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCriminalRecordsCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectCriminalRecordsCloseByClient, "Close By Client");
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCriminalCommentCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCriminalCommentCategory, "As per client instruction");
		Thread.sleep(1000);
		txtCriminalSpecialComments.sendKeys(criminalComments);
		clickOnCriminalClosedByClientBtn.click();

		// Current Address Verification --Checks Summary -- Case Summary Details--3
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCurrentAddressClosedByClientSuccessfullyMsg));
		txtCurrentAddressSearchNo.sendKeys(currentAddrArsNo);
		clickOnCurrentAddressSearchBtn.click();
		clickOnCurrentAddressArsNumber.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCurrentAddressCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentAddressCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentAddressCloseByClient, "Close By Client");
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentAddressCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentAddressCategory, "As per client instruction");
		Thread.sleep(1000);
		txtCurrentAddressSpecialComments.sendKeys(currentAddrComments);
		clickOnCurrentAddressClosedByClientBtn.click();

		// Current Employment Verification --Checks Summary -- Case Summary Details--4
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCurrentEmploymentClosedByClientSuccessfullyMsg));
		txtCurrentEmploymentSearchNo.sendKeys(currentEmpArsNo);
		clickOnCurrentEmploymentSearchBtn.click();
		clickOnCurrentEmploymentArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmploymentVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmploymentVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCurrentEmploymentCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentEmploymentCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentEmploymentCloseByClient, "Close By Client");
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentEmploymentCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentEmploymentCategory, "As per client instruction");
		Thread.sleep(1000);
		txtCurrentEmploymentSpecialComments.sendKeys(currentEmpComments);
		clickOnCurrentEmploymentClosedByClientBtn.click();

		// CV Validation --Checks Summary -- Case Summary Details--5
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCvValidationClosedByClientSuccessfullyMsg));
		txtCvValidationSearchNo.sendKeys(cvValidationArsNo);
		clickOnCvValidationSearchBtn.click();
		clickOnCvValidationArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCvValidationCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCvValidationCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectCvValidationCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCvValidationCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectCvValidationCategory, "As per client instruction");
		Thread.sleep(1000);
		txtCvValidationSpecialComments.sendKeys(cvValidationComments);
		clickOnCvValidationClosedByClientBtn.click();

		// Global Database Check --Checks Summary -- Case Summary Details--6
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGlobalDatabaseClosedByClientSuccessfullyMsg));
		txtGlobalDatabaseSearchNo.sendKeys(globalArsNo);
		clickOnGlobalDatabaseSearchBtn.click();
		clickOnGlobalDatabaseArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalDatabaseCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalDatabaseCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalDatabaseCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalDatabaseCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalDatabaseCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalDatabaseCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalDatabaseCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectGlobalDatabaseCategory, "As per client instruction");
		Thread.sleep(1000);
		txtGlobalDatabaseSpecialComments.sendKeys(globalComments);
		clickOnGlobalDatabaseClosedByClientBtn.click();

		// India Court Record Check through Law Firm --Checks Summary -- Case Summary
		// Details--7
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCourtClosedByClientSuccessfullyMsg));
		txtIndiaCourtRecordSearchNo.sendKeys(indianCourtArsNo);
		clickOnIndiaCourtRecordSearchBtn.click();
		clickOnIndiaCourtRecordArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecordCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecordCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecordCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtRecordCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtRecordCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtRecordCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtRecordCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndiaCourtRecordCategory, "As per client instruction");
		Thread.sleep(1000);
		txtIndiaCourtRecordSpecialComments.sendKeys(indianCourtComments);
		clickOnIndiaCourtRecordClosedByClientBtn.click();

		// Indian Database Verification --Checks Summary -- Case Summary Details--8
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndianDatabaseClosedByClientSuccessfullyMsg));
		txtIndianDatabaseSearchNo.sendKeys(indianDbArsNo);
		clickOnIndianDatabaseSearchBtn.click();
		clickOnIndianDatabaseArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianDatabaseCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDatabaseCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianDatabaseCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndianDatabaseCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndianDatabaseCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndianDatabaseCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndianDatabaseCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectIndianDatabaseCategory, "As per client instruction");
		Thread.sleep(1000);
		txtIndianDatabaseSpecialComments.sendKeys(indianDbComments);
		clickOnIndianDatabaseClosedByClientBtn.click();

		// National Identity Check --Checks Summary -- Case Summary Details--9
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyNationalIdentityClosedByClientSuccessfullyMsg));
		txtNationalIdentitySearchNo.sendKeys(nationalArsNo);
		clickOnNationalIdentitySearchBtn.click();
		clickOnNationalIdentityArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentityCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentityCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentityCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectNationalIdentityCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectNationalIdentityCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectNationalIdentityCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectNationalIdentityCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectNationalIdentityCategory, "As per client instruction");
		Thread.sleep(1000);
		txtNationalIdentitySpecialComments.sendKeys(nationalComments);
		clickOnNationalIdentityClosedByClientBtn.click();

		// PAN No Verification --Checks Summary -- Case Summary Details--10
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPanANNoClosedByClientSuccessfullyMsg));
		txtPanVerificationSearchNo.sendKeys(panNoArsNo);
		clickOnPanVerificationSearchBtn.click();
		clickOnPanVerificationArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanVerificationCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanVerificationCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanVerificationCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanVerificationCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanVerificationCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanVerificationCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanVerificationCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectPanVerificationCategory, "As per client instruction");
		Thread.sleep(1000);
		txtPanVerificationSpecialComments.sendKeys(panNoComments);
		clickOnPanVerificationClosedByClientBtn.click();

		// Permanent Address Verification --Checks Summary -- Case Summary Details--11
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPermanentAddressClosedByClientSuccessfullyMsg));
		txtPermanentAddressSearchNo.sendKeys(perAddrArsNo);
		clickOnPermanentAddressSearchBtn.click();
		clickOnPermanentAddressArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPermanentAddressCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPermanentAddressCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectPermanentAddressCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPermanentAddressCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectPermanentAddressCategory, "As per client instruction");
		Thread.sleep(1000);
		txtPermanentAddressSpecialComments.sendKeys(perAddressComments);
		clickOnPermanentAddressClosedByClientBtn.click();

		// Previous Employment Verification --Checks Summary -- Case Summary Details--12
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPreviousEmploymentClosedByClientSuccessfullyMsg));
		txtPreviousEmploymentSearchNo.sendKeys(preEmpArsNo);
		clickOnPreviousEmploymentSearchBtn.click();
		clickOnPreviousEmploymentArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmploymentCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmploymentCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmploymentCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPreviousEmploymentCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPreviousEmploymentCloseByClient));
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousEmploymentCloseByClient, "Close By Client");
		Thread.sleep(1000);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPreviousEmploymentCategory));
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousEmploymentCategory, "As per client instruction");
		Thread.sleep(1000);
		txtPreviousEmploymentSpecialComments.sendKeys(preEmpComments);
		clickOnPreviousEmploymentClosedByClientBtn.click();

		// Professional Reference Check --Checks Summary -- Case Summary Details--13
//		wait = new WebDriverWait(ldriver, 60);
//		wait.until(ExpectedConditions.visibilityOf(verifyProfessionalReferenceClosedByClientSuccessfullyMsg));
//		txtProfessionalReferenceSearchNo.sendKeys(professionalArsNo);
//		clickOnProfessionalReferenceSearchBtn.click();
//		clickOnProfessionalReferenceArsNumber.click();
//
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalReferenceCheck);
//		wait = new WebDriverWait(ldriver, 60);
//		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalReferenceCheck));
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", clickOnProfessionalReferenceCheck);
//
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].scrollIntoView(true);", selectProfessionalReferenceCloseByClient);
//		wait = new WebDriverWait(ldriver, 60);
//		wait.until(ExpectedConditions.visibilityOf(selectProfessionalReferenceCloseByClient));
//		JavaScriptManuplator.selectOptionFromDropDown(selectProfessionalReferenceCloseByClient, "Close By Client");
//		Thread.sleep(1000);
//
//		wait = new WebDriverWait(ldriver, 60);
//		wait.until(ExpectedConditions.visibilityOf(selectProfessionalReferenceCategory));
//		JavaScriptManuplator.selectOptionFromDropDown(selectProfessionalReferenceCategory, "As per client instruction");
//		Thread.sleep(1000);
//		txtProfessionalReferenceSpecialComments.sendKeys(professionalComments);
//		clickOnProfessionalReferenceClosedByClientBtn.click();
//		Thread.sleep(1000);
	}
//
	public String verifyProfessionalReferenceCheckClosedByClientMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyProfessionalReferenceCheckClosedbyClient));
		return verifyProfessionalReferenceCheckClosedbyClient.getText();
   }

	public void bridgeAccountLoggedOut() throws InterruptedException {
		Thread.sleep(2000);
		clickOnBridgeLogoutBtn.click();
		Thread.sleep(1000);
	}

	// Education Verification W --Checks Summary -- Case Summary Details
	public void educationWChecksSummaryVerification(String educationArsNo, String collegeLocation, String courseName,
			String enrollNo, String refereeName, String yearOfPassing, String dateTime) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtEducationVerificationWSearchNo.sendKeys(educationArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationWSearchBtn);
		// clickOnEducationVerificationWSearchBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationWArsNumber);
		// clickOnEducationVerificationWArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerificationW);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerificationW));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationW);

		// Antecedents to Verify --Education Verification W
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCopyStatedChekBox);
		js = (JavascriptExecutor) ldriver;
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkCopyStatedChekBox));
		js.executeScript("arguments[0].click()", checkCopyStatedChekBox);
		Thread.sleep(2000);
		//txtCollegeLocation.sendKeys(collegeLocation);
		Select modeOfVerification = new Select(selectModeOfVerification);
		modeOfVerification.selectByIndex(2);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveVerifiedDataBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCloseVerificationAction);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCloseVerificationAction));
		Select educationCaseCheckVerification = new Select(selectCloseVerificationAction);
		educationCaseCheckVerification.selectByIndex(20);

		// Case Check - Close Verification --
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectVerifiedViaEmail));
		Select verifiedViaEmail = new Select(selectVerifiedViaEmail);
		verifiedViaEmail.selectByIndex(1);

		// Select finalVerificationCountry = new Select(selectFinalVerificationCountry);
		// finalVerificationCountry.selectByIndex(1);

		Select verificationTypeName = new Select(selectVerificationTypeName);
		verificationTypeName.selectByIndex(3);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBox533UnableToVerify);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBox533UnableToVerify);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCloseVerification);
		Thread.sleep(1000);
	}

	// Verify -- Education Verification W(Completed) --Check is successfully marked
	// as "Completed".
	public String verifyEducationVerificationWCompletedTextName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyEducationVerificationWCompletedText));
		return verifyEducationVerificationWCompletedText.getText();
	}

	// Verification Quality Allocator--Check List - Search Result - (14 records)
	public void superAdminVerificationQualityAllocator(String enterArsNo, String checkComments)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleVerificationQualityAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleVerificationQualityAllocator, "Verification Quality Allocator");
		//Select userRoleVerificationQualityAllocator = new Select(selectUserRoleVerificationQualityAllocator);
		//userRoleVerificationQualityAllocator.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlerts));
		txtEnterArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearchBtn);
		// clickOnArsNoSearchBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnVerifiedCountNumber);
		// clickOnVerifiedCountNumber.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkOnCheckBoxCheckListAll));
		checkOnCheckBoxCheckListAll.click();

		Select actionAllocateToVqc = new Select(selectActionAllocateToVqc);
		actionAllocateToVqc.selectByIndex(1);

		// Select teamMemberName = new Select(selectTeamMemberName);
		// teamMemberName.selectByIndex(4);
		txtCheckComments.sendKeys(checkComments);
		clickOnGoBtn.click();

		WebElement element = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// The selected checks were successfully released for report.
	public String verificationQualityAllocatorSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyQualityAllocatorSuccessMsg));
		return verifyQualityAllocatorSuccessMsg.getText();
	}

	// Verification Quality-- Check List - Search Result - (14 records)
	public void superAdminVerificationQuality(String enterArsNo, String remarkComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleVerificationQualityAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleVerificationQualityAllocator, "Verification Quality");
		//Select userRoleVerificationQualityAllocator = new Select(selectUserRoleVerificationQualityAllocator);
		//userRoleVerificationQualityAllocator.selectByIndex(63);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlerts));
		txtEnterArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearchBtn);
		// clickOnArsNoSearchBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnVerifiedCountNumber);
		// clickOnVerifiedCountNumber.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEductaionVerificationWCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEductaionVerificationWCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectActionReviewForQuality);
		Select actionReviewForQuality = new Select(selectActionReviewForQuality);
		actionReviewForQuality.selectByIndex(2);

		// Review Check for Quality
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtRemarksComments));
		txtRemarksComments.sendKeys(remarkComments);
		Select actionReviewStatus = new Select(selectActionReviewStatus);
		actionReviewStatus.selectByIndex(1);
		clickOnReviewBtn.click();
		Thread.sleep(1000);
	}

	// The check was successfully released for report.
	public String verifyReleasedForReportSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessfullyReleasedForReportMsg));
		return verifySuccessfullyReleasedForReportMsg.getText();
	}

	// CAT-- (Forward For Report) Case List - Search Result
	public void superAdminforwardForReportCat(String arsNumber, String caseComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleCAT));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleCAT, "CAT");
		//Select userRoleCAT = new Select(selectUserRoleCAT);
		//userRoleCAT.selectByIndex(15);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsCasesStatus));
		txtEnterArsNumberField.sendKeys(arsNumber);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNumberSearchBtn);
		// clickOnArsNumberSearchBtn.click();

		wait = new WebDriverWait(ldriver, 420);
		wait.until(ExpectedConditions.visibilityOf(selectActionForwardForReport));
		Select actionForwardForReport = new Select(selectActionForwardForReport);
		actionForwardForReport.selectByIndex(6);

		// Do you wish to continue with "Forward for Report"?
		WebElement element = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectActionRequestType);
		// wait = new WebDriverWait(ldriver, 60);
		// wait.until(ExpectedConditions.visibilityOf(selectActionRequestType));
		// Select actionRequestType = new Select(selectActionRequestType);
		// actionRequestType.selectByIndex(1);

		Select actionReportSubName = new Select(selectActionReportSubName);
		actionReportSubName.selectByIndex(5);
		txtCasesComments.sendKeys(caseComments);
		clickOnSubmitBtn.click();
		Thread.sleep(1000);
	}

	// The Case was successfully forwarded for the report.
	public String verifySuccessfullyForwardForReportMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessForwardReportMsg));
		return verifySuccessForwardReportMsg.getText();
	}

	// Reports Manager -- Search Report
	public void superAdminReportsManager(String enterArsNo) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleReportsManager));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleReportsManager, "Reports Manager");
		//Select userRoleReportsManager = new Select(selectUserRoleReportsManager);
		//userRoleReportsManager.selectByIndex(50);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsReportsStatus));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnReportsManagerReports);
		// clickOnReportsManagerReports.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Search Report')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtArsNumber));
		txtArsNumber.sendKeys(enterArsNo);
		clickOnSearchReportBtn.click();

		// Report List - Search Result -- Single Window Review Report
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectActionWindowReviewReport));
		Select actionWindowReviewReport = new Select(selectActionWindowReviewReport);
		actionWindowReviewReport.selectByIndex(3);

		// Do you wish to continue with the action "Single Window Review Report"?
		WebElement ele = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions act = new Actions(ldriver);
		act.moveToElement(ele).click().perform();

		// Criminal Records Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCriminalRecordsSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCriminalRecordsSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCriminalRecordsSubmitBtn);

		// National Identity Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentitySubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentitySubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentitySubmitBtn);

		// Credit Default
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCreditDefaultSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditDefaultSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCreditDefaultSubmitBtn);

		// PAN No Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoSubmitBtn);

		// Indian Database Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianDatabaseSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDatabaseSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianDatabaseSubmitBtn);

		// Global Database Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalDatabaseSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalDatabaseSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalDatabaseSubmitBtn);

		// CV Validation
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationSubmitBtn);

		// Current Address Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressSubmitBtn);

		// Permanent Address Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressSubmitBtn);

		// India Court Record Check through Law Firm
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtSubmitBtn);

		// Education Verification W
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerificationWSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerificationWSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationWSubmitBtn);

		// Professional Reference Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalReferenceSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalReferenceSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalReferenceSubmitBtn);

		// Current Employment Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmploymentSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmploymentSubmitBtn);

		// Previous Employment Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmploymentSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmploymentSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmploymentSubmitBtn);

		// Report Review--
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnReportReviewBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectReportSeverity));
		Select reportSeverity = new Select(selectReportSeverity);
		reportSeverity.selectByIndex(6);
		Select standardComments = new Select(selectStandardComments);
		standardComments.selectByIndex(17);
		Thread.sleep(2000);
		String url = ldriver.getCurrentUrl();
		try {

			File output = new File("copyGenerateCode.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(url);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		clickOnReportReviewBtn.click();
		Thread.sleep(1000);
	}

	// Report Successfully Reviewed.
	public String verifyReportSuccessReviewedMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyReportSuccessReviewMsg));
		return verifyReportSuccessReviewMsg.getText();
	}

	// Crone URL hit--Case Report not found. Case Report Id: 5030200
	public String verifyGenerateCaseReportIdNotFound() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseReportIdNotFound));
		return verifyCaseReportIdNotFound.getText();
	}

	// Generate Pdf Report has been Verified Successfully.
	public void clickOnGeneratedPdfIcon() {
		clickOnGenerateReportPdf.click();
	}

	// Generate Pdf Report has been Verified Successfully.
	public String generateReportPdf() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyGenerateReportPdf));
		return verifyGenerateReportPdf.getText();
	}

	public String verifyReportStatusVerified() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyReportStatusVerifiedText));
		return verifyReportStatusVerifiedText.getText();

	}

	// Verify Completed Case --(iBridge Portal)
	public void verifyCompletedCaseInBucketPresentOrNot(String arsNumber) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Completed Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(arsNumber);
		Thread.sleep(2000);
		clickOnArcsSearchBox.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}

	// Verify Completed Text name of the Completed Case.
	public String verifyCompletedCaseAsMarkCompleted() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCompletedTextName));
		return verifyCompletedTextName.getText();
	}

	// Reopen Case --Bridge Portal
	public void verifyReOpenCompletedCase(String creditArsNumber, String reopenComments, String reopenComment)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(selectUserCurrentRoleCat));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserCurrentRoleCat, "CAT");
		//Select userCurrentRoleCat = new Select(selectUserCurrentRoleCat);
		//userCurrentRoleCat.selectByIndex(15);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 420);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsCasesStatus));
		txtCompleteSearchNo.sendKeys(creditArsNumber);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompleteSearchBtn);
		// clickOnCompleteSearchBtn.click();
		clickOnArsNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseLevelActions));
		Select caseLevelActions = new Select(selectCaseLevelActions);
		caseLevelActions.selectByIndex(3);

		// Do you wish to continue with "Reopen Case"?
		WebElement element = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkEduVerificationWReopenStatus));
		checkEduVerificationWReopenStatus.click();

		Select reopenResoan = new Select(selectReopenReason);
		reopenResoan.selectByIndex(2);
		Thread.sleep(3000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectReopenScenarios));
		Select reopenScenarios = new Select(selectReopenScenarios);
		reopenScenarios.selectByIndex(4);
		Thread.sleep(3000);
		txtReopenCaseComments.sendKeys(reopenComments);
		Thread.sleep(2000);
		// Case Reopen
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(SelectReOpenReason));
		Select reOpenReason = new Select(SelectReOpenReason);
		reOpenReason.selectByIndex(2);
		Thread.sleep(3000);
		Select reopenScenario = new Select(selectReopenScenario);
		reopenScenario.selectByIndex(4);
		Thread.sleep(2000);
		txtReopenCaseComment.sendKeys(reopenComment);
		clickOnCaseReopenSubmitBtn.click();
		Thread.sleep(1000);
	}

	// The Case was successfully reopened.
	public String verifyCaseSuccessReopenedMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseSuccessReopened));
		return verifyCaseSuccessReopened.getText();
	}

	// Reopen Case ---iBridge Portal
	public void verifyReOpenedCasesInReopenedWip(String arsNumber) throws InterruptedException {
		clickOnSidebarExpandSu.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTrackerReOpen));
		clickOnSubmittedCasesTrackerReOpen.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'WIP Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsNumber.sendKeys(arsNumber);
		Thread.sleep(2000);
		searchByArsNumber.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}

	// Verify Reopened Case----
	public String verifyReopenedWipToolTipText() {
		WebElement element = ldriver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/i[1]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyReopenedWipToolTipText));
		return verifyReopenedWipToolTipText.getText();

	}
}
