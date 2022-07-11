package com.iBridge.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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

public class PrepaidSubmitCaseIndividuallyExtended {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public PrepaidSubmitCaseIndividuallyExtended(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Prepaid Submit Case Individually Extended
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnExpandBar;

	@FindBy(xpath = "//span[contains(text(),'Initiate New Case')]")
	@CacheLookup
	WebElement clickOnInitiateNewCase;

	@FindBy(xpath = "//span[contains(text(),'Submit Case Individually')]")
	@CacheLookup
	WebElement clickOnSubmitCaseIndividually;

	@FindBy(xpath = "//a[contains(text(),'Select')]")
	@CacheLookup
	WebElement clickOnCheckWiseSelect;

	@FindBy(xpath = "//button[@id='pacakgeSubmitForm']")
	@CacheLookup
	WebElement clickOnSaveAndContinueBtn;

	// Confirm-- You will not be able to edit the package in future. Are you sure?
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement clickOnConfirmOkBtn;

	// INSTRUCTIONS TO FILL BACKGROUND VERIFICATION FORM
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopup;

	// AUTHORIZATION--Step 3 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='arn']")
	WebElement clickUploadDoc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/i[1]")
	WebElement verifyDeleteAuthBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='trigger_digital_arn_link']")
	WebElement checkBoxSendLinktoCandidate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='pacakgeSubmitForm']")
	WebElement clickOnAuthContinueBtn;

	// Profile (Candidate Information)-- Step 3 - Candidate Summary
	@FindBy(xpath = "//select[@id='prefix']")
	@CacheLookup
	WebElement selectPrefixName;

	@FindBy(xpath = "//input[@id='first-name']")
	@CacheLookup
	WebElement txtCandidateFname;

	@FindBy(xpath = "//input[@id='middle-name']")
	@CacheLookup
	WebElement txtCandidateMname;

	@FindBy(xpath = "//input[@id='last-name']")
	@CacheLookup
	WebElement txtCandidateLname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateEmail;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement clickCandidateDob;

	@FindBy(xpath = "//*[@id='mobile-no']")
	@CacheLookup
	WebElement txtCandidateMobileNo;

	@FindBy(name = "alternate_mobile_no")
	@CacheLookup
	WebElement txtAlternateMobileNo;

	@FindBy(id = "gender-male")
	@CacheLookup
	WebElement checkRadioBtn;

	@FindBy(xpath = "//select[@id='gender']")
	@CacheLookup
	WebElement selectGenderName;

	@FindBy(name = "father_name")
	@CacheLookup
	WebElement txtFatherName;

	// Additional Field(s)--(Candidate Information)
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectLocation;// Gurgaon

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidatePerAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateCurrentAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateGstinNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateBussinessAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPriorityCalculation;// P1

	@FindBy(xpath = "//button[@id='profileSubmitForm']")
	@CacheLookup
	WebElement clickOnProfileSubmitFormBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Ignore Duplicate(s)')]")
	WebElement ignoreDuplicate;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='profileSubmitForm']")
	WebElement saveAndContinueButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='pacakgeSubmitForm']")
	WebElement submit;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okButton;

	// Candidate information saved successfully
	@FindBy(xpath = "//div[contains(text(),'Candidate information saved successfully')]")
	@CacheLookup
	WebElement verifyToastMsg;

	// ADDRESS (Current Address Details)--Step 3 - Candidate Summary
	@FindBy(xpath = "//*[@type='radio'][@value='india']")
	@CacheLookup
	WebElement selectWithinIndia;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtFlat_House;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtColonyName;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement clickOnResidingForm;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[3]/div[4]/div/div[2]/div/label/input[2]")
	@CacheLookup
	WebElement checkBoxTillDate;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPinCode;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtStateName;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[3]/div/input[1]")
	@CacheLookup
	WebElement txtCityName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPoliceStation;

	@FindBy(xpath = "//*[@id='adrs-chk-div']/div[2]/label/span")
	@CacheLookup
	WebElement clickOnaddressSameAsAddressBtn;

	// Add Documents
	@FindBy(id = "filenamesdiv")
	@CacheLookup
	WebElement uploadAddressProof;

	// Is your current address or any of the above mentioned address same as
	// Permanent Address
	@FindBy(className = "slider")
	@CacheLookup
	WebElement addressSameasPermanentAddress;

	// Permanent Address Details===============
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkWithinIndiaRadioBtn;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtHouseNo;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtLocality;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement clickOnResidingFormDate;

	@FindBy(xpath = "/html/body/div[6]/div[1]/table/tbody/tr[6]/td[2]")
	@CacheLookup
	WebElement selectDateResiding;

	@FindBy(css = "#\\31  > div:nth-child(3) > div:nth-child(4) > div > div.col-sm-5.col-md-3.col-lg-5 > div > label > span")
	@CacheLookup
	WebElement selectTillDate;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[4]/div[1]/div/input")
	@CacheLookup
	WebElement txtPinCodePer;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[4]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtStateNamePer;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[4]/div[3]/div/input[1]")
	@CacheLookup
	WebElement txtCityNamePer;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPoStation;

	@FindBy(id = "filenamesdiv")
	@CacheLookup
	WebElement uploadAddressProofPermanent;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnAddressContinueBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@value='Continue']")
	WebElement submitButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Ok']")
	WebElement okButtonClick;

	// Education Details--Step 3 - Candidate Summary
	// Are you a Fresher?
	// Are you a Campus Hire?
	@FindBy(xpath = "//select[@id='campus_element']")
	@CacheLookup
	WebElement selectCampusHireYes;// Yes

	@FindBy(xpath = "//button[@id='eduQuestnUpd']")
	@CacheLookup
	WebElement clickOnCampusContinueBtn;

	// Education Details 1 (Enter your highest education details)
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectQualification;// Graduate

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement selectCourseName;// B.Tech -Information Technology

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement selectUniversityName;// Bundelkhand University, Jhansi

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement clickOnIntituteField;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement txtIntituteName;

	@FindBy(xpath = "//li[contains(text(),'Bundelkhand University, Jhansi')]")
	@CacheLookup
	WebElement clickOnIntituteName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtLocationName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectModeOfQualification;// Full time

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtRoleNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPercentage;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtStartBatchMonthYear;// 07/2010

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtEndBatchMonthYear;// 06/2014

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtRemarks;

	@FindBy(xpath = "//span[contains(text(),'I will provide the document later')]")
	@CacheLookup
	WebElement clickProvideDocumentLaterOne;

	// Education Details 2 (Enter your second highest education details)
	@FindBy(xpath = "//small[contains(text(),'(Enter your second highest education details)')]")
	@CacheLookup
	WebElement verifySecondHighestEduDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectsecondQualificationName;// Senior Secondary (10+2)

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement selectSecondCourseName;// Science PCMB-Physics, Chemistry, Maths, Biology

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement selectSecondCollege;// Acharya Narendra Dev College , New Delhi

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement clickOnSecondIntituteField;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement txtSecondInstituteName;

	@FindBy(xpath = "//li[contains(text(),'Bundelkhand University, Jhansi')]")
	@CacheLookup
	WebElement clickSecondIntituteName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSecondLocation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectSecondModeOfQualification;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSecondRoleNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtGradeName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSecondStartBatchMonthYear;// 07/2007

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSecondEndBatchMonthYear;// 06/2008

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtSecondRemarks;

	// Not Use this Locator for Diy 10+2
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickWillSecondProvideDocLater;

	// Education Details 3
	@FindBy(xpath = "//h4[contains(text(),'Education Details 3')]")
	@CacheLookup
	WebElement verifyEducationDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectThreeQualification;// Secondary (10th)

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement selectThreeCourseName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement selectThreeUniversity;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement clickOnThreeIntituteField;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement txtThreeUniversityName;

	@FindBy(xpath = "//li[contains(text(),'Bundelkhand University, Jhansi')]")
	@CacheLookup
	WebElement clickThreeIntituteName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreeLocation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectThreeModeOfQualification;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreeRoleNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreePercentage;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreeStartBatchMonthYear;// 07/2005

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreeEndYearMonthYear;// 06/2006

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtThreeRemarks;

	// Do not use this locator for the 10Th- DIY
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickOnThreeProvideDocLater;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement clickOnEduSaveAndCountinueBtn;

	@FindBy(xpath = "//button[@id='fresherGap']")
	@CacheLookup
	WebElement verifyEmploymentContinueBtn;

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	// Are you a Fresher?
	@FindBy(xpath = "//select[@id='fresher_element']")
	@CacheLookup
	WebElement selectCurrentEmploymentNo;// No

	@FindBy(xpath = "//button[@id='fresherGap']")
	@CacheLookup
	WebElement clickOnCurrentContinuebtn;

	// Current Employment Details
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickOnCurrentRadioEmployedCompany;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnCurrentRadioPayroll;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement clickOnCurrentCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	@CacheLookup
	WebElement clickOnCurrentOthers;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtOtherCompanyName;

	@FindBy(xpath = "//li[contains(text(),'Authbridge Research Services Pvt Ltd, Gurgaon')]")
	@CacheLookup
	WebElement clickOnCurrentEmploymentCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentCity;// Gurgaon

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentCompanyConatctNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	WebElement txtCompleteAddressCompany;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectCurrentEmploymentType;// Permanent

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/select[1]")
	@CacheLookup
	WebElement selectCurrentNatureOfEmployment;// Full Time

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentCorporateEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentDepartment;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentDateOfJoinig;// 14-11-2020

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentDateOfLeaving;// 16-11-2020

	@FindBy(xpath = "//label[contains(text(),'Till Date')]")
	@CacheLookup
	WebElement clickOnCurrentTillDateRadioBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[9]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentResponsibilities;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[10]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentEmploymentRemarks;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectCurrentSalaryCurrency;// India Rupee

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement txtCurrentSalary;// Per Annum

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentSalarCtc;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentEmploymentCode;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentEmploymentBand;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentReasonForLeaving;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentUanNumber;

	// Other Information -- REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")
	@CacheLookup
	WebElement verifyCurrentReportingManagerDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentManagerFname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[2]")
	@CacheLookup
	WebElement txtCurrentManagerMname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[3]")
	@CacheLookup
	WebElement txtCurrentManagerLname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentManagerDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentManagerContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentEmailId;

	// Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/label[3]/span[1]")
	@CacheLookup
	WebElement verifyCurrentDontKnowText;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnCurrentRadioYesConnectReportingMng;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnCurrentRadioYesStillPartOfCompanyManger;

	// HR DETAILS
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentHrFname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[2]")
	@CacheLookup
	WebElement txtCurrentHrMname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[3]")
	@CacheLookup
	WebElement txtCurrentHrLname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentHrDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentHrCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentHrContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCurrentHrEmailId;

	@FindBy(xpath = "//span[contains(text(),'I will provide the document later')]")
	@CacheLookup
	WebElement clickCurrentProvideDocLaterOne;

	// Previous Employment Details
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousEmployedCompanyRadio;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousPayroll;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousCompany;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement txtEnterPreviousCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	@CacheLookup
	WebElement clickOnPreviousCompanyNameOthers;

	@FindBy(xpath = "//li[contains(text(),'Agami Technologies, Greater Noida')]")
	@CacheLookup
	WebElement clickOnPreviousComapnyName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtEnterPreviousOtherCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousCityName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousCompanyContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/textarea[1]")
	@CacheLookup
	WebElement txtPreviousCompanyCompleteAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreviousEmploymentType;// Permanent

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreviousNatureOfEmployment;// Full Time

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousCorporateEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousDepartment;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[6]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousDateOfJoining;// 01-11-2014

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousDateOfLeaving;// 01-10-2020

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[8]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousRole;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[9]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousRemarks;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement slectPreviousSalaryCurrency;// India Rupee

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreviousSalaryCycle;// Per Annum

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousSalaryCtc;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousEmployeeCode;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[3]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousGrade;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousReasonOfLeaving;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousUanNumber;// 101291150200

	// Other Information-- REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousMangrFname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[2]")
	@CacheLookup
	WebElement txtPreviousMangrMname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[3]")
	@CacheLookup
	WebElement txtPreviousMangrLname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousMangrDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousMangrContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousMangrEmailId;

	// Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/label[3]/span[1]")
	@CacheLookup
	WebElement verifyDontKnowRadio;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousConnectMngrYesRadioBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousStillMngrYesRadioBtn;

	// HR DETAILS
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousHrFname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[2]")
	@CacheLookup
	WebElement txtPreviousHrMname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/input[3]")
	@CacheLookup
	WebElement txtPreviousHrLname;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousHrDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousHrCompanyName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousHrContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPreviousHrEmailId;

	// Do not use doc later code- Diy
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[7]/div[1]/div[1]/div[8]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickOnPreviousWillProvideDoclaterTwo;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/button")
	@CacheLookup
	WebElement clickOnEmploymentSaveContinueBtn;

	// Tenure Alert! -- Confirm and Proceed
	@FindBy(xpath = "//button[contains(text(),'Confirm and Proceed')]")
	@CacheLookup
	WebElement clickOnConfirmAndProceedBtn;

	// ALERT - GAP CHECK FOUND
	// Employment To Employment Gap
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/textarea")
	@CacheLookup
	WebElement txtEmploymentGapReason;

	// Education To Employment Gap
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/textarea")
	@CacheLookup
	WebElement txtEducationGapReason;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement clickOnGapReasonSubmitBtn;

	// Professional Reference Check
	// Add Reference(s)-- REFERENCE 1
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement clickOnRadioReferenceSenior;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceSeniorName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceSeniorDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceSeniorMobileNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferenceSeniorEmailId;

	// Add Reference(s)-- REFERENCE 2
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement clickOnReferenceRadioPeerBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferencePeerName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferencePeerDesignation;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferencePeerMobileNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtReferencePeerEmailId;

	@FindBy(xpath = "//button[@id='profileSubmitForm']")
	@CacheLookup
	WebElement clickOnReferebnceSaveAndContinueBtn;

	// Step 4 - Case Preview
	// Please review the screen before you proceed
	@FindBy(xpath = "//button[@id='pacakgeSubmitForm']")
	@CacheLookup
	WebElement clickOnSubmitBtn;

	// Confirm-- All the details will be submitted and you will not be able to make
	// changes later. Please review your form and submit
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	@CacheLookup
	WebElement clickOnConfirmOkbtn;

	// Verify Initiated Case Thank You Message!
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyCaseThankYouMsg;

	// Payment Pending Cases
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnMenuExpand;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnSubmissionSummary;

	@FindBy(xpath = "//a[contains(text(),'Pending Payment')]")
	@CacheLookup
	WebElement clickOnPendingPayment;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]/input[1]")
	@CacheLookup
	WebElement checkCheckBoxPaymentPendingCase;

	@FindBy(xpath = "//input[@id='formSubmitId']")
	@CacheLookup
	WebElement clickOnContinueToPayBtn;

	// Amount Payable
	@FindBy(xpath = "//span[@id='paywalletbal']")
	@CacheLookup
	WebElement verifyAmountPayable;

	// Your case(s) initiation is pending, you have not paid yet.
	@FindBy(xpath = "//p[contains(text(),'Your case(s) initiation is pending, you have not p')]")
	@CacheLookup
	WebElement verifyYourCaseInitiationPending;

	@FindBy(xpath = "//button[@id='paySubmitBtn']")
	@CacheLookup
	WebElement clickOnClickHereToPayForCaseInitiationBtn;

	// Payment Completed.The candidate profile has been submitted for verification.
	@FindBy(xpath = "//span[contains(text(),'Payment Completed.')]")
	@CacheLookup
	WebElement verifyPaymentCompletedText;

	// Submitted for Verification Bucket
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickMenuExpandBar;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnSubmissionSummaryModule;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@title='Submitted for Verification']")
	WebElement submittedForVerification;

	@FindBy(xpath = "//a[contains(text(),'Submitted for Verification')]")
	@CacheLookup
	WebElement clickOnSubmittedForVerificationBucket;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement verifyCaseCandidateName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[1]/div[2]/label[1]")
	@CacheLookup
	WebElement verifyCaseCandidateEmailId;

	// (WIP Cases)--Submitted Case(s) Tracker
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
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsCandidateName1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div/div[1]/div[1]/label")
	WebElement verifyCandidateFname;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(.,'ARS No:')]/parent::div")
	WebElement copyARSNo;

	// Prepaid Submit Case Individually Extended
	public void submitCaseInitiateIndividually() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnExpandBar));
		JavaScriptManuplator.javaScriptExecutor(clickOnExpandBar, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateNewCase, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmitCaseIndividually));
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitCaseIndividually, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckWiseSelect));
		JavaScriptManuplator.javaScriptExecutor(clickOnCheckWiseSelect, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSaveAndContinueBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSaveAndContinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// AUTHORIZATION--Step 3 - Candidate Summary
	public void authorizationDiy(String document) throws InterruptedException {
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(5000);
		// clickOnOkCnfPopup.click();
		try {
			clickOnInstructionPopup.click();
		} catch (Exception e) {

		}
		Thread.sleep(2000);
		clickUploadDoc.sendKeys(document);

		try {
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(verifyDeleteAuthBtn));
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {

		}
		Thread.sleep(1000);
		clickOnAuthContinueBtn.click();
		Thread.sleep(1000);
	}

	// Profile (Candidate Information)-- Step 3 - Candidate Summary
	public void candidateFirstName(String fName) {
		txtCandidateFname.sendKeys(fName);
	}

	public void candidateMiddleName(String mName) {
		txtCandidateMname.sendKeys(mName);
	}

	public void candidateLastName(String lName) {
		txtCandidateLname.sendKeys(lName);
	}

	public void setEmail(String email) throws InterruptedException {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='" + email + "'", txtCandidateEmail);
		Thread.sleep(1000);
	}

	public void prepaidCandidateProfile(String candidateDob, String mobileNo, String altMobileNo, String fatherName)
			throws ParseException, InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPrefixName));
		Select prefixName = new Select(selectPrefixName);
		prefixName.selectByIndex(4);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickCandidateDob);
		clickCandidateDob.sendKeys(candidateDob);
		txtCandidateMobileNo.sendKeys(mobileNo);
		txtAlternateMobileNo.sendKeys(altMobileNo);
		// checkRadioBtn.click();
		Select genderName = new Select(selectGenderName);
		genderName.selectByIndex(1);
		txtFatherName.sendKeys(fatherName);
		Thread.sleep(1000);
	}

	// Additional Field(s)--(Candidate Information)
	public void prepaidCandidateAdditionalInfo() throws InterruptedException {
		JavaScriptManuplator.javaScriptExecutor(selectPriorityCalculation, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPriorityCalculation));
		JavaScriptManuplator.selectOptionFromDropDown(selectLocation, "Gurgaon");
		JavaScriptManuplator.javaScriptExecutor(txtCandidateEmailId, "arguments[0].value='raju.yadav@authbridge.com'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateContactNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidatePerAddress, "arguments[0].value='Mayur Vihar Phase'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateCurrentAddress, "arguments[0].value='New Delhi'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateGstinNumber, "arguments[0].value='27AACCM3174A1ZV'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='New Delhi'",
				ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectPriorityCalculation, "P1");
		Thread.sleep(1000);
	
		JavaScriptManuplator.javaScriptExecutor(clickOnProfileSubmitFormBtn, "arguments[0].click()", ldriver);
		
		List<WebElement> tag1 = ldriver.findElements(By.tagName("a"));
		for (int i = 0; i < tag1.size(); i++) {
			System.out.println(tag1.get(i).getAttribute("title"));
			if (tag1.get(i).getAttribute("title").equals("Irrespective of matching record(s), new case will be initiated in selected package")) {
				JavaScriptManuplator.javaScriptExecutor(tag1.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}	
	
//		JavaScriptManuplator.javaScriptExecutor(ignoreDuplicate, "arguments[0].click()", ldriver);
//    	ignoreDuplicate.click();
		JavaScriptManuplator.javaScriptExecutor(saveAndContinueButton, "arguments[0].click()", ldriver);
//		saveAndContinueButton.click();

	}

	// ADDRESS(Current Address Details)--Step 3 - Candidate Summary
	public void prepaidCandidateAddress(String flat, String colony, String residingForm, String pinCode, String state,
			String city, String station, String houseNo, String locality, String residingFormDate, String pinCodePer,
			String statePer, String cityPer, String policeStation, String AddressProof)
			throws InterruptedException, ParseException {
	
//		wait = new WebDriverWait(ldriver, 60);
//		wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
//		JavaScriptManuplator.javaScriptExecutor(selectWithinIndia, "arguments[0].click()", ldriver);
//     	selectWithinIndia.click();
//		txtFlat_House.clear();
//		txtFlat_House.sendKeys(flat);
//		txtColonyName.clear();
//		txtColonyName.sendKeys(colony);
//
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingForm);
//		clickOnResidingForm.sendKeys(residingForm);
//		Thread.sleep(1000);
//		checkBoxTillDate.click();
//		txtPinCode.clear();
//		JavaScriptManuplator.javaScriptExecutor(txtPinCode, "arguments[0].value='323233'", ldriver);
//		Thread.sleep(1000);
//		JavaScriptManuplator.javaScriptExecutor(txtStateName, "arguments[0].value='Delhi'", ldriver);
//		Thread.sleep(1000);
//		JavaScriptManuplator.javaScriptExecutor(txtCityName, "arguments[0].value='Delhi'", ldriver);
//		Thread.sleep(1000);
//		txtPoliceStation.sendKeys(station);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].scrollIntoView(true);", checkWithinIndiaRadioBtn);
//		// Add Documents
//		// Is your current address or any of the above mentioned address same as
//		// Permanent Address
//		// Permanent Address Details
//		try {
//			checkWithinIndiaRadioBtn.click();
//		} catch (StaleElementReferenceException e) {
//			selectWithinIndia.click();
//		}
//		wait = new WebDriverWait(ldriver, 120);
//		wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
//		selectWithinIndia.click();
//		txtHouseNo.clear();
//		txtHouseNo.sendKeys(houseNo);
//		txtLocality.clear();
//		txtLocality.sendKeys(locality);

//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingFormDate);
//		clickOnResidingFormDate.sendKeys(residingFormDate);
//		Thread.sleep(1000);
//		selectTillDate.click();
//		JavaScriptManuplator.javaScriptExecutor(txtPinCodePer, "arguments[0].value='32'", ldriver);
//		txtPinCodePer.sendKeys("325467");
//		JavaScriptManuplator.javaScriptExecutor(txtCityNamePer, "arguments[0].value='Delhi'", ldriver);
//		txtCityNamePer.sendKeys("Delhi");
		// Adding headless code
//		WebElement xWL = ldriver.findElement(By.xpath(
//				"/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]"));
//		Actions xAct = new Actions(ldriver);
//		xAct.moveToElement(xWL).build().perform();
//		Thread.sleep(2000);
//		JavaScriptManuplator.javaScriptExecutor(txtStateNamePer, "arguments[0].value='Delhi'", ldriver);
//		Thread.sleep(1000);
//		txtStateNamePer.sendKeys("Delhi");
//		JavaScriptManuplator.javaScriptExecutor(txtStateNamePer, "arguments[0].value='Agra'", ldriver);
//		txtStateNamePer.sendKeys(Keys.SPACE);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].value='Del'", txtStateNamePer);
//		Thread.sleep(1000);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].value='Delhi'", txtCityNamePer);
//		txtCityNamePer.clear();
//		txtCityNamePer.sendKeys(cityPer);
//		Select sec =new Select(txtCityNamePer);
//		sec.selectByVisibleText("Dewas");
//		JavaScriptManuplator.javaScriptExecutor(txtCityNamePer, "arguments[0].value='Agra'", ldriver);
//		txtCityNamePer.sendKeys(Keys.SPACE);
//		JavaScriptManuplator.javaScriptExecutor(txtCityNamePer, "arguments[0].value='Delhi'", ldriver);
//		txtCityNamePer.sendKeys("Delhi");
//		txtPoStation.clear();
//		JavaScriptManuplator.javaScriptExecutor(txtPoStation, "arguments[0].value='Delhi'", ldriver);
//		txtPoStation.sendKeys(station);
//		 uploadAddressProofPermanent.sendKeys(AddressProof);
		
//		wait = new WebDriverWait(ldriver, 60);
//    	wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
		List<WebElement> tag1 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag1.size(); i++) {
			System.out.println(tag1.get(i).getAttribute("id"));
			if (tag1.get(i).getAttribute("id").equals("check-data-90952-162-india")) {
				JavaScriptManuplator.javaScriptExecutor(tag1.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}	
//		JavaScriptManuplator.javaScriptExecutor(selectWithinIndia, "arguments[0].click()", ldriver);
//		selectWithinIndia.click();
//		wait.until(ExpectedConditions.visibilityOf(txtFlat_House));
//		txtFlat_House.clear();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='flat'",
				ldriver);
//		txtFlat_House.sendKeys(flat);
//		txtColonyName.clear();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='colony'",
				ldriver);
