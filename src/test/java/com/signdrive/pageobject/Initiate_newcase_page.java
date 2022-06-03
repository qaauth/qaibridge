package com.signdrive.pageobject;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.JavaScriptManuplator;
import com.iBridge.utilities.ReadConfig;

public class Initiate_newcase_page extends BaseClass {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	String fullName;
	String newName;
	public String uploadOfferLetterPathStart = "//*[text()=";
	public String uploadOfferLetterPathEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::a[@title='Upload Offer Letter']";
	public String uploadStatusPathStart = "//*[text()=";
	public String uploadStatusPathEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::*[@class='tag-name']";
	public String hitCronStatusStart = "//*[text()=";
	public String hitCronEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::*[@class='tag-name']";
	public String approvePathStart = "//*[text()=";
	public String approvePathEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::a[@title='Review Signed Offer Letter']";
	public String completePathStart = "//*[text()=";
	public String completePathEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::*[@class='tag-name']";
	public String checksXpathStart = "(//*[@class='checkwise-check'])[";
	public String checkXpathEnd = "]";
	public String rejectXpathStart = "//*[text()=";
	public String rejectXpathEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::label[@class='tag-name']";
	public String rejectEpfoXpathStart = "//*[text()=";
	public String rejectEpfoEnd = "]//parent::div//parent::div[@class='candiate-details']//following-sibling::div[@class='action-box']//child::label[@class='tag-name']";

	ReadConfig config = new ReadConfig();

	public Initiate_newcase_page(WebDriver rdriver, String firstName, String middleName, String lastName) {

		ldriver = rdriver;
		newName = "' " + firstName + " " + middleName + " " + lastName + " '";
		PageFactory.initElements(driver, this);
	}

	// Login Functionalities of the SignDrive Portal

	@FindBy(xpath = "//*[@id='username']")
	@CacheLookup
	WebElement usernameField;

	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	WebElement passwordField;

	@FindBy(xpath = "//*[@id='submitBtn']")
	@CacheLookup
	WebElement login_Btn;

