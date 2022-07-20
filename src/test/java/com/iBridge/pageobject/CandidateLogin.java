package com.iBridge.pageobject;

import java.awt.Robot;
import java.text.ParseException;
import java.util.List;

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

public class CandidateLogin {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public CandidateLogin(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the iBridge Portal
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

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/label[1]/input[2]")
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
	WebElement inputCompanyName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-results__option select2-results__option--highlighted']")
	WebElement companyNameOther;

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

	// Adding New Locator for Corporate Email Id
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtCorporateEmailId;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[5]/div/input")
	@CacheLookup
	WebElement txtDepartment;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[6]/div/input")
	@CacheLookup
	WebElement clickOnDateOfJoining;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[6]/div/input")
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

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
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
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[1]/div/h4")
	@CacheLookup
	WebElement verifyTextReferenceCheckNow;

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

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/div/span[1]/span[1]/span")
	@CacheLookup
	WebElement txtPreviousCompName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-results__option select2-results__option--highlighted']")
	WebElement preOtherButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='select2-search__field']")
	WebElement preSearchField;

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

	// Adding New Locator for Corporate Email Id
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousCorporateEmailId;

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
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[1]/div/h4")
	@CacheLookup
	WebElement verifyTextReferenceCheckNowPrevious;

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

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[3]/span")
	@CacheLookup
	WebElement clickOnDontKnow;

	// Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[1]/div/label[2]/input")
	@CacheLookup
	WebElement checkRadioBtnManagerYes;

	// Is the Reporting Manager still a part of company?
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[2]/input")
	@CacheLookup
	WebElement ckeckRadioBtnPartManagerYes;

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
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='pacakgeSubmitForm']")
	WebElement clickOnCasePreviewSubmitBtn;
	
	// Confirm--  All the details will be submitted and you will not be able to make changes later. Please review your form and submit
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@class='btn btn-default'])[1]")
	WebElement clickOnConfirmAlertOkBtn;

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
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		try {
			Thread.sleep(1000);
			clickOnInstructionPopupCrossBtn.click();
		} catch (Exception e) {

		}
	}

	public String verifyDashboardCandidateSummaryText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateSummaryText));
		return verifyCandidateSummaryText.getText();
	}

	// Authorization --Step 3 - Candidate Summary
	public void candidateAuthorization() throws InterruptedException {
		
		WebDriverWait wait =new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.invisibilityOf(verifyText));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", verifyText);
		Thread.sleep(5000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkConcentCheckBox));
		JavaScriptManuplator.javaScriptExecutor(checkConcentCheckBox, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(checkAgreeCheckBox, "arguments[0].click()", ldriver);
		//checkConcentCheckBox.click();
		//checkAgreeCheckBox.click();
		Thread.sleep(1000);
		Actions actionBuilder = new Actions(ldriver);
		Action drawAction = actionBuilder.moveToElement(ldriver.findElement(By.xpath("//div[@id='signatureparent']")))
				.clickAndHold().moveByOffset(-50, 60).moveByOffset(-60, -70).moveByOffset(150, 60)
				.moveByOffset(-60, -70).doubleClick().build();
		drawAction.perform();
		Thread.sleep(3000);
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}

	// National Identity--Step 3 - Candidate Summary
	public void candidateIdentity(String nameDoc, String docNumber) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkBoxNoPanCard));
		checkBoxNoPanCard.click();
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCnfPopupcheckBoxNoPanCard));
		clickOnCnfPopupcheckBoxNoPanCard.click();
		Thread.sleep(2000);
		ldriver.navigate().refresh();
		Select documentType = new Select(selectDocumentType);
		documentType.selectByIndex(2);
		txtNameAsPerDocument.sendKeys(nameDoc);
		txtDocumentNumber.sendKeys(docNumber);
		Thread.sleep(1000);
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
		Select genderName = new Select(selectGenderName);
		genderName.selectByIndex(1);
		txtFatherName.clear();
		txtFatherName.sendKeys(fatherName);
		clickOnProfileContinueBtn.click();
		Thread.sleep(1000);
	}

	// ADDRESS(Current Address Details)--Step 3 - Candidate Summary
	public void candidateAddress(String flat, String colony, String residingForm, String pinCode, String state,
			String city, String station, String houseNo, String locality, String residingFormDate, String pinCodePer,
			String statePer, String cityPer, String policeStation, String AddressProof)
			throws InterruptedException, ParseException {
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
		// checkBoxTillDate.clear();
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
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkWithinIndiaRadioBtn);
		// Add Documents
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkWithinIndiaRadioBtn));
		// Is your current address or any of the above mentioned address same as
		// Permanent Address
		// addressSameasPermanentAddress.click();
		// Permanent Address Details
		try {
			Thread.sleep(1000);
			checkWithinIndiaRadioBtn.click();
		} catch (StaleElementReferenceException e) {
			selectWithinIndia.click();
		}