//		txtColonyName.sendKeys(colony);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingForm);
//		JavaScriptManuplator.javaScriptExecutor(clickOnResidingForm, "arguments[0].click()", ldriver);
		List<WebElement> tag2 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag2.size(); i++) {
			System.out.println(tag2.get(i).getAttribute("name"));
			if (tag2.get(i).getAttribute("name").equals("check_data[90952][5]")) {
				JavaScriptManuplator.javaScriptExecutor(tag2.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}	
//		clickOnResidingForm.click();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='residingForm'",
				ldriver);
//		clickOnResidingForm.sendKeys(residingForm);
		// checkBoxTillDate.clear();
		List<WebElement> tag3 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag3.size(); i++) {
			System.out.println(tag3.get(i).getAttribute("id"));
			if (tag3.get(i).getAttribute("id").equals("tillDate90954")) {
				JavaScriptManuplator.javaScriptExecutor(tag3.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}	
//		JavaScriptManuplator.javaScriptExecutor(checkBoxTillDate, "arguments[0].click()", ldriver);
//		checkBoxTillDate.click();
//		txtPinCode.clear();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='pinCode'",
				ldriver);
//		txtPinCode.sendKeys("123456");
//		txtCityName.clear();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='city'",
				ldriver);
//		txtCityName.sendKeys(city);
//		txtStateName.clear();
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='Del'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='state'",
				ldriver);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].value='Del'", txtStateName);
