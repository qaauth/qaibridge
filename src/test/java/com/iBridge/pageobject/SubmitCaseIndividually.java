package com.iBridge.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class SubmitCaseIndividually {
	WebDriver ldriver;
	JavascriptExecutor js;
	WebDriverWait wait;
	Robot rbt;

	public SubmitCaseIndividually(WebDriver rdriver) {
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

	// Do It Yourself(DIY)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Submit Case Individually')]")
	WebElement clickOnDiy;

	// Package Selection
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Select')]")
	WebElement clickCheckWiseSelect;

	// CHECK(S) SELECTED
	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][id]")
	WebElement previousEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][count]")
	WebElement txtPreviousEmploymentVerificationCount;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[57][id]")
	WebElement currentAddressVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[58][id]")
	WebElement currentEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[83][id]")
	WebElement educationVerificationW;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customized-check']/li[11]/div/input")
	WebElement txtEucationVerificationWCount;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickContinue;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOkCnfPopup;

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

	// NATIONAL IDENTITY--Step 3 - Candidate Summary
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div[1]/button/img")
	@CacheLookup
	WebElement clickOnInstructionPopup;

	@FindBy(xpath = "//*[@id='no_pan_card']")
	@CacheLookup
	WebElement checkBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnCnfPopupcheckBoxNoPanCard;

	@FindBy(css = "#sub_nid_selected_0")
	@CacheLookup
	WebElement selectDocumentType;

	@FindBy(xpath = "//*[@id='NID_Default_0']/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement uploadDocumentFrontEnd;

	@FindBy(id = "ele_doc_name_0")
	@CacheLookup
	WebElement txtNameAsPerDocument;

	@FindBy(id = "ele_doc_numb_0")
	@CacheLookup
	WebElement txtDocumentNumber;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnIdentityContinueBtn;

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
	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectBridgeLocation;

	@FindBy(xpath = "//*[@id='caseflexfielddata-1']")
	@CacheLookup
	WebElement txtEin;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement clickDateOfJoining;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtDoB;

	@FindBy(name = "CaseFlexFieldData[4]")
	@CacheLookup
	WebElement txtBusinessUnit;

	@FindBy(css = "#caseflexfielddata-5")
	@CacheLookup
	WebElement selectOuG;

	@FindBy(name = "CaseFlexFieldData[6]")
	@CacheLookup
	WebElement txtDesignation;

	@FindBy(name = "CaseFlexFieldData[7]")
	@CacheLookup
	WebElement txtLineManager;

	@FindBy(name = "CaseFlexFieldData[8]")
	@CacheLookup
	WebElement txtRoleCode;

	@FindBy(name = "CaseFlexFieldData[9]")
	@CacheLookup
	WebElement txtLegalEntity;

	@FindBy(name = "CaseFlexFieldData[10]")
	@CacheLookup
	WebElement txtBtEmailId;

	@FindBy(name = "CaseFlexFieldData[11]")
	@CacheLookup
	WebElement txtDateOfProvisionalOffer;

	@FindBy(name = "CaseFlexFieldData[12]")
	@CacheLookup
	WebElement txtRecordId;

	@FindBy(name = "CaseFlexFieldData[13]")
	@CacheLookup
	WebElement txtPanNumber;

	@FindBy(name = "CaseFlexFieldData[14]")
	@CacheLookup
	WebElement selectRecruiterEmailId;

	@FindBy(name = "CaseFlexFieldData[15]")
	@CacheLookup
	WebElement selectRecruiterName;

	@FindBy(name = "CaseFlexFieldData[16]")
	@CacheLookup
	WebElement selectCeGoAheadRequired;

	@FindBy(name = "CaseFlexFieldData[17]")
	@CacheLookup
	WebElement selectBgVSpoc;

	@FindBy(xpath = "//h4[contains(text(),'Additional Field(s)')]")
	@CacheLookup
	WebElement additionalFieldToScroll;

	@FindBy(name = "CaseFlexFieldData[18]")
	@CacheLookup
	WebElement selectBgVSpocEmailId;

	@FindBy(name = "CaseFlexFieldData[19]")
	@CacheLookup
	WebElement txtHrdpName;

	@FindBy(name = "CaseFlexFieldData[20]")
	@CacheLookup
	WebElement txtHrdpEmailId;

	@FindBy(name = "CaseFlexFieldData[21]")
	@CacheLookup
	WebElement txtClientProcessName;

	@FindBy(name = "CaseFlexFieldData[22]")
	@CacheLookup
	WebElement txtCandidateId;

	@FindBy(name = "CaseFlexFieldData[23]")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(xpath = "//button[@id='profileSubmitForm']")
	@CacheLookup
	WebElement clickOnProfileContinueBtn;

	@FindBy(xpath = "//div[contains(text(),'Candidate information saved successfully')]")
	@CacheLookup
	WebElement verifyToastMsg;

	// ADDRESS (Current Address Details)--Step 3 - Candidate Summary
	@FindBy(xpath = "//*[@id='57']/div[2]/div/div/label[1]/span[1]")
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

	@FindBy(xpath = "//*[@id='57']/div[3]/div[4]/div/div[2]/div/label/span")
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

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtHouseNo;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtLocality;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement clickOnResidingFormDate;

	@FindBy(xpath = "/html/body/div[6]/div[1]/table/tbody/tr[6]/td[2]")
	@CacheLookup
	WebElement selectDateResiding;

	@FindBy(css = "#\\31  > div:nth-child(3) > div:nth-child(4) > div > div.col-sm-5.col-md-3.col-lg-5 > div > label > span")
	@CacheLookup
	WebElement selectTillDate;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[1]/div/input")
	@CacheLookup
	WebElement txtPinCodePer;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtStateNamePer;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[3]/div/input[1]")
	@CacheLookup
	WebElement txtCityNamePer;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPoStation;

	@FindBy(id = "filenamesdiv")
	@CacheLookup
	WebElement uploadAddressProofPermanent;

	@FindBy(name = "continue")
	@CacheLookup
	WebElement clickOnAddressContinueBtn;

	// Education(Education Details)--Step 3 - Candidate Summary
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div/select")
	@CacheLookup
	WebElement selectQualificationDegree;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/input[1]")
	@CacheLookup
	WebElement txtQualification;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtUniversityBoard;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[4]/div/span/span[1]/span")
	@CacheLookup
	WebElement clickOnIntituteField;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement txtIntituteName;

	@FindBy(xpath = "//li[contains(text(),'Bundelkhand University, Jhansi')]")
	@CacheLookup
	WebElement clickOnIntituteName;
	
	// Other College Name
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[5]/div/input")
	@CacheLookup
	WebElement txtOtherCollegeName;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement txtInstituteLocation;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div/select")
	@CacheLookup
	WebElement selectModeOfQualification;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtEnrollmentNo;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtGrade_Percentage;

	// Batch Start Date
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement clickOnBatchStartDate;

	// End Year
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[1]/div/div[2]/div/input")
	@CacheLookup
	WebElement clickOnEndYear;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div/input")
	@CacheLookup
	WebElement txtRemark;

	@FindBy(xpath = "//span[contains(text(),'I will provide the document later')]")
	@CacheLookup
	WebElement checkBoxDocumentLater;

	@FindBy(xpath = "//*[@id='saveBtn']")
	@CacheLookup
	WebElement clickOnEducationContinueBtn;

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	@FindBy(xpath = "//*[@id='emp-chk-div']/div[1]/div[2]/div[1]/div/label[1]/span")
	@CacheLookup
	WebElement employedInCompany;

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[2]/span[1]")
	@CacheLookup
	WebElement checkOnPayroll;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement clickOnCurrentCompanyName;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement verifySearchTextField;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtCompanyName;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement txtCurrentCompanyName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtOtherCompanyName;
	
	@FindBy(xpath = "/html/body/span/span/span[2]/ul/li[1]")
	@CacheLookup
	WebElement clickOnOtherName;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtDesignationName;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtLocation;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtCompanyMobileNo;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[1]/div/textarea")
	@CacheLookup
	WebElement txtAddressoftheCompany;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/div/select")
	@CacheLookup
	WebElement selectEmploymentType;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[3]/div/select")
	@CacheLookup
	WebElement selectNatureOfEmployment;
	
	// Corporate Email Id
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtCorporateEmailId;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[5]/div/input")
	@CacheLookup
	WebElement txtDepartment;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[6]/div/input")
	@CacheLookup
	WebElement clickOnDateOfJoining;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[7]/div/input")
	@CacheLookup
	WebElement clickOnDateOfLeaving;

	@FindBy(xpath = "//label[contains(text(),'Till Date')]")
	@CacheLookup
	WebElement clickOnTillDate;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[9]/div/input")
	@CacheLookup
	WebElement txtResponsibilities;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[4]/div[10]/div/input")
	@CacheLookup
	WebElement txtRemarks;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[1]/div/select")
	@CacheLookup
	WebElement selectSalaryCurrency;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[2]/div/div[1]/div/select")
	@CacheLookup
	WebElement selectSalaryCycle;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtSalaryCTC;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[3]/div/div[1]/div/input")
	@CacheLookup
	WebElement txtEmaployeeCode;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[3]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtGradeBond;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[4]/div/input")
	@CacheLookup
	WebElement txtReasonForLeaving;

	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[5]/div[5]/div/input")
	@CacheLookup
	WebElement txtUanNumber;

	//Other Information--REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtMiddleName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement txtDesigName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtContactNumber;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtEmailId;
	
	//Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[3]/div[1]/div/label[2]/input")
	@CacheLookup
	WebElement checkBox;
	
	//Is the Reporting Manager still a part of company?
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[2]/input")
	@CacheLookup
	WebElement checkBoxYes;
	
	//HR DETAILS
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtHrFistName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtHrMiddleName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtHrLastName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtHrDesignation;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtHrCompanyName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtHrContactName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[6]/div/div/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtHrEmail;
	
	// Add Document(s) --Current Employment Details
	@FindBy(css = "custom-upload-control check-docs check-documents error")
	@CacheLookup
	WebElement uploadSalarySlipContainingEmpId;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[2]/div[2]/div[1]/div")
	@CacheLookup
	WebElement uploadAppointmentLetter;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[3]/div[2]/div[1]/div")
	@CacheLookup
	WebElement uploadExperienceLetter;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[4]/div[2]/div[1]/div")
	@CacheLookup
	WebElement salarySlipEmp;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[5]/div[2]/div[1]/div")
	@CacheLookup
	WebElement uploadAppointLetter;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[6]/div[2]/div[1]/div")
	@CacheLookup
	WebElement uploadExpLetter;
	
	//Add Document(s)
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/div[7]/div/div/div[9]/div/div/label/input[2]")
	@CacheLookup
	WebElement checkHrdocumentLater;
	
	//Previous Employment Details--
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/label[1]/input")
	@CacheLookup
	WebElement checkEmployedRadioBtn;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/label[2]/input")
	@CacheLookup
	WebElement checkRadioPayrollBtn;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/div/span/span[1]/span")
	@CacheLookup
	WebElement clickOnPreviousOtherCompName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtPreviousCompName;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement verifyPreviousCompNameSearchTextField;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	@CacheLookup
	WebElement txtEnterCompanyName;
	
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
	@CacheLookup
	WebElement clickOnPreviousOtherName;
	
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousOtherCompName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtPreviousDesignation;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousCity;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtPreviousMobileNo;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[1]/div/textarea")
	@CacheLookup
	WebElement txtPreviousAddressComp;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreviousEmploymentType;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/select[1]")
	@CacheLookup
	WebElement selectPreviousNatureEmp;
	
	// Corporate Email Id
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousCorporateEmail;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[5]/div/input")
	@CacheLookup
	WebElement txtPreviousDepartment;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[6]/div/input")
	@CacheLookup
	WebElement clickOnPreviousJoining;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[7]/div/input")
	@CacheLookup
	WebElement clickOnPreviousLeaving;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(1) > td:nth-child(5)")
	@CacheLookup
	WebElement clickOnPreviousLeavingDate;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[8]/div/input")
	@CacheLookup
	WebElement txtPreviousRole;
	
	@FindBy(xpath = "//html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[9]/div/input")
	@CacheLookup
	WebElement txtPreviousRemarks;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[1]/div/select")
	@CacheLookup
	WebElement selectPreviousSalaryCurrency;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[2]/div/div[1]/div/select")
	@CacheLookup
	WebElement selectPreviousSalaryCycle;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousSalaryCtc;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[3]/div/div[1]/div/input")
	@CacheLookup
	WebElement txtPreviousEmpCode;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[3]/div/div[2]/div/input")
	@CacheLookup
	WebElement txtPreviousGrade;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[4]/div/input")
	@CacheLookup
	WebElement txtPreviousReasonLeaving;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[5]/div[5]/div/input")
	@CacheLookup
	WebElement txtPreviousUanNo;
	
	//Other Information--REPORTING MANAGER DETAILS
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtManagerFirstName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtManagerMiddleName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtManagerLastName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement txtManagerDesignation;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[3]/div/input")
	@CacheLookup
	WebElement txtManagerMobileNo;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[2]/div[4]/div/input")
	@CacheLookup
	WebElement txtManagerEmailId;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[3]/input")
	@CacheLookup
	WebElement clickOnDontKnow;
	
	//Can we connect with your reporting manager for reference check now?
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[1]/div/label[2]/span")
	@CacheLookup
	WebElement checkRadioBtnManagerYes;
	
	//Is the Reporting Manager still a part of company?
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]/div[3]/div[3]/div/label[2]/span")
	@CacheLookup
	WebElement ckeckRadioBtnManagerYes;
	
	//HR DETAILS
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[1]")
	@CacheLookup
	WebElement txtHrFirstName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[2]")
	@CacheLookup
	WebElement txtHrMiddleN;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[1]/div/input[3]")
	@CacheLookup
	WebElement txtHrLastN;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[2]/div/input")
	@CacheLookup
	WebElement txtHrDesig;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[3]/div/input")
	@CacheLookup
	WebElement txtHrCompanyN;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[4]/div/input")
	@CacheLookup
	WebElement txtHrContactNumber;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[6]/div/div/div[3]/div[5]/div/input")
	@CacheLookup
	WebElement txtHrEmailId;
	
	// Add Document(s)--Previous Employment Details
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadSalarySlipEmpId;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadAppointmentLetterPrevious;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement uploadExperienceLetterPrevious;

	//Add Document(s)
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[7]/div/div/div[9]/div/div/label/input[2]")
	@CacheLookup
	WebElement checkDocumentLater;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/button")
	@CacheLookup
	WebElement clickOnEmploymentBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='pacakgeSubmitForm']")
	WebElement clickOnCasePreviewSubmitBtn;
	
	// Confirm--  All the details will be submitted and you will not be able to make changes later. Please review your form and submit
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmAlertOkBtn;

	
	//Education to Employment Gap
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/div[2]/textarea")
	@CacheLookup
	WebElement txtGapReason;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement clickOnSubmitGapBtn;
	
	//Case Preview--Step 4 - Case Preview
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/form/div[2]/div[2]/button")
	@CacheLookup
	WebElement clickOnPreviewSubmitBtn;


	// Action Methods for the Login
	public void login(String uname, String pwd) throws InterruptedException {
		Thread.sleep(2000);
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	// Do It Yourself(DIY)
	public void sidebarExpandBtn() throws InterruptedException {
		Thread.sleep(3000);
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		clickOnDiy.click();
		clickCheckWiseSelect.click();
	}

	public void clickUnCheckWiseSelect(String empCount) {
		List<WebElement> allCheckBoxList = ldriver.findElements(By.className("checkwise-check"));
		System.out.println("Number of elements:" + allCheckBoxList.size());
		int checkBoxSizeList = allCheckBoxList.size();
		for (int i = 0; i < checkBoxSizeList; i++) {
			try {
				if (i == 0 || i == 2) {
					txtPreviousEmploymentVerificationCount.clear();
					txtPreviousEmploymentVerificationCount.sendKeys(empCount);
					continue;
				}
				((WebElement) allCheckBoxList.get(i)).click();
			} catch (Exception e) {
				js = (JavascriptExecutor) ldriver;
				js.executeScript("arguments[0].scrollIntoView(true);", ((WebElement) allCheckBoxList.get(i)));
				((WebElement) allCheckBoxList.get(i)).click();
			}
		}
	}

	public void checkWiseSelect(String count) throws InterruptedException {
		// Clicked on Pan number Verification and Continue button
		educationVerificationW.click();
		txtEucationVerificationWCount.sendKeys(count);
		currentAddressVerification.click();
		currentEmploymentVerification.click();
		clickContinue.click();
		Thread.sleep(1000);
	}

	// AUTHORIZATION--Step 3 - Candidate Summary
	public void authorizationDiy(String document) throws InterruptedException {
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		//wait = new WebDriverWait(ldriver, 60);
		//wait.until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(5000);
		//clickOnOkCnfPopup.click();
		try {
			clickOnInstructionPopup.click();
		} catch (Exception e) {

		}
		Thread.sleep(2000);
		clickUploadDoc.sendKeys(document);
		
		try {
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(verifyDeleteAuthBtn));
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{

		}
		
		//wait = new WebDriverWait(ldriver, 120);
		//wait.until(ExpectedConditions.visibilityOf(verifyDeleteAuthBtn));
		Thread.sleep(1000);
		//checkBoxSendLinktoCandidate.click();
		clickOnAuthContinueBtn.click();
		Thread.sleep(1000);
	}

	// National Identity--Step 3 - Candidate Summary
	public void nationalIdentity(String nameDoc, String docNumber) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='continue']")));
		checkBoxNoPanCard.click();

		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		clickOnCnfPopupcheckBoxNoPanCard.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDocumentType));
		Select documentType = new Select(selectDocumentType);
		documentType.selectByIndex(2);
		txtNameAsPerDocument.sendKeys(nameDoc);
		txtDocumentNumber.sendKeys(docNumber);
		clickOnIdentityContinueBtn.click();
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
		js.executeScript("arguments[0].value='"+email+"'", txtCandidateEmail);
		Thread.sleep(1000);
	}
	
	public void candidateProfile(String candidateDob, String mobileNo,
			String altMobileNo, String fatherName) throws ParseException, InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPrefixName));
		Select prefixName = new Select(selectPrefixName);
		prefixName.selectByIndex(4);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickCandidateDob);
		clickCandidateDob.sendKeys(candidateDob);
		txtCandidateMobileNo.sendKeys(mobileNo);
		txtAlternateMobileNo.sendKeys(altMobileNo);
		//checkRadioBtn.click();
		Select genderName = new Select(selectGenderName);
		genderName.selectByIndex(1);
		txtFatherName.sendKeys(fatherName);
		Thread.sleep(1000);
	}

	// Additional Field(s)--(Candidate Information)
	public void candidateAdditionalInfo(String ein,String dateOfJoining, String dob, String bUnit, String designation, String lMngr,
			String roleCode, String lEntity, String emailId, String dProvision, String recordId, String panNumber,
			String hrdpName, String hrdpEmail, String clientProcess, String candidateId, String address)
			throws ParseException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtBusinessUnit);
		WebElement element = ldriver
				.findElement(By.xpath("//*[@id='mCSB_2_container']/div[2]/div[2]/div[1]/div/label"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectBridgeLocation));
		Select bridgeLocation = new Select(selectBridgeLocation);
		bridgeLocation.selectByIndex(1);
		txtEin.sendKeys(ein);
		//wait = new WebDriverWait(ldriver, 60);
		//wait.until(ExpectedConditions.visibilityOf(clickDateOfJoining));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='18-01-2021'", clickDateOfJoining);
		//clickDateOfJoining.sendKeys(dateOfJoining);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='04-04-1991'", txtDoB);
		//txtDoB.sendKeys(dob);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Unit Bussines'", txtBusinessUnit);
		//txtBusinessUnit.sendKeys(bUnit);
		Thread.sleep(2000);
		//Adding headless code
				WebElement xWL = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/select[1]"));
				Actions xAct = new Actions(ldriver);
				xAct.moveToElement(xWL).build().perform();
				Thread.sleep(1000);
		Select setOuG = new Select(selectOuG);
		setOuG.selectByIndex(2);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='QA'", txtDesignation);
		//txtDesignation.sendKeys(designation);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Raju Yadav'", txtLineManager);
		//txtLineManager.sendKeys(lMngr);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='CR0012'", txtRoleCode);
		//txtRoleCode.sendKeys(roleCode);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Entity Code'", txtLegalEntity);
		//txtLegalEntity.sendKeys(lEntity);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='raju.yadav1@authbridge.com'", txtBtEmailId);
		//txtBtEmailId.sendKeys(emailId);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Provisonal'", txtDateOfProvisionalOffer);
		//txtDateOfProvisionalOffer.sendKeys(dProvision);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", additionalFieldToScroll);
		txtRecordId.sendKeys(recordId);
		txtPanNumber.sendKeys(panNumber);
		Select recruiterEmailId = new Select(selectRecruiterEmailId);
		recruiterEmailId.selectByIndex(2);
		Select recruiterName = new Select(selectRecruiterName);
		recruiterName.selectByIndex(2);
		Select ceGoAheadRequired = new Select(selectCeGoAheadRequired);
		ceGoAheadRequired.selectByIndex(3);
		Select bgVSpoc = new Select(selectBgVSpoc);
		bgVSpoc.selectByIndex(4);
		Select bgVSpocEmailId = new Select(selectBgVSpocEmailId);
		bgVSpocEmailId.selectByIndex(4);
		txtHrdpName.sendKeys(hrdpName);
		txtHrdpEmailId.sendKeys(hrdpEmail);
		txtClientProcessName.sendKeys(clientProcess);
		txtCandidateId.sendKeys(candidateId);
		txtAddress.sendKeys(address);
		clickOnProfileContinueBtn.click();
		Thread.sleep(1000);
	}

	// ADDRESS(Current Address Details)--Step 3 - Candidate Summary
	public void candidateAddress(String flat, String colony,String residingForm, String pinCode,String state,String city, String station, String houseNo,
			String locality,String residingFormDate, String pinCodePer,String statePer,String cityPer, String policeStation, String AddressProof)
			throws InterruptedException, ParseException {
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectWithinIndia));
		selectWithinIndia.click();