	// Initiate Via Candidate(IVC)

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='sidebar-expand-collapse-btn']/div/div/div")
	WebElement sideBarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement initiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Initiate Case(s) Individually']")
	WebElement initiateCaseIndividually;

	// Package Selection

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='recent-package-list-box-map']/div/div[1]/a[2]")
	WebElement checkWiseSelectBtn;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][id]")
	WebElement previousEmploymentVerificationCheck;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][count]")
	WebElement previousEmploymentVerificationCountField;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[60][id]']")
	WebElement addressVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[60][count]']")
	WebElement addressVerificationCount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[63][id]']")
	WebElement indiaCreditDefaultDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[63][count]']")
	WebElement indiaCreditDefaultDatabaseCheckCount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[144][id]\']")
	WebElement educationVerificationWritten;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[144][count]']")
	WebElement educationVerificationWrittenCount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[217][id]']")
	WebElement federalCriminalcheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[217][count]']")
	WebElement federalCriminalcheckCount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[220][id]']")
	WebElement countryCriminalCheckUSA;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='checkwise[220][count]']")
	WebElement countryCriminalCheckUSACount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement saveAndContinue;

	// Step 3 - Candidate Summary (Add Candidate Information)

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='middle-name']")
	WebElement txtMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='last-name']")
	WebElement txtLastName;

	// Date of Birth (DOB)

	@CacheLookup
	@FindBy(how = How.ID, using = "date-of-birth")
	WebElement clickDateOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'24')]")
	WebElement clickDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='email-address']")
	WebElement txtEmailId;

	@CacheLookup
	@FindBy(how = How.ID, using = "mobile-no")
	WebElement txtMobileNumber;

	// Additional Field(s)

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='row']//child::div[@class='col-sm-6']//child::div[@class='material-design-box']//child::select[@id='bridge-location-id']")
	WebElement locationId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-1']")
	WebElement employeeIDField;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-5']")
	WebElement clientNameField;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='mCSB_2_dragger_vertical']//child::div[@style='line-height: 50px;']")
	WebElement scrollBar;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='addCandidate']")
	WebElement clickAddTOQueue;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@onclick='ignoreDuplicacy()']")
	WebElement ignoreDuplicate;

	// Candidate information saved successfully

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Candidate information saved successfully')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='continueBtn']")
	WebElement clickOnContinueBtn;

	// Case Preview- INITIATE (Please review the screen before you proceed)

	@CacheLookup
	@FindBy(how = How.ID, using = "initiateBtn")
	WebElement clickInitiateBtn;

	// OFFER LETTER CASE(S) SUMMARY

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@class='tag-name'] )[1]")
	WebElement pendingCTCUploadStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div/form/div[2]/div/div/div/input")
	WebElement dragDropFileHere;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='upload']")
	WebElement upload;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='action-div-20792']/div/label")
	WebElement uploadVerifyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=':2d']/span[1]/span")
	WebElement verifyEmail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Cron run']")
	WebElement cronRun;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@action_type='APPROVE_SD_DOC']")
	WebElement approveDocument;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='submit-btn']")
	WebElement approveButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[ @id='signed-doc-view-popup']//button")
	WebElement documentApproveClose;

	// BGV Login credentials

	@CacheLookup
	@FindBy(xpath = "//*[@id='username']")
	WebElement bgvUsernameField;

	@CacheLookup
	@FindBy(xpath = "//*[@id='password']")
	WebElement bgvPasswordField;

	@CacheLookup
	@FindBy(xpath = "//*[@id='submitBtn']")
	WebElement bgv_Login_Btn;

	@CacheLookup
	@FindBy(xpath = "//*[text()='Instructions to Fill Background Verification Form']")
	WebElement bgvLoginScreenMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@aria-label='Close']//child::img[@src='/ibridge_aws_new/img/popup-close-icon.png'])[1]")
	WebElement closeVerificationFromBtn;

	// INSTRUCTIONS TO FILL BACKGROUND VERIFICATION FORM

	@FindBy(xpath = "//*[@id='instruction-popup']/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopupCrossBtn;

	// Verify After Login By Candidate Account-- Case Submission Summary Text

	@CacheLookup
	@FindBy(xpath = "//label[contains(text(),'Step 3 - Candidate Summary')]")
	WebElement verifyCandidateSummaryText;

	// AUTHORIZATION--Step 3 - Candidate Summary

	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/div/div/div[4]/div/div/div[1]/label/span")
	@CacheLookup
	WebElement verifyText;

	@FindBy(id = "concentcheck")
	@CacheLookup
	WebElement checkConcentCheckBox;

	@FindBy(id = "agreecheck")
	@CacheLookup
	WebElement checkAgreeCheckBox;

	@FindBy(xpath = "//div[@id='signatureparent']")
	@CacheLookup
	WebElement signatureParent;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnContinueBtn1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='prefix']")
	WebElement prefix;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='gender']")
	WebElement gender;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='ssn-number']")
	WebElement ssnNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement saveAndContinueProfile;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Confirm and Proceed']")
	WebElement confirmAndProceed;

	// Candidate Information

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-father-full-name']")
	WebElement fatherFullName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-father-dob']")
	WebElement fatherDateOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-father-qualification']")
	WebElement fatherQualification;

	// personal Information

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-blood-group']")
	WebElement bloodGroup;

	// Bank Account Details

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-bank-name']")
	WebElement bankName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-name-as-per-bank']")
	WebElement nameAsPerBankAccount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-bank-account-number']")
	WebElement bankAccountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-ifsc-code-of-branch']")
	WebElement ifscCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-micr-number']")
	WebElement micrNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-bank-address']")
	WebElement bankAddressWithPincode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='cheque_doc']")
	WebElement uploadCancelledCheque;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement continueButton;

	// Aadhaar Details

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='check-data-78491-115']")
	WebElement aaddharCardNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='check_documents_24_78491front']")
	WebElement uploadDocumentFrontSide;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@data-docside='back']")
	WebElement uploadDocumentBackSide;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement saveAndContinueButton;

	// Address Details

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div/div/label[1]/input")
	@CacheLookup
	WebElement selectWithinIndia;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtFlat_House;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtColonyName;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement clickOnResidingForm;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[4]/div/div[2]/div/label/input[2]")
	@CacheLookup
	WebElement checkBoxTillDate;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[1]/div/input")
	@CacheLookup
	WebElement txtPinCode;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtStateName;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[3]/div/input[1]")
	@CacheLookup
	WebElement txtCityName;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPoliceStation;

	// Add Documents

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div/input[1]")
	@CacheLookup
	WebElement uploadAddressProof;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='new-continue-btn pull-right show_forms_valid']")
	WebElement savebutton;

	// Onboading details

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-current-location']")
	WebElement currentLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-religion']")
	WebElement religion;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-uan-number']")
	WebElement uanNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-nominee-name']")
	WebElement nomieeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-nominee-address']")
	WebElement nomieeAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-nominee-relationship']")
	WebElement nomieeRelationship;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-nominee-age']")
	WebElement nomineeAge;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-nominee-amount-share']")
	WebElement nomieeAmount;

	// Member

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-eps-family-member-name']")
	WebElement familyMemberName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-eps-family-member-address']")
	WebElement familyMemberAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-eps-family-member-relationship']")
	WebElement familyMemberRelationship;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-eps-family-member-age']")
	WebElement familyMemberAge;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-pension-nominee-name']")
	WebElement pensionNomineeNmae;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-pension-nominee-address']")
	WebElement pensionNomineeAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/div/div[4]/div[3]/div/select")
	WebElement pensionNomineeRelationship;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-pension-nominee-dob']")
	WebElement pensionNomineeDob;

	// PROVIDENT FUND ORGANIZATION

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-earlier-member-epf-scheme-n']")
	WebElement noMemberEpf;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-earlier-member-ep-scheme-n']")
	WebElement noMemberEp;

	// International worker

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-international-worker-y']")
	WebElement yes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-country-of-origin']")
	WebElement countryOfOrigin;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-pf-passport-number']")
	WebElement passportNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-validity-of-passport-from']")
	WebElement passportfrom;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-validity-of-passport-to']")
	WebElement passportTo;

	// GRATUITY DETAILS

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-bank-account-number']")
	WebElement bankAccountNumberDetails;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-ifsc-code-of-branch']")
	WebElement ifscCodeOfBranch;

	// GRATUITY NOMINATION

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-gratuity-nominee-name']")
	WebElement gratuityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-gratuity-nominee-address']")
	WebElement gratuityAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-gratuity-nominee-relationship']")
	WebElement gratuityRelationship;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-gratuity-nominee-age']")
	WebElement gratuityAge;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customfields-data-gratuity-nominee-amount-share']")
	WebElement amountShare;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='signdriveDetailsFormSubmit']")
	WebElement submit;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement sumitbutton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement clickOk;

	// Candidate Logout

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/a/span")
	WebElement clickOnCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/ul/li/a")
	WebElement clickOnLogoutBtn;

	// Verify Initiate Case Thank You Message

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyCaseThankYouMsg;

	// Case move to pending sign off bucket

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/ul/li[4]/a/span")
	WebElement caseSubmissionSummary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Pending Sign-Off']")
	WebElement pendingSignOff;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@selection='migrate-cases']")
	WebElement submitButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[1]/label/input")
	WebElement checkbox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Confirm Submit']")
	WebElement confirmSubmit;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement ok;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@aria-controls='submitted_for_verification']")
	WebElement submittedForVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@case_ars='MTAwMC0yMDI0OTk%3D']")
	WebElement viewDetails;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@aria-controls='sign_documents']")
	WebElement documentForSignature;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[5]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[3]/a[3]")
	WebElement folderViewSignedDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")
	WebElement approve;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[6]/div/div/div[2]/div/form/div[2]/div[3]/button")
	WebElement approveLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okClick;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div/div/div[1]/button/img")
	WebElement documentApproved;

	// Disclosure under corporate GoverNance

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Disclosure under Corporate Governance']")
	WebElement disclosureCorporate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")
	WebElement approveDisclosure;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='reject-approve-doc-btn']")
	WebElement approveDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div/div/div[1]/button/img")
	WebElement approvedDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='ESIC FORM']")
	WebElement esicForm;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@action_type='APPROVE_SD_DOC']")
	WebElement approveEsicDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='reject-approve-doc-btn']")
	WebElement approveEsic;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okEsic;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[3]/div/div/div[1]/button/img")
	WebElement approveEsicdoc;

	// Action Method for Login functionalities of the SignDrive Portal
	public void loginSignDriveAccount(String username, String password) throws InterruptedException {

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		login_Btn.click();
		Thread.sleep(2000);
	}

	// Initiate Via Candidate(IVC)
	public void sidebarExpandBtn() throws InterruptedException {

		sideBarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(initiateNewCase));
		initiateNewCase.click();
		initiateCaseIndividually.click();
	}

	// Package Selection
	public void clickUnCheckWiseSelect(String previousemploymentverification, String addressverification,
			String indiacreditdefaultdatabasecheck, String educationverificationwritten, String federalcriminalcheck,
			String countrycriminalcheck) throws InterruptedException {

		checkWiseSelectBtn.click();

		for (int itr = 1; itr <= 19; itr++) {
			if (itr == 4) {
				addressVerificationCount.clear();
				addressVerificationCount.sendKeys(addressverification);
				continue;

			} else if (itr == 9 || itr == 17) {
				String checkXpath1 = checksXpathStart.concat(Integer.toString(itr)).concat(checkXpathEnd);
				JavaScriptManuplator.javaScriptExecutor(ldriver.findElement(By.xpath(checkXpath1)),
						"arguments[0].scrollIntoView(true);", ldriver);
				wait = new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(ldriver.findElement(By.xpath(checkXpath1))));
				ldriver.findElement(By.xpath(checkXpath1)).click();

			} else {
				String checkXpath = checksXpathStart.concat(Integer.toString(itr)).concat(checkXpathEnd);
				ldriver.findElement(By.xpath(checkXpath)).click();
			}
		}