//		txtStateName.sendKeys(state);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='Delhi'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='city'",
				ldriver);
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].value='Delhi'", txtCityName);
//		txtCityName.clear();
//		txtCityName.sendKeys(city);
//		txtPoliceStation.clear();
		JavaScriptManuplator.javaScriptExecutor(txtCandidateBussinessAddress, "arguments[0].value='station'",
				ldriver);
//		txtPoliceStation.sendKeys(station);
		Thread.sleep(2000);
//		JavaScriptManuplator.javaScriptExecutor(clickOnAddressContinueBtn, "arguments[0].click()", ldriver);
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].click();", clickOnAddressContinueBtn);
		List<WebElement> tag4 = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag4.size(); i++) {
			System.out.println(tag4.get(i).getAttribute("name"));
			if (tag4.get(i).getAttribute("name").equals("continue")) {
				JavaScriptManuplator.javaScriptExecutor(tag4.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}
		clickOnAddressContinueBtn.click();
		Thread.sleep(2000);
		submitButton.click();
		Thread.sleep(3000);
//		JavaScriptManuplator.javaScriptExecutor(okButtonClick, "arguments[0].click()", ldriver);
		
		List<WebElement> tag5 = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag5.size(); i++) {
			System.out.println(tag5.get(i).getAttribute("class"));
			if (tag5.get(i).getAttribute("class").equals("btn btn-default")) {
				JavaScriptManuplator.javaScriptExecutor(tag5.get(i), "arguments[0].click()", ldriver);
				break;
			}
		}
//		okButtonClick.click();
	}

	// Education Details--Step 3 - Candidate Summary
	public void prepaidEducationInformation(String instituteName) throws InterruptedException {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectCampusHireYes));
		JavaScriptManuplator.selectOptionFromDropDown(selectCampusHireYes, "Yes");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnCampusContinueBtn, "arguments[0].click()", ldriver);

		// Education Details 1 (Enter your highest education details)
		
		JavaScriptManuplator.waitForElementPresent(ldriver, selectQualification, 120);
		JavaScriptManuplator.selectOptionFromDropDown(selectQualification, "Graduate");
		JavaScriptManuplator.javaScriptExecutor(selectCourseName, "arguments[0].value='Computer Science & Engineering'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectUniversityName,
				"arguments[0].value='Bundelkhand University, Jhansi'", ldriver);
		Thread.sleep(2000);
		clickOnIntituteField.click();
		Thread.sleep(2000);
		txtIntituteName.sendKeys(instituteName);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIntituteName));
		Thread.sleep(2000);
		clickOnIntituteName.click();
		JavaScriptManuplator.javaScriptExecutor(txtLocationName, "arguments[0].value='Jhansi'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectModeOfQualification, "Full time");
		JavaScriptManuplator.javaScriptExecutor(txtRoleNumber, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtRoleNumber));
		JavaScriptManuplator.javaScriptExecutor(txtRoleNumber, "arguments[0].value='6098'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPercentage, "arguments[0].value='85%'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtStartBatchMonthYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtStartBatchMonthYear, "arguments[0].value='07/2010'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEndBatchMonthYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEndBatchMonthYear, "arguments[0].value='06/2014'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtRemarks, "arguments[0].value='Good Remark added'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickProvideDocumentLaterOne, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickProvideDocumentLaterOne));
		JavaScriptManuplator.javaScriptExecutor(clickProvideDocumentLaterOne, "arguments[0].click()", ldriver);
		Thread.sleep(2000);

		// Education Details 2 (Enter your second highest education details)
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySecondHighestEduDetails));
		JavaScriptManuplator.selectOptionFromDropDown(selectsecondQualificationName, "Senior Secondary (10+2)");
		JavaScriptManuplator.javaScriptExecutor(selectSecondCourseName, "arguments[0].value='Science'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectSecondCollege,
				"arguments[0].value='Acharya Narendra Dev College'", ldriver);
		Thread.sleep(2000);
		clickOnSecondIntituteField.click();
		txtSecondInstituteName.sendKeys(instituteName);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickSecondIntituteName));
		Thread.sleep(2000);
		clickSecondIntituteName.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtSecondLocation, "arguments[0].value='Jhansi'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectSecondModeOfQualification, "Full time");
		JavaScriptManuplator.javaScriptExecutor(txtSecondRoleNumber, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtSecondRoleNumber));
		JavaScriptManuplator.javaScriptExecutor(txtSecondRoleNumber, "arguments[0].value='6099'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtGradeName, "arguments[0].value='91%'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSecondStartBatchMonthYear,
				"arguments[0].removeAttribute('readonly')", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSecondStartBatchMonthYear, "arguments[0].value='07/2007'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSecondEndBatchMonthYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSecondEndBatchMonthYear, "arguments[0].value='06/2008'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtSecondRemarks, "arguments[0].value='Good Remark added'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickWillSecondProvideDocLater, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickWillSecondProvideDocLater));
		JavaScriptManuplator.javaScriptExecutor(clickWillSecondProvideDocLater, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		
		// Education Details 3 -------
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyEducationDetails));
		JavaScriptManuplator.selectOptionFromDropDown(selectThreeQualification, "Secondary (10th)");
		JavaScriptManuplator.javaScriptExecutor(selectThreeCourseName, "arguments[0].value='Science PCM'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectThreeUniversity,
				"arguments[0].value='Acharya Narendra Dev College'", ldriver);
		Thread.sleep(2000);
		clickOnThreeIntituteField.click();
		Thread.sleep(2000);
		txtThreeUniversityName.sendKeys(instituteName);
		Thread.sleep(2000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtThreeUniversityName));
		Thread.sleep(2000);
		clickThreeIntituteName.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtThreeLocation, "arguments[0].value='Jhansi'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectThreeModeOfQualification, "Full time");
		JavaScriptManuplator.javaScriptExecutor(txtThreeRoleNumber, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtThreeRoleNumber));
		JavaScriptManuplator.javaScriptExecutor(txtThreeRoleNumber, "arguments[0].value='6100'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreePercentage, "arguments[0].value='87%'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreeStartBatchMonthYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreeStartBatchMonthYear, "arguments[0].value='07/2005'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreeEndYearMonthYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreeEndYearMonthYear, "arguments[0].value='06/2006'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtThreeRemarks, "arguments[0].value='Good Remark added'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnThreeProvideDocLater, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnThreeProvideDocLater));
		JavaScriptManuplator.javaScriptExecutor(clickOnThreeProvideDocLater, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnEduSaveAndCountinueBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnEduSaveAndCountinueBtn, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyEmploymentContinueBtn));
		Thread.sleep(1000);
	}

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	// Are you a Fresher?
	public void prepaidCurrentEmploymentDetails(String instituteName) throws InterruptedException {
		JavaScriptManuplator.waitForElementPresent(ldriver, selectCurrentEmploymentNo, 120);
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentEmploymentNo, "No");
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentContinuebtn, "arguments[0].click()", ldriver);

		// Current Employment Details
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentRadioEmployedCompany));
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentRadioEmployedCompany, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentRadioPayroll, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		clickOnCurrentCompanyName.click();
		Thread.sleep(2000);
		txtCurrentCompanyName.sendKeys(instituteName);
		Thread.sleep(4000);
		clickOnCurrentOthers.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtOtherCompanyName,
				"arguments[0].value='Authbridge Research Services Pvt Ltd, Gurgaon'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentDesignation,
				"arguments[0].value='Senior QA Automation Engineer'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentCity, "arguments[0].value='Gurgaon'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentCompanyConatctNumber, "arguments[0].value='7042718794'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCompleteAddressCompany, "arguments[0].value='Gurgaon'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectCurrentEmploymentType, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentEmploymentType));
		Thread.sleep(2000);
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentEmploymentType, "Permanent");
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentNatureOfEmployment, "Full Time");
		JavaScriptManuplator.javaScriptExecutor(txtCurrentCorporateEmailId,
				"arguments[0].value='raju.yadav@authbridge.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentDepartment, "arguments[0].value='Engineering'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentTillDateRadioBtn, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentTillDateRadioBtn));
		JavaScriptManuplator.javaScriptExecutor(txtCurrentDateOfJoinig, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentDateOfJoinig, "arguments[0].value='14-11-2020'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentTillDateRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentResponsibilities,
				"arguments[0].value='Automated Web Application'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentEmploymentRemarks, "arguments[0].value='Good Are Remarks'",
				ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectCurrentSalaryCurrency, "India Rupee");
		JavaScriptManuplator.selectOptionFromDropDown(txtCurrentSalary, "Per Annum");
		JavaScriptManuplator.javaScriptExecutor(txtCurrentSalarCtc, "arguments[0].value='600000'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentEmploymentCode, "arguments[0].value='6098'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentEmploymentBand, "arguments[0].value='Associate'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentReasonForLeaving,
				"arguments[0].value='Personal and Career Growth'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentUanNumber, "arguments[0].value='152745675'", ldriver);
		Thread.sleep(4000);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerFname, "arguments[0].scrollIntoView(true);", ldriver);
		// Other Information -- REPORTING MANAGER DETAILS
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCurrentManagerFname));
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerFname, "arguments[0].value='Raju'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerMname, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerLname, "arguments[0].value='Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerDesignation,
				"arguments[0].value='Senior QA Automation Engineer'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentManagerContactNumber, "arguments[0].value='7042718794'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentEmailId, "arguments[0].value='rajuyadav0556@gmail.com'",
				ldriver);

		// Can we connect with your reporting manager for reference check now?
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCurrentDontKnowText));
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentRadioYesConnectReportingMng, "arguments[0].click()",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnCurrentRadioYesStillPartOfCompanyManger, "arguments[0].click()",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrFname, "arguments[0].scrollIntoView(true);", ldriver);
		// HR DETAILS
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCurrentHrFname));
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrFname, "arguments[0].value='Aman'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrMname, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrLname, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrLname, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrDesignation, "arguments[0].value='Human Resource'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrCompanyName, "arguments[0].value='Agami Technologies'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrContactNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCurrentHrEmailId, "arguments[0].value='ajit@agamitechnologies.com'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickCurrentProvideDocLaterOne, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickCurrentProvideDocLaterOne));
		JavaScriptManuplator.javaScriptExecutor(clickCurrentProvideDocLaterOne, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Previous Employment Details
	public void prepaidPreviousEmploymentDetails(String instituteName) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmployedCompanyRadio));
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousEmployedCompanyRadio, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousPayroll, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		clickOnPreviousCompany.click();
		Thread.sleep(2000);
		txtEnterPreviousCompanyName.sendKeys(instituteName);
		Thread.sleep(4000);
		clickOnPreviousCompanyNameOthers.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtEnterPreviousOtherCompanyName,
				"arguments[0].value='Agami Technologies, Greater Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDesignation,
				"arguments[0].value='Senior QA Automation Engineer'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCityName, "arguments[0].value='Greater Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCompanyContactNumber, "arguments[0].value='8009744341'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCompanyCompleteAddress, "arguments[0].value='Greater Noida'",
				ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousEmploymentType, "Permanent");
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousNatureOfEmployment, "Full Time");
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCorporateEmailId,
				"arguments[0].value='agami.raju@agamitechnologies.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDepartment, "arguments[0].value='Engineering'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDateOfJoining, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtPreviousDateOfJoining));
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDateOfJoining, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDateOfJoining, "arguments[0].value='01-11-2014'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDateOfLeaving, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDateOfLeaving, "arguments[0].value='01-10-2020'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousRole, "arguments[0].value='Automation Web Application'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousRemarks, "arguments[0].value='Comments are Good'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(slectPreviousSalaryCurrency, "India Rupee");
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousSalaryCycle, "Per Annum");
		JavaScriptManuplator.javaScriptExecutor(txtPreviousSalaryCtc, "arguments[0].value='500000'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousEmployeeCode, "arguments[0].value='Agami035'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousGrade, "arguments[0].value='B'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousReasonOfLeaving,
				"arguments[0].value='Personal and Career Growth'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousUanNumber, "arguments[0].value='15289730832'", ldriver);
		Thread.sleep(4000);
		// Other Information-- REPORTING MANAGER DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrMname, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtPreviousMangrMname));
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrFname, "arguments[0].value='Abhishek'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrMname, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrLname, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrDesignation, "arguments[0].value='Project Manager'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrContactNumber, "arguments[0].value='7042718794'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMangrEmailId,
				"arguments[0].value='abhishek@agamitechnologies.com'", ldriver);

		// Can we connect with your reporting manager for reference check now?
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyDontKnowRadio));
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousConnectMngrYesRadioBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousStillMngrYesRadioBtn, "arguments[0].click()", ldriver);

		// HR DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrFname, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtPreviousHrFname));
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrFname, "arguments[0].value='Manish'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrMname, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrLname, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrDesignation, "arguments[0].value='Human Resource'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrCompanyName, "arguments[0].value='Agami Technologies'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrContactNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousHrEmailId,
				"arguments[0].value='manish@agamitechnologies.com'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnEmploymentSaveContinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		// Tenure Alert! -- Confirm and Proceed
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmAndProceedBtn));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnConfirmAndProceedBtn, "arguments[0].click()", ldriver);

		// ALERT - GAP CHECK FOUND
		// Employment To Employment Gap
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtEmploymentGapReason));
		JavaScriptManuplator.javaScriptExecutor(txtEmploymentGapReason,
				"arguments[0].value='Preparation for Get New job'", ldriver);
		Thread.sleep(1000);
		// Education To Employment Gap
		JavaScriptManuplator.javaScriptExecutor(txtEducationGapReason,
				"arguments[0].value='Preparation for the entrance examination'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnGapReasonSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Professional Reference Check
	public void prepaidProfessionalReferenceCheck() throws InterruptedException {
		// Add Reference(s)-- REFERENCE 1
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnRadioReferenceSenior));
		JavaScriptManuplator.javaScriptExecutor(clickOnRadioReferenceSenior, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceSeniorName, "arguments[0].value='Krishna Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceSeniorDesignation, "arguments[0].value='Senior QA'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceSeniorMobileNumber, "arguments[0].value='8009744341'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferencePeerName, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferenceSeniorEmailId, "arguments[0].value='krishnaKant@gmail.com'",
				ldriver);

		// Add Reference(s)-- REFERENCE 2
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnReferenceRadioPeerBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnReferenceRadioPeerBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferencePeerName, "arguments[0].value='Abhishek Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferencePeerDesignation, "arguments[0].value='Project Manager'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferencePeerMobileNumber, "arguments[0].value='7042718794'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReferencePeerEmailId, "arguments[0].value='abhishekKumar@gmail.com'",
				ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnReferebnceSaveAndContinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);

		// Step 4 - Case Preview
		// Please review the screen before you proceed
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmitBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);

		// Confirm-- All the details will be submitted and you will not be able to make
		// changes later. Please review your form and submit
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkbtn));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnConfirmOkbtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Verify Initiated Case Thank You Message!
	public String verifyInitiatedCaseThankYouMessage() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();
	}

	// Payment Pending Cases
	public void prepaidPaymentPendingCases() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnMenuExpand));
		JavaScriptManuplator.javaScriptExecutor(clickOnMenuExpand, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSummary));
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmissionSummary, "arguments[0].click()", ldriver);
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Pending Payment')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkCheckBoxPaymentPendingCase));
		JavaScriptManuplator.javaScriptExecutor(checkCheckBoxPaymentPendingCase, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnContinueToPayBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Amount Payable
	public String verifyAmountPayableValue() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyAmountPayable));
