package com.iBridge.sme.pageobject;

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

import com.iBridge.utilities.JavaScriptManuplator;


public class InsufficientBridgeSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InsufficientBridgeSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// (Docs Quality)--Bridge --Insufficient
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectDocsQcQuality;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[1]/ul/li[4]/a")
	WebElement clickOnDocQualityCases;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Cases for Quality Review')]")
	WebElement verifyCasesforQualityReview;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Search Case')]")
	WebElement clickOnSearchCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='CaseMasterCASEARSNO']")
	WebElement txtArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search Case')]")
	WebElement clickOnSearchCaseBtn;

	// Case List - Search Result
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[13]/select[1]")
	WebElement selectActionReviewForQuality;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')]")
	WebElement clickOnActionConfirmationAlertYesBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/th[2]")
	WebElement verifyCaseQCReviewArsNumber;

	// Check Type -- (QC Done)--Checks Summary)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/h2[1]")
	WebElement verifyCaseActionsSummary;

	// Current Address Verification --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[1]/td[8]/a[1]/img[1]")
	WebElement clickOnCurrentAddressQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnMarkAsDQCDone;

	// Current Employment Verification--Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[2]/td[8]/a[1]/img[1]")
	WebElement clickOnCurrentEmploymentQcDoneImg;

	// QC Check list-3 Index select
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectTenureMappeCorrectly;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectDesignationMapped;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectCtcMapped;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnMarkQcChecklistDoneBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[9]/tbody[1]/tr[1]/th[2]/button[1]")
	WebElement clickOnCurrentEmpMarkAsDqcDoneBtn;

	// CV Validation --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[3]/td[8]/a[1]/img[1]")
	WebElement clickOnCvValidationQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnCvValidationMarkAsDqcDone;

	// Drug Test--Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[4]/td[8]/a[1]/img[1]")
	WebElement clickOnDrugTestQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnDrugTestMarkAsDqcDoneBtn;

	// Education Verification Written-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[5]/td[8]/a[1]/img[1]")
	WebElement clickOnEducationVerificationQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnEducationMarkAsDqcDoneBtn;

	// Global Regulatory Compliance and Debarment Database Verification --Check Type
	// (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[6]/td[8]/a[1]/img[1]")
	WebElement clickOnGlobalRegulatoryQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnGlobalMarkAsDqcDone;

	// India Advanced Web and Media Searches --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[7]/td[8]/a[1]/img[1]")
	WebElement clickOnIndianAdvancedQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndianAdvancedMarkAsDqcDone;

	// India Civil Litigation Database Check --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[8]/td[8]/a[1]/img[1]")
	WebElement clickOnIndianCivilQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaCivilMarkAsDqcDone;

	// India Comprehensive Criminal Record Database Check --Check Type (QC
	// Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[9]/td[8]/a[1]/img[1]")
	WebElement clickOnIndiaCriminalQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndianCrimialMarkAsDqcDone;

	// India Court Record Check through Law Firm-- Check Type (QC Done)Checks
	// Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[10]/td[8]/a[1]/img[1]")
	WebElement clickOnIndiaCourtQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaCourtMarkAsDqcDone;

	// India Court Record Database Check --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[11]/td[8]/a[1]/img[1]")
	WebElement clickOnIndiaCourtRecordQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaCourtRecardMarkAsDqcDone;

	// India Credit Default Database Check-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[12]/td[8]/a[1]/img[1]")
	WebElement clickOnIndiaCreditQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaCreditMarkAsDqcDone;

	// India Database Check Level 1-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[13]/td[8]/a[1]/img[1]")
	WebElement clickOnIndiaDatabaseQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaDatabaseMarkAsDqcDone;

	// National Identity Check-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[14]/td[8]/a[1]/img[1]")
	WebElement clickOnNationalIdentityQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnNationalIdentityMarkAsDqcDone;

	// PAN No Verification --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[15]/td[8]/a[1]/img[1]")
	WebElement clickOnPanNoQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPanNoMarkAsDqcDone;

	// Permanent Address Verification-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='frmCaseReviewDetails']/table[4]/tbody/tr[16]/td[8]/a/img")
	WebElement clickOnPermanentAddressQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPermanentAddressMarkAsDqcDone;

	// Personal Reference Check-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[17]/td[8]/a[1]/img[1]")
	WebElement clickOnPersonalRefQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPersonalRefMarkAsDqcDone;

	// Previous Employment Verification-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[18]/td[8]/a[1]/img[1]")
	WebElement clickOnPreviousEmpQcDoneImg;

	// QC Check list- 3 index
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectTenureMapped;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectDesignationCorrectly;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectCtcCorrectly;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPreviousMarkQcChecklistDoneBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[9]/tbody[1]/tr[1]/th[2]/button[1]")
	WebElement clickOnPreviousEmpMarkAsDqcDone;

	// Professional Reference Check-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[19]/td[8]/a[1]/img[1]")
	WebElement clickOnProfessionalRefQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnProfessionalRefMarkAsDqcDone;

	// Checks Summary--Case QC - Review- Case level Comments (if any)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCasesComments;

	// index 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='case_action_taken']")
	WebElement selectReleaseForVerification;

	// Confirmation Alert-- There are 1 overlapping tenures between employment
	// checks.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok, I Understood')]")
	WebElement clickOnOkUnderstoodBtn;

	// Index 3
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCASELEVEL']")
	WebElement selectSeniorLevel;

	// QC Check list-Index 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectCorrectClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectCorrectProcess;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectClientSpecific;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[2]/select[1]")
	WebElement selectCandidateDetails;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[5]/td[2]/select[1]")
	WebElement selectChecksRaised;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[6]/td[2]/select[1]")
	WebElement selectReadInstructions;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='csis_count']")
	WebElement txtNoOfChecks;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='qc_checklist_btn']")
	WebElement clickOnMarkQcChecklistDone;

	// Action Required -- Confirmation Popup -index 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='action_taken']")
	WebElement selectActionTaken;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btn-action']")
	WebElement clickOnActionSubmitBtn;

	// Case QC - Review --Checks Summary-------Success Page
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCaseLevelComments;

	// Index 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='case_action_taken']")
	WebElement selectCaseActionTaken;

	// Confirmation- Alert There are 1 overlapping tenures between employment
	// checks.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok, I Understood')]")
	WebElement clickOnOkIUnderstoodBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCASELEVEL']")
	WebElement selectSeniorCaseLevel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnSubmit']")
	WebElement clickOnReviewBtn;

	// The Case was successfully released for Verification.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'The Case was successfully released for Verification.')]")
	WebElement verifyReleasedForVerificationMessage;

	// Allocator-- (Super Admin)-- Bridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectSuperAdminAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Employment UAN')]")
	WebElement verifyEmploymentUan;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtArsNumberAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnSearchAllocatorBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[10]/a")
	WebElement clickOnApplicableCountNumber;

	// Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='check_all']")
	WebElement checkAllCheckBoxCandidate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckBULKACTIONTAKEN']")
	WebElement selectAssignToVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlChecksAssignedTo']")
	WebElement selectTeamMemberName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='check_comments']")
	WebElement txtCheckComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoAllocatorBtn;

	// Checks are successfully allocated to Shariq Abbas
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]")
	WebElement verifyChecksAreSuccessfullyMsg;

	// Verifier --(Super Admin)-- Bridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectSuperAdminVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Digital Verification')]")
	WebElement verifyDigitalVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtArsNumberPaste;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCopmpleteSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[12]/a")
	WebElement clickOnPendingCountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Credit Default Database Check')]")
	WebElement clickOnIndiaCreditDefaultCheck;

	// Antecedents to Verify --(Save Verified Data)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[1]/td[3]/select[1]")
	WebElement selectCibilCreditBureaus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[2]/td[3]/input[2]")
	WebElement txtDateOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/input[2]")
	WebElement txtTimeOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='Save_Data']")
	WebElement clickOnSaveVerifiedData;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCaseCheckVerification;

	// Case Check - Mark Insufficiency
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='insuff_type']")
	WebElement selectSelectReasonForInsufficiency;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtInsufficientComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[5]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnMarkAsInsufficientBtn;

	// Check is successfully marked as Insufficient.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check is successfully marked as Insufficient.')]")
	WebElement verifyMarkedAsInsufficientMsg;

	// Insufficiency Fulfillment--Approve -- Super Admin(Raju Yadav Account - CAT
	// Role Bridge)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserCurrentRoleCat;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Cases Status')]")
	WebElement verifyNotificationAlertsCasesStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCompleteSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCompleteSearchBtn;
	
	// By sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[1]/h4[2]/a")
	WebElement loadResult;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[12]/a[1]")
	WebElement clickOnPendingCoutNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Credit Default Database Check')]")
	WebElement clickOnIndiaCreditDefault;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectFullfilCheckInsufficiences;

	// Case Check - Fulfill Insufficiency
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtInsuffFulfillComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Yes')]")
	WebElement clickOnFulfillInsufficiencyRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='document_id']")
	WebElement selectDocumentType;
	
	// Note: Only JPG images can be included in report. Documents of any other format being attached to a case cannot be included in the report.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btnAddFiles']")////span[contains(text(),'Add files...')]
	WebElement clickOnAddFilesBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[2]/thead[1]/tr[3]/td[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/button[1]/span[1]")
	WebElement clickOnPicStartBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckDOCUMENTSOURCE']")
	WebElement selectSourceVerificationDocument;
	
	// Note: Only JPG images can be included in report. Documents of any other format being attached to a case cannot be included in the report.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btnAddFiles']")
	WebElement uploadDocuments;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[2]/thead[1]/tr[3]/td[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/button[1]/span[1]")
	WebElement clickOnStartBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Application Form PDF')]")
	WebElement verifyApplicationFormPdfText;
	

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='CaseCheckPROOFCOMMENT']")
	WebElement txtProofsComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='submit_btn_attach_proof']")
	WebElement clickOnFulfillInsuffBtn;

	// Check insufficiency is successfully fulfilled.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check insufficiency is successfully fulfilled.')]")
	WebElement verifyCheckInsuffSuccessFulfilled;

	// Global Regulatory Compliance and Debarment Database Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Global Regulatory Compliance and Debarment Databas')]")
	WebElement clickOnGlobalRegulatory;
	
	// Antecedents
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[1]/td[3]/select[1]")
	WebElement selectLawEnforcement;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[2]/td[3]/select[1]")
	WebElement selectRegulatoryEnforcement;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/select[1]")
	WebElement selectSanctions;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[4]/td[3]/select[1]")
	WebElement selectPoliticallyExposedPersonsCheck;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[5]/td[3]/select[1]")
	WebElement selectOtherBodies;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[6]/td[3]/input[2]")
	WebElement txtAntecedentsDateVerification;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[7]/td[3]/input[2]")
	WebElement txtAntecedentsTimeOfVerification;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[8]/td[3]/textarea[1]")
	WebElement txtVerifierComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[1]/td[3]/input[2]")
	WebElement txtDateVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[2]/td[3]/input[2]")
	WebElement txtTimeofVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/select[1]")
	WebElement selectComplianceChecks;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[4]/td[3]/select[1]")
	WebElement selectRegulatory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[5]/td[3]/select[1]")
	WebElement selectFinancial;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[6]/td[3]/select[1]")
	WebElement selectAsian;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[7]/td[3]/select[1]")
	WebElement selectAsianMoney;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[8]/td[3]/textarea[1]")
	WebElement txtVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[8]/tbody[1]/tr[1]/th[3]/div[1]/input[1]")
	WebElement clickOnSaveVerifiedDataBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectRaiseInsuficiencyName;

	// Mark Insufficiency -- Cost Approval Required
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='insuff_type']")
	WebElement selectReasonForInsufficiency;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtInsuffComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='insuff_comment']")
	WebElement txtInsuffCost;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Domestic')]")
	WebElement clickOnDomesticRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[5]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnMarkAsInsufficiencyBtn;

	// Check is successfully marked as Insufficient.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check is successfully marked as Insufficient.')]")
	WebElement verifySsuccessfullyMarkedInsuffMessage;

	// Insuff Both Verifier-- India Court Record Database Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Database Check')]")
	WebElement clickOnIndiaCourtRecord;

	// Antecedents Address
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[2]/td[3]/select[1]")
	WebElement selectMagistrateCourt;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/select[1]")
	WebElement selectStateHighCourt;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[4]/td[3]/select[1]")
	WebElement selectSupremeCourt;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[5]/td[3]/select[1]")
	WebElement selectTribunals;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[6]/td[3]/input[2]")
	WebElement txtInsuffDateOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[7]/td[3]/input[2]")
	WebElement txtInsuffTimeOfVerification;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[8]/tbody[1]/tr[1]/th[3]/div[1]/input[1]")
	WebElement clickOnInsuffSaveVerifiedDataBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectInsuffRaiseInsuffienciency;

	// Mark Insufficiency
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='insuff_type']")
	WebElement selectInsuffReasonInsufficiencyBoth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtInsuffComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='insuff_comment']")
	WebElement txtInsuffCostValue;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Domestic')]")
	WebElement clickOnCostApprovalType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[5]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnInsuffMarkAsInsufficientBtn;

	// Cases On Hold raised by Cat role Raju Account
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[13]/select[1]")
	WebElement selectActionPutOnHold;

	// Confirm-- Do you wish to continue with "Put On Hold"?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')]")
	WebElement clickOnConfirmOkBtn;

	// Case Put On Hold
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='onhold_comment']")
	WebElement txtReasonToMakeOnHold;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[2]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPutOnHoldBtn;

	// The Case was successfully put on hold.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifySuccessfullyPutOnHoldMessage;

	// Check is successfully marked as Insufficient.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check is successfully marked as Insufficient.')]")
	WebElement verifyMarkAsInsufficientMessage;

	// LogOut Bridge account-- Shariq Abbas
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickOnVerifierLogoutBtn;

	// LogOut Bridge account-- Raju Yadav
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickCatRoleLogoutBtn;
	
	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Verify Docs Quality-- Bridge Portal
	public void superAdminDocsQuality(String arsNumber) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(selectDocsQcQuality));
		//JavaScriptManuplator.waitForElementPresent(ldriver, selectDocsQcQuality, 180);
		JavaScriptManuplator.selectOptionFromDropDown(selectDocsQcQuality, "Docs Quality");
		//Select docsQcQuality = new Select(selectDocsQcQuality);
		//docsQcQuality.selectByIndex(25);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyCasesforQualityReview));
		clickOnDocQualityCases.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Search Case')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtArsNumber));
		txtArsNumber.sendKeys(arsNumber);
		clickOnSearchCaseBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectActionReviewForQuality));
		Select actionReviewForQuality = new Select(selectActionReviewForQuality);
		actionReviewForQuality.selectByIndex(3);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnActionConfirmationAlertYesBtn));
		clickOnActionConfirmationAlertYesBtn.click();
		Thread.sleep(1000);
	}

	public String verifyCaseQCReviewArsNumber() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseQCReviewArsNumber));
		return verifyCaseQCReviewArsNumber.getText();
	}

	// Check Type -- (QC Done)--Checks Summary)
	public void verifyQcDoneChecksSummary(String caseComments, String noOfChecks, String casesComments)
			throws InterruptedException {
		// Current Address Verification --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressQcDoneImg);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnMarkAsDQCDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnMarkAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkAsDQCDone);

		// Current Employment Verification--Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmploymentQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmploymentQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectTenureMappeCorrectly);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectTenureMappeCorrectly));

		Select tenureMappeCorrectly = new Select(selectTenureMappeCorrectly);
		tenureMappeCorrectly.selectByIndex(3);

		Select designationMapped = new Select(selectDesignationMapped);
		designationMapped.selectByIndex(3);

		Select ctcMapped = new Select(selectCtcMapped);
		ctcMapped.selectByIndex(3);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkQcChecklistDoneBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmpMarkAsDqcDoneBtn);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmpMarkAsDqcDoneBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmpMarkAsDqcDoneBtn);

		// CV Validation --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationMarkAsDqcDone);

		// Drug Test--Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnDrugTestQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDrugTestQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDrugTestQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnDrugTestMarkAsDqcDoneBtn);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDrugTestMarkAsDqcDoneBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDrugTestMarkAsDqcDoneBtn);

		// Education Verification Written-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerificationQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerificationQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationMarkAsDqcDoneBtn);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationMarkAsDqcDoneBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationMarkAsDqcDoneBtn);

		// Global Regulator Compliance and Debarment Database Verification --Check Type
		// (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalRegulatoryQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalRegulatoryQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalRegulatoryQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalMarkAsDqcDone);

		// India Advanced Web and Media Searches --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianAdvancedQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianAdvancedQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianAdvancedQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianAdvancedMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianAdvancedMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianAdvancedMarkAsDqcDone);

		// India Civil Litigation Database Check --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianCivilQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianCivilQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianCivilQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCivilMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCivilMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCivilMarkAsDqcDone);

		// India Comprehensive Criminal Record Database Check --Check Type (QC
		// Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCriminalQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCriminalQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCriminalQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianCrimialMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianCrimialMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianCrimialMarkAsDqcDone);

		// India Court Record Check through Law Firm-- Check Type (QC Done)Checks
		// Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtMarkAsDqcDone);

		// India Court Record Database Check --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecordQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecordQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecordQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecardMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecardMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecardMarkAsDqcDone);

		// India Credit Default Database Check-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCreditQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCreditQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCreditMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCreditMarkAsDqcDone);

		// India Database Check Level 1-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaDatabaseQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaDatabaseQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaDatabaseQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaDatabaseMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaDatabaseMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaDatabaseMarkAsDqcDone);

		// National Identity Check-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentityQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentityQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentityQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentityMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentityMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentityMarkAsDqcDone);

		// PAN No Verification --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoMarkAsDqcDone);
		Thread.sleep(10000);
		// Permanent Address Verification-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressMarkAsDqcDone);

		// Personal Reference Check-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPersonalRefQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPersonalRefQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPersonalRefQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPersonalRefMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPersonalRefMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPersonalRefMarkAsDqcDone);

		// Previous Employment Verification-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmpQcDoneImg);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmpQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmpQcDoneImg);

		// QC Check list- 3 index
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectTenureMapped);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectTenureMapped));
		Select tenureMapped = new Select(selectTenureMapped);
		tenureMapped.selectByIndex(3);

		Select designationCorrectly = new Select(selectDesignationCorrectly);
		designationCorrectly.selectByIndex(3);

		Select ctcCorrectly = new Select(selectCtcCorrectly);
		ctcCorrectly.selectByIndex(3);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousMarkQcChecklistDoneBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmpMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmpMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmpMarkAsDqcDone);

		// Professional Reference Check-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalRefQcDoneImg);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalRefQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalRefQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalRefMarkAsDqcDone);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalRefMarkAsDqcDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalRefMarkAsDqcDone);

		// Checks Summary--Case QC - Review- Case level Comments (if any)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtCasesComments);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCasesComments));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Case level comments are good'", txtCasesComments);

		Select releaseForVerification = new Select(selectReleaseForVerification);
		releaseForVerification.selectByIndex(2);

		// Confirmation Alert-- There are 1 overlapping tenures between employment
		// checks.
