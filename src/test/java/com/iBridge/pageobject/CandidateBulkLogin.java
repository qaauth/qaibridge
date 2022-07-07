package com.iBridge.pageobject;

import java.text.ParseException;

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

import com.iBridge.utilities.JavaScriptManuplator;

public class CandidateBulkLogin {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CandidateBulkLogin(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the iBridge
	@FindBy(name = "username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@id=\"submitBtn\"]")
	@CacheLookup
	WebElement btnLogin;

	// INSTRUCTIONS TO FILL BACKGROUND VERIFICATION FORM
	@FindBy(xpath = "//*[@id='instruction-popup']/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopupCrossBtn;
	
	// Verify After Login By Candidate Account-- Case Submission Summary Text
	@FindBy(xpath = "//label[contains(text(),'Step 3 - Candidate Summary')]")
	@CacheLookup
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
	WebElement clickOnContinueBtn;

	// NATIONAL IDENTITY--Step 3 - Candidate Summary
	@FindBy(xpath = "//*[@id='no_pan_card']")
	@CacheLookup
	WebElement checkBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnCnfPopupcheckBoxNoPanCard;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[1]/div/select")
	@CacheLookup
	WebElement selectDocumentType;

	@FindBy(xpath = "//*[@id='NID_Default_0']/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement uploadDocumentFrontEnd;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement txtNameAsPerDocument;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtDocumentNumber;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnIdentityContinueBtn;

	// Profile --Step 3 - Candidate Summary
	@FindBy(xpath = "//select[@id='prefix']")
	@CacheLookup
	WebElement selectPrefixName;

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

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/button")
	@CacheLookup
	WebElement clickOnProfileContinueBtn;

	@FindBy(xpath = "//div[contains(text(),'Candidate information saved successfully')]")
	@CacheLookup
	WebElement verifyToastMsg;

	// ADDRESS(Current Address Details)--Step 3 - Candidate Summary
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
	@FindBy(id = "filenamesdiv")
	@CacheLookup
	WebElement uploadAddressProof;

	// Is your current address or any of the above mentioned address same as
	// Permanent Address
	@FindBy(className = "slider")
	@CacheLookup
	WebElement addressSameasPermanentAddress;

	// Permanent Address Details
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[2]/div/div/label[1]/input")
	@CacheLookup
	WebElement checkWithinIndiaRadioBtn;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtHouseNo;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtLocality;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement clickOnResidingFormDate;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[4]/div/div[2]/div/label/input[2]")
	@CacheLookup
	WebElement selectTillDate;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[1]/div/input")
	@CacheLookup
	WebElement txtPinCodePer;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtStateNamePer;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[3]/div/input[1]")
	@CacheLookup
	WebElement txtCityNamePer;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPoStation;

	@FindBy(id = "filenamesdiv")
	@CacheLookup
	WebElement uploadAddressProofPermanent;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnAddressContinueBtn;

	// Education Details--Step 3 - Candidate Summary
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div/select")
	@CacheLookup
	WebElement selectQualificationDegree;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtQualification;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtUniversityBoard;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[4]/div/span/span[1]/span")
	@CacheLookup
	WebElement clickOnIntituteField;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement txtIntituteName;

	@FindBy(xpath = "//li[contains(text(),'Bundelkhand University, Jhansi')]")
	@CacheLookup
	WebElement clickOnIntituteName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCollegeInstitute;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtInstituteLocation;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div/select")
	@CacheLookup
	WebElement selectModeOfQualification;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtEnrollmentNo;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtGrade_Percentage;

	// Batch Start Date
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement clickOnBatchStartDate;

	// End Year
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[1]/div/div[2]/div/input")
	@CacheLookup
	WebElement clickOnEndYear;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div/input")
	@CacheLookup
	WebElement txtRemark;

	@FindBy(xpath = "//span[contains(text(),'I will provide the document later')]")
	@CacheLookup
	WebElement checkBoxDocumentLater;

	@FindBy(xpath = "//*[@id='saveBtn']")
	@CacheLookup
	WebElement clickOnEducationContinueBtn;

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/label[1]/input")
	@CacheLookup
	WebElement employedInCompany;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div/label[2]/input")
	@CacheLookup
	WebElement checkOnPayroll;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement txtCompanyName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-search__field']")
	WebElement currentEmployeSearchField;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Other']")
	WebElement clickOnOtherName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtDesignation;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtLocation;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtCompanyMobileNo;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[1]/div/textarea")
	@CacheLookup
	WebElement txtAddressoftheCompany;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/div/select")
	@CacheLookup
	WebElement selectEmploymentType;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[3]/div/select")
	@CacheLookup
	WebElement selectNatureOfEmployment;
	
	// Corporate Email ID
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCorporateEmailId;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[5]/div/input")
	@CacheLookup
	WebElement txtDepartment;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[6]/div/input")
	@CacheLookup
	WebElement clickOnDateOfJoining;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[7]/div/input")
	@CacheLookup
	WebElement clickOnDateOfLeaving;

	@FindBy(xpath = "//label[contains(text(),'Till Date')]")
	@CacheLookup
	WebElement clickOnTillDate;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[9]/div/input")
	@CacheLookup
	WebElement txtResponsibilities;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[10]/div/input")
	@CacheLookup
	WebElement txtRemarks;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[1]/div/select")
	@CacheLookup
	WebElement selectSalaryCurrency;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[2]/div/div[1]/div/select")
	@CacheLookup
	WebElement selectSalaryCycle;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtSalaryCTC;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[3]/div/div[1]/div/input")
	@CacheLookup
	WebElement txtEmaployeeCode;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[3]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtGradeBond;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[4]/div/input")
	@CacheLookup
	WebElement txtReasonForLeaving;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[5]/div/input")
	@CacheLookup
	WebElement txtUanNumber;

	// Other Information--REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtMiddleName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement txtDesignationName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtContactNumber;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtEmailId;

	// Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[3]/div[1]/div/label[2]/input")
	@CacheLookup
	WebElement checkBox;

	// Is the Reporting Manager still a part of company?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[2]/input")
	@CacheLookup
	WebElement checkBoxYes;

	// HR DETAILS
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtHrFistName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtHrMiddleName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtHrLastName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtHrDesignation;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtHrCompanyName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtHrContactName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtHrEmail;

	// Add Document(s)
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[9]/div/div/label/input[2]")
	@CacheLookup
	WebElement checkHrdocumentLater;

	// Previous Employment Details--
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/label[1]/input")
	@CacheLookup
	WebElement checkEmployedRadioBtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/label[2]/input")
	@CacheLookup
	WebElement checkRadioPayrollBtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement txtPreviousCompName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-search__field']")
	WebElement searchField;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-results__option select2-results__option--highlighted']")
	WebElement otherField;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousDesignation;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtPreviousCity;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousMobileNo;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[1]/div/textarea")
	@CacheLookup
	WebElement txtPreviousAddressComp;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[2]/div/select")
	@CacheLookup
	WebElement selectPreviousEmploymentType;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[3]/div/select")
	@CacheLookup
	WebElement selectPreviousNatureEmp;
	
	// Corporate Email ID
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousCorporateEmail;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[5]/div/input")
	@CacheLookup
	WebElement txtPreviousDepartment;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[6]/div/input")
	@CacheLookup
	WebElement clickOnPreviousJoining;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[7]/div/input")
	@CacheLookup
	WebElement clickOnPreviousLeaving;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[8]/div/input")
	@CacheLookup
	WebElement txtPreviousRole;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[9]/div/input")
	@CacheLookup
	WebElement txtPreviousRemarks;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[1]/div/select")
	@CacheLookup
	WebElement selectPreviousSalaryCurrency;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[2]/div/div[1]/div/select")
	@CacheLookup
	WebElement selectPreviousSalaryCycle;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousSalaryCtc;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[3]/div/div[1]/div/input")
	@CacheLookup
	WebElement txtPreviousEmpCode;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[3]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousGrade;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousReasonLeaving;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[5]/div/input")
	@CacheLookup
	WebElement txtPreviousUanNo;

	// Other Information--REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtManagerFirstName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtManagerMiddleName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtManagerLastName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement txtManagerDesignation;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtManagerMobileNo;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtManagerEmailId;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[3]/input")
	@CacheLookup
	WebElement clickOnDontKnow;

	// Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[1]/div/label[2]/input")
	@CacheLookup
	WebElement checkRadioBtnManagerYes;

	// Is the Reporting Manager still a part of company?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[2]/input")
	@CacheLookup
	WebElement ckeckRadioBtnManagerYes;

	// HR DETAILS
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtHrFirstName;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtHrMiddleN;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtHrLastN;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtHrDesig;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement txtHrCompanyN;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtHrContactNumber;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtHrEmailId;

	// Add Document(s)
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[7]/div/div/div[9]/div/div/label/input[2]")
	@CacheLookup
	WebElement checkDocumentLater;

	@FindBy(xpath = "//*[@id='saveBtn']")
	@CacheLookup
	WebElement clickOnEmploymentBtn;

	// Education to Employment Gap
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/textarea")
	@CacheLookup
	WebElement txtGapReason;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement clickOnSubmitGapBtn;

	// Case Preview--Step 4 - Case Preview
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/form/div[2]/div[2]/button")
	@CacheLookup
	WebElement clickOnPreviewSubmitBtn;

	// Action Methods for the Login
	public void candidateLogin(String uname, String pwd) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		try {
			clickOnInstructionPopupCrossBtn.click();
		} catch (Exception e) {
			//System.out.println("Entered catch block!");
		}
	}
	
	public String verifyDashboardCandidateSummaryText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateSummaryText));
		return verifyCandidateSummaryText.getText();
	}

	// Authorization --Step 3 - Candidate Summary
	public void candidateAuthorization() throws InterruptedException {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", verifyText);
		Thread.sleep(3000);
		checkConcentCheckBox.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkAgreeCheckBox));
		checkAgreeCheckBox.click();
		Thread.sleep(1000);
		Actions actionBuilder = new Actions(ldriver);
		Action drawAction = actionBuilder.moveToElement(ldriver.findElement(By.xpath("//div[@id='signatureparent']")))
				.clickAndHold().moveByOffset(-50, 60).moveByOffset(-60, -70).moveByOffset(150, 60)
				.moveByOffset(-60, -70).doubleClick().build();
		drawAction.perform();
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}

	// National Identity--Step 3 - Candidate Summary
	public void candidateIdentity(String nameDoc, String docNumber) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkBoxNoPanCard));
		checkBoxNoPanCard.click();

		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		clickOnCnfPopupcheckBoxNoPanCard.click();
		Thread.sleep(2000);
		ldriver.navigate().refresh();
		Thread.sleep(2000);
		Select documentType = new Select(selectDocumentType);
		documentType.selectByIndex(2);
		// uploadDocumentFrontEnd.sendKeys(document);
		txtNameAsPerDocument.sendKeys(nameDoc);
		txtDocumentNumber.sendKeys(docNumber);
		clickOnIdentityContinueBtn.click();
		Thread.sleep(1000);
	}

	// Profile --Step 3 - Candidate Summary
	public void candidateProfile(String altMobileNo, String fatherName) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectPrefixName));
		Select prefixName = new Select(selectPrefixName);
		prefixName.selectByIndex(5);
		txtAlternateMobileNo.clear();
		txtAlternateMobileNo.sendKeys(altMobileNo);
		//checkRadioBtn.click();
		Select genderName = new Select(selectGenderName);
		genderName.selectByIndex(1);
		clickOnProfileContinueBtn.click();
		Thread.sleep(1000);
	}

	// ADDRESS(Current Address Details)--Step 3 - Candidate Summary
	public void condidateAddress(String flat, String colony, String residingForm, String pinCode,String state,String city, String station,
			String houseNo, String locality, String residingFormDate, String pinCodePer,String statePer,String cityPer, String policeStation,
			String AddressProof) throws InterruptedException, ParseException {

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
		try {
			selectWithinIndia.click();
		} catch (StaleElementReferenceException e) {
			selectWithinIndia.click();
		}
		txtFlat_House.clear();
		txtFlat_House.sendKeys(flat);
		txtColonyName.clear();
		txtColonyName.sendKeys(colony);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingForm);
		clickOnResidingForm.sendKeys(residingForm);
		// checkBoxTillDate.clear();
		checkBoxTillDate.click();
		txtPinCode.clear();
		txtPinCode.sendKeys(pinCode);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtStateName.clear();
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Del'", txtStateName);
		txtStateName.sendKeys(state);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Delhi'", txtCityName);
		txtCityName.clear();
		txtCityName.sendKeys(city);
		txtPoliceStation.clear();
		txtPoliceStation.sendKeys(station);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkWithinIndiaRadioBtn);
		// Add Documents
		// uploadAddressProof.sendKeys(document);
		// Is your current address or any of the above mentioned address same as
		// Permanent Address
		// addressSameasPermanentAddress.click();

		// Permanent Address Details
		try {
			checkWithinIndiaRadioBtn.click();
		} catch (StaleElementReferenceException e) {
			selectWithinIndia.click();
		}
		txtHouseNo.clear();
		txtHouseNo.sendKeys(houseNo);
		txtLocality.clear();
		txtLocality.sendKeys(locality);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingFormDate);
		clickOnResidingFormDate.sendKeys(residingFormDate);
		selectTillDate.click();
		txtPinCodePer.clear();
		txtPinCodePer.sendKeys(pinCode);
		txtCityNamePer.sendKeys(cityPer);
		Thread.sleep(2000);
		//Adding headless code
				WebElement xWL = ldriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]"));
				Actions xAct = new Actions(ldriver);
				xAct.moveToElement(xWL).build().perform();
		//txtStateNamePer.clear();
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Del'", txtStateNamePer);
		//txtStateNamePer.sendKeys(statePer);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Delhi'", txtCityNamePer);
		txtCityNamePer.clear();
		txtCityNamePer.sendKeys(cityPer);
		txtPoStation.clear();
		txtPoStation.sendKeys(policeStation);
		// uploadAddressProofPermanent.sendKeys(AddressProof);
		clickOnAddressContinueBtn.click();
		Thread.sleep(1000);
	}

	// Education Details--Step 3 - Candidate Summary
	public void candidateEducation(String qualification, String university, String intitu, String institute,
			String instituteLocation, String enrollmentNo, String paercentage, String batchStartDate,
			String clkOnEndYear, String remark) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectQualificationDegree));
		Select degree = new Select(selectQualificationDegree);
		degree.selectByIndex(2);
		txtQualification.clear();
		txtQualification.sendKeys(qualification);
		txtUniversityBoard.clear();
		txtUniversityBoard.sendKeys(university);
		clickOnIntituteField.click();
		txtIntituteName.sendKeys(intitu);
		clickOnIntituteName.click();
		Thread.sleep(1000);
		txtInstituteLocation.clear();
		txtInstituteLocation.sendKeys(instituteLocation);
		Select modeOfQualification = new Select(selectModeOfQualification);
		modeOfQualification.selectByIndex(3);
		txtEnrollmentNo.clear();
		txtEnrollmentNo.sendKeys(enrollmentNo);
		txtGrade_Percentage.clear();
		txtGrade_Percentage.sendKeys(paercentage);

		// Batch Start Date
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnBatchStartDate);
		clickOnBatchStartDate.sendKeys(batchStartDate);

		// End Year
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnEndYear);
		clickOnEndYear.clear();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='06/2014'", clickOnEndYear);
		// clickOnEndYear.sendKeys(clkOnEndYear);
		txtRemark.clear();
		txtRemark.sendKeys(remark);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkBoxDocumentLater);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkBoxDocumentLater);
		//checkBoxDocumentLater.click();
		clickOnEducationContinueBtn.click();
		Thread.sleep(1000);
	}

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	public void candidateEmployment(String compName, String designation, String location, String compMobileNo,
			String addressComp, String dept, String dateOfJoining, String responsibilities, String remark,
			String salaryCTC, String empCode, String gradeBand, String reason, String uanNumber, String firstName,
			String middleName, String lastName, String designationName, String contactNumber, String emailId,
			String hrFirstName, String hrMiddleName, String hrLastName, String hrDesignation, String hrCompanyName,
			String hrContactName, String hrEmail) throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(employedInCompany));
		employedInCompany.click();
		checkOnPayroll.click();