//		txtHouseNo.clear();
		txtHouseNo.sendKeys(houseNo);
		txtLocality.clear();
		txtLocality.sendKeys(locality);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingFormDate);
		clickOnResidingFormDate.sendKeys(residingFormDate);
		selectTillDate.click();
		txtPinCodePer.clear();
		txtPinCodePer.sendKeys(pinCode);
		txtCityNamePer.sendKeys(cityPer);
		Thread.sleep(2000);
		// Adding headless code
		WebElement xWL = ldriver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]"));
		Actions xAct = new Actions(ldriver);
		xAct.moveToElement(xWL).build().perform();
		// Thread.sleep(2000);
		// txtStateNamePer.clear();
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Del'", txtStateNamePer);
		// txtStateNamePer.sendKeys(statePer);
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
	public void candidateEducation(String qualification, String university, String intitu, String instituteLocation,
			String enrollmentNo, String paercentage, String batchStartDate, String clkOnEndYear, String remark)
			throws InterruptedException {
		
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
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIntituteName));
		Thread.sleep(1000);
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
		js.executeScript("arguments[0].value='18-01-2021'", clickOnEndYear);
		// clickOnEndYear.sendKeys(clkOnEndYear);
		txtRemark.clear();
		txtRemark.sendKeys(remark);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkBoxDocumentLater);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkBoxDocumentLater));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkBoxDocumentLater);
		// checkBoxDocumentLater.click();
		Thread.sleep(1000);
		clickOnEducationContinueBtn.click();
		Thread.sleep(1000);
	}

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	public void candidateEmployment(String compName, String designation, String location, String compMobileNo,
			String addressComp, String corporateEmail, String dept, String dateOfJoining, String responsibilities,
			String remark, String salaryCTC, String empCode, String gradeBand, String reason, String uanNumber,
			String firstName, String middleName, String lastName, String designationName, String contactNumber,
			String emailId, String hrFirstName, String hrMiddleName, String hrLastName, String hrDesignation,
			String hrCompanyName, String hrContactName, String hrEmail) throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(employedInCompany));
		JavaScriptManuplator.javaScriptExecutor(employedInCompany, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(checkOnPayroll, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		txtCompanyName.click();
		inputCompanyName.sendKeys(compName);
		Thread.sleep(2000);
		companyNameOther.click();
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtDesignation, "arguments[0].value='Quality Analyst'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtLocation, "arguments[0].value='Greater Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCompanyMobileNo, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtAddressoftheCompany, "arguments[0].value='Greater Noida'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectEmploymentType, "Permanent");
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectNatureOfEmployment, "Full Time");
		JavaScriptManuplator.javaScriptExecutor(txtCorporateEmailId, "arguments[0].value='raju.yadav@authbridge.com'",
				ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtDepartment, "arguments[0].value='Information Technologies'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnTillDate, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnDateOfJoining, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnDateOfJoining, "arguments[0].value='10-01-2019'", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTillDate));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnTillDate, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtResponsibilities, "arguments[0].value='Testing software'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtRemarks, "arguments[0].value='Good'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectSalaryCurrency, "India Rupee");
		JavaScriptManuplator.selectOptionFromDropDown(selectSalaryCycle, "Per Annum");
		JavaScriptManuplator.javaScriptExecutor(txtSalaryCTC, "arguments[0].value='600000'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtEmaployeeCode, "arguments[0].value='Agm0035'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtGradeBond, "arguments[0].value='A'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReasonForLeaving, "arguments[0].value='Personal and Career Growth'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtUanNumber, "arguments[0].value='152745675567'", ldriver);
//		txtUanNumber.sendKeys("152745675567");
		Thread.sleep(4000);
		// Other Information--REPORTING MANAGER DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtFirstName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtFirstName, "arguments[0].value='Raju'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtLastName, "arguments[0].value='Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtDesignationName, "arguments[0].value='QA'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtContactNumber, "arguments[0].value='7042718794'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEmailId, "arguments[0].value='rajuyadav0556@gmail.com'", ldriver);
		// Can we connect with your reporting manager for reference check now?
		JavaScriptManuplator.javaScriptExecutor(checkBox, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		// Is the Reporting Manager still a part of company?
		JavaScriptManuplator.javaScriptExecutor(checkBoxYes, "arguments[0].click()", ldriver);
		Thread.sleep(2000);

		// HR DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtHrFistName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrFistName));
		JavaScriptManuplator.javaScriptExecutor(txtHrFistName, "arguments[0].value='Aman'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrLastName, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrDesignation, "arguments[0].value='Human Resource'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrCompanyName, "arguments[0].value='Agami Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrContactName, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrEmail, "arguments[0].value='ajit@agamitechnologies.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkHrdocumentLater, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkHrdocumentLater));
		// Add Document(s)
		JavaScriptManuplator.javaScriptExecutor(checkHrdocumentLater, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Previous Employment Details--
	public void candidatePreviousEmployment(String preComp, String designation, String city, String mobileNo,
			String addressComp, String preCorporateEmail, String dept, String previousJoining, String role,
			String remarks, String salCurrency, String empCode, String grade, String reason, String uanNo,
			String managerFname, String managerMname, String managerLname, String managerDesignation,
			String managerMobileNo, String managerEmail, String hrFname, String hrMname, String hrLname, String hrDesig,
			String hrCompName, String hrContactNumber, String hrEmail, String prevDate, String gapReason)
			throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkEmployedRadioBtn));
		JavaScriptManuplator.javaScriptExecutor(checkEmployedRadioBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(checkRadioPayrollBtn, "arguments[0].click()", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtPreviousCompName, "arguments[0].value='HCL Technologies'", ldriver);
		txtPreviousCompName.click();
		Thread.sleep(1000);
		preSearchField.sendKeys(preComp);
		Thread.sleep(2000);
		preOtherButton.click();
//		preSearchField.sendKeys(Keys.ENTER);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDesignation, "arguments[0].value='Quality Analyst'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCity, "arguments[0].value='Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMobileNo, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousAddressComp, "arguments[0].value='Noida'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(selectPreviousEmploymentType, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousEmploymentType, "Permanent");
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousNatureEmp, "Full Time");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCorporateEmailId,
				"arguments[0].value='raju.yadav@agamitechnologies.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDepartment, "arguments[0].value='Engineering'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousJoining, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousJoining));
		Thread.sleep(1000);
		// Previous Leaving Date
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousJoining, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousJoining, "arguments[0].value='01-11-2014'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousLeaving, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousLeaving, "arguments[0].value='01-11-2020'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousRole, "arguments[0].value='QA'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousRemarks, "arguments[0].value='Good'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousSalaryCurrency, "India Rupee");
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousSalaryCycle, "Per Annum");
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousSalaryCtc, "arguments[0].value='480000'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousEmpCode, "arguments[0].value='Hcl210'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousGrade, "arguments[0].value='A'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousReasonLeaving,
				"arguments[0].value='Personal and Career Growth'", ldriver);
		Thread.sleep(1000);