//		wait = new WebDriverWait(ldriver, 120);
//		wait.until(ExpectedConditions.visibilityOf(clickOnOkUnderstoodBtn));
//		js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", clickOnOkUnderstoodBtn);

		Select seniorLevel = new Select(selectSeniorLevel);
		seniorLevel.selectByIndex(3);
		// QC Check list-Index 2
		Select correctClient = new Select(selectCorrectClient);
		correctClient.selectByIndex(2);

		Select correctProcess = new Select(selectCorrectProcess);
		correctProcess.selectByIndex(2);

		Select clientSpecific = new Select(selectClientSpecific);
		clientSpecific.selectByIndex(2);

		Select candidateDetails = new Select(selectCandidateDetails);
		candidateDetails.selectByIndex(2);

		Select checksRaised = new Select(selectChecksRaised);
		checksRaised.selectByIndex(2);

		Select readInstructions = new Select(selectReadInstructions);
		readInstructions.selectByIndex(2);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='2'", txtNoOfChecks);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkQcChecklistDone);

		// Action Required -- Confirmation Popup -index 2
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectActionTaken));
		Select actionTaken = new Select(selectActionTaken);
		actionTaken.selectByIndex(2);
		clickOnActionSubmitBtn.click();

		// Case QC - Review --Checks Summary-------Success Page
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnReviewBtn);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Testuser'", txtCaseLevelComments);
		// txtCaseLevelComments.sendKeys(casesComments);

		Select caseActionTaken = new Select(selectCaseActionTaken);
		caseActionTaken.selectByIndex(2);

		// Confirmation- Alert There are 1 overlapping tenures between employment
		// checks.