//		previousEmploymentVerificationCountField.clear();
//		previousEmploymentVerificationCountField.sendKeys(previousemploymentverification);
//		addressVerificationCount.clear();
//		addressVerificationCount.sendKeys(addressverification);
//		indiaCreditDefaultDatabaseCheckCount.clear();
//		indiaCreditDefaultDatabaseCheckCount.sendKeys(indiacreditdefaultdatabasecheck);
//		educationVerificationWrittenCount.clear();
//		educationVerificationWrittenCount.sendKeys(educationverificationwritten);
//		Thread.sleep(1000);
//		JavaScriptManuplator.javaScriptExecutor(federalCriminalcheck, "arguments[0].scrollIntoView(true);", ldriver);
//		wait = new WebDriverWait(ldriver, 120);
//		wait.until(ExpectedConditions.visibilityOf(federalCriminalcheck));
//		federalCriminalcheckCount.clear();
//		federalCriminalcheckCount.sendKeys(federalcriminalcheck);
//		countryCriminalCheckUSACount.clear();
//		countryCriminalCheckUSACount.sendKeys(countrycriminalcheck);
		Thread.sleep(3000);
		saveAndContinue.click();
	}

	// Check wise Select
	public void checkWiseSelect(String count) throws InterruptedException {

		indiaCreditDefaultDatabaseCheck.click();
		educationVerificationWritten.click();
		addressVerification.click();
		federalCriminalcheck.click();
		countryCriminalCheckUSA.click();
		Thread.sleep(5000);
	}

	// Candidate Summary (Add Candidate Information)
	public void candidateFirstName(String firstName) {

		txtFirstName.sendKeys(firstName);
	}

	public void candidateMiddleName(String middleName) {

		txtMiddleName.sendKeys(middleName);
	}

	public void candidateLastName(String lastName) {

		txtLastName.sendKeys(lastName);
	}

	// Add Candidate DOB, Email And Mobile
	public void addCandidateDOBEmailAndMobile(String mobileNumber, String dob)
			throws ParseException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickDateOfBirth);
		clickDateOfBirth.sendKeys(dob);
		txtMobileNumber.sendKeys(mobileNumber);
		Thread.sleep(1000);
		txtEmailId.sendKeys(config.getemail());
	}

	// Additional Fields
	public void selectLocationFromDropDown() throws InterruptedException {

		Select location = new Select(locationId);
		location.selectByVisibleText("Gurgaon");
		Thread.sleep(2000);
	}

	// Add Employee id and Client name
	public void enterEmployeeIDAndClientName() throws InterruptedException {

		logger.info("Enter Employee ID and Client Name");
		employeeIDField.sendKeys(config.getiBridgeClientname());
		Thread.sleep(2000);
		clientNameField.sendKeys(config.getiBridgeClientname());
		txtEmailId.click();
	}

	// Add to Queue
	public void addToQueue() throws InterruptedException {

		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		clickAddTOQueue.click();
		logger.info("Clicked on add to Queue Button has Successfully!");
		ignoreDuplicate.click();
		if (verifyToastMsg.isDisplayed() == true) {
			clickOnContinueBtn.click();
			Thread.sleep(1000);
			clickInitiateBtn.click();

		} else {
			System.out.println("Canidate details not save successfully");
		}
	}

	// Verify Case migrate into OfferLetter Bucket
	public boolean verifyCaseMigrateToOfferLetterBucket() {

		String status = ldriver.findElement(By.xpath(uploadStatusPathStart.concat(newName).concat(uploadStatusPathEnd)))
				.getText();
		if (status.equals(config.getPendingCTCUploadStatusMsg())) {
			return true;

		} else {
			logger.info("Case is not migrated to Offer Letter Bucket");
			return false;
		}
	}

	// Upload Pending CTC
	public void fileUpload(String uploadDoc) throws InterruptedException {

		if (verifyCaseMigrateToOfferLetterBucket() == true) {
			ldriver.findElement(By.xpath(uploadOfferLetterPathStart.concat(newName).concat(uploadOfferLetterPathEnd)))
					.click();
			Thread.sleep(3000);
			dragDropFileHere.sendKeys(uploadDoc);
			Thread.sleep(1000);
			upload.click();
		}
	}

	// Checker Review the offer Letter
	public boolean verifyCTCUploaded() {

		String status = ldriver.findElement(By.xpath(uploadStatusPathStart.concat(newName).concat(uploadStatusPathEnd)))
				.getText();
		if (status.equals(config.getPendingCandidateSignatureStatusMsg())) {
			return true;

		} else {
			logger.info("CTC not uploaded...");
			return false;
		}
	}

	// Hit the Cron
	public void cronHit() throws InterruptedException {

		((JavascriptExecutor) ldriver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(ldriver.getWindowHandles());
		ldriver.switchTo().window(tabs.get(1));
		ldriver.get(cronUrl);
		Thread.sleep(5000);
		System.out.println("-------------CRON start value from UI::" + cronRun.getText() + "-------------");
		Thread.sleep(5000);
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(cronRun));
		System.out.println("-------------CRON End value from UI::" + cronRun.getText() + "-------------");
		ldriver.close();
	}

	// Verify signed review offer letter
	public boolean verifySignedReviewOfferLetter() {

		String statusCronHit = ldriver.findElement(By.xpath(hitCronStatusStart.concat(newName).concat(hitCronEnd)))
				.getText();
		if (statusCronHit.equals(config.getHitCronStatus())) {
			return true;

		} else {
			logger.info("page is not refersh");
		}
		return false;
	}

	// Approve Offer Letter
	public void approveOfferLetter() throws InterruptedException {

		Thread.sleep(5000);
		ldriver.findElement(By.xpath(approvePathStart.concat(newName).concat(approvePathEnd))).click();
		Thread.sleep(1000);
		approveDocument.click();
		Thread.sleep(1000);
		approveButton.click();
		Thread.sleep(1000);
		okButton.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(documentApproveClose));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", documentApproveClose);
	}

	// verify complete review status
	public boolean completeReviewStatus() {

		String statusComplete = ldriver.findElement(By.xpath(completePathStart.concat(newName).concat(completePathEnd)))
				.getText();
		if (statusComplete.equals(config.getCompleteStatus())) {
			return true;

		} else {
			logger.info(" status not completed today");
		}
		return false;
	}

	// BGV Login
	public boolean bgvLogin(String username, String password) throws InterruptedException {

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(bgvUsernameField));
		Thread.sleep(3000);
		bgvUsernameField.sendKeys(username);
		bgvPasswordField.sendKeys(password);
		bgv_Login_Btn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(bgvLoginScreenMsg));
		return bgvLoginScreenMsg.isDisplayed();
	}

	// Authorization details
	public void candidateSumitForm() throws InterruptedException {

		clickOnInstructionPopupCrossBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", verifyText);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkConcentCheckBox));
		JavaScriptManuplator.javaScriptExecutor(checkConcentCheckBox, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(checkAgreeCheckBox, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		Actions actionBuilder = new Actions(ldriver);
		Action drawAction = actionBuilder.moveToElement(ldriver.findElement(By.xpath("//div[@id='signatureparent']")))
				.clickAndHold().moveByOffset(-50, 60).moveByOffset(-60, -70).moveByOffset(150, 60)
				.moveByOffset(-60, -70).doubleClick().build();
		drawAction.perform();
		Thread.sleep(2000);
		clickOnContinueBtn1.click();
		Thread.sleep(1000);

		// profile details
		Select preSelect = new Select(prefix);
		preSelect.selectByVisibleText("Doctor");
		Thread.sleep(2000);
		Select geSelect = new Select(gender);
		geSelect.selectByVisibleText("Male");
		saveAndContinueProfile.click();
		logger.info("profile details add sucessfully");
	}

	// Other personal details
	public void addOtherPersonalDetails() throws InterruptedException {

		fatherFullName.sendKeys("jagdishsing");
		fatherQualification.sendKeys("B.tech");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(bloodGroup, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(1000);
		bloodGroup.sendKeys("A");
		logger.info("other personal details add sucessfully");
	}

	public void bankAccountDetails() throws InterruptedException {

		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(bankName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		bankName.sendKeys("Axis");
		Thread.sleep(1000);
		nameAsPerBankAccount.sendKeys("sapna");
		bankAccountNumber.sendKeys("546565678765");
		ifscCode.sendKeys("UBIN0000043");
		Thread.sleep(1000);
		micrNumber.sendKeys("32345");
		bankAddressWithPincode.sendKeys("NearrodeAgra232345");
		uploadCancelledCheque.sendKeys("/home/sapna.chaudhary/eclipse-workspace/ibridge/documents/ARN.pdf");
		Thread.sleep(1000);
		Thread.sleep(2000);
		continueButton.click();
		logger.info("add bankaccount details successfully");
	}

	// Address Details
	public void candidateAddress(String flat, String colony, String residingForm, String pinCode, String state,
			String city, String station, String uploadAddress) throws InterruptedException, ParseException {

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
		try {
			selectWithinIndia.click();

		} catch (StaleElementReferenceException e) {
			selectWithinIndia.click();
		}
		wait.until(ExpectedConditions.visibilityOf(txtFlat_House));
		txtFlat_House.clear();
		txtFlat_House.sendKeys(flat);
		txtColonyName.clear();
		txtColonyName.sendKeys(colony);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingForm);
		Thread.sleep(1000);
		clickOnResidingForm.sendKeys(residingForm);
		checkBoxTillDate.click();
		txtPinCode.clear();
		txtPinCode.sendKeys(pinCode);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtStateName.clear();
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Del'", txtStateName);
		txtStateName.sendKeys(state);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Delhi'", txtCityName);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtPoliceStation.clear();
		txtPoliceStation.sendKeys(station);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		uploadAddressProof.sendKeys(uploadAddress);
		Thread.sleep(2000);
		savebutton.click();
	}

	// OnBoarding details
	public void onboardingDetails() throws InterruptedException {

		currentLocation.sendKeys("Agra");
		religion.sendKeys("Hindu");
		uanNumber.sendKeys("343454345678");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(nomieeName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		nomieeName.sendKeys("Jyoti");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(nomieeAddress));
		nomieeAddress.sendKeys("agra");
		Thread.sleep(2000);
		Select nominee = new Select(nomieeRelationship);
		nominee.selectByVisibleText("Father");
		nomieeRelationship.click();
		Thread.sleep(1000);
		nomineeAge.sendKeys("45");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(nomieeAmount));
		nomieeAmount.sendKeys("100");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(familyMemberName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		familyMemberName.sendKeys("sona");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(familyMemberAddress));
		familyMemberAddress.sendKeys("AgraNagar");
		Thread.sleep(3000);
		Select member = new Select(familyMemberRelationship);
		member.selectByVisibleText("Father");
		wait.until(ExpectedConditions.visibilityOf(familyMemberAddress));
		familyMemberAddress.sendKeys("AgraNagar");
		familyMemberRelationship.click();
		familyMemberAge.sendKeys("34");
		Thread.sleep(1000);
		pensionNomineeNmae.sendKeys("divya");
		pensionNomineeAddress.sendKeys("VijayNagar");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(pensionNomineeRelationship));
		pensionNomineeRelationship.sendKeys("Father");
		Thread.sleep(1000);
		Date date = new Date(0);
		SimpleDateFormat datefor = new SimpleDateFormat("dd-MM-yyyyy");
		String StringDate = datefor.format(date);
		System.out.println(StringDate);
		pensionNomineeDob.sendKeys(StringDate);
		Thread.sleep(2000);

		// PROVIDENT FUND ORGANIZATION
		Thread.sleep(1000);
		noMemberEpf.click();
		Thread.sleep(1000);
		noMemberEp.click();
	}

	// International worker & GRATUITY DETAIL
	public void internationalGratuity() throws InterruptedException {

		yes.click();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		countryOfOrigin.sendKeys("uk");
		passportNumber.sendKeys("234345676545");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly')", passportfrom);
		passportfrom.sendKeys("04-04-2009");
		passportfrom.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].removeAttribute('readonly')", passportTo);
		passportTo.sendKeys("10-04-2009");
		passportTo.click();
		bankAccountNumberDetails.sendKeys("232323454567");
		ifscCodeOfBranch.sendKeys("UBIN000005");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(gratuityName, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		gratuityName.sendKeys("soni");
		Thread.sleep(1000);
		gratuityAddress.sendKeys("Bulandshahr");
		Select gratutity = new Select(gratuityRelationship);
		gratutity.selectByVisibleText("Friend");
		Thread.sleep(2000);
		gratuityRelationship.click();
		Thread.sleep(2000);
		gratuityAge.sendKeys("43");
		Thread.sleep(3000);
		amountShare.sendKeys("100");
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
		Actions b = new Actions(driver);
		b.sendKeys(Keys.PAGE_DOWN).build().perform();
		sumitbutton.click();
		Thread.sleep(2000);
		clickOk.click();
	}

	// Candidate Logout
	public void CandidateLogout() {

		clickOnCandidateName.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnLogoutBtn));
		clickOnLogoutBtn.click();
		driver.close();
	}

	// Verify Initiate Case ThankYou Msg
	public String verifyInitiateCaseThankYouMsg() {

		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();
	}

	// Case move to pending sign off bucket
	public void caseMoveToTheSignOffBucket() throws InterruptedException {

		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(caseSubmissionSummary));
		caseSubmissionSummary.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(pendingSignOff));
		pendingSignOff.click();
		Thread.sleep(1000);
		submitButton.click();
		checkbox.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(confirmSubmit));
		confirmSubmit.click();
		Thread.sleep(3000);
		ok.click();
	}

	/**
	 * Case Migrates to submitted for verification bucket, WIP Bucket, and Document
	 * for signature Bucket
	 * 
	 * @throws InterruptedException
	 */
	public void caseMigrates() throws InterruptedException {

		submittedForVerification.click();
		logger.info("Case migrates to WIP bucket");
		Thread.sleep(1000);
		documentForSignature.click();
	}

	// Review & Approve the InstaForm by user
	public void approveInstaFormLink() throws InterruptedException {

		folderViewSignedDoc.click();
		Thread.sleep(1000);
		approve.click();
		Thread.sleep(3000);
		approveLink.click();
		Thread.sleep(3000);
		okClick.click();
		Thread.sleep(3000);

		// disclosureCorporate
		disclosureCorporate.click();
		approveDisclosure.click();
		Thread.sleep(3000);
		approveDoc.click();
		Thread.sleep(3000);
		okDoc.click();

		// ESIC Form
		Thread.sleep(2000);
		esicForm.click();
		approveEsicDoc.click();
		Thread.sleep(3000);
		approveEsic.click();
		Thread.sleep(3000);
		okEsic.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", approveEsicdoc);
	}

	public void cronhit() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(cronUrl);
		Thread.sleep(5000);
		driver.close();
	}

	// Cron Hit
	public void cron() throws InterruptedException {

		((JavascriptExecutor) ldriver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(cronUrl);
		Thread.sleep(5000);
		driver.close();
	}

	// Rejected Offer Letter Review Status
	public boolean rejectOfferLetterReviewStatus() {

		String RejectOfferLetterCandidate = ldriver
				.findElement(By.xpath(rejectXpathStart.concat(newName).concat(rejectXpathEnd))).getText();
		if (RejectOfferLetterCandidate.equals(config.getrejectOfferLetter())) {
			return true;

		} else {
			logger.info("Candidate Offer Letter not Rejected");
		}
		return false;
	}
	
	// Rejected EPFO Review Status
	public boolean rejectEpfoReviewStatus() throws InterruptedException {

		String RejectEpfoLetter = ldriver
				.findElement(By.xpath(rejectEpfoXpathStart.concat(newName).concat(rejectEpfoEnd))).getText();
		Thread.sleep(2000);
		if (RejectEpfoLetter.equals(config.getrejectEpfo())) {
			return true;

		} else {
			logger.info("Epfo not Rejected");
		}
		return false;
	}
}
