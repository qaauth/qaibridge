package com.iBridge.pageobject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;

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

public class InsufficientBridge {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	String parent;

	public InsufficientBridge(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// (Docs Qc Allocator)-- (Super Admin) Bridge --Insufficient
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectDocsQcAllocator;
	
	// Notification Alerts-- Load Result
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[1]/h4[2]/a")
	WebElement clickOnLoadResultLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div/div[2]/table/tbody/tr/td[4]/a")
	WebElement clickOniBridgeCountAllNo;
	
	// Client Portal Count
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Client Portal Count')]")
	WebElement verifyClientPortalCount;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='SearchCriteriaCASEARSNO']")
	WebElement txtSearchArsNumber;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btnSearch']")
	WebElement clickOnSearchBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'British Telecom')]")
	WebElement verifyBritishTelecom;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='case_all']")
	WebElement checkBoxCheckedClientCaseAll;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement checkBoxCheckedBritishTelecom;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseMasterBULKACTIONTAKEN']")
	WebElement selectCaseMasterBulkActionTaken;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlCasesAssignedTo']")
	WebElement selectDdlCasesAssignedTo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoBtn;

	// Are you sure you want to allocate selected Cases to "Shariq Abbas" ?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Yes')]")
	WebElement clickOnActionConfAlertYesBtn;
	
	// Client Portal Count-- Get Total Records - 185 
	@FindBy(xpath = "//h4[contains(text(),'Client Portal Count')]")
	@CacheLookup
	WebElement verifyClientPortalCountText;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement getCasesTotalRecords;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'All selected cases were successfully allocated to QC Team Member.')]")
	WebElement verifyCaseSuccessfullyAllocated;

	// (Docs Quality)--Bridge --Insufficient
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectDocsQcQuality;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/div[1]/h4[2]/a")
	WebElement clickOnDocsQtLoadResultLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[1]/ul/li[3]/a")
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

	// Credit Default --Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/h2[1]")
	WebElement verifyCaseActionsSummary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[4]/tbody[1]/tr[1]/td[8]/a[1]/img[1]")
	WebElement clickOnCreditDefaultQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnMarkAsDQCDone;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check is successfully released to Verification')]")
	WebElement verifyMarkAsDQCDoneMsg;

	// Criminal Records Verification-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form[1]/table[4]/tbody/tr[2]/td[8]/a/img")
	WebElement clickOnCriminalRecordsQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnCriminalRecordsMarkAsDQCDone;

	// Current Address Verification-- Check Type (QC Done)Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form[1]/table[4]/tbody/tr[3]/td[8]/a/img")
	WebElement clickOnCurrentAddressQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnCurrentAddressMarkAsDQCDone;

	// Current Employment Verification-- Check Type (QC Done)Checks Summary (QC
	// Check list--Yes Fields)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form[1]/table[4]/tbody/tr[4]/td[8]/a/img")
	WebElement clickOnCurrentEmploymentQcDoneImg;
	
	// QC Check list
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectTenureMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectDesignationMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectCtcMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnMarkQcChecklistDoneBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnCurrentEmploymentAsDQCDone;

	// CV Validation--Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[5]/td[8]/a/img")
	WebElement clickOnCvValidationQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnCvValidationAsDQCDone;

	// Education Verification W----Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[6]/td[8]/a/img")
	WebElement clickOnEducationVerificationWQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnEducationVerificationWAsDQCDone;

	// Global Database Check----Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[7]/td[8]/a/img")
	WebElement clickOnGlobalDatabaseQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnGlobalDatabaseAsDQCDone;

	// India Court Record Check through Law Firm----Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[8]/td[8]/a/img")
	WebElement clickOnIndiaCourtRecordQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndiaCourtRecordAsDQCDone;

	// Indian Database Verification----Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[9]/td[8]/a/img")
	WebElement clickOnIndianDatabaseQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnIndianDatabaseAsDQCDone;

	// National Identity Check--Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[10]/td[8]/a/img")
	WebElement clickOnNationalIdentityQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnNationalIdentityAsDQCDone;

	// PAN No Verification--Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[11]/td[8]/a/img")
	WebElement clickOnPanNoVerificationQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPanNoVerificationAsDQCDone;

	// Permanent Address Verification --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[5]/tbody[1]/tr[2]/td[3]/span[1]/button[1]")
	WebElement scrollViewReviewBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[12]/td[8]/a/img")
	WebElement clickOnPermanentAddressQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPermanentAddressAsDQCDone;

	// Previous Employment Verification--Checks Summary-Check list--Yes Fields)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[13]/td[8]/a/img")
	WebElement clickOnPreviousEmploymentQcDoneImg;

	// QC Check list
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectPreviousEmpTenureMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectPreviousEmpDesignationMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectPreviousEmpCtcMappedCorrectlyYes;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPreviousEmpMarkQcChecklistDoneBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnPreviousEmploymentAsDQCDone;

	// Professional Reference Check --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[4]/tbody/tr[14]/td[8]/a/img")
	WebElement clickOnProfessionalRefQcDoneImg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnAction']")
	WebElement clickOnProfessionalRefAsDQCDone;

	// QC Check list-- Correct Client & location selected
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/select[1]")
	WebElement selectCorrectClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")
	WebElement selectCorrectProcessMapped;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[3]/td[2]/select[1]")
	WebElement selectClientSpecificFields;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[4]/td[2]/select[1]")
	WebElement selectCandidateDetailsMapped;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[5]/td[2]/select[1]")
	WebElement selectChecksRaisedCorrectly;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[2]/table[1]/tbody[1]/tr[6]/td[2]/select[1]")
	WebElement selectReadCsisInstructions;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='csis_count']")
	WebElement txtNoOfChecks;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='qc_checklist_btn']")
	WebElement clickOnQcCheckListBtn;

	// Action Required --There is a difference in the no. of checks raised and no.
	// of checks given by you, Please select action
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='action_taken']")
	WebElement selectActionTaken;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='btn-action']")
	WebElement clickOnActionSubmitBtn;

	// Case QC - Review --Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCaseLevelComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCaseLevelComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='case_action_taken']")
	WebElement selectReleseForVerification;

	// Action Confirmation Alert-- There are 1 overlapping tenures between
	// employment checks.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok, I Understood')]")
	WebElement clickOnOkIUnderstoodBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCASELEVEL']")
	WebElement selectCaseLevelSenior;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnSubmit']")
	WebElement clickOnReviewBtn;

	// Case QC - Review --Checks Summary-------Success Page
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='cases_comments']")
	WebElement txtCaseLevelCommentCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='case_action_taken']")
	WebElement selectReleseForVerificationCheck;

	// Action Confirmation Alert-- There are 1 overlapping tenures between
	// employment checks.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok, I Understood')]")
	WebElement clickOnOkIUnderstoodBtnCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCASELEVEL']")
	WebElement selectCaseLevelSeniorCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnSubmit']")
	WebElement clickOnReviewBtnCheck;

	// The Case was successfully released for Verification.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'The Case was successfully released for Verification.')]")
	WebElement verifyReleasedForVerificationMessage;

	// Allocator-- (Super Admin)
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

	// Verifier --(Super Admin)
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
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[1]/td[3]/a")
	WebElement clickOnCheckIdNumber;

	// Antecedents to Verify --(Save Verified Data)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[7]/tbody/tr[1]/td[3]/input[2]")
	WebElement txtAntecedentsPinCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[7]/tbody/tr[2]/td[3]/select")
	WebElement selectAntecedentsVerificationType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/textarea[1]")
	WebElement txtAntecedentsVerifiedFrom;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[4]/td[3]/input[2]")
	WebElement txtAntecedentsRelationshipWithCandidate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[5]/td[3]/input[2]")
	WebElement txtAntecedentsDurationofStay;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[6]/td[3]/input[2]")
	WebElement txtAntecedentsDateOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[7]/td[3]/textarea[1]")
	WebElement txtAntecedentsAnyOtherComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[8]/td[3]/textarea[1]")
	WebElement txtAntecendentsAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[9]/td[3]/input[2]")
	WebElement txtAntecendentsExecutiveName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[10]/td[3]/input[2]")
	WebElement txtAntecendentsTimeofVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[11]/td[3]/input[2]")
	WebElement txtAntecendentsGateOfColor;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[12]/td[3]/input[2]")
	WebElement txtAntecendentsColorOfBuilding;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[13]/td[3]/input[2]")
	WebElement txtAntecendentsPeriodofStay;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[14]/td[3]/textarea[1]")
	WebElement txtAntecendentsNewAddressDetails;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[15]/td[3]/select[1]")
	WebElement selectAntecendentsResidenceType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='chk_unconfirmed']")
	WebElement checkCheckBoxUntraceable;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[10]/td[3]/select[1]")
	WebElement selectResidenceType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[13]/td[3]/select[1]")
	WebElement selectVerificationType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='Save_Data']")
	WebElement clickOnSaveVerifiedDataBtn;

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

	// Mark Insufficiency Cost Approval Required
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Professional Reference Check')]")
	WebElement clickOnProfessionalReferenceCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[8]/tbody[1]/tr[2]/td[3]/textarea[1]")
	WebElement txtRefereeNameAndDetails;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='chk_not_verified']")
	WebElement checkCheckBoxNotVerified;
	
	// Antecedents to Verify 
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[8]/tbody[1]/tr[3]/td[3]/select[1]")
	WebElement selectResonForLeaving;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[8]/tbody[1]/tr[8]/td[3]/select[1]")
	WebElement selectCandidate;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='Save_Data']")
	WebElement clickOnSaveVerifiedDataButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectRaiseInsuffAtionName;

	// Case Check - Mark Insufficiency--Reason For Insuff
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='insuff_type']")
	WebElement selectReasonForInsufficiency;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtCostApprovalComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='insuff_cost']")
	WebElement txtCostApproval;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Domestic')]")
	WebElement clickOnDomesticRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[5]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCostApprovalMarkAsInsufficientBtn;

	// Mark Insufficiency Pan Number Check (PAN No Verification)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification')]")
	WebElement clickOnPanNoVerification;
	
	// Copy Stated
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='chk_copy_stated']")
	WebElement clickOnChkCopyStated;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[2]/td[3]/input[2]")
	WebElement txtDateofVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[3]/td[3]/input[2]")
	WebElement txtTimeOfVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[1]/td[3]/input[2]")
	WebElement txtPanCardNumber;

	// Mark Insufficiency Indian DataBase Check (Indian Database Verification)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Indian Database Verification')]")
	WebElement clickOnIndianDataBaseVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[7]/tbody[1]/tr[8]/td[3]/select[1]")
	WebElement selectCriminalVerification;

	// Reason for insufficiency --Both (Select Insufficiency Reason)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='insuff_type']")
	WebElement selectBothReasonInsuffType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='insuff_comment']")
	WebElement txtBothInsuffTypeComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='insuff_cost']")
	WebElement txtBothInsuffTypeCost;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Domestic')]")
	WebElement clickOnBothInsuffTypeDomesticRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[5]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnBothInsuffTypeMarkAsInsufficientBtn;

	// Check is successfully marked as Insufficient.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Check is successfully marked as Insufficient.')]")
	WebElement verifyMarkedAsInsufficientMsg;

	// Insufficiency Fulfillment -- Super Admin
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserInsuffFulfillment;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[1]/h4[2]/a")
	WebElement clickOnInsuffLoadResultLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div/div[2]/table/tbody/tr/td[2]/a")
	WebElement clickOnInsuffRespondediBridgeCount;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/table/tbody/tr[4]/td[3]/a")
	WebElement clickOnBtTotalCasesCount;

	// Mobile Number
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='mobile_no']")
	WebElement txtMobileNumber;

	// Client: British Telecom-- Action-Review
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/a")
	WebElement clickOnBtActionReviewBtn;

	// Case Insufficiency Fulfill Summary-- Insufficiency fulfillment action
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseChecks']")
	WebElement selectInsufficiencyFulfillmentAction;

	// For Indian Database Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[2]/tbody[1]/tr[4]/td[1]/div[3]/div[1]/select[1]")
	WebElement selectInsufficiencyIndianDatabaseFulfillmentAction;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[2]/tbody/tr[1]/td/div[3]/textarea")
	WebElement txtInsuffComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[2]/tbody[1]/tr[4]/td[1]/div[3]/textarea[1]")
	WebElement txtIndianDatabaseInsuffComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='submit_btn_attach_proof']")
	WebElement clickOnFullFillInsuffBtn;

	// Verify the Updated Successfully Message
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Updated Successfully')]")
	WebElement verifyUpdatedSuccessfullyMsg;

	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Verify Docs Qc Allocator-- Bridge Portal
	public void superAdminDocsQcAllocator() throws InterruptedException, IOException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectDocsQcAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectDocsQcAllocator, "Docs QC Allocator");
		//Select docsQCAllocator = new Select(selectDocsQcAllocator);
		//docsQCAllocator.selectByIndex(24);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		Thread.sleep(3000);