//		wait = new WebDriverWait(ldriver, 120);
//		wait.until(ExpectedConditions.visibilityOf(clickOnOkIUnderstoodBtn));
//		clickOnOkIUnderstoodBtn.click();
		Thread.sleep(1000);
		Select seniorCaseLevel = new Select(selectSeniorCaseLevel);
		seniorCaseLevel.selectByIndex(3);
		clickOnReviewBtn.click();
		Thread.sleep(1000);
	}

	// The Case was successfully released for Verification.
	public String verifyReleasedForVerificationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyReleasedForVerificationMessage));
		return verifyReleasedForVerificationMessage.getText();
	}

	// Allocator-- (Super Admin)-- Bridge Portal
	public void superAdminAllocator(String arsNumberAllocator, String checkComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminAllocator, "Allocator");
		//Select superAdminAllocator = new Select(selectSuperAdminAllocator);
		//superAdminAllocator.selectByIndex(3);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyEmploymentUan));
		txtArsNumberAllocator.sendKeys(arsNumberAllocator);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchAllocatorBtn);
		//clickOnSearchAllocatorBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApplicableCountNumber));
		clickOnApplicableCountNumber.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkAllCheckBoxCandidate));
		checkAllCheckBoxCandidate.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectAssignToVerifier);
		Select assignToVerifierName = new Select(selectAssignToVerifier);
		assignToVerifierName.selectByIndex(1);

		Select teamMemberName = new Select(selectTeamMemberName);
		teamMemberName.selectByIndex(6);
		txtCheckComments.sendKeys(checkComments);
		Thread.sleep(1000);
		clickOnGoAllocatorBtn.click();
		Thread.sleep(1000);
	}

	public String verifyChecksSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyChecksAreSuccessfullyMsg));
		return verifyChecksAreSuccessfullyMsg.getText();
	}

	// Verifier --(Super Admin)-- Bridge Portal
	public void superAdminVerifier(String pasteArsNo, String dateOfVerification, String timeOfVerification,
			String insuffComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		Thread.sleep(3000);
		txtArsNumberPaste.sendKeys(pasteArsNo);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		//clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditDefaultCheck));
		clickOnIndiaCreditDefaultCheck.click();

		// Antecedents to Verify --(Save Verified Data)
		/*js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCibilCreditBureaus);
		Select cibilCreditBureaus = new Select(selectCibilCreditBureaus);
		cibilCreditBureaus.selectByIndex(3);
		txtDateOfVerification.sendKeys(dateOfVerification);
		txtTimeOfVerification.sendKeys(timeOfVerification);*/
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnSaveVerifiedData);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveVerifiedData);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCaseCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseCheckVerification));
		Select caseCheckVerification = new Select(selectCaseCheckVerification);
		caseCheckVerification.selectByIndex(4);

		// Case Check - Mark Insufficiency
