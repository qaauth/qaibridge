package com.iBridge.sme.pageobject;

import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class InitiateSelfCaseSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InitiateSelfCaseSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Initiate Self --Initiate new case
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Initiate Self')]")
	WebElement clickOnInitiateSelf;

	// Step 1-Package Selection-- Buy Checks - Packages
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'PAN No Verification')]")
	WebElement checkedChekBoxPanNoVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Education Verification')]")
	WebElement checkedCheckBoxEducation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Global Regulatory Compliance and Debarment Databas')]")
	WebElement checkedCheckBoxGlobalRegulatory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Court Record Database Check')]")
	WebElement checkedCheckboxIndiaCourtCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Database Check Level 1')]")
	WebElement checkedCheckboxIndiaDatabase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Comprehensive Criminal Record Database Check')]")
	WebElement checkedCheckboxIndiaComprehensive;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'CV Validation')]")
	WebElement checkedCheckboxCvValidation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Court Record Check through Law Firm')]")
	WebElement checkedCheckboxIndiaCourtRecord;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Civil Litigation Database Check')]")
	WebElement checkedCheckboxIndiaCivil;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'National Identity Check')]")
	WebElement chekedCheckboxNationalIdentity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Credit Default Database Check')]")
	WebElement checkCheckedIndiaCredit;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Current Employment Verification')]")
	WebElement checkedCheckboxCurrentEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Current Address Verification')]")
	WebElement checkedCheckboxCurrentAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Advanced Web and Media Searches')]")
	WebElement checkedCheckboxIndiaAdvanced;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Previous Employment Verification')]")
	WebElement checkedCheckboxPreviousEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Personal Reference Check')]")
	WebElement checkedCheckboxPersonalReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Professional Reference Check')]")
	WebElement checkedCheckboxProfessionalReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Drug Test')]")
	WebElement checkedCheckboxDrugTest;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Permanent Address Verification')]")
	WebElement checkedCheckboxPermanentAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[3]/div[2]/div[3]/button[1]")
	WebElement clickOnChooseCustomBtn;

	// Step 2-Initiate a Case--Please Enter Candidate Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCandidateFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtCandidateMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement txtCandidateLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='cv-document-file']")
	WebElement uploadCandidateCv;

	// Package Details: No. of verification(s)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaCourtRecordCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaComprehensiveCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaCourtRecordLawFirmCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectNationalIdentityCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaAdvancedWeb;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement clickOnInitiateCaseBtn;

	// Verify-- Instructions to Fill Background Verification Form
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Instructions to Fill Background Verification Form')]")
	WebElement verifyInstructionsBackgroundText;

	// Profile Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	WebElement clickOnContinueBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='father-name']")
	WebElement txtFatherName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Male')]")
	WebElement checkedMaleRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='date-of-birth']")
	WebElement txtDateOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='place-of-birth']")
	WebElement txtPlaceOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement txtEmailAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='mobileNumberId']")
	WebElement txtMoileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='alternate-mobile-no']")
	WebElement txtAlternateMobileNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='emergency-contact-person']")
	WebElement txtEmergencyContactPerson;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='relationship-with-person']")
	WebElement selectRelationshipWithPerson;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='emergency-contact-number']")
	WebElement txtEmergencyContactNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitFormId']")
	WebElement clickOnSaveAndContinueBtn;

	// Profile Details - PAN Card
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='pan-card-number']")
	WebElement txtPanCardNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]/button[1]")
	WebElement uploadPanCardDocument;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'I will provide the document later')]")
	WebElement checkedProvideDocumentLater;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitFormId']")
	WebElement clickOnPanCardSaveContinueBtn;

	// Profile Details -- PAN Card
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='pan-card-number']")
	WebElement txtPanNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]/button[1]")
	WebElement uploadPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'I will provide the document later')]")
	WebElement clickOnPovideDocumentLater;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitFormId']")
	WebElement clickOnPanSaveAndSubmitBtn;

	// Profile Details - VOTER Card
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='voterid-number']")
	WebElement txtVoterIdNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Voter Card')]")
	WebElement uploadVoterCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'i will provide the document later')]")
	WebElement clickOnProvideDocumentLater;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitFormId']")
	WebElement clickOnVoterIdSaveAndSubmitBtn;

	// Current Address Verification-- Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPinCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtStateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtCityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHouseNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtStreetNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPoliceStation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtResidingFromDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtResidingToDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[1]/label[1]")
	WebElement clickedCheckboxTillDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/button[1]")
	WebElement clickOnSaveContinueBtn;

	// Permanent Address Verification --Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPermanentPinCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPermanentState;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtPermanentCity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtFloorNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtColony;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPoliceStationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPerResidingFromDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPerResidingToDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[2]/div[1]/div[1]/label[1]")
	WebElement clickOnPerTillDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/button[1]")
	WebElement clickOnPerSaveAndContinueBtn;

	// Education Details-- Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnIsEductionRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectBatchStartYear;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectEndYear;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtEnrollmentNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPercentage;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtConfirmEnrollmentNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectModeOfEduction;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectYearOfPassing;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnCourseCompletedRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[9]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCollegeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[9]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtCourseName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtLocationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'I will provide the document later')]")
	WebElement checkedCheckBoxDocumentLater;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Continue')]")
	WebElement clickOnEductionSaveSubmitBtn;

	// Current Employment Verification-- Employment Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnEmploymentInCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnPayrollDirect;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCompanyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDesignationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCurrentCityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtContactNoOfCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement txtCompleteAddressOfComapny;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDateOfJoining;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDateOfLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[2]/div[1]/label[1]")
	WebElement clickOnTillDateRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectEmploymentType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[9]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectNatureOfEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDepartmentName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectSalaryCycleType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtSalaryCycle;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtEmployeeCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[11]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtGradeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[13]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReasonForLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[13]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtGapEmploymentDetail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/form/div[14]/div/div[8]/div/label")
	WebElement clickOnProvideDocumentLaterRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[15]/div[1]/div[1]/button[1]")
	WebElement clickOnEmploymentSaveContinueBtn;

	// Reporting Manager Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingManagerRefRadioBtn;

	// Is the Reporting Manager still a part of company?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtConatactNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[7]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[10]/div[1]/div[1]/button[1]")
	WebElement clickOnPreviousSaveContinueBtn;

	// HR Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtHrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[3]/form/div[3]/div[3]/div/div/input")
	WebElement txtHrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrCompanyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtHrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[7]/div[1]/div[1]/button[1]")
	WebElement clickOnHrSaveContinueBtn;

	// Previous Employment Verification--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnWorkStatusRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnEmployedCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousComapnyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtContactNumberCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement txtPreviousAddressCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDateOfJoining;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDateOfLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectPreviousEmpType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[9]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectPreviousNatureOfEmp;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDepartmentName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectPreviousSalaryType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtPreviousSalary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousEmpCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[11]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPreviousGradeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[13]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousReasonForLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[13]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPreviousGapEmp;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/form/div[14]/div/div[8]/div/label")
	WebElement clickOnPreviousDocumentLaterCheckBox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[15]/div[1]/div[1]/button[1]")
	WebElement clickOnPreviousSaveContinuBtn;

	// Reporting Manager Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingManagerRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingMangrRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMangrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtMangrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrConatctNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMangrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[10]/div[1]/div[1]/button[1]")
	WebElement clickOnMangrSaveContinueBtn;

	// HR Details --
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement txthrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
	WebElement txthrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrComapnyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txthrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[7]/div[1]/div[1]/button[1]")
	WebElement clickOnhrSaveContinueBtn;

	// Professional Reference Details--
	// REFERENCE 1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnPeerReferenceLevel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefMobile;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefBestTimeToReach;

	// REFERENCE 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnSeniorReferenceLevel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefMobile;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/button[1]")
	WebElement clickOnReferenceSaveContinueBtn;

	// Personal Reference Details-- REFERENCE 1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRelationshipWithReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceEmailId;

	// Personal Reference Details-- REFERENCE 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefRelationshipName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/button[1]")
	WebElement clickOnPersonalSaveContinueBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement clickOnContinueButton;

	// Authorization Release Note
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[2]/div/form/div[5]/div/div/label")
	WebElement uploadArnBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]/div[1]/input[1]")
	WebElement uploadArnrBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	WebElement clickOnAuthorizeSubmitBtn;

	// Verify Candidate profile for background verification completed.Case will be
	// initiated post payment.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/h1[1]")
	WebElement verifyCaseWillBeInitiated;

	// Payment --Continue to pay-- Verify Candidate profile for background
	// verification completed
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Continue to pay')]")
	WebElement clickOnContinueToPayBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='paySubmitBtn']")
	WebElement clickOnClickToPayForCaseInitiationBtn;

	// Verify Message--Authorization
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div[2]/div/form/div[2]")
	WebElement verifyAuthorizationText;

	// Thank you for completing payment- Case(s) initiated for background.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you for completing payment')]")
	WebElement verifyCompletingPaymentText;

	// iBridge Dashboard
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashboardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[3]/ul[1]/li[6]/a[1]")
	WebElement clickOnWipCountNumberBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement getArsNumberIntiateSelfCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/a[1]")
	WebElement verifyWipCandidateName;

	// Action Required - Payment Pending Cases
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashBoardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Payment Pending')]")
	WebElement clickOnPaymentPendingCountNo;

	// Payment Pending Cases
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/label[1]/input[1]")
	WebElement checkedCheckBoxPaymentPendingCases;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='formdiscardId']")
	WebElement clickOnDiscardCaseBtn;

	// Confirm-- Press OK if you want to withdraw the case, else press CANCEL.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOkWithdrawCase;

	// Verify-- Case(s) has been withdrawn Successfully !
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifWiWthdrawnSuccessfullyMessage;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Record Found!')]")
	WebElement verifyNoRecordFoundMessage;
	
	// Search Ars Number
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='#searchModal']")
	WebElement search;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='ars_number']")
	WebElement arsNumber;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div/div/div/div[1]/div/form/div/div[3]/button")
	WebElement searcButton;
	
	// Advanced Search
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@href='#searchModal']")
	WebElement searchAdvanced;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Advanced Search']")
	WebElement advancedSearch;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='first-name']")
	WebElement firstName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='client-name']")
	WebElement selectProcess;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Search']")
	WebElement searchAdvancedButton;
	

	// Initiate Self --Initiate new case
	public void initiateNewCase() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateSelf));
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Initiate Self')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// Step 1-Package Selection-- Buy Checks - Packages
	public void buyChecksPackagesSelection() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkedChekBoxPanNoVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedChekBoxPanNoVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckBoxEducation);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckBoxGlobalRegulatory);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCourtCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxIndiaDatabase);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaDatabase);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaComprehensive);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCvValidation);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCourtRecord);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxIndiaCivil);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCivil);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", chekedCheckboxNationalIdentity);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckedIndiaCredit);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCurrentEmployment);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxCurrentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCurrentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaAdvanced);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPreviousEmployment);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPersonalReference);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxProfessionalReference);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxDrugTest);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxDrugTest);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPermanentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnChooseCustomBtn);
		Thread.sleep(1000);
	}

	// Please Enter Candidate Name-- Initiate Case
	public void candidateFirstName(String firstName) {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtCandidateFirstName));
		txtCandidateFirstName.sendKeys(firstName);
	}

	public void candidateMiddleName(String middleName) {
		txtCandidateMiddleName.sendKeys(middleName);
	}

	public void candidateLastName(String lastName) throws InterruptedException {
		txtCandidateLastName.sendKeys(lastName);
	}

	// Step 2-Initiate a Case--Please Enter Candidate Name
	public void initiateSelfCaseCustom(String candidateCv) throws InterruptedException {
		Thread.sleep(1000);
		uploadCandidateCv.sendKeys(candidateCv);
		Thread.sleep(2000);

		// Package Details: No. of verification(s)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtRecordCheck);
		Select indiaCourtRecordCheck = new Select(selectIndiaCourtRecordCheck);
		indiaCourtRecordCheck.selectByIndex(1);

		Select indiaDatabaseCheck = new Select(selectIndiaDatabaseCheck);
		indiaDatabaseCheck.selectByIndex(1);

		Select indiaComprehensiveCheck = new Select(selectIndiaComprehensiveCheck);
		indiaComprehensiveCheck.selectByIndex(1);

		Select indiaCourtRecordLawFirmCheck = new Select(selectIndiaCourtRecordLawFirmCheck);
		indiaCourtRecordLawFirmCheck.selectByIndex(1);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectNationalIdentityCheck);
		Select nationalIdentityCheck = new Select(selectNationalIdentityCheck);
		nationalIdentityCheck.selectByIndex(4);

		Select indiaAdvancedWeb = new Select(selectIndiaAdvancedWeb);
		indiaAdvancedWeb.selectByIndex(1);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInitiateCaseBtn);
		Thread.sleep(1000);
	}

	// Verify-- Instructions to Fill Background Verification Form
	public String verifyInstructionsBackgroundVerificationText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyInstructionsBackgroundText));
		return verifyInstructionsBackgroundText.getText();
	}

	// Profile Details--
	public void candidateProfileDetails(String fatherName, String dateOfBirth, String placeOfBirth, String emailAddress,
			String mobileNo, String alternateMobileNo, String EmergencyContPerson, String emergencyContactNo)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnContinueBtn);
		txtFatherName.sendKeys(fatherName);
		checkedMaleRadioBtn.click();
		txtDateOfBirth.sendKeys(dateOfBirth);
		txtPlaceOfBirth.sendKeys(placeOfBirth);
		txtEmailAddress.sendKeys(emailAddress);
		txtMoileNumber.sendKeys(mobileNo);
		txtAlternateMobileNo.sendKeys(alternateMobileNo);
		txtEmergencyContactPerson.sendKeys(EmergencyContPerson);

		Select relationshipWithPerson = new Select(selectRelationshipWithPerson);
		relationshipWithPerson.selectByIndex(2);
		txtEmergencyContactNumber.sendKeys(emergencyContactNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveAndContinueBtn);
		Thread.sleep(1000);
	}

	// Profile Details -- PAN Card
	public void candidatePanCardNumberDetails(String panNumber, String uploadPan) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtPanNumber));
		txtPanNumber.sendKeys(panNumber);
		// uploadPanCard.sendKeys(uploadPan);
		clickOnPovideDocumentLater.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanSaveAndSubmitBtn);
		Thread.sleep(1000);
	}

	// Profile Details - VOTER Card
	public void candidateVoterIdCardDetails(String voterId, String uploadVoterId) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtVoterIdNumber));
		txtVoterIdNumber.sendKeys(voterId);
		// uploadVoterCard.sendKeys(uploadVoterId);
		clickOnProvideDocumentLater.click();
		Thread.sleep(2000);
		clickOnVoterIdSaveAndSubmitBtn.click();
		Thread.sleep(1000);
	}

	// Current Address Verification-- Address Details
	public void currentAddressVerificationDetails(String pinCode, String state, String city, String houseNumber,
			String streetNumber, String policeStation, String residingFromDate, String residingToDate)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtPinCode));
		txtPinCode.sendKeys(pinCode);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtStateName.clear();
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Del'", txtStateName);
		txtStateName.sendKeys(state);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Delhi'", txtCityName);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtHouseNumber.sendKeys(houseNumber);
		txtStreetNumber.sendKeys(streetNumber);
		txtPoliceStation.sendKeys(policeStation);
		txtResidingFromDate.sendKeys(residingFromDate);
		// txtResidingToDate.sendKeys(residingToDate);
		// clickedCheckboxTillDate.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveContinueBtn);
		Thread.sleep(1000);
	}

	// Permanent Address Verification --Address Details
	public void permanentAddressVerificationDetails(String perPinCode, String perState, String perCity,
			String floorNumber, String colony, String policeStation, String residingFromDate, String residingToDate)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtPermanentPinCode));
		txtPermanentPinCode.sendKeys(perPinCode);
		txtPermanentCity.clear();
		txtPermanentCity.sendKeys(perCity);
		txtPermanentState.clear();
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Del'", txtPermanentState);
		txtPermanentState.sendKeys(perState);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Delhi'", txtPermanentCity);
		txtPermanentCity.clear();
		txtPermanentCity.sendKeys(perCity);
		txtFloorNumber.sendKeys(floorNumber);
		txtColony.sendKeys(colony);
		txtPoliceStationName.sendKeys(policeStation);
		txtPerResidingFromDate.sendKeys(residingFromDate);
		txtPerResidingToDate.sendKeys(residingToDate);
		clickOnPerTillDate.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPerSaveAndContinueBtn);
		Thread.sleep(1000);
	}

	// Education Details-- Candidate Profile
	public void candidateEducationDetails(String enrollNo, String percentage, String confirmEnroll, String collegeName,
			String courseName, String locationName) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIsEductionRadioBtn));
		clickOnIsEductionRadioBtn.click();
		Select batchStartYear = new Select(selectBatchStartYear);
		batchStartYear.selectByIndex(32);
		Thread.sleep(1000);
		Select endYear = new Select(selectEndYear);
		endYear.selectByIndex(5);
		txtEnrollmentNo.sendKeys(enrollNo);
		txtPercentage.sendKeys(percentage);
		txtConfirmEnrollmentNo.sendKeys(confirmEnroll);

		Select modeOfEduction = new Select(selectModeOfEduction);
		modeOfEduction.selectByIndex(3);

		Select yearOfPassing = new Select(selectYearOfPassing);
		yearOfPassing.selectByIndex(5);
		clickOnCourseCompletedRadioBtn.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Bundelkhand University, Jhansi'", txtCollegeName);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Computer Science & Engineering'", txtCourseName);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Jhansi'", txtLocationName);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckBoxDocumentLater);
		checkedCheckBoxDocumentLater.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEductionSaveSubmitBtn);
		Thread.sleep(1000);
	}

	// Employment Details-- Current Employment Verification
	public void currentEmploymentVerificationDetails(String companyName, String designation, String cityName,
			String contactNumber, String addressCompany, String dateOfJoining, String dateOfLeaving, String deptName,
			String salary, String empCode, String gradeName, String reasonLeaving, String gapEmpDetails,
			String firstName, String middleName, String lastName, String mngrDesignation, String contactNo,
			String emailId, String bestTimeReach, String hrFirstName, String hrMiddleName, String hrLastName,
			String hrDesignation, String hrCompanyName, String hrMobile, String hrEmail) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEmploymentInCompanyRadioBtn));
		clickOnEmploymentInCompanyRadioBtn.click();
		clickOnPayrollDirect.click();
		txtCompanyName.sendKeys(companyName);
		txtDesignationName.sendKeys(designation);
		txtCurrentCityName.sendKeys(cityName);
		txtContactNoOfCompany.sendKeys(contactNumber);
		txtCompleteAddressOfComapny.sendKeys(addressCompany);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtDateOfJoining);
		txtDateOfJoining.sendKeys(dateOfJoining);
		txtDateOfLeaving.sendKeys(dateOfLeaving);
		clickOnTillDateRadioBtn.click();
		Select employmentType = new Select(selectEmploymentType);
		employmentType.selectByIndex(2);

		Select natureOfEmployment = new Select(selectNatureOfEmployment);
		natureOfEmployment.selectByIndex(1);
		txtDepartmentName.sendKeys(deptName);

		Select salaryCycleType = new Select(selectSalaryCycleType);
		salaryCycleType.selectByIndex(1);
		txtSalaryCycle.sendKeys(salary);
		txtEmployeeCode.sendKeys(empCode);
		txtGradeName.sendKeys(gradeName);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtReasonForLeaving);
		txtReasonForLeaving.sendKeys(reasonLeaving);
		txtGapEmploymentDetail.sendKeys(gapEmpDetails);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProvideDocumentLaterRadioBtn);
		clickOnProvideDocumentLaterRadioBtn.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEmploymentSaveContinueBtn);
		Thread.sleep(1000);

		// Reporting Manager Details--
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnReportingManagerRefRadioBtn));
		clickOnReportingManagerRefRadioBtn.click();
		clickOnReportingCompanyRadioBtn.click();
		txtFirstName.sendKeys(firstName);
		txtMiddleName.sendKeys(middleName);
		txtLastName.sendKeys(lastName);
		txtDesignation.sendKeys(mngrDesignation);
		txtConatactNumber.sendKeys(contactNo);
		txtEmailId.sendKeys(emailId);
		txtBestTimeToReach.sendKeys(bestTimeReach);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousSaveContinueBtn);
		Thread.sleep(1000);

		// HR Details-- Employment Details
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtHrFirstName));
		txtHrFirstName.sendKeys(hrFirstName);
		txtHrMiddleName.sendKeys(hrMiddleName);
		txtHrLastName.sendKeys(hrLastName);
		txtHrDesignation.sendKeys(hrDesignation);
		txtHrCompanyName.sendKeys(hrCompanyName);
		txtHrMobileNumber.sendKeys(hrMobile);
		txtHrEmailId.sendKeys(hrEmail);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnHrSaveContinueBtn);
		Thread.sleep(1000);
	}

	// Employment Details-- Previous Employment Verification
	public void previousEmploymentVerification(String preCompany, String preDesignation, String preLocation,
			String preConatactNo, String preAddress, String preDateJoining, String preDateLeaving, String preDept,
			String preSalary, String preEmpCode, String preGrade, String preReasonLeaving, String preGapEmp,
			String mangerFirstName, String mngrMiddleName, String mngrLastName, String mngrDesignation,
			String mngrConatctNo, String mngrEmailId, String mngrBestTime, String hrFirstName, String hrMiddleName,
			String hrLastName, String hrDesignation, String hrCompany, String hrMobile, String hrEmail)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnWorkStatusRadioBtn));
		clickOnWorkStatusRadioBtn.click();
		clickOnEmployedCompanyRadioBtn.click();

		txtPreviousComapnyName.sendKeys(preCompany);
		txtPreviousDesignation.sendKeys(preDesignation);
		txtPreviousLocation.sendKeys(preLocation);
		txtContactNumberCompany.sendKeys(preConatactNo);
		txtPreviousAddressCompany.sendKeys(preAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPreviousDateOfJoining);
		txtPreviousDateOfJoining.sendKeys(preDateJoining);
		txtPreviousDateOfLeaving.sendKeys(preDateLeaving);

		Select previousEmpType = new Select(selectPreviousEmpType);
		previousEmpType.selectByIndex(2);

		Select previousNatureOfEmp = new Select(selectPreviousNatureOfEmp);
		previousNatureOfEmp.selectByIndex(1);
		txtPreviousDepartmentName.sendKeys(preDept);

		Select previousSalaryType = new Select(selectPreviousSalaryType);
		previousSalaryType.selectByIndex(1);
		txtPreviousSalary.sendKeys(preSalary);
		txtPreviousEmpCode.sendKeys(preEmpCode);
		txtPreviousGradeName.sendKeys(preGrade);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtPreviousReasonForLeaving);
		txtPreviousReasonForLeaving.sendKeys(preReasonLeaving);
		txtPreviousGapEmp.sendKeys(preGapEmp);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousDocumentLaterCheckBox);
		clickOnPreviousDocumentLaterCheckBox.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousSaveContinuBtn);
		Thread.sleep(1000);

		// Reporting Manager Details--
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnReportingManagerRadioBtn));
		clickOnReportingManagerRadioBtn.click();
		clickOnReportingMangrRadioBtn.click();
		txtMangrFirstName.sendKeys(mangerFirstName);
		txtMangrMiddleName.sendKeys(mngrMiddleName);
		txtMangrLastName.sendKeys(mngrLastName);
		txtMangrDesignation.sendKeys(mngrDesignation);
		txtMangrConatctNumber.sendKeys(mngrConatctNo);
		txtMangrEmailId.sendKeys(mngrEmailId);
		txtMangrBestTimeToReach.sendKeys(mngrBestTime);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMangrSaveContinueBtn);
		Thread.sleep(1000);

		// HR Details --
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txthrFirstName));
		txthrFirstName.sendKeys(hrFirstName);
		txthrMiddleName.sendKeys(hrMiddleName);
		txthrLastName.sendKeys(hrLastName);
		txthrDesignation.sendKeys(hrDesignation);
		txthrComapnyName.sendKeys(hrCompany);
		txthrMobileNumber.sendKeys(hrMobile);
		txthrEmailId.sendKeys(hrEmail);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnhrSaveContinueBtn);
		Thread.sleep(1000);
	}

	// Professional Reference Details-- REFERENCE 1
	public void professionalReferenceDetails(String peerRefName, String peerRefDesig, String peerRefMobile,
			String peerRefEmail, String peerRefBestTime, String seniorRefName, String seniorRefDesig,
			String seniorRefMobile, String seniorRefEmail, String SeniorRefBestTime) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPeerReferenceLevel));
		clickOnPeerReferenceLevel.click();
		txtPeerRefName.sendKeys(peerRefName);
		txtPeerRefDesignation.sendKeys(peerRefDesig);
		txtPeerRefMobile.sendKeys(peerRefMobile);
		txtPeerRefEmailId.sendKeys(peerRefEmail);
		txtPeerRefBestTimeToReach.sendKeys(peerRefBestTime);

		// Professional Reference Details-- REFERENCE 2
		clickOnSeniorReferenceLevel.click();
		txtSeniorRefName.sendKeys(seniorRefName);
		txtSeniorRefDesignation.sendKeys(seniorRefDesig);
		txtSeniorRefMobile.sendKeys(seniorRefMobile);
		txtSeniorRefEmailId.sendKeys(seniorRefEmail);
		txtSeniorRefBestTimeToReach.sendKeys(SeniorRefBestTime);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnReferenceSaveContinueBtn);
		Thread.sleep(1000);
	}

	// Personal Reference Details-- REFERENCE 1
	public void personalReferenceDetails(String refName, String refRelationshipName, String refMobileNo,
			String refEmailId, String referenceName, String referenceRelationship, String referenceMobileNo,
			String referenceEmailId) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtReferenceName));
		txtReferenceName.sendKeys(refName);
		txtRelationshipWithReference.sendKeys(refRelationshipName);
		txtReferenceMobileNumber.sendKeys(refMobileNo);
		txtReferenceEmailId.sendKeys(refEmailId);

		// Personal Reference Details-- REFERENCE 2
		txtRefName.sendKeys(referenceName);
		txtRefRelationshipName.sendKeys(referenceRelationship);
		txtRefMobileNumber.sendKeys(referenceMobileNo);
		txtRefEmailId.sendKeys(referenceEmailId);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPersonalSaveContinueBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnContinueButton);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueButton));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnContinueButton);
	}

	// Authorization Release Note
	public String verifyAuthorizationReleaseNoteText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyAuthorizationText));
		return verifyAuthorizationText.getText();
	}

	// Authorization Release Note
	public void authorizationReleaseNote(String uploadARN) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(uploadArnBtn));
		Thread.sleep(1000);
		uploadArnrBtn.sendKeys(uploadARN);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnAuthorizeSubmitBtn);

		// Payment --Continue to pay-- Verify Candidate profile for background
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueToPayBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnContinueToPayBtn);

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClickToPayForCaseInitiationBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnClickToPayForCaseInitiationBtn);
		Thread.sleep(1000);
	}

	public String verifyCaseInitiatedMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseWillBeInitiated));
		return verifyCaseWillBeInitiated.getText();
	}

	// Verify Candidate profile for background verification completed.Case will be
	public String verifyCaseInitiatedSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseWillBeInitiated));
		return verifyCaseWillBeInitiated.getText();
	}

	// Thank you for completing payment- Case(s) initiated for background
	// verification.
	public String verifyThankYouCompletingPaymentSuccessMsg() {
		
		wait = new WebDriverWait(ldriver, 160);
		wait.until(ExpectedConditions.visibilityOf(verifyCompletingPaymentText));
		return verifyCompletingPaymentText.getText();
	}

	// iBridge Dashboard -- Work In Progress Case
	public void dashboardWorkInProgressCases(String arsNumberValue, String firstNameValue) throws InterruptedException {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		clickOnDashboardModule.click();
		
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnWipCountNumberBucket));
		clickOnWipCountNumberBucket.click();

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(getArsNumberIntiateSelfCase));
		Thread.sleep(1000);
		try {
			File output = new File("copyInitiateSelfCaseArs.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(getArsNumberIntiateSelfCase.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}
		ldriver.navigate().back();
		search.click();
		Thread.sleep(3000);
		System.out.println(arsNumberValue);
		arsNumber.sendKeys(arsNumberValue);
		searcButton.click();
		
		ldriver.navigate().back();
		searchAdvanced.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(advancedSearch));
		advancedSearch.click();
		firstName.sendKeys(firstNameValue);
		Select location = new Select(selectProcess);
		location.selectByVisibleText("CheckWise");
		searchAdvancedButton.click();
	}

	public String verifyInitiateSelfCaseCandidateName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyWipCandidateName));
		return verifyWipCandidateName.getText();
	}
	
	
	// Action Required - Payment Pending Cases
	public void paymentPendingCases() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashBoardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashBoardModule);
		// clickOnDashBoardModule.click();
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPaymentPendingCountNo));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPaymentPendingCountNo);

		// Payment Pending Cases
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkedCheckBoxPaymentPendingCases));
		checkedCheckBoxPaymentPendingCases.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDiscardCaseBtn);

		// Confirm-- Press OK if you want to withdraw the case, else press CANCEL.
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkWithdrawCase));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnOkWithdrawCase);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashBoardModule);
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPaymentPendingCountNo));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPaymentPendingCountNo);
		Thread.sleep(1000);
	}

	// Verify-- Case(s) has been withdrawn Successfully !
	public String verifyWithdrawnSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifWiWthdrawnSuccessfullyMessage));
		System.out.println("RAJU============" + verifWiWthdrawnSuccessfullyMessage.getText());
		return verifWiWthdrawnSuccessfullyMessage.getText();
	}

	public String verifyNoRecordFoundTextMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNoRecordFoundMessage));
		System.out.println("RAJU============" + verifyNoRecordFoundMessage.getText());
		return verifyNoRecordFoundMessage.getText();
	}
	
	// Get Ars Number
	public String getArsNumber()
	{
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(getArsNumberIntiateSelfCase));
		return getArsNumberIntiateSelfCase.getText();
	}
	
	// Verify Ars Number
	public void arsNumberSearch(String arsNumberValue) throws InterruptedException
	{
		Thread.sleep(2000);
		ldriver.navigate().back();
		clickOnDashboardModule.click();
		search.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(arsNumber));
		arsNumber.sendKeys(arsNumberValue);
		System.out.println(arsNumberValue);
		searcButton.click();
	}
	
	// Advanced Search
	public void advancedSearch(String firstNameValue)
	{
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.invisibilityOf(search));
		search.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(advancedSearch));
		advancedSearch.click();
		firstName.sendKeys(firstNameValue);
		Select location = new Select(selectProcess);
		location.selectByVisibleText("CheckWise");
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.invisibilityOf(searchAdvancedButton));
		searchAdvancedButton.click();
	}
}
