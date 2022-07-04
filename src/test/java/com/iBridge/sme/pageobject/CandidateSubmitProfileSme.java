package com.iBridge.sme.pageobject;

import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CandidateSubmitProfileSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CandidateSubmitProfileSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Logout SME User account Login Details
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[2]/li[1]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnSmeUserNameProfile;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement clickOnLogoutBtn;

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

	@FindBy(xpath = "//div[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement verifyDashboardText;

	// Get Payment Pending Count Number
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")
	@CacheLookup
	WebElement getPaymentPendingCountNo;

	// INSTRUCTIONS TO FILL BACKGROUND VERIFICATION FORM
	@FindBy(xpath = "//*[@id='instruction-popup']/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopupCrossBtn;

	// Instructions to Fill Background Verification Form
	@FindBy(xpath = "//div[contains(text(),'Instructions to Fill Background Verification Form')]")
	@CacheLookup
	WebElement verifyInstructionsFillBackgroundText;

	// SME Candidate Profile Details
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	@CacheLookup
	WebElement clickOnContinueBtn;

	@FindBy(xpath = "//input[@id='father-name']")
	@CacheLookup
	WebElement txtCandidateFatherName;

	@FindBy(xpath = "//label[contains(text(),'Male')]")
	@CacheLookup
	WebElement clickOnCandidateGenderRadioBtn;

	@FindBy(xpath = "//input[@id='date-of-birth']")
	@CacheLookup
	WebElement txtCandidateDateOfBirth;

	@FindBy(xpath = "//input[@id='place-of-birth']")
	@CacheLookup
	WebElement txtCandidatePlaceOfBirth;

	@FindBy(xpath = "//input[@id='alternate-mobile-no']")
	@CacheLookup
	WebElement txtCandidateAlternateMobileNo;

	@FindBy(xpath = "//input[@id='emergency-contact-person']")
	@CacheLookup
	WebElement txtCandidateEmergencyContactPerson;

	@FindBy(xpath = "//select[@id='relationship-with-person']")
	@CacheLookup
	WebElement selectCandidateRelationshipWithPerson;

	@FindBy(xpath = "//input[@id='emergency-contact-number']")
	@CacheLookup
	WebElement txtCandidateEmergencyContactNumber;

	@FindBy(xpath = "//button[@id='submitFormId']")
	@CacheLookup
	WebElement clickOnSaveAndContinueBtn;

	// Current Address Verification-- Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPinCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtStateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtCityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHouseNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtStreetNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPoliceStation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtResidingFromDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtResidingToDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[1]/label[1]")
	WebElement clickedCheckboxTillDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/button[1]")
	WebElement clickOnSaveContinueBtn;

	// Permanent Address Verification --Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPermanentPinCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPermanentState;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtPermanentCity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtFloorNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtColony;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPoliceStationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPerResidingFromDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPerResidingToDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[5]/div[2]/div[1]/div[1]/label[1]")
	WebElement clickOnPerTillDate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/button[1]")
	WebElement clickOnPerSaveAndContinueBtn;

	// Education Details-- Candidate Profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnIsEductionRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectBatchStartYear;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectEndYear;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtEnrollmentNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[4]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPercentage;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtConfirmEnrollmentNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectModeOfEduction;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectYearOfPassing;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnCourseCompletedRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[9]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCollegeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[9]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtCourseName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtLocationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'I will provide the document later')]")
	WebElement checkedCheckBoxDocumentLater;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Continue')]")
	WebElement clickOnEductionSaveSubmitBtn;

	// Current Employment Verification-- Employment Details
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnEmploymentInCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnPayrollDirect;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCompanyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDesignationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtCurrentCityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtContactNoOfCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement txtCompleteAddressOfComapny;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDateOfJoining;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDateOfLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[8]/div[2]/div[1]/label[1]")
	WebElement clickOnTillDateRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectEmploymentType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[9]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectNatureOfEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDepartmentName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectSalaryCycleType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtSalaryCycle;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtEmployeeCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[11]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtGradeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[13]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReasonForLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[13]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtGapEmploymentDetail;

	// Sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/form/div[14]/div/div[8]/div/label")
	WebElement clickOnProvideDocumentLaterRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[15]/div[1]/div[1]/button[1]")
	WebElement clickOnEmploymentSaveContinueBtn;

	// Reporting Manager Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingManagerRefRadioBtn;

	// Is the Reporting Manager still a part of company?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[5]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtConatactNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[7]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[10]/div[1]/div[1]/button[1]")
	WebElement clickOnPreviousSaveContinueBtn;

	// HR Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtHrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtHrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrCompanyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtHrMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtHrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[7]/div[1]/div[1]/button[1]")
	WebElement clickOnHrSaveContinueBtn;

	// Previous Employment Verification--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnWorkStatusRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnEmployedCompanyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousComapnyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtContactNumberCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement txtPreviousAddressCompany;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDateOfJoining;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDateOfLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectPreviousEmpType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[9]/div[2]/div[1]/div[1]/select[1]")
	WebElement selectPreviousNatureOfEmp;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousDepartmentName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement selectPreviousSalaryType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtPreviousSalary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousEmpCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[11]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPreviousGradeName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[13]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPreviousReasonForLeaving;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[13]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtPreviousGapEmp;

	// sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/form/div[14]/div/div[8]/div/label")
	WebElement clickOnPreviousDocumentLaterCheckBox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[15]/div[1]/div[1]/button[1]")
	WebElement clickOnPreviousSaveContinuBtn;

	// Reporting Manager Details--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingManagerRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnReportingMangrRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMangrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[5]/div[3]/div[1]/div[1]/input[1]")
	WebElement txtMangrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrConatctNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/div[1]/input[1]")
	WebElement txtMangrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtMangrBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[10]/div[1]/div[1]/button[1]")
	WebElement clickOnMangrSaveContinueBtn;

	// HR Details --
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement txthrMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
	WebElement txthrLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrComapnyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txthrMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[6]/div[2]/div[1]/div[1]/input[1]")
	WebElement txthrEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/form[1]/div[7]/div[1]/div[1]/button[1]")
	WebElement clickOnhrSaveContinueBtn;

	// Professional Reference Details--
	// REFERENCE 1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnPeerReferenceLevel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefMobile;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtPeerRefBestTimeToReach;

	// REFERENCE 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	WebElement clickOnSeniorReferenceLevel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefMobile;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[6]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtSeniorRefBestTimeToReach;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Continue')]")
	WebElement clickOnReferenceSaveContinueBtn;

	// Personal Reference Details-- REFERENCE 1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRelationshipWithReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtReferenceEmailId;

	// Personal Reference Details-- REFERENCE 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefRelationshipName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement txtRefEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Continue')]")
	WebElement clickOnPersonalSaveContinueBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement clickOnContinueButton;

	// Verify --Authorization Release Note
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Authorization Release Note')]")
	WebElement verifyAuthorizationReleaseNoteText;

	// Verify --Authorization Release Note
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/canvas[1]")
	WebElement candidateSignatureAuth;

	// Verify --Authorization Release Note
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitFormId']")
	WebElement clickOnAuthAndSubmitBtn;

	// Thank you for completing your profile
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you for completing your profile')]")
	WebElement verifyThankYouCompletingProfileText;

	// Payment Pending Cases-- Initiate Via Candidate Case
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Payment Pending')]")
	WebElement clickOnPaymentPendingName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]/input[1]")
	WebElement checkCheckBoxPaymentPendingCases;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='formSubmitId']")
	WebElement clickOnContinueOnPayBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='paySubmitBtn']")
	WebElement clickOnClickHereToPayCaseInitiation;

	// Verify-- Thank you for completing payment
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you for completing payment')]")
	WebElement verifyThankYouCompletedPaymentText;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashBoardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Total Cases Sent')]")
	WebElement clickOnTotalCasesSentBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement getSmeArsNumberIvc;

	// Verify-- Total Case Sent- Candidate Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/a[1]")
	WebElement verifyCandidateName;

	// Verify Form Submitted Bucket--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Form Submitted')]")
	WebElement clickOnFormSubmittedBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	WebElement verifyCandidateFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement copyArsNumberFormSubmitted;

	// Verify Payment pending Bucket--Total Cases Raised
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashboardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Cases Raised')]")
	WebElement clickOnTotalCasesRaised;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Payment Pending')]")
	WebElement clickOnPaymentPendingBucket;

	// Verify -- Payment Pending Cases - No Record Found!
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Record Found!')]")
	WebElement verifyNoRecordFoundText;

	// Work In Progress Bucket to be checked
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'WIP')]")
	WebElement clickOnWorkInProgressBucket;

	// Verify-- Work In Progress Candidate Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/a[1]")
	WebElement verifyWipCandidateName;

	// Logout SME User account Login Details
	public void smeUserAccountLogout() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSmeUserNameProfile));
		clickOnSmeUserNameProfile.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		// clickOnLogoutBtn.click();
		Thread.sleep(1000);
	}

	// Action Methods for the SME Login Details
	public void candidateSmeLogin(String uname, String pwd) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		try {
			clickOnInstructionPopupCrossBtn.click();
		} catch (Exception e) {
			// System.out.println("Entered catch block!");
		}
	}

	// Instructions to Fill Background Verification Form
	public String verifyInstructionsFillBackgroundMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyInstructionsFillBackgroundText));
		return verifyInstructionsFillBackgroundText.getText();
	}

	// SME Candidate Profile Details
	public void candidateSmeProfileDetails(String fatherName, String dateOfBirth, String placeOfBirth,
			String alternateNo, String emergencyContact, String emergencyNumber) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueBtn));
		clickOnContinueBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtCandidateFatherName));
		txtCandidateFatherName.sendKeys(fatherName);
		clickOnCandidateGenderRadioBtn.click();
		txtCandidateDateOfBirth.sendKeys(dateOfBirth);
		txtCandidatePlaceOfBirth.sendKeys(placeOfBirth);
		txtCandidateAlternateMobileNo.sendKeys(alternateNo);
		txtCandidateEmergencyContactPerson.sendKeys(emergencyContact);

		Select candidateRelationshipWithPerson = new Select(selectCandidateRelationshipWithPerson);
		candidateRelationshipWithPerson.selectByIndex(2);
		txtCandidateEmergencyContactNumber.sendKeys(emergencyNumber);
		clickOnSaveAndContinueBtn.click();
		Thread.sleep(1000);
	}

	// Current Address Verification-- Address Details
	public void currentCandidateAddressVerificationDetails(String pinCode, String state, String city,
			String houseNumber, String streetNumber, String policeStation, String residingFromDate,
			String residingToDate) throws InterruptedException {
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
	public void permanentCandidateAddressVerificationDetails(String perPinCode, String perState, String perCity,
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
	public void educationcandidateDetails(String enrollNo, String percentage, String confirmEnroll, String collegeName,
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
	public void currentCandidateEmploymentVerificationDetails(String companyName, String designation, String cityName,
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
	public void previousCandidateEmploymentVerification(String preCompany, String preDesignation, String preLocation,
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
		wait = new WebDriverWait(ldriver, 60);
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
	public void professionalCandidateReferenceDetails(String peerRefName, String peerRefDesig, String peerRefMobile,
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
	public void personalCandidateReferenceDetails(String refName, String refRelationshipName, String refMobileNo,
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

	// Verify-- Authorization Release Note
	public String verifyAuthorizationReleaseNoteTextMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyAuthorizationReleaseNoteText));
		return verifyAuthorizationReleaseNoteText.getText();
	}

	// Authorization Release Note
	public void candidateAuthorizationReleaseNote() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyAuthorizationReleaseNoteText));

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", candidateSignatureAuth);
		Thread.sleep(1000);
		Actions actionBuilder = new Actions(ldriver);
		Action drawAction = actionBuilder
				.moveToElement(ldriver.findElement(By.xpath(
						"/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/canvas[1]")))
				.clickAndHold().moveByOffset(-50, 60).moveByOffset(-60, -70).moveByOffset(150, 60)
				.moveByOffset(-60, -70).doubleClick().build();
		drawAction.perform();
		Thread.sleep(1000);
		clickOnAuthAndSubmitBtn.click();
		Thread.sleep(3000);
	}

	// Thank you for completing your profile
	public String verifyThankYouCompletingProfileMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyThankYouCompletingProfileText));
		return verifyThankYouCompletingProfileText.getText();
	}

	public void clickOnSmeDashboardModule() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyDashboardText));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", verifyDashboardText);
	}

	public String getPaymentPendingCountNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(getPaymentPendingCountNo));
		return getPaymentPendingCountNo.getText();
	}

	// Payment Pending Cases-- Initiate Via Candidate Case
	public void candidatePaymentPendingCases() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPaymentPendingName));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPaymentPendingName);
		// Payment Pending Cases- CheckBox
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkCheckBoxPaymentPendingCases));
		checkCheckBoxPaymentPendingCases.click();
		clickOnContinueOnPayBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnClickHereToPayCaseInitiation));
		clickOnClickHereToPayCaseInitiation.click();
		Thread.sleep(1000);
	}

	// Verify-- Thank you for completing payment
	public String verifyThankYouCompletedPaymentMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyThankYouCompletedPaymentText));
		return verifyThankYouCompletedPaymentText.getText();
	}

	public void appearingInTotalCaseSentList() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashBoardModule));
		clickOnDashBoardModule.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesSentBucket));
		clickOnTotalCasesSentBucket.click();
		Thread.sleep(1000);
	}

	// Verify-- Total Case Sent- Candidate Name
	public String verifyCandidateFirstNameIvcCase() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateName));
		return verifyCandidateName.getText();
	}

	// Verify Form Submitted Bucket--
	public void formSubmittedBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesRaised));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesRaised);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnFormSubmittedBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnFormSubmittedBucket);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(copyArsNumberFormSubmitted));
		Thread.sleep(1000);
		try {
			File output = new File("getIvcCaseArs.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(copyArsNumberFormSubmitted.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	// Verify Candidate Name in Form Submitted list.
	public String verifyCandidateFirstName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFirstName));
		return verifyCandidateFirstName.getText();
	}

	// Verify Payment Pending Cases Bucket-- No Record Found!
	public void paymentPendingBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesRaised));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesRaised);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPaymentPendingBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPaymentPendingBucket);
		Thread.sleep(1000);
	}

	// Verify -- Payment Pending Cases - No Record Found!
	public String verifyPaymentPendingCasesMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNoRecordFoundText));
		return verifyNoRecordFoundText.getText();
	}

	// Work In Progress Bucket to be checked
	public void workInProgressBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnWorkInProgressBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnWorkInProgressBucket);
		Thread.sleep(1000);
	}

	// Verify-- Work In Progress Candidate Name
	public String verifyWipCandidateFullName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWipCandidateName));
		return verifyWipCandidateName.getText();
	}
}