//		Select selectReasonForInsufficiency = new Select(selectSelectReasonForInsufficiency);
//		selectReasonForInsufficiency.selectByIndex(1);
//		txtInsufficientComment.sendKeys(insuffComments);
//		clickOnMarkAsInsufficientBtn.click();
//		Thread.sleep(1000);
	}

	public String verifyMarkedAsInsufficientMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyMarkedAsInsufficientMsg));
		return verifyMarkedAsInsufficientMsg.getText();
	}

	// Insufficiency Fulfillment--Approve -- Super Admin(Raju Yadav Account - CAT
	// Role Bridge)
	public void userAdminInsufficiencyFulfillment(String currentArsNumber, String insuffComments, String proofComments)
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
		txtCompleteSearchNo.sendKeys(currentArsNumber);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompleteSearchBtn);
		//clickOnCompleteSearchBtn.click();
		clickOnPendingCoutNumber.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditDefault));
		clickOnIndiaCreditDefault.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectFullfilCheckInsufficiences));
		Select fullfilCheckInsufficiences = new Select(selectFullfilCheckInsufficiences);
		fullfilCheckInsufficiences.selectByIndex(6);
		
		// Fulfill Check Level Insufficiency
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtInsuffFulfillComments));
		txtInsuffFulfillComments.sendKeys(insuffComments);
		clickOnFulfillInsufficiencyRadioBtn.click();
		Select documentType = new Select(selectDocumentType);
		documentType.selectByIndex(1);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnFulfillInsuffBtn));
		Select sourceVerificationDocument = new Select(selectSourceVerificationDocument);
		sourceVerificationDocument.selectByIndex(1);

		txtProofsComments.sendKeys(proofComments);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnFulfillInsuffBtn);
		Thread.sleep(1000);
	}

	// Check insufficiency is successfully fulfilled.
	public String checkinsufficiencySuccessfullyFulfilledMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCheckInsuffSuccessFulfilled));
		return verifyCheckInsuffSuccessFulfilled.getText();
	}

	// Cost Approval Required Insufficiency -- Global Regulatory Compliance and
	// Debarment Database Verification
	public void costApprovalInsuffFulfillment(String pasteArsNo,String dateOfVerification ,String timeOfVerification,String verifierComments, String dateVerification, String timeVerification,
			String verifier, String insuffComments, String insuffCost) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		//clickOnCopmpleteSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalRegulatory));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalRegulatory);
		
		// Antecedents
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectLawEnforcement);
		Select lawEnforcement = new Select(selectLawEnforcement);
		lawEnforcement.selectByIndex(3);
		Select regulatoryEnforcement = new Select(selectRegulatoryEnforcement);
		regulatoryEnforcement.selectByIndex(3);
		Select sanctions = new Select(selectSanctions);
		sanctions.selectByIndex(3);
		Select politicallyExposedPersonsCheck = new Select(selectPoliticallyExposedPersonsCheck);
		politicallyExposedPersonsCheck.selectByIndex(3);
		Select otherBodies = new Select(selectOtherBodies);
		otherBodies.selectByIndex(3);
		txtAntecedentsDateVerification.sendKeys(dateOfVerification);
		txtAntecedentsTimeOfVerification.sendKeys(timeOfVerification);
		txtVerifierComments.sendKeys(verifierComments);
		
		/*txtDateVerification.sendKeys(dateVerification);
		txtTimeofVerification.sendKeys(timeVerification);
		Select complianceChecks = new Select(selectComplianceChecks);
		complianceChecks.selectByIndex(5);
		Select regulatory = new Select(selectRegulatory);
		regulatory.selectByIndex(5);
		Select financial = new Select(selectFinancial);
		financial.selectByIndex(5);
		Select asian = new Select(selectAsian);
		asian.selectByIndex(5);
		Select asianMoney = new Select(selectAsianMoney);
		asianMoney.selectByIndex(5);
		txtVerifier.sendKeys(verifier);*/
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveVerifiedDataBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectRaiseInsuficiencyName));
		Select raiseInsuficiencyName = new Select(selectRaiseInsuficiencyName);
		raiseInsuficiencyName.selectByIndex(5);
		
		// Mark Insufficiency -- Cost Approval Required
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectReasonForInsufficiency));
		Select reasonForInsufficiency = new Select(selectReasonForInsufficiency);
		reasonForInsufficiency.selectByIndex(2);
		txtInsuffComments.sendKeys(insuffComments);
		txtInsuffCost.sendKeys(insuffCost);
		clickOnDomesticRadioBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkAsInsufficiencyBtn);
		Thread.sleep(1000);
	}

	// Check is successfully marked as Insufficient.
	public String verifySsuccessfullyMarkedInsuffMessage() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifySsuccessfullyMarkedInsuffMessage));
		return verifySsuccessfullyMarkedInsuffMessage.getText();
	}

	// Insufficient Both Verifier-- India Court Record Database Check
	public void adminUserReasonInsufficientBoth(String pasteArsNo, String insuffDate, String insuffTime,
			String insuffComments, String insuffCost) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 300);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		//clickOnCopmpleteSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecord));
		clickOnIndiaCourtRecord.click();
		// Antecedents Address
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", selectMagistrateCourt);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectMagistrateCourt));
		Select magistrateCourt = new Select(selectMagistrateCourt);
		magistrateCourt.selectByIndex(3);
		Select stateHighCourt = new Select(selectStateHighCourt);
		stateHighCourt.selectByIndex(3);
		Select supremeCourt = new Select(selectSupremeCourt);
		supremeCourt.selectByIndex(3);
		Select tribunals = new Select(selectTribunals);
		tribunals.selectByIndex(3);
		txtInsuffDateOfVerification.sendKeys(insuffDate);
		txtInsuffTimeOfVerification.sendKeys(insuffTime);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffSaveVerifiedDataBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectInsuffRaiseInsuffienciency));
		Select insuffRaiseInsuffienciency = new Select(selectInsuffRaiseInsuffienciency);
		insuffRaiseInsuffienciency.selectByIndex(4);
		// Mark Insufficiency
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectInsuffReasonInsufficiencyBoth));
		Select insuffReasonInsufficiencyBoth = new Select(selectInsuffReasonInsufficiencyBoth);
		insuffReasonInsufficiencyBoth.selectByIndex(3);
		txtInsuffComment.sendKeys(insuffComments);
		txtInsuffCostValue.sendKeys(insuffCost);
		clickOnCostApprovalType.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffMarkAsInsufficientBtn);
		Thread.sleep(1000);
	}

	// Cases On Hold raised by Cat role Raju Account
	public void adminUserInsuffRaisedCasesOnHold(String currentArsNumber, String reasonMakeHold) throws InterruptedException {
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
		txtCompleteSearchNo.sendKeys(currentArsNumber);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCompleteSearchBtn);
		//clickOnCompleteSearchBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectActionPutOnHold));
		Select actionPutOnHold = new Select(selectActionPutOnHold);
		actionPutOnHold.selectByIndex(7);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmOkBtn);
		// Case Put On Hold
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPutOnHoldBtn));
		txtReasonToMakeOnHold.sendKeys(reasonMakeHold);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPutOnHoldBtn);
	}

	// The Case was successfully put on hold.
	public String verifySuccessfullyPutOnHoldMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessfullyPutOnHoldMessage));
		return verifySuccessfullyPutOnHoldMessage.getText();
	}

	// Check is successfully marked as Insufficient.
	public String verifyMarkAsInsufficientMessage() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyMarkAsInsufficientMessage));
		return verifyMarkAsInsufficientMessage.getText();
	}

	// LogOut Bridge account-- Shariq Abbas Sir
	public void clickOnVerifierLogoutBtn() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnVerifierLogoutBtn));
		clickOnVerifierLogoutBtn.click();
	}
}