//		System.out.println("verifyAmountPayable===" + verifyAmountPayable);
		return verifyAmountPayable.getText();
	}

	// Your case(s) initiation is pending, you have not paid yet.
	public void prepaidPaymentPendingCaseCompleted() throws InterruptedException {
		// Your case(s) initiation is pending, you have not p
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyYourCaseInitiationPending));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnClickHereToPayForCaseInitiationBtn, "arguments[0].click()",
				ldriver);
		Thread.sleep(1000);
	}

	// Payment Completed.The candidate profile has been submitted for verification.
	public String verifyPaymentCompletedMessage() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyPaymentCompletedText));
		return verifyPaymentCompletedText.getText();
	}

	// Submitted For Verification Bucket
	public void submittedForVerificationBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickMenuExpandBar));
		JavaScriptManuplator.javaScriptExecutor(clickMenuExpandBar, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		clickOnSubmissionSummaryModule.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(submittedForVerification, "arguments[0].click()", ldriver);
	}

	// Submitted For Verification Bucket-- Candidate Name
	public String verifyPrepaidCandidateName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseCandidateName));
		return verifyCaseCandidateName.getText();
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	public void submittedCasesTrackerWipCases(String firstName, String middleName) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'WIP Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(firstName);
		searchByArsCandidateName1.sendKeys(middleName);
		Thread.sleep(2000);
		searchByArsCandidateName.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		try {
			File output = new File("PrepaidIvcArs.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(copyARSNo.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCandidateFName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname));
		return verifyCandidateFname.getText();
	}

}