//		JavaScriptManuplator.javaScriptExecutor(txtPreviousUanNo, "arguments[0].value='152897308323'", ldriver);
		txtPreviousUanNo.sendKeys("152897308322");
		Thread.sleep(4000);

		// Other Information--REPORTING MANAGER DETAIL
		JavaScriptManuplator.javaScriptExecutor(txtManagerFirstName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtManagerFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtManagerFirstName, "arguments[0].value='Abhishek'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerLastName, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerDesignation, "arguments[0].value='Project Manager'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerMobileNo, "arguments[0].value='7042718794'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerEmailId,
				"arguments[0].value='abhishek@agamitechnologies.com'", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDontKnow));
		JavaScriptManuplator.javaScriptExecutor(clickOnDontKnow, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkRadioBtnManagerYes, "arguments[0].click()", ldriver);
		// HR DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtHrFirstName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtHrFirstName, "arguments[0].value='Manish'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrMiddleN, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrLastN, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrDesig, "arguments[0].value='Human Resource'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrCompanyN, "arguments[0].value='Agami Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrContactNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrEmailId, "arguments[0].value='manish@agamitechnologies.com'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkDocumentLater, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkDocumentLater));
		// Add Document(s)
		JavaScriptManuplator.javaScriptExecutor(checkDocumentLater, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnEmploymentBtn, "arguments[0].click()", ldriver);
		Thread.sleep(5000);

		// Submit Button Click
		
		List<WebElement> tag13 = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag13.size(); i++) {
			if (tag13.get(i).getAttribute("name").equals("continue")) {
				System.out.println("Index for I :"+i);
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag13.get(i));
				System.out.println("hii");
				break;
			} 
		}
		
		
		// Confirm- alert Ok Button
		
		Thread.sleep(5000);
		List<WebElement> tag14 = ldriver.findElements(By.tagName("button"));
		tag14.get(15).click();
		System.out.println("alert box has been click");
		
			
//		List<WebElement> tag14 = ldriver.findElements(By.tagName("button"));
//		for (int i = 0; i < tag14.size(); i++) {
//			if (tag14.get(i).getAttribute("class").equals("btn btn-default")) {
//				System.out.println("Index for I :"+i);
//				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
//				executor.executeScript("arguments[0].click();", tag14.get(i));
//				System.out.println("hello");
//				break;
//			} 
//		}
		
		try {
			txtGapReason.clear();
			txtGapReason.sendKeys(gapReason);
			clickOnSubmitGapBtn.click();
		} catch (Exception e) {
			// System.out.println("Entered in to the catch block");
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