//		wait = new WebDriverWait(ldriver, 360);
//		wait.until(ExpectedConditions.visibilityOf(clickOnLoadResultLink));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnLoadResultLink);
//		clickOnLoadResultLink.click();
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOniBridgeCountAllNo));
		JavaScriptManuplator.javaScriptExecutor(clickOniBridgeCountAllNo, "arguments[0].click()", ldriver);
		// Client Portal Count
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyClientPortalCount));
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber[] = data.split(" ");
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='"+arsNumber[2]+"'", txtSearchArsNumber);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkBoxCheckedClientCaseAll));
		checkBoxCheckedClientCaseAll.click();
		// checkBoxCheckedBritishTelecom.click();
		Select caseMasterBulkActionTaken = new Select(selectCaseMasterBulkActionTaken);
		caseMasterBulkActionTaken.selectByIndex(2);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDdlCasesAssignedTo));
		Select ddlCasesAssignedTo = new Select(selectDdlCasesAssignedTo);
		ddlCasesAssignedTo.selectByVisibleText("Shariq Abbas");
		clickOnGoBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnActionConfAlertYesBtn));
		clickOnActionConfAlertYesBtn.click();
		Thread.sleep(1000);
	}
	
	// Verify Docs Qc Allocator-- For Sme Portal, Bridge Portal sapna
		public void superSmeAdminDocsQcAllocator() throws InterruptedException, IOException {
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(selectDocsQcAllocator));
			JavaScriptManuplator.selectOptionFromDropDown(selectDocsQcAllocator, "Docs QC Allocator");
			//Select docsQCAllocator = new Select(selectDocsQcAllocator);
			//docsQCAllocator.selectByIndex(24);
			Thread.sleep(5000);
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnDashboard);
			wait = new WebDriverWait(ldriver, 360);
			Thread.sleep(4000);
			clickOnLoadResultLink.click();
			wait.until(ExpectedConditions.visibilityOf(clickOniBridgeCountAllNo));
			clickOniBridgeCountAllNo.click();
			
			// Client Portal Count
			wait = new WebDriverWait(ldriver, 360);
			wait.until(ExpectedConditions.visibilityOf(verifyClientPortalCount));
			String data = new String(Files.readAllBytes(Paths.get("copyInitiateSelfCaseArs.txt")));
			String arsNumber[] = data.split(" ");
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].value='"+arsNumber[0]+"'", txtSearchArsNumber);
			Thread.sleep(2000);
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnSearchBtn);
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(checkBoxCheckedClientCaseAll));
			checkBoxCheckedClientCaseAll.click();
			// checkBoxCheckedBritishTelecom.click();
			Select caseMasterBulkActionTaken = new Select(selectCaseMasterBulkActionTaken);
			caseMasterBulkActionTaken.selectByIndex(2);
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(selectDdlCasesAssignedTo));
			Select ddlCasesAssignedTo = new Select(selectDdlCasesAssignedTo);
			ddlCasesAssignedTo.selectByVisibleText("Shariq Abbas");
			clickOnGoBtn.click();
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(clickOnActionConfAlertYesBtn));
			clickOnActionConfAlertYesBtn.click();
			Thread.sleep(1000);
		}
		
		// Verify Docs Qc Allocator-- For Sme Portal, Bridge Portal sapna
		public void superCandidateSmeAdminDocsQcAllocator() throws InterruptedException, IOException {
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(selectDocsQcAllocator));
			//JavaScriptManuplator.waitForElementPresent(ldriver, selectDocsQcAllocator, 60);
			JavaScriptManuplator.selectOptionFromDropDown(selectDocsQcAllocator, "Docs QC Allocator");
			//Select docsQCAllocator = new Select(selectDocsQcAllocator);
			//docsQCAllocator.selectByIndex(24);
			Thread.sleep(3000);
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnDashboard);
			Thread.sleep(2000);
			clickOnLoadResultLink.click();
			wait = new WebDriverWait(ldriver, 360);
			wait.until(ExpectedConditions.visibilityOf(clickOniBridgeCountAllNo));
			clickOniBridgeCountAllNo.click();
			
			// Client Portal Count
			wait = new WebDriverWait(ldriver, 360);
			wait.until(ExpectedConditions.visibilityOf(verifyClientPortalCount));
			String data = new String(Files.readAllBytes(Paths.get("getIvcCaseArs.txt")));
			String arsNumber[] = data.split(" ");
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].value='"+arsNumber[0]+"'", txtSearchArsNumber);
			Thread.sleep(2000);
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnSearchBtn);
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(checkBoxCheckedClientCaseAll));
			checkBoxCheckedClientCaseAll.click();
			// checkBoxCheckedBritishTelecom.click();
			Select caseMasterBulkActionTaken = new Select(selectCaseMasterBulkActionTaken);
			caseMasterBulkActionTaken.selectByIndex(2);
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(selectDdlCasesAssignedTo));
			Select ddlCasesAssignedTo = new Select(selectDdlCasesAssignedTo);
			ddlCasesAssignedTo.selectByVisibleText("Shariq Abbas");
			clickOnGoBtn.click();
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(clickOnActionConfAlertYesBtn));
			clickOnActionConfAlertYesBtn.click();
			Thread.sleep(1000);
		}
	
	public String verifyCaseSuccessAllocatedMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseSuccessfullyAllocated));
		return verifyCaseSuccessfullyAllocated.getText();
	}

	// Verify Docs Quality-- Bridge Portal
	public void superAdminDocsQuality(String arsNumber) throws InterruptedException, IOException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(selectDocsQcQuality));
		JavaScriptManuplator.selectOptionFromDropDown(selectDocsQcQuality, "Docs Quality");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(clickOnDocsQtLoadResultLink));
		JavaScriptManuplator.javaScriptExecutor(clickOnDocsQtLoadResultLink, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyCasesforQualityReview));
		String data = new String(Files.readAllBytes(Paths.get("outputArs.txt")));
		String arsNumber1[] = data.split(" ");

		// new added

		// How many rows in table
		int rows = ldriver
				.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr"))
				.size();
		// Get Client name, and clicked on British Telecom count number.
		for (int r = 1; r <= rows; r++) {
			String clientName = ldriver.findElement(By
					.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[" + r + "]/td[1]"))
					.getText();
			if (clientName.contains("British Telecom")) {

				WebElement element = ldriver.findElement(
						By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[" + r + "]/td[3]/a[1]"));
				element.click();
				break;
			}
		}
		/*
		 * clickOnDocQualityCases.click(); WebElement element =
		 * ldriver.findElement(By.xpath("//a[contains(text(),'Search Case')]")); Actions
		 * actions = new Actions(ldriver);
		 * actions.moveToElement(element).click().perform(); wait = new
		 * WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(txtArsNumber));
		 * txtArsNumber.sendKeys(arsNumber); clickOnSearchCaseBtn.click();
		 */

		// added ars number

		int row = ldriver
				.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr"))
				.size();
		// Get Client name, and clicked on British Telecom count number.
		for (int r = 1; r <= row; r++) {
			String arsNumbers = ldriver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[" + r + "]/td[4]"))
					.getText();
			if (arsNumbers.contains(arsNumber1[2])) {

				WebElement element = ldriver.findElement(
						By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[" + r
								+ "]/td[12]/select[1]"));
				Select ele = new Select(element);
				ele.selectByIndex(3);
				clickOnActionConfirmationAlertYesBtn.click();
				break;
			}
		}

		/*
		 * wait = new WebDriverWait(ldriver, 60);
		 * wait.until(ExpectedConditions.visibilityOf(selectActionReviewForQuality));
		 * Select actionReviewForQuality = new Select(selectActionReviewForQuality);
		 * actionReviewForQuality.selectByIndex(3); wait = new WebDriverWait(ldriver,
		 * 60); wait.until(ExpectedConditions.visibilityOf(
		 * clickOnActionConfirmationAlertYesBtn));
		 * clickOnActionConfirmationAlertYesBtn.click();
		 */
		Thread.sleep(1000);
	}

	public String verifyCaseQCReviewArsNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseQCReviewArsNumber));
		return verifyCaseQCReviewArsNumber.getText();
	}

	// Check Type -- (QC Done)--Checks Summary)
	public void verifyQcDoneChecksSummary(String caseComments, String noOfChecks, String caseComment)
			throws InterruptedException {
		// Credit Default --Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCreditDefaultQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCreditDefaultQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCreditDefaultQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnMarkAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnMarkAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkAsDQCDone);

		// Criminal Records Verification-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCriminalRecordsQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCriminalRecordsQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCriminalRecordsQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCriminalRecordsMarkAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCriminalRecordsMarkAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCriminalRecordsMarkAsDQCDone);

		// Current Address Verification-- Check Type (QC Done)Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressMarkAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressMarkAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressMarkAsDQCDone);

		// Current Employment Verification-- Check Type (QC Done)Checks Summary(QC Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmploymentQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmploymentQcDoneImg);

		// QC Check list
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnMarkQcChecklistDoneBtn);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(selectTenureMappedCorrectlyYes));
		Select tenureMappedCorrectlyYes = new Select(selectTenureMappedCorrectlyYes);
		tenureMappedCorrectlyYes.selectByIndex(2);
		Select designationMappedCorrectlyYes = new Select(selectDesignationMappedCorrectlyYes);
		designationMappedCorrectlyYes.selectByIndex(2);
		Select ctcMappedCorrectlyYes = new Select(selectCtcMappedCorrectlyYes);
		ctcMappedCorrectlyYes.selectByIndex(2);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnMarkQcChecklistDoneBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmploymentAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmploymentAsDQCDone);

		// CV Validation--Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidationAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidationAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidationAsDQCDone);

		// Education Verification W----Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerificationWQcDoneImg);

		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerificationWQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationWQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerificationWAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerificationWAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerificationWAsDQCDone);

		// Global Database Check----Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalDatabaseQcDoneImg);

		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalDatabaseQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalDatabaseQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalDatabaseAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalDatabaseAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalDatabaseAsDQCDone);

		// India Court Record Check through Law Firm----Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecordQcDoneImg);

		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecordQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecordQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecordAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecordAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecordAsDQCDone);

		// Indian Database Verification----Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianDatabaseQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDatabaseQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianDatabaseQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianDatabaseAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDatabaseAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndianDatabaseAsDQCDone);

		// National Identity Check--Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentityQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentityQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentityQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentityAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentityAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentityAsDQCDone);

		// PAN No Verification--Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoVerificationQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoVerificationQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoVerificationQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoVerificationAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoVerificationAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoVerificationAsDQCDone);

		// Permanent Address Verification --Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddressAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddressAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddressAsDQCDone);

		// Previous Employment Verification--Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmploymentQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmploymentQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmploymentQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmpMarkQcChecklistDoneBtn);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(selectPreviousEmpTenureMappedCorrectlyYes));

		Select previousTenureMappedCorrectlyYes = new Select(selectPreviousEmpTenureMappedCorrectlyYes);
		previousTenureMappedCorrectlyYes.selectByIndex(2);

		Select previousDesignationMappedCorrectlyYes = new Select(selectPreviousEmpDesignationMappedCorrectlyYes);
		previousDesignationMappedCorrectlyYes.selectByIndex(2);

		Select previousCtcMappedCorrectlyYes = new Select(selectPreviousEmpCtcMappedCorrectlyYes);
		previousCtcMappedCorrectlyYes.selectByIndex(2);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmpMarkQcChecklistDoneBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmploymentAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmploymentAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmploymentAsDQCDone);

		// Professional Reference Check --Checks Summary
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalRefQcDoneImg);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalRefQcDoneImg));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalRefQcDoneImg);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalRefAsDQCDone);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalRefAsDQCDone));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalRefAsDQCDone);

		// Case QC - Review --Checks Summary-- Case level Comments (if any)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtCaseLevelComments);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(txtCaseLevelComments));
		txtCaseLevelComments.sendKeys(caseComments);

		Select releseForVerification = new Select(selectReleseForVerification);
		releseForVerification.selectByIndex(2);

		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkIUnderstoodBtn));
		clickOnOkIUnderstoodBtn.click();

		Select caseLevelSenior = new Select(selectCaseLevelSenior);
		caseLevelSenior.selectByIndex(3);
		// clickOnReviewBtn.click();

		// QC Check list-- Correct Client & location selected
		Select correctClient = new Select(selectCorrectClient);
		correctClient.selectByIndex(2);

		Select correctProcessMapped = new Select(selectCorrectProcessMapped);
		correctProcessMapped.selectByIndex(2);

		Select clientSpecificFields = new Select(selectClientSpecificFields);
		clientSpecificFields.selectByIndex(2);

		Select candidateDetailsMapped = new Select(selectCandidateDetailsMapped);
		candidateDetailsMapped.selectByIndex(2);

		Select checksRaisedCorrectly = new Select(selectChecksRaisedCorrectly);
		checksRaisedCorrectly.selectByIndex(2);

		Select readCsisInstructions = new Select(selectReadCsisInstructions);
		readCsisInstructions.selectByIndex(2);
		txtNoOfChecks.sendKeys(noOfChecks);
		clickOnQcCheckListBtn.click();

		// Action Required -- Confirmation Popup
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(selectActionTaken));
		Select actionTaken = new Select(selectActionTaken);
		actionTaken.selectByIndex(2);
		clickOnActionSubmitBtn.click();

		// Case QC - Review --Checks Summary-------Success Page
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnReviewBtnCheck);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Testuser'", txtCaseLevelCommentCheck);
		// txtCaseLevelCommentCheck.sendKeys(caseComment);

		Select releseForVerificationCheck = new Select(selectReleseForVerificationCheck);
		releseForVerificationCheck.selectByIndex(2);

		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkIUnderstoodBtnCheck));
		clickOnOkIUnderstoodBtnCheck.click();

		Select caseLevelSeniorCheck = new Select(selectCaseLevelSeniorCheck);
		caseLevelSeniorCheck.selectByIndex(3);
		clickOnReviewBtnCheck.click();
		Thread.sleep(1000);

	}

	// The Case was successfully released for Verification.
	public String verifyReleasedForVerificationMsg() {
		wait = new WebDriverWait(ldriver, 360);
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
		wait = new WebDriverWait(ldriver, 600);
		wait.until(ExpectedConditions.visibilityOf(verifyEmploymentUan));
		txtArsNumberAllocator.sendKeys(arsNumberAllocator);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchAllocatorBtn);
		// clickOnSearchAllocatorBtn.click();

		wait = new WebDriverWait(ldriver, 600);
		wait.until(ExpectedConditions.visibilityOf(clickOnApplicableCountNumber));
		clickOnApplicableCountNumber.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 600);
		wait.until(ExpectedConditions.visibilityOf(checkAllCheckBoxCandidate));
		checkAllCheckBoxCandidate.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectAssignToVerifier);
		Select assignToVerifierName = new Select(selectAssignToVerifier);
		assignToVerifierName.selectByIndex(1);

		Select teamMemberName = new Select(selectTeamMemberName);
		teamMemberName.selectByIndex(7);
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
	public void superAdminVerifier(String pasteArsNo, String pinCode, String verifiedFrom, String relationshipName,
			String durationOfStay, String dateOfVerification, String comments, String address, String executiveName,
			String timeofVerification, String gateOfColor, String colorOfBuilding, String periodofStay,
			String newAddress, String insufficientComment) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 360);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		// clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckIdNumber));
		clickOnCheckIdNumber.click();

		// Antecedents to Verify --(Save Verified Data)
		/*
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecedentsPinCode); txtAntecedentsPinCode.sendKeys(pinCode);
		 * 
		 * Select antecedentsVerificationType = new
		 * Select(selectAntecedentsVerificationType);
		 * antecedentsVerificationType.selectByIndex(2);
		 * 
		 * txtAntecedentsVerifiedFrom.sendKeys(verifiedFrom);
		 * txtAntecedentsRelationshipWithCandidate.sendKeys(relationshipName);
		 * txtAntecedentsDurationofStay.sendKeys(durationOfStay);
		 * txtAntecedentsDateOfVerification.sendKeys(dateOfVerification);
		 * txtAntecedentsAnyOtherComments.sendKeys(comments);
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecendentsAddress); txtAntecendentsAddress.sendKeys(address);
		 * txtAntecendentsExecutiveName.sendKeys(executiveName);
		 * txtAntecendentsTimeofVerification.sendKeys(timeofVerification);
		 * txtAntecendentsGateOfColor.sendKeys(gateOfColor);
		 * txtAntecendentsColorOfBuilding.sendKeys(colorOfBuilding);
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecendentsPeriodofStay);
		 * txtAntecendentsPeriodofStay.sendKeys(periodofStay);
		 * txtAntecendentsNewAddressDetails.sendKeys(newAddress);
		 * 
		 * Select antecendentsResidenceType = new
		 * Select(selectAntecendentsResidenceType);
		 * antecendentsResidenceType.selectByIndex(5);
		 */

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBoxUntraceable);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBoxUntraceable);

		Select residenceType = new Select(selectResidenceType);
		residenceType.selectByIndex(5);

		Select verificationType = new Select(selectVerificationType);
		verificationType.selectByIndex(2);
		clickOnSaveVerifiedDataBtn.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCaseCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseCheckVerification));
		Select caseCheckVerification = new Select(selectCaseCheckVerification);
		caseCheckVerification.selectByIndex(3);

		// Case Check - Mark Insufficiency
		Select selectReasonForInsufficiency = new Select(selectSelectReasonForInsufficiency);
		selectReasonForInsufficiency.selectByIndex(1);
		// selectReasonForInsufficiency.selectByIndex(index);
		txtInsufficientComment.sendKeys(insufficientComment);
		Thread.sleep(1000);
		clickOnMarkAsInsufficientBtn.click();
		Thread.sleep(1000);
	}

	// Mark Insufficiency Cost Approval Required (ProfessionalReferenceCheck)
	public void superAdminVerifierCostApproval(String pasteArsNo, String refereeName, String costApproval, String cost)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		// clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalReferenceCheck));
		clickOnProfessionalReferenceCheck.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBoxNotVerified);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Ashish Kumar'", txtRefereeNameAndDetails);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBoxNotVerified);
		// Antecedents to Verify 
		/*Select leavingReason = new Select(selectResonForLeaving);
		leavingReason.selectByIndex(2);
		Select candidate = new Select(selectCandidate);
		candidate.selectByIndex(2);
		Thread.sleep(1000);*/
		////////////////////////////////////////////
		//clickOnSaveVerifiedDataButton.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectRaiseInsuffAtionName);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectRaiseInsuffAtionName));
		Select raiseInsuffAtionName = new Select(selectRaiseInsuffAtionName);
		raiseInsuffAtionName.selectByIndex(5);

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectReasonForInsufficiency));
		Select costApprovalReasonForInsuff = new Select(selectReasonForInsufficiency);
		costApprovalReasonForInsuff.selectByIndex(2);
		txtCostApprovalComment.sendKeys(costApproval);
		Thread.sleep(1000);
		txtCostApproval.sendKeys(cost);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnDomesticRadioBtn, "arguments[0].click()", ldriver);
		//clickOnDomesticRadioBtn.click();
		Thread.sleep(1000);
		clickOnCostApprovalMarkAsInsufficientBtn.click();
		Thread.sleep(1000);
	}

	// Mark Insufficiency -- Pan Number Check (Pan Number Check)
	public void superAdminVerifierPanNumberCheck(String pasteArsNo, String dateVerification, String timeVerification,
			String panaNumber, String comments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);// ,int index
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		// clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoVerification));
		clickOnPanNoVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnChkCopyStated);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnChkCopyStated);
		
		/*js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='21-Jan-2021'", txtDateofVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='2PM'", txtTimeOfVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='AKST234'", txtPanCardNumber);*/
		Thread.sleep(5000);
		clickOnSaveVerifiedDataButton.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectRaiseInsuffAtionName);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectRaiseInsuffAtionName));
		Select raiseInsuffAtionName = new Select(selectRaiseInsuffAtionName);
		raiseInsuffAtionName.selectByIndex(5);

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectReasonForInsufficiency));
		Select costApprovalReasonForInsuff = new Select(selectReasonForInsufficiency);
		costApprovalReasonForInsuff.selectByIndex(1);
		txtCostApprovalComment.sendKeys(comments);
		Thread.sleep(1000);
		clickOnCostApprovalMarkAsInsufficientBtn.click();
		Thread.sleep(1000);
	}

	// Mark Insufficiency -- Indian Database Check (Indian Database Verification)
	public void superAdminVerifierIndianDatabaseCheck(String pasteArsNo, String comments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		// clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDataBaseVerification));
		clickOnIndianDataBaseVerification.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCriminalVerification);

		Select criminalVerification = new Select(selectCriminalVerification);
		criminalVerification.selectByIndex(5);
		clickOnSaveVerifiedDataButton.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectRaiseInsuffAtionName);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectRaiseInsuffAtionName));
		Select raiseInsuffAtionName = new Select(selectRaiseInsuffAtionName);
		raiseInsuffAtionName.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectReasonForInsufficiency));
		Select costApprovalReasonForInsuff = new Select(selectReasonForInsufficiency);
		costApprovalReasonForInsuff.selectByIndex(1);
		txtCostApprovalComment.sendKeys(comments);
		Thread.sleep(1000);
		clickOnCostApprovalMarkAsInsufficientBtn.click();
		Thread.sleep(1000);
	}

	// Reason for insufficiency --Both (Select Insufficiency Reason)
	public void superAdminInsuffTypeBoth(String pasteArsNo, String pinCode, String verifiedFrom,
			String relationshipName, String durationOfStay, String dateOfVerification, String comments, String address,
			String executiveName, String timeofVerification, String gateOfColor, String colorOfBuilding,
			String periodofStay, String newAddress, String insufficientComment, String comment, String costInsuff)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);// ,int index
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtArsNumberPaste.sendKeys(pasteArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCopmpleteSearchBtn);
		// clickOnCopmpleteSearchBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPendingCountNumber));
		clickOnPendingCountNumber.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckIdNumber));
		clickOnCheckIdNumber.click();

		// Antecedents to Verify --(Save Verified Data)
		/*
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecedentsPinCode); txtAntecedentsPinCode.sendKeys(pinCode);
		 * 
		 * Select antecedentsVerificationType = new
		 * Select(selectAntecedentsVerificationType);
		 * antecedentsVerificationType.selectByIndex(2);
		 * 
		 * txtAntecedentsVerifiedFrom.sendKeys(verifiedFrom);
		 * txtAntecedentsRelationshipWithCandidate.sendKeys(relationshipName);
		 * txtAntecedentsDurationofStay.sendKeys(durationOfStay);
		 * txtAntecedentsDateOfVerification.sendKeys(dateOfVerification);
		 * txtAntecedentsAnyOtherComments.sendKeys(comments);
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecendentsAddress); txtAntecendentsAddress.sendKeys(address);
		 * txtAntecendentsExecutiveName.sendKeys(executiveName);
		 * txtAntecendentsTimeofVerification.sendKeys(timeofVerification);
		 * txtAntecendentsGateOfColor.sendKeys(gateOfColor);
		 * txtAntecendentsColorOfBuilding.sendKeys(colorOfBuilding);
		 * 
		 * js = (JavascriptExecutor) ldriver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",
		 * txtAntecendentsPeriodofStay);
		 * txtAntecendentsPeriodofStay.sendKeys(periodofStay);
		 * txtAntecendentsNewAddressDetails.sendKeys(newAddress);
		 * 
		 * Select antecendentsResidenceType = new
		 * Select(selectAntecendentsResidenceType);
		 * antecendentsResidenceType.selectByIndex(5);
		 */
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBoxUntraceable);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBoxUntraceable);

		Select residenceType = new Select(selectResidenceType);
		residenceType.selectByIndex(5);

		Select verificationType = new Select(selectVerificationType);
		verificationType.selectByIndex(2);
		clickOnSaveVerifiedDataBtn.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCaseCheckVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCaseCheckVerification));
		Select caseCheckVerification = new Select(selectCaseCheckVerification);
		caseCheckVerification.selectByIndex(3);

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectBothReasonInsuffType));
		Select bothReasonInsuffType = new Select(selectBothReasonInsuffType);
		bothReasonInsuffType.selectByIndex(3);
		txtBothInsuffTypeComments.sendKeys(comment);
		txtBothInsuffTypeCost.sendKeys(costInsuff);
		clickOnBothInsuffTypeDomesticRadioBtn.click();
		Thread.sleep(1000);
		clickOnBothInsuffTypeMarkAsInsufficientBtn.click();
		Thread.sleep(1000);
	}

	public String verifyMarkedAsInsufficientMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyMarkedAsInsufficientMsg));
		return verifyMarkedAsInsufficientMsg.getText();
	}

	// Insufficiency Fulfillment--Approve -- Super Admin
	public void superAdminInsufficiencyFulfillment(String mobileNo, String insuffComment) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectUserInsuffFulfillment));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserInsuffFulfillment, "Insufficiency Fulfilment");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffLoadResultLink));
		JavaScriptManuplator.javaScriptExecutor(clickOnInsuffLoadResultLink, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffRespondediBridgeCount));
		JavaScriptManuplator.javaScriptExecutor(clickOnInsuffRespondediBridgeCount, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		//clickOnInsuffRespondediBridgeCount.click();
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(clickOnBtTotalCasesCount));
		clickOnBtTotalCasesCount.click();

		// Client: British Telecom -- Action-Review
		String parent = ldriver.getWindowHandle();
		clickOnBtActionReviewBtn.click();
		Set<String> allWindows = ldriver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		ldriver.switchTo().window(tabs.get(0));
		ldriver.close();
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				ldriver.switchTo().window(child);
				// Case Insufficiency Fulfill Summary-- Insufficiency fulfillment action
				wait = new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(txtMobileNumber));
				txtMobileNumber.clear();
				txtMobileNumber.sendKeys(mobileNo);

				js = (JavascriptExecutor) ldriver;
				js.executeScript("arguments[0].scrollIntoView(true);", clickOnFullFillInsuffBtn);
				wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(selectInsufficiencyFulfillmentAction));
				Select insufficiencyFulfillmentAction = new Select(selectInsufficiencyFulfillmentAction);
				insufficiencyFulfillmentAction.selectByIndex(1);
				txtInsuffComment.sendKeys(insuffComment);
				clickOnFullFillInsuffBtn.click();
				Thread.sleep(1000);
			}
		}
	}

	// Insufficiency Fulfillment--Partially Approve -- Super Admin
	public void superAdminInsufficiencyPartiallyApproveFulfillment(String mobileNo, String insuffComment)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectUserInsuffFulfillment));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserInsuffFulfillment, "Insufficiency Fulfilment");
		//Select userInsuffFulfillment = new Select(selectUserInsuffFulfillment);
		//.selectByIndex(36);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffLoadResultLink));
		JavaScriptManuplator.javaScriptExecutor(clickOnInsuffLoadResultLink, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffRespondediBridgeCount));
		clickOnInsuffRespondediBridgeCount.click();
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(clickOnBtTotalCasesCount));
		clickOnBtTotalCasesCount.click();

		// Client: British Telecom -- Action-Review
		String parent = ldriver.getWindowHandle();
		clickOnBtActionReviewBtn.click();
		Set<String> allWindows = ldriver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		ldriver.switchTo().window(tabs.get(0));
		ldriver.close();
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				ldriver.switchTo().window(child);
				// Case Insufficiency Fulfill Summary-- Insufficiency fulfillment action
				wait = new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(txtMobileNumber));
				txtMobileNumber.clear();
				txtMobileNumber.sendKeys(mobileNo);

				js = (JavascriptExecutor) ldriver;
				js.executeScript("arguments[0].scrollIntoView(true);", clickOnFullFillInsuffBtn);
				wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(selectInsufficiencyFulfillmentAction));
				Select insufficiencyFulfillmentAction = new Select(selectInsufficiencyFulfillmentAction);
				insufficiencyFulfillmentAction.selectByIndex(2);
				txtInsuffComment.sendKeys(insuffComment);
				clickOnFullFillInsuffBtn.click();
				Thread.sleep(1000);
			}
		}
	}

	// Insufficiency Fulfillment--Rejected -- Super Admin
	public void superAdminInsufficiencyRejectFulfillment(String mobileNo, String insuffComment)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectUserInsuffFulfillment));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserInsuffFulfillment, "Insufficiency Fulfilment");
		//Select userInsuffFulfillment = new Select(selectUserInsuffFulfillment);
		//userInsuffFulfillment.selectByIndex(36);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffLoadResultLink));
		JavaScriptManuplator.javaScriptExecutor(clickOnInsuffLoadResultLink, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffRespondediBridgeCount));
		clickOnInsuffRespondediBridgeCount.click();
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(clickOnBtTotalCasesCount));
		clickOnBtTotalCasesCount.click();

		// Client: British Telecom -- Action-Review
		String parent = ldriver.getWindowHandle();
		clickOnBtActionReviewBtn.click();
		Set<String> allWindows = ldriver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		ldriver.switchTo().window(tabs.get(0));
		ldriver.close();
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				ldriver.switchTo().window(child);

				// Case Insufficiency Fulfill Summary-- Insufficiency fulfillment action
				wait = new WebDriverWait(ldriver, 120);
				wait.until(ExpectedConditions.visibilityOf(txtMobileNumber));
				txtMobileNumber.clear();
				txtMobileNumber.sendKeys(mobileNo);

				js = (JavascriptExecutor) ldriver;
				js.executeScript("arguments[0].scrollIntoView(true);", clickOnFullFillInsuffBtn);
				wait = new WebDriverWait(ldriver, 60);
				wait.until(ExpectedConditions.visibilityOf(selectInsufficiencyIndianDatabaseFulfillmentAction));
				selectInsufficiencyIndianDatabaseFulfillmentAction.click();
				Select insufficiencyFulfillmentAction = new Select(selectInsufficiencyIndianDatabaseFulfillmentAction);
				insufficiencyFulfillmentAction.selectByIndex(3);
				// txtInsuffComment.sendKeys(insuffComment);
				txtIndianDatabaseInsuffComment.sendKeys(insuffComment);
				clickOnFullFillInsuffBtn.click();
				Thread.sleep(1000);
			}
		}
	}

	// Verify the Updated Successfully Message
	public String verifyUpdatedSuccessfullyMessage() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyUpdatedSuccessfullyMsg));
		return verifyUpdatedSuccessfullyMsg.getText();
	}
}