//		txtCompanyName.clear();
//		txtCompanyName.sendKeys(compName);
//		JavaScriptManuplator.javaScriptExecutor(txtCompanyName, "arguments[0].value='Aga'", ldriver);
//		txtCompanyName.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		txtCompanyName.click();
		Thread.sleep(1000);
		currentEmployeSearchField.sendKeys(compName);
		Thread.sleep(2000);
		clickOnOtherName.click();
		txtDesignation.clear();
		txtDesignation.sendKeys(designation);
		txtLocation.clear();
		txtLocation.sendKeys(location);
		txtCompanyMobileNo.clear();
		txtCompanyMobileNo.sendKeys(compMobileNo);
		Thread.sleep(2000);
		txtAddressoftheCompany.clear();
		txtAddressoftheCompany.sendKeys(addressComp);
		Select employmentType = new Select(selectEmploymentType);
		employmentType.selectByIndex(2);
		Select natureOfEmployment = new Select(selectNatureOfEmployment);
		natureOfEmployment.selectByIndex(1);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='raju.yadav@authbridge.com'", txtCorporateEmailId);
		txtDepartment.clear();
		txtDepartment.sendKeys(dept);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnDateOfJoining);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnDateOfJoining);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDateOfJoining));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='10-01-2019'", clickOnDateOfJoining);
		//clickOnDateOfJoining.sendKeys(dateOfJoining);
		clickOnTillDate.click();
		txtResponsibilities.clear();
		txtResponsibilities.sendKeys(responsibilities);
		txtRemarks.clear();
		txtRemarks.sendKeys(remark);
		Select salaryCurrency = new Select(selectSalaryCurrency);
		salaryCurrency.selectByIndex(1);
		Select salaryCycle = new Select(selectSalaryCycle);
		salaryCycle.selectByIndex(2);
		txtSalaryCTC.clear();
		txtSalaryCTC.sendKeys(salaryCTC);
		txtEmaployeeCode.clear();
		txtEmaployeeCode.sendKeys(empCode);
		txtGradeBond.clear();
		txtGradeBond.sendKeys(gradeBand);
		txtReasonForLeaving.clear();
		txtReasonForLeaving.sendKeys(reason);
		txtUanNumber.clear();
		txtUanNumber.sendKeys(uanNumber);
		Thread.sleep(4000);

		// Other Information--REPORTING MANAGER DETAILS
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtFirstName);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtFirstName));
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Raju'", txtFirstName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Kumar'", txtMiddleName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Kumar'", txtLastName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='QA'", txtDesignationName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='7042718794'", txtContactNumber);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='rajuyadav0556@gmail.com'", txtEmailId);
		
		// Can we connect with your reporting manager for reference check now?
		checkBox.click();
		// Is the Reporting Manager still a part of company?
		checkBoxYes.click();
		
		// HR DETAILS
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtHrFistName);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrFistName));
		txtHrFistName.clear();
		txtHrFistName.sendKeys(hrFirstName);
		txtHrMiddleName.clear();
		txtHrMiddleName.sendKeys(hrMiddleName);
		txtHrLastName.clear();
		txtHrLastName.sendKeys(hrLastName);
		txtHrDesignation.clear();
		txtHrDesignation.sendKeys(hrDesignation);
		txtHrCompanyName.clear();
		txtHrCompanyName.sendKeys(hrCompanyName);
		txtHrContactName.clear();
		txtHrContactName.sendKeys(hrContactName);
		txtHrEmail.clear();
		txtHrEmail.sendKeys(hrEmail);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkHrdocumentLater);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkHrdocumentLater));
		// Add Document(s)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkHrdocumentLater);
		//checkHrdocumentLater.click();
		Thread.sleep(1000);
	}

	// Previous Employment Details--
	public void candidatePreviousEmployment(String preComp, String designation, String city, String mobileNo,
			String addressComp, String dept, String previousJoining, String role, String remarks, String salCurrency,
			String empCode, String grade, String reason, String uanNo, String managerFname, String managerMname,
			String managerLname, String managerDesignation, String managerMobileNo, String managerEmail, String hrFname,
			String hrMname, String hrLname, String hrDesig, String hrCompName, String hrContactNumber, String hrEmail,
			String prevDate, String gapReason) throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkEmployedRadioBtn));
		checkEmployedRadioBtn.click();
		checkRadioPayrollBtn.click();
		txtPreviousCompName.click();
		Thread.sleep(1000);
		searchField.sendKeys(preComp);
		Thread.sleep(2000);
		otherField.click();
		txtPreviousDesignation.clear();
		txtPreviousDesignation.sendKeys(designation);
		txtPreviousCity.clear();
		txtPreviousCity.sendKeys(city);
		txtPreviousMobileNo.clear();
		txtPreviousMobileNo.sendKeys(mobileNo);
		txtPreviousAddressComp.clear();
		txtPreviousAddressComp.sendKeys(addressComp);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(selectPreviousEmploymentType, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		Select previousEmploymentType = new Select(selectPreviousEmploymentType);
		previousEmploymentType.selectByIndex(2);
		Select previousNatureEmp = new Select(selectPreviousNatureEmp);
		previousNatureEmp.selectByIndex(1);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='raju.yadav@authbridge.com'", txtPreviousCorporateEmail);
		
		txtPreviousDepartment.clear();
		txtPreviousDepartment.sendKeys(dept);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousJoining);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousJoining));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnPreviousJoining);
		//js = (JavascriptExecutor) ldriver;
		//js.executeScript("arguments[0].click();", clickOnPreviousJoining);

		// Previous Leaving Date
		clickOnPreviousJoining.sendKeys(previousJoining);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnPreviousLeaving);
		clickOnPreviousLeaving.sendKeys(prevDate);
		txtPreviousRole.clear();
		txtPreviousRole.sendKeys(role);
		txtPreviousRemarks.clear();
		txtPreviousRemarks.sendKeys(remarks);
		Select salaryCurrency = new Select(selectPreviousSalaryCurrency);
		salaryCurrency.selectByIndex(1);
		Select previousSalaryCycle = new Select(selectPreviousSalaryCycle);
		previousSalaryCycle.selectByIndex(2);
		txtPreviousSalaryCtc.clear();
		txtPreviousSalaryCtc.sendKeys(salCurrency);
		txtPreviousEmpCode.clear();
		txtPreviousEmpCode.sendKeys(empCode);
		txtPreviousGrade.clear();
		txtPreviousGrade.sendKeys(grade);
		txtPreviousReasonLeaving.clear();
		txtPreviousReasonLeaving.sendKeys(reason);
		txtPreviousUanNo.clear();
		txtPreviousUanNo.sendKeys(uanNo);
		Thread.sleep(4000);
		
		// Other Information--REPORTING MANAGER DETAILS
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtManagerMiddleName);
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtManagerFirstName));
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Abhishek'", txtManagerFirstName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Kumar'", txtManagerMiddleName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Singh'", txtManagerLastName);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Project Manager'", txtManagerDesignation);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='7042718794'", txtManagerMobileNo);
		
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='abhishek@agamitechnologies.com'", txtManagerEmailId);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDontKnow);
		//clickOnDontKnow.click();
		// Can we connect with your reporting manager for reference check now?
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkRadioBtnManagerYes);
		//checkRadioBtnManagerYes.click();
		// Is the Reporting Manager still a part of company?
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ckeckRadioBtnManagerYes);
		//ckeckRadioBtnManagerYes.click();

		// HR DETAILS
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtHrFirstName);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrFirstName));
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Manish'", txtHrFirstName);
		//txtHrFirstName.clear();
		//txtHrFirstName.sendKeys(hrFname);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Kumar'", txtHrMiddleN);
		//txtHrMiddleN.clear();
		//txtHrMiddleN.sendKeys(hrMname);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Singh'", txtHrLastN);
		//txtHrLastN.clear();
		//txtHrLastN.sendKeys(hrLname);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Human Resource'", txtHrDesig);
		//txtHrDesig.clear();
		//txtHrDesig.sendKeys(hrDesig);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='Agami Technologies'", txtHrCompanyN);
		//txtHrCompanyN.clear();
		//txtHrCompanyN.sendKeys(hrCompName);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='8009744341'", txtHrContactNumber);
		//txtHrContactNumber.clear();
		//txtHrContactNumber.sendKeys(hrContactNumber);
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='manish@agamitechnologies.com'", txtHrEmailId);
		//txtHrEmailId.clear();
		//txtHrEmailId.sendKeys(hrEmail);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkDocumentLater);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkDocumentLater));
		// Add Document(s)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkDocumentLater);
		//checkDocumentLater.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnEmploymentBtn));
		clickOnEmploymentBtn.click();
		Thread.sleep(1000);
		try {
			txtGapReason.clear();
			txtGapReason.sendKeys(gapReason);
			clickOnSubmitGapBtn.click();
		} catch (Exception e) {
			//System.out.println("Entered in to the catch block");
		}
	}

	// Education to Employment Gap
	public void candidateCasePreview() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviewSubmitBtn));
		clickOnPreviewSubmitBtn.click();
		Thread.sleep(1000);
	}
}