//		txtFlat_House.clear();
		Thread.sleep(2000);
		txtFlat_House.sendKeys(flat);
		JavaScriptManuplator.javaScriptExecutor(txtColonyName, "arguments[0].value='Mayur Vihar'", ldriver);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickOnResidingForm);
		clickOnResidingForm.sendKeys(residingForm);
		checkBoxTillDate.click();
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtPinCode, "arguments[0].value='323233'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtCityName, "arguments[0].value='Delhi'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtStateName, "arguments[0].value='Delhi'", ldriver);
		Thread.sleep(1000);
//		txtPoliceStation.clear(); 
		JavaScriptManuplator.javaScriptExecutor(txtPoliceStation, "arguments[0].value='station'", ldriver);
//		txtPoliceStation.sendKeys(station);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkWithinIndiaRadioBtn);
		// Add Documents
		// Is your current address or any of the above mentioned address same as
		// Permanent Address
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
		txtPinCodePer.sendKeys(pinCodePer);
		txtStateNamePer.clear();
		txtCityNamePer.sendKeys(cityPer);
		//Adding headless code
		WebElement xWL = ldriver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[3]/div[4]/div[2]/div/input[1]"));
		Actions xAct = new Actions(ldriver);
		xAct.moveToElement(xWL).build().perform();
		//txtStateNamePer.clear();
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Del'", txtStateNamePer);
		//txtStateNamePer.sendKeys(statePer);
		Thread.sleep(2000);
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
			String enrollmentNo, String paercentage,String batchStartDate,String clkOnEndYear, String remark) throws InterruptedException, AWTException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectQualificationDegree));
		Select degree = new Select(selectQualificationDegree);
		degree.selectByIndex(2);
		txtQualification.clear();
		txtQualification.sendKeys(qualification);
		txtUniversityBoard.clear();
		txtUniversityBoard.sendKeys(university);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIntituteField));
		clickOnIntituteField.click();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtIntituteName));
		
		WebElement sourceCityName = ldriver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		try {
			sourceCityName.clear();
		} catch (StaleElementReferenceException e) {
			Thread.sleep(3000);
			sourceCityName.sendKeys("Bundelkhand University, Jhansi");
		}
		sourceCityName.sendKeys("Bundelkhand University, Jhansi");
		String text;
		do {
			sourceCityName.sendKeys(Keys.ARROW_DOWN);
			text = sourceCityName.getAttribute("value");
			if (text.equals("Bundelkhand University, Jhansi")) {
				sourceCityName.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				sourceCityName.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		} while (!text.isEmpty());
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtOtherCollegeName, "arguments[0].value='Bundelkhand University, Jhansi'", ldriver);
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
		JavaScriptManuplator.javaScriptExecutor(clickOnEndYear, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnEndYear, "arguments[0].value='18-01-2021'", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtRemark));
		JavaScriptManuplator.javaScriptExecutor(txtRemark, "arguments[0].value='Good'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkBoxDocumentLater, "arguments[0].scrollIntoView(true);",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkBoxDocumentLater, "arguments[0].click()", ldriver);
		//checkBoxDocumentLater.click();
		JavaScriptManuplator.javaScriptExecutor(clickOnEducationContinueBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Employment(Current Employment Details)--Step 3 - Candidate Summary
	public void candidateEmployment(String compName,String designation,String location,String compMobileNo,String addressComp,String dept,String dateOfJoining,String responsibilities,String remark,String salaryCTC,String empCode,String gradeBand,String reason,String uanNumber,String firstName,String middleName,String lastName,String designationName,String contactNumber,String emailId,String hrFirstName,String hrMiddleName,String hrLastName,String hrDesignation,String hrCompanyName,String hrContactName,String hrEmail,String salarySlipEmpId,String appointLetter,String expLetter,String uploadSalaryEmpid, String uploadAppLetter,String upExpLetter) throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(employedInCompany));
		JavaScriptManuplator.javaScriptExecutor(employedInCompany, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkOnPayroll, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		//JavaScriptManuplator.javaScriptExecutor(clickOnCurrentCompanyName, "arguments[0].click()", ldriver);
		clickOnCurrentCompanyName.click();
		//wait = new WebDriverWait(ldriver,60);
		//wait.until(ExpectedConditions.visibilityOf(verifySearchTextField));
		/*WebElement sourceCompanyName = ldriver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		try {
			sourceCompanyName.clear();
		} catch (StaleElementReferenceException e) {
			Thread.sleep(3000);
			sourceCompanyName.sendKeys("Agami Technologies, Greater Noida");
		}
		sourceCompanyName.sendKeys("Agami Technologies, Greater Noida");
		String text;
		do {
			Thread.sleep(4000);
			sourceCompanyName.sendKeys(Keys.ARROW_DOWN);
			text = sourceCompanyName.getAttribute("value");
			if (text.equals("Agami Technologies, Greater Noida")) {
				sourceCompanyName.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				sourceCompanyName.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		} while (!text.isEmpty());
		Thread.sleep(5000);*/
		JavaScriptManuplator.javaScriptExecutor(txtCurrentCompanyName, "arguments[0].value='Aga'", ldriver);
		txtCurrentCompanyName.sendKeys(Keys.SPACE);
		//wait = new WebDriverWait(ldriver,60);
		//wait.until(ExpectedConditions.visibilityOf(clickOnOtherName));
		Thread.sleep(4000);
		clickOnOtherName.click();
		Thread.sleep(2000);
		//JavaScriptManuplator.javaScriptExecutor(txtCompanyName, "arguments[0].value='Agami Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtOtherCompanyName, "arguments[0].value='Agami Technologies, Greater Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtDesignationName, "arguments[0].value='Quality Analyst'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtLocation, "arguments[0].value='Greater Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCompanyMobileNo, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtAddressoftheCompany, "arguments[0].value='Greater Noida'", ldriver);
//		wait = new WebDriverWait(ldriver,120);
//		wait.until(ExpectedConditions.visibilityOf(selectEmploymentType));
		JavaScriptManuplator.selectOptionFromDropDown(selectEmploymentType, "Permanent");
		Thread.sleep(2000);
		JavaScriptManuplator.selectOptionFromDropDown(selectNatureOfEmployment, "Full Time");
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtCorporateEmailId, "arguments[0].value='raju.yadav@authbridge.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtDepartment, "arguments[0].value='Information Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnTillDate, "arguments[0].scrollIntoView(true);",
				ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnDateOfJoining, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnDateOfJoining, "arguments[0].value='10-01-2019'", ldriver);
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTillDate));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnTillDate, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtResponsibilities, "arguments[0].value='Testing software'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtRemarks, "arguments[0].value='Good'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectSalaryCurrency, "India Rupee");
		JavaScriptManuplator.selectOptionFromDropDown(selectSalaryCycle, "Per Annum");
		JavaScriptManuplator.javaScriptExecutor(txtSalaryCTC, "arguments[0].value='600000'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEmaployeeCode, "arguments[0].value='Agm0035'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtGradeBond, "arguments[0].value='A'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtReasonForLeaving, "arguments[0].value='Personal and Career Growth'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtUanNumber, "arguments[0].value='152745675234'", ldriver);
		Thread.sleep(4000);
	
	    //Other Information--REPORTING MANAGER DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtFirstName, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtFirstName, "arguments[0].value='Raju'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtLastName, "arguments[0].value='Yadav'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtDesigName, "arguments[0].value='QA'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtContactNumber, "arguments[0].value='7042718794'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtEmailId, "arguments[0].value='rajuyadav0556@gmail.com'", ldriver);
		
		//Can we connect with your reporting manager for reference check now?
		JavaScriptManuplator.javaScriptExecutor(checkBox, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		//Is the Reporting Manager still a part of company?
		JavaScriptManuplator.javaScriptExecutor(checkBoxYes, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		
		//HR DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtHrEmail, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrEmail));
		JavaScriptManuplator.javaScriptExecutor(txtHrFistName, "arguments[0].value='Aman'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrLastName, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrDesignation, "arguments[0].value='Human Resource'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrCompanyName, "arguments[0].value='Agami Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrContactName, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrEmail, "arguments[0].value='ajit@agamitechnologies.com'", ldriver);
		
		// Add Document(s) --Current Employment Details
		JavaScriptManuplator.javaScriptExecutor(checkHrdocumentLater, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(checkHrdocumentLater));
		//Add Document(s)
		JavaScriptManuplator.javaScriptExecutor(checkHrdocumentLater, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}	
	
	//Previous Employment Details--
	public void candidatePreviousEmployment(String preComp,String designation,String city,String mobileNo,String addressComp,String dept,String previousJoining,String previousLeaving, String role,String remarks,String salCurrency,String empCode,String grade,String reason,String uanNo, String managerFname,String managerMname,String managerLname,String managerDesignation,String managerMobileNo,String managerEmail,String hrFname,String hrMname,String hrLname,String hrDesig,String hrCompName,String hrContactNumber,String hrEmail,String salarySlipPdf,String appointmentLetter,String experienceLetter, String gapReason) throws InterruptedException, ParseException {
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(checkEmployedRadioBtn));
		JavaScriptManuplator.javaScriptExecutor(checkEmployedRadioBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(checkRadioPayrollBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		clickOnPreviousOtherCompName.click();
		/*wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(verifyPreviousCompNameSearchTextField));
		WebElement sourcePreviousCompanyName = ldriver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		try {
			sourcePreviousCompanyName.clear();
		} catch (StaleElementReferenceException e) {
			Thread.sleep(3000);
			sourcePreviousCompanyName.sendKeys("HCL Software Technologies, Gurgaon");
		}
		sourcePreviousCompanyName.sendKeys("HCL Software Technologies, Gurgaon");
		String text;
		do {
			Thread.sleep(4000);
			sourcePreviousCompanyName.sendKeys(Keys.ARROW_DOWN);
			text = sourcePreviousCompanyName.getAttribute("value");
			if (text.equals("HCL Software Technologies, Gurgaon")) {
				sourcePreviousCompanyName.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				sourcePreviousCompanyName.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(2000);
		} while (!text.isEmpty());
		Thread.sleep(5000);*/
		JavaScriptManuplator.javaScriptExecutor(txtEnterCompanyName, "arguments[0].value='HCL'", ldriver);
		txtEnterCompanyName.sendKeys(Keys.SPACE);
		//wait = new WebDriverWait(ldriver,60);
		//wait.until(ExpectedConditions.visibilityOf(clickOnPreviousOtherName));
		Thread.sleep(4000);
		clickOnPreviousOtherName.click();
		Thread.sleep(2000);
		//JavaScriptManuplator.javaScriptExecutor(txtPreviousCompName, "arguments[0].value='HCL Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousOtherCompName, "arguments[0].value='HCL Software Technologies, Gurgaon'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDesignation, "arguments[0].value='Quality Analyst'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCity, "arguments[0].value='Noida'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousMobileNo, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousAddressComp, "arguments[0].value='Noida'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(selectPreviousEmploymentType, "arguments[0].scrollIntoView(true);", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousEmploymentType, "Permanent");
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectPreviousNatureEmp, "Full Time");
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousCorporateEmail, "arguments[0].value='raju.yadav@agamitechnologies.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousDepartment, "arguments[0].value='Engineering'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnPreviousJoining, "arguments[0].scrollIntoView(true);", ldriver);
//		wait = new WebDriverWait(ldriver,50);
//		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousJoining));
		Thread.sleep(1000);
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
		JavaScriptManuplator.javaScriptExecutor(txtPreviousSalaryCtc, "arguments[0].value='480000'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousEmpCode, "arguments[0].value='Hcl210'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousGrade, "arguments[0].value='A'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousReasonLeaving, "arguments[0].value='Personal and Career Growth'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtPreviousUanNo, "arguments[0].value='152897308325'", ldriver);
		Thread.sleep(4000);
		
		//Other Information--REPORTING MANAGER DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtManagerFirstName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtManagerFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtManagerFirstName, "arguments[0].value='Abhishek'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerMiddleName, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerLastName, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerDesignation, "arguments[0].value='Project Manager'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerMobileNo, "arguments[0].value='7042718794'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtManagerEmailId, "arguments[0].value='abhishek@agamitechnologies.com'", ldriver);
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDontKnow));
		JavaScriptManuplator.javaScriptExecutor(clickOnDontKnow, "arguments[0].click()",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkRadioBtnManagerYes, "arguments[0].click()",
				ldriver);
		
		//HR DETAILS
		JavaScriptManuplator.javaScriptExecutor(txtHrFirstName, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtHrFirstName));
		JavaScriptManuplator.javaScriptExecutor(txtHrFirstName, "arguments[0].value='Manish'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrMiddleN, "arguments[0].value='Kumar'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrLastN, "arguments[0].value='Singh'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrDesig, "arguments[0].value='Human Resource'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrCompanyN, "arguments[0].value='Agami Technologies'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrContactNumber, "arguments[0].value='8009744341'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtHrEmailId, "arguments[0].value='manish@agamitechnologies.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(checkDocumentLater, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver,60);
		wait.until(ExpectedConditions.visibilityOf(checkDocumentLater));
		//Add Document(s)
		JavaScriptManuplator.javaScriptExecutor(checkDocumentLater, "arguments[0].click()",
				ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnEmploymentBtn, "arguments[0].click()",
				ldriver);
		Thread.sleep(2000);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
		System.out.println("radhe");
		
//		List<WebElement> tag13 = ldriver.findElements(By.tagName("button"));
//		for (int j = 0; j < tag13.size(); j++) {
//			if (tag13.get(j).getAttribute("type").equals("submit")) {
//				System.out.println("he");
//				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
//				executor.executeScript("arguments[0].click();", tag13.get(j));
//				System.out.println("hi");
//				break;
//			}}
		
		// Confirm- alert Ok Button
		
				List<WebElement> tag12 = ldriver.findElements(By.tagName("button"));
				for (int i = 0; i < tag12.size(); i++) {
					if (tag12.get(i).getAttribute("class").equals("btn btn-default")) {
						System.out.println("hello");
						JavascriptExecutor executor = (JavascriptExecutor) ldriver;
						executor.executeScript("arguments[0].click();", tag12.get(i));
						System.out.println("hii");
						break;
					}
				}
		try {
			txtGapReason.clear();
			txtGapReason.sendKeys(gapReason);
			clickOnSubmitGapBtn.click();
		}catch(Exception e) {
			//System.out.println("Entered into the catch block");
		}
	}
	
	//Education to Employment Gap
	public void candidateCasePreview() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviewSubmitBtn));
		clickOnPreviewSubmitBtn.click();
		Thread.sleep(1000);	
		}
	}
