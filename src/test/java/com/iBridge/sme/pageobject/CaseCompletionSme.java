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

import com.iBridge.utilities.JavaScriptManuplator;

public class CaseCompletionSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CaseCompletionSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// CAT-(Close By Client)-- (Super Admin) Bridge
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

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnArsNumber;

	// Current Address Verification -- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Current Address Verification')]")
	WebElement clickOnCurrentAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCurrentAddressCloseByClient;

	// Closed By Client--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCaseCheckCommentCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCurrentAddressCloseByClientBtn;

	// Current Employment Verification-- Checks Summary
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
	WebElement txtCurrentEmpSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCurrentEmploymentClosedByClientBtn;

	// CV Validation--Checks Summary
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
	WebElement clickOnCvValidation;

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

	// Drug Test--Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyDrugTestClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtDrugTestSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnDrugTestSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnDrugTestArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Drug Test')]")
	WebElement clickOnDrugTest;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectDrugTestCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectDrugTestCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtDrugTestSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnDrugTestClosedByClientBtn;

	// Education Verification Written-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyEducationClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEducationSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnEducationSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnEducationArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Education Verification Written')]")
	WebElement clickOnEducationVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectEducationCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectEducationCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtEducationSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnEducationClosedByClientBtn;

	// Global Regulatory Compliance and Department Database-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyGlobalClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtGlobalSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnGlobalSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnGlobalArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Global Regulatory Compliance and Debarment Databas')]")
	WebElement clickOnGlobalRegulatory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectGlobalCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectGlobalCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtGlobalSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnGlobalClosedByClientBtn;

	// India Advanced Web and Media Searches-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaAdvancedClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaAdvancedSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaAdvancedSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaAdvancedArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Advanced Web and Media Searches')]")
	WebElement clickOnIndiaAdvanced;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaAdvancedActionCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaAdvancedCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaAdvancedSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaAdvancedClosedByClientBtn;

	// India Civil Litigation Database Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCivilClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCivilSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCivilSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCivilArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Civil Litigation Database Check')]")
	WebElement clickOnIndiaCivil;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCivilCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCivilCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCivilSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCivilClosedByClientBtn;

	// India Comprehensive Criminal Record Database Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaComprehensiveClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaComprehensiveSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaComprehensiveSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaComprehensiveArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Comprehensive Criminal Record Database Check')]")
	WebElement clickOnIndiaComprehensive;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaComprehensiveCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaComprehensiveCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaComprehensiveSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaComprehensiveClosedByClientBtn;

	// India Court Record Check through Law Firm-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCourtRecordClosedByClientSuccessfullyMsg;

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
	WebElement clickOnIndiaCourtRecord;

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

	// India Court Record Database Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyCourtRecordClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCourtRecordRecordSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCourtRecordRecordSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCourtRecordArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Court Record Database Check')]")
	WebElement clickOnndiaCourtRecordDatabase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCourtRecordCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectCourtRecordCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtCourtRecordSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnCourtRecordClosedByClientBtn;

	// India Credit Default Database Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaCreditDefaultClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaCreditDefaultSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaCreditDefaultSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaCreditDefaultArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Credit Default Database Check')]")
	WebElement clickOnIndiaCreditDefault;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaCreditDefaultCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaCreditDefaultCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaCreditDefaultSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaCreditDefaultClosedByClientBtn;

	// India Database Check Level 1-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyIndiaDatabaseCheckClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtIndiaDatabaseCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnIndiaDatabaseCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnIndiaDatabaseCheckArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'India Database Check Level 1')]")
	WebElement clickOnIndiaDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectIndiaDatabaseCheckCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectIndiaDatabaseCheckCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtIndiaDatabaseCheckSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnIndiaDatabaseCheckClosedByClientBtn;

	// National Identity Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyNationalIdentityClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtNationalIdentityCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnNationalIdentityCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnNationalIdentityArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'National Identity Check')]")
	WebElement clickOnNationalIdentity;

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

	// PAN No Verification-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPanNoVerificationClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPanNoVerificationCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPanNoVerificationCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPanNoVerificationArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification')]")
	WebElement clickOnPanNoVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPanNoVerificationCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPanNoVerificationCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPanNoVerificationSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPanNoVerificationClosedByClientBtn;

	// Permanent Address Verification-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPermanentAddressClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPermanentAddressCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPermanentAddressCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPermanentAddressArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Permanent Address Verification')]")
	WebElement clickOnPermanentAddress;

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

	// Personal Reference Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPersonalReferenceClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPersonalReferenceCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPersonalReferenceCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPersonalReferenceArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Personal Reference Check')]")
	WebElement clickOnPersonalReferenceCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectPersonalReferenceCloseByClient;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckCOMMENTCATEGORY']")
	WebElement selectPersonalReferenceCategory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='closure_comments']")
	WebElement txtPersonalReferenceSpecialComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[1]/thead[1]/tr[3]/td[1]/span[1]/div[1]/input[1]")
	WebElement clickOnPersonalReferenceClosedByClientBtn;

	// Previous Employment Verification-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyPreviousEmploymentClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtPreviousEmploymentCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnPreviousEmploymentCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnPreviousEmploymentArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Previous Employment Verification')]")
	WebElement clickOnPreviousEmployment;

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

	// Professional Reference Check-- Checks Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyProfessionalReferenceClosedByClientSuccessfullyMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtProfessionalReferenceCheckSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnProfessionalReferenceCheckSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnProfessionalReferenceArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Professional Reference Check')]")
	WebElement clickOnProfessionalReference;

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

	// Current Address Verification --Checks Summary -- Case Summary Details
	// Verifier --(Super Admin)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectSuperAdminVerifier;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Digital Verification')]")
	WebElement verifyDigitalVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtCurrentAddressVerificationSearchNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnCurrentAddressSearchBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement clickOnCurrentAddressArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Current Address Verification')]")
	WebElement clickOnCurrentAddressVerification;

	// Antecedents to Verify --Current Address Verification
	// Untraceable Check Box- Antecedents
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='chk_unconfirmed']")
	WebElement checkOnUntraceableCheckBox;
	
	// sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[7]/tbody/tr[2]/td[3]/select")
	WebElement selectResidenceStatus;
	
	// sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[7]/tbody/tr[11]/td[3]/select")
	WebElement selectResidenceType;
	
	//sapna
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[2]/form/table[7]/tbody/tr[14]/td[3]/select")
	WebElement selectVerificationType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='Save_Data']")
	WebElement clickOnSaveVerifiedDataBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFIERACTION']")
	WebElement selectCloseVerificationAction;

	// Case Check - Close Verification--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFICATIONPROCEDURE']")
	WebElement selectVerifiedViaEmail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERSUMMARY']")
	WebElement selectVerificationInfo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckVERIFICATIONCOUNTRYID']")
	WebElement selectFinalVerificationCountry;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/form[1]/table[2]/thead[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[52]/td[1]/div[1]/span[1]/input[1]")
	WebElement checkCheckBox52171NoResponseReceived;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='close_verify_btn']")
	WebElement clickOnCloseVerification;

	// Verify -- Current Address Verification(Completed)--Check is successfully
	// marked
	// as "Completed".
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Current Address Verification ( Completed )')]")
	WebElement verifyCurrentAddressVerificationCompletedText;

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
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Current Address Verification')]")
	WebElement clickOnCurrentAddressVerificationCheck;

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

	// Verification Quality Allocator--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserAdminRoleVerificationQualityAllocator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts')]")
	WebElement verifyNotificationAlert;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='complete_search_no']")
	WebElement txtEnterArsNumberss;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='complete_search']")
	WebElement clickOnArsNoSearch;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr/td[11]/a")
	WebElement clickOnVerifiedCountNumbers;

	// Check List - Search Result - (14 records)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/thead[1]/tr[1]/th[1]/input[2]")
	WebElement checkOnCheckBoxChecksListAll;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='CaseCheckBULKACTIONTAKEN']")
	WebElement selectActionAllocatesToVqc;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='ddlChecksAssignedToRelease']")
	WebElement selectTeamMemberNames;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='check_comments']")
	WebElement txtCheckComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='btnGo']")
	WebElement clickOnGoButton;

	// Verification Quality Allocator Successfully Message--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyQualityAllocatorSuccesssMsg;

	// Reports Manager -- Search Report
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectUserRoleReportsManager;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notification Alerts - Reports Status')]")
	WebElement verifyNotificationAlertsReportsStatus;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[1]/ul/li[6]/a")
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

	// Case Documents Received-- Permanent Address Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[3]/div[1]/h4/a")
	WebElement clickOnPermanentSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[1]")
	WebElement submitPermanentAddress;

	// Case Documents Received-- Drug Test
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[4]/div[1]/h4/a")
	WebElement clickOnDrugTestSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[2]")
	WebElement submitDrug;

	// Case Documents Received-- Professional Reference Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[5]/div[1]/h4/a")
	WebElement clickOnProfessionalSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[3]")
	WebElement submitProfessional;
	
	// Case Documents Received-- Personal Reference Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[6]/div[1]/h4/a")
	WebElement clickOnPersonalSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[4]")
	WebElement submitPersonal;

	// Case Documents Received-- Previous Employment Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[7]/div[1]/h4/a")
	WebElement clickOnPreviousSubmitBtn;
	
	@CacheLookup
	@FindBy(how =How.XPATH, using = "(//*[@type='submit'])[5]")
	WebElement submitPrevious;

	// Case Documents Received-- PAN No Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[8]/div[1]/h4/a")
	WebElement clickOnPanSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[6]")
	WebElement submitOnPanSubmitBtn;

	// Case Documents Received-- India Advanced Web and Media Searches
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[9]/div[1]/h4/a")
	WebElement clickOnIndiaAdvancedSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[7]")
	WebElement submitOnIndiaAdvancedSubmitBtn;

	// Case Documents Received-- Current Address Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[10]/div[1]/h4/a")
	WebElement clickOnCurrentAddressSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[8]")
	WebElement submitOnCurrentSubmitBtn;

	// Case Documents Received-- Current Employment Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[11]/div[1]/h4/a")
	WebElement clickOnCurrentEmpSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[9]")
	WebElement submitOnCurrentEmpSubmitBtn;

	// Case Documents Received-- India Credit Default Database Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[12]/div[1]/h4/a")
	WebElement clickOnIndiaCreditSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[10]")
	WebElement submitOnIndiaSubmitBtn;

	// Case Documents Received-- National Identity Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[13]/div[1]/h4/a")
	WebElement clickOnNationalSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[11]")
	WebElement submitOnNationalSubmitBtn;

	// Case Documents Received-- India Civil Litigation Database Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[14]/div[1]/h4/a")
	WebElement clickOnIndiaCivilSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[12]")
	WebElement submitOnCivilSubmitBtn;

	// Case Documents Received-- India Court Record Check through Law Firm
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[15]/div[1]/h4/a")
	WebElement clickOnIndiaCourtSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[13]")
	WebElement submitOnIndiaCourtSubmitBtn;

	// Case Documents Received-- CV Validation
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[16]/div[1]/h4/a")
	WebElement clickOnCvSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[14]")
	WebElement submitOnCVSubmitBtn;

	// Case Documents Received-- India Comprehensive Criminal Record Database Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[17]/div[1]/h4/a")
	WebElement clickOnIndiaComprehensiveSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[15]")
	WebElement submitOnIndiaComprehensiveSubmitBtn;

	// Case Documents Received-- India Database Check Level 1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[18]/div[1]/h4/a")
	WebElement clickOnIndiaDatabaseSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[16]")
	WebElement submitOnIndiaDatabaseSubmitBtn;

	// Case Documents Received-- India Court Record Database Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[19]/div[1]/h4/a")
	WebElement clickOnIndiaCourtRecordSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[17]")
	WebElement submitOnIndiaCourtRecordSubmitBtn;

	// Case Documents Received-- Global Regulator Compliance and Department Database
	// Verification
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[20]/div[1]/h4/a")
	WebElement clickOnGlobalSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[18]")
	WebElement submitOnGlobalSubmitBtn;

	// Case Documents Received-- Education Verification Written
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[21]/div[1]/h4/a")
	WebElement clickOnEducationSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[19]")
	WebElement submitOnEducationSubmitBtn;

	// Report Review -- Case Documents Received
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='report_severity']")
	WebElement selectReportSeverityName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='standard_comment']")
	WebElement selectStandardComment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='final_form_btn']")
	WebElement clickOnReviewButton;

	// Report Successfully Reviewed.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]")
	WebElement verifyReportSuccessfullyReviewedMsg;

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
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[11]")
	WebElement verifyReportStatusVerifiedText;
	
	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;


	public void userAdminChecksSummaryClosedByClient(String currentArsNumber, String specialComment,
			String currentEmpArsNo, String currentEmpComments, String cvValidationArsNo, String cvValidationComments,
			String drugTestArsNo, String drugTestComments, String educationArsNo, String educationSpecialComments,
			String globalArsNo, String globalSpecialComments, String indiaAdvancedArsNo,
			String indiaAdvancedSpecialComments, String indiaCivilArsNo, String indiaCivilSpecialComments,
			String indiaCompArsNo, String indiaCompSpecialComments, String indiaCourtArsNo,
			String indiaRecordSpecialComments, String courtRecordArsNo, String recordSpecialComments,
			String creditDefaultArsNo, String creditDefaultSpecialComments, String databaseCheckArsNo,
			String databaseCheckSpecialComments, String identityCheckArsNo, String identitySpecialComments,
			String panNoArsNo, String panNoSpecialComments, String permanentCheckArsNo, String addressSpecialComments,
			String personalRefCheckArsNo, String personalRefSpecialComments, String previousEmpCheckArsNo,
			String previousEmpSpecialComments, String professRefCheckArsNo, String professionalRefSpecialComments)
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
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", clickOnCompleteSearchBtn);
//		clickOnCompleteSearchBtn.click();
		clickOnArsNumber.click();

		// Current Employment Verification-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmploymentVerification));
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
		Select criminalCaseCheckVerification = new Select(selectCurrentEmploymentCloseByClient);
		criminalCaseCheckVerification.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCurrentEmploymentCategory));
		Select criminalCaseCheckCommentCategory = new Select(selectCurrentEmploymentCategory);
		criminalCaseCheckCommentCategory.selectByIndex(1);
		txtCurrentEmpSpecialComments.sendKeys(currentEmpComments);
		clickOnCurrentEmploymentClosedByClientBtn.click();

		// CV Validation--Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCvValidationClosedByClientSuccessfullyMsg));
		txtCvValidationSearchNo.sendKeys(cvValidationArsNo);
		JavascriptExecutor exe = (JavascriptExecutor)ldriver;
		exe.executeScript("arguments[0].click();", clickOnCvValidationSearchBtn);
//		clickOnCvValidationSearchBtn.click();
		clickOnCvValidationArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvValidation);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvValidation));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvValidation);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCvValidationCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCvValidationCloseByClient));
		Select cvValidationCloseByClient = new Select(selectCvValidationCloseByClient);
		cvValidationCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCvValidationCategory));
		Select cvValidationCategory = new Select(selectCvValidationCategory);
		cvValidationCategory.selectByIndex(1);
		txtCvValidationSpecialComments.sendKeys(cvValidationComments);
		clickOnCvValidationClosedByClientBtn.click();

		// Drug Test--Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyDrugTestClosedByClientSuccessfullyMsg));
		txtDrugTestSearchNo.sendKeys(drugTestArsNo);
		JavascriptExecutor exec = (JavascriptExecutor)ldriver;
		exec.executeScript("arguments[0].click();", clickOnDrugTestSearchBtn);
//		clickOnDrugTestSearchBtn.click();
		clickOnDrugTestArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnDrugTest);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDrugTest));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDrugTest);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectDrugTestCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDrugTestCloseByClient));
		Select drugTestCloseByClient = new Select(selectDrugTestCloseByClient);
		drugTestCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDrugTestCategory));
		Select drugTestCategory = new Select(selectDrugTestCategory);
		drugTestCategory.selectByIndex(1);
		txtDrugTestSpecialComments.sendKeys(drugTestComments);
		clickOnDrugTestClosedByClientBtn.click();

		// Education Verification Written-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyEducationClosedByClientSuccessfullyMsg));
		txtEducationSearchNo.sendKeys(educationArsNo);
		JavascriptExecutor execu = (JavascriptExecutor)ldriver;
		execu.executeScript("arguments[0].click();", clickOnEducationSearchBtn);
//		clickOnEducationSearchBtn.click();
		clickOnEducationArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectEducationCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectEducationCloseByClient));
		Select educationCloseByClient = new Select(selectEducationCloseByClient);
		educationCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectEducationCategory));
		Select educationCategory = new Select(selectEducationCategory);
		educationCategory.selectByIndex(1);
		txtEducationSpecialComments.sendKeys(educationSpecialComments);
		clickOnEducationClosedByClientBtn.click();

		// Global Regulator Compliance and Department Database-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyGlobalClosedByClientSuccessfullyMsg));
		txtGlobalSearchNo.sendKeys(globalArsNo);
		JavascriptExecutor execut = (JavascriptExecutor)ldriver;
		execut.executeScript("arguments[0].click();", clickOnGlobalSearchBtn);
//		clickOnGlobalSearchBtn.click();
		clickOnGlobalArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalRegulatory);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalRegulatory));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalRegulatory);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectGlobalCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalCloseByClient));
		Select globalCloseByClient = new Select(selectGlobalCloseByClient);
		globalCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectGlobalCategory));
		Select globalCategory = new Select(selectGlobalCategory);
		globalCategory.selectByIndex(1);
		txtGlobalSpecialComments.sendKeys(globalSpecialComments);
		clickOnGlobalClosedByClientBtn.click();

		// India Advanced Web and Media Searches-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaAdvancedClosedByClientSuccessfullyMsg));
		txtIndiaAdvancedSearchNo.sendKeys(indiaAdvancedArsNo);
		JavascriptExecutor executo = (JavascriptExecutor)ldriver;
		executo.executeScript("arguments[0].click();", clickOnIndiaAdvancedSearchBtn);
//		clickOnIndiaAdvancedSearchBtn.click();
		clickOnIndiaAdvancedArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaAdvanced);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvanced));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaAdvanced);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaAdvancedActionCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedActionCloseByClient));
		Select advancedActionCloseByClient = new Select(selectIndiaAdvancedActionCloseByClient);
		advancedActionCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaAdvancedCategory));
		Select indiaAdvancedCategory = new Select(selectIndiaAdvancedCategory);
		indiaAdvancedCategory.selectByIndex(1);
		txtIndiaAdvancedSpecialComments.sendKeys(indiaAdvancedSpecialComments);
		clickOnIndiaAdvancedClosedByClientBtn.click();

		// India Civil Litigation Database Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCivilClosedByClientSuccessfullyMsg));
		txtIndiaCivilSearchNo.sendKeys(indiaCivilArsNo);
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", clickOnIndiaCivilSearchBtn);
//		clickOnIndiaCivilSearchBtn.click();
		clickOnIndiaCivilArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCivil);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCivil));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCivil);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCivilCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCivilCloseByClient));
		Select indiaCivilCloseByClient = new Select(selectIndiaCivilCloseByClient);
		indiaCivilCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCivilCategory));
		Select indiaCivilCategory = new Select(selectIndiaCivilCategory);
		indiaCivilCategory.selectByIndex(1);
		txtIndiaCivilSpecialComments.sendKeys(indiaCivilSpecialComments);
		clickOnIndiaCivilClosedByClientBtn.click();

		// India Comprehensive Criminal Record Database Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaComprehensiveClosedByClientSuccessfullyMsg));
		txtIndiaComprehensiveSearchNo.sendKeys(indiaCompArsNo);
		JavascriptExecutor jd = (JavascriptExecutor)ldriver;
		jd.executeScript("arguments[0].click();", clickOnIndiaComprehensiveSearchBtn);
//		clickOnIndiaComprehensiveSearchBtn.click();
		clickOnIndiaComprehensiveArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaComprehensive);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaComprehensive));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaComprehensive);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaComprehensiveCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaComprehensiveCloseByClient));
		Select indiaComprehensiveCloseByClient = new Select(selectIndiaComprehensiveCloseByClient);
		indiaComprehensiveCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaComprehensiveCategory));
		Select indiaComprehensiveCategory = new Select(selectIndiaComprehensiveCategory);
		indiaComprehensiveCategory.selectByIndex(1);
		txtIndiaComprehensiveSpecialComments.sendKeys(indiaCompSpecialComments);
		clickOnIndiaComprehensiveClosedByClientBtn.click();

		// India Court Record Check through Law Firm-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCourtRecordClosedByClientSuccessfullyMsg));
		txtIndiaCourtRecordSearchNo.sendKeys(indiaCourtArsNo);
		JavascriptExecutor jr = (JavascriptExecutor)ldriver;
		jr.executeScript("arguments[0].click();", clickOnIndiaCourtRecordSearchBtn);
//		clickOnIndiaCourtRecordSearchBtn.click();
		clickOnIndiaCourtRecordArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecord);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecord));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecord);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtRecordCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtRecordCloseByClient));
		Select indiaCourtRecordCloseByClient = new Select(selectIndiaCourtRecordCloseByClient);
		indiaCourtRecordCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCourtRecordCategory));
		Select indiaCourtRecordCategory = new Select(selectIndiaCourtRecordCategory);
		indiaCourtRecordCategory.selectByIndex(1);
		txtIndiaCourtRecordSpecialComments.sendKeys(indiaRecordSpecialComments);
		clickOnIndiaCourtRecordClosedByClientBtn.click();

		// India Court Record Database Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCourtRecordClosedByClientSuccessfullyMsg));
		txtCourtRecordRecordSearchNo.sendKeys(courtRecordArsNo);
		JavascriptExecutor je = (JavascriptExecutor)ldriver;
		je.executeScript("arguments[0].click();", clickOnCourtRecordRecordSearchBtn);
//		clickOnCourtRecordRecordSearchBtn.click();
		clickOnCourtRecordArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnndiaCourtRecordDatabase);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnndiaCourtRecordDatabase));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnndiaCourtRecordDatabase);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCourtRecordCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCourtRecordCloseByClient));
		Select courtRecordCloseByClient = new Select(selectCourtRecordCloseByClient);
		courtRecordCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCourtRecordCategory));
		Select courtRecordCategory = new Select(selectCourtRecordCategory);
		courtRecordCategory.selectByIndex(1);
		txtCourtRecordSpecialComments.sendKeys(recordSpecialComments);
		clickOnCourtRecordClosedByClientBtn.click();

		// India Credit Default Database Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaCreditDefaultClosedByClientSuccessfullyMsg));
		txtIndiaCreditDefaultSearchNo.sendKeys(creditDefaultArsNo);
		JavascriptExecutor ja = (JavascriptExecutor)ldriver;
		ja.executeScript("arguments[0].click();", clickOnIndiaCreditDefaultSearchBtn);
//		clickOnIndiaCreditDefaultSearchBtn.click();
		clickOnIndiaCreditDefaultArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCreditDefault);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditDefault));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCreditDefault);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCreditDefaultCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCreditDefaultCloseByClient));
		Select indiaCreditDefaultCloseByClient = new Select(selectIndiaCreditDefaultCloseByClient);
		indiaCreditDefaultCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaCreditDefaultCategory));
		Select indiaCreditDefaultCategory = new Select(selectIndiaCreditDefaultCategory);
		indiaCreditDefaultCategory.selectByIndex(1);
		txtIndiaCreditDefaultSpecialComments.sendKeys(creditDefaultSpecialComments);
		clickOnIndiaCreditDefaultClosedByClientBtn.click();

		// India Database Check Level 1-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyIndiaDatabaseCheckClosedByClientSuccessfullyMsg));
		txtIndiaDatabaseCheckSearchNo.sendKeys(databaseCheckArsNo);
		JavascriptExecutor jb = (JavascriptExecutor)ldriver;
		jb.executeScript("arguments[0].click();", clickOnIndiaDatabaseCheckSearchBtn);
//		clickOnIndiaDatabaseCheckSearchBtn.click();
		clickOnIndiaDatabaseCheckArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaDatabaseCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaDatabaseCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaDatabaseCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaDatabaseCheckCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaDatabaseCheckCloseByClient));
		Select indiaDatabaseCheckCloseByClient = new Select(selectIndiaDatabaseCheckCloseByClient);
		indiaDatabaseCheckCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectIndiaDatabaseCheckCategory));
		Select indiaDatabaseCheckCategory = new Select(selectIndiaDatabaseCheckCategory);
		indiaDatabaseCheckCategory.selectByIndex(1);
		txtIndiaDatabaseCheckSpecialComments.sendKeys(databaseCheckSpecialComments);
		clickOnIndiaDatabaseCheckClosedByClientBtn.click();

		// National Identity Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyNationalIdentityClosedByClientSuccessfullyMsg));
		txtNationalIdentityCheckSearchNo.sendKeys(identityCheckArsNo);
		JavascriptExecutor jc = (JavascriptExecutor)ldriver;
		jc.executeScript("arguments[0].click();", clickOnNationalIdentityCheckSearchBtn);
//		clickOnNationalIdentityCheckSearchBtn.click();
		clickOnNationalIdentityArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalIdentity);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalIdentity));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalIdentity);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectNationalIdentityCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectNationalIdentityCloseByClient));
		Select nationalIdentityCloseByClient = new Select(selectNationalIdentityCloseByClient);
		nationalIdentityCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectNationalIdentityCategory));
		Select nationalIdentityCategory = new Select(selectNationalIdentityCategory);
		nationalIdentityCategory.selectByIndex(1);
		txtNationalIdentitySpecialComments.sendKeys(identitySpecialComments);
		clickOnNationalIdentityClosedByClientBtn.click();

		// PAN No Verification-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPanNoVerificationClosedByClientSuccessfullyMsg));
		txtPanNoVerificationCheckSearchNo.sendKeys(panNoArsNo);
		JavascriptExecutor jf = (JavascriptExecutor)ldriver;
		jf.executeScript("arguments[0].click();", clickOnPanNoVerificationCheckSearchBtn);
//		clickOnPanNoVerificationCheckSearchBtn.click();
		clickOnPanNoVerificationArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanNoVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanNoVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPanNoVerificationCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoVerificationCloseByClient));
		Select panNoVerificationCloseByClient = new Select(selectPanNoVerificationCloseByClient);
		panNoVerificationCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPanNoVerificationCategory));
		Select panNoVerificationCategory = new Select(selectPanNoVerificationCategory);
		panNoVerificationCategory.selectByIndex(1);
		txtPanNoVerificationSpecialComments.sendKeys(panNoSpecialComments);
		clickOnPanNoVerificationClosedByClientBtn.click();

		// Permanent Address Verification-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPermanentAddressClosedByClientSuccessfullyMsg));
		txtPermanentAddressCheckSearchNo.sendKeys(permanentCheckArsNo);
		JavascriptExecutor jg = (JavascriptExecutor)ldriver;
		jg.executeScript("arguments[0].click();", clickOnPermanentAddressCheckSearchBtn);
//		clickOnPermanentAddressCheckSearchBtn.click();
		clickOnPermanentAddressArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentAddress);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentAddress));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPermanentAddressCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPermanentAddressCloseByClient));
		Select permanentAddressCloseByClient = new Select(selectPermanentAddressCloseByClient);
		permanentAddressCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPermanentAddressCategory));
		Select permanentAddressCategory = new Select(selectPermanentAddressCategory);
		permanentAddressCategory.selectByIndex(1);
		txtPermanentAddressSpecialComments.sendKeys(addressSpecialComments);
		clickOnPermanentAddressClosedByClientBtn.click();

		// Personal Reference Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPersonalReferenceClosedByClientSuccessfullyMsg));
		txtPersonalReferenceCheckSearchNo.sendKeys(personalRefCheckArsNo);
		JavascriptExecutor jh = (JavascriptExecutor)ldriver;
		jh.executeScript("arguments[0].click();", clickOnPersonalReferenceCheckSearchBtn);
//		clickOnPersonalReferenceCheckSearchBtn.click();
		clickOnPersonalReferenceArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPersonalReferenceCheck);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPersonalReferenceCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPersonalReferenceCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPersonalReferenceCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPersonalReferenceCloseByClient));
		Select personalReferenceCloseByClient = new Select(selectPersonalReferenceCloseByClient);
		personalReferenceCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPersonalReferenceCategory));
		Select personalReferenceCategory = new Select(selectPersonalReferenceCategory);
		personalReferenceCategory.selectByIndex(1);
		txtPersonalReferenceSpecialComments.sendKeys(personalRefSpecialComments);
		clickOnPersonalReferenceClosedByClientBtn.click();

		// Previous Employment Verification-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPreviousEmploymentClosedByClientSuccessfullyMsg));
		txtPreviousEmploymentCheckSearchNo.sendKeys(previousEmpCheckArsNo);
		JavascriptExecutor ji = (JavascriptExecutor)ldriver;
		ji.executeScript("arguments[0].click();", clickOnPreviousEmploymentCheckSearchBtn);
//		clickOnPreviousEmploymentCheckSearchBtn.click();
		clickOnPreviousEmploymentArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousEmployment);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousEmployment));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousEmployment);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPreviousEmploymentCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPreviousEmploymentCloseByClient));
		Select previousEmploymentCloseByClient = new Select(selectPreviousEmploymentCloseByClient);
		previousEmploymentCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPreviousEmploymentCategory));
		Select previousEmploymentCategory = new Select(selectPreviousEmploymentCategory);
		previousEmploymentCategory.selectByIndex(1);
		txtPreviousEmploymentSpecialComments.sendKeys(previousEmpSpecialComments);
		clickOnPreviousEmploymentClosedByClientBtn.click();

		// Professional Reference Check-- Checks Summary
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyProfessionalReferenceClosedByClientSuccessfullyMsg));
		txtProfessionalReferenceCheckSearchNo.sendKeys(professRefCheckArsNo);
		JavascriptExecutor jk = (JavascriptExecutor)ldriver;
		jk.executeScript("arguments[0].click();", clickOnProfessionalReferenceCheckSearchBtn);
//		clickOnProfessionalReferenceCheckSearchBtn.click();
		clickOnProfessionalReferenceArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalReference);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalReference));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalReference);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectProfessionalReferenceCloseByClient);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectProfessionalReferenceCloseByClient));
		Select professionalReferenceCloseByClient = new Select(selectProfessionalReferenceCloseByClient);
		professionalReferenceCloseByClient.selectByIndex(4);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectProfessionalReferenceCategory));
		Select professionalReferenceCategory = new Select(selectProfessionalReferenceCategory);
		professionalReferenceCategory.selectByIndex(1);
		txtProfessionalReferenceSpecialComments.sendKeys(professionalRefSpecialComments);
		clickOnProfessionalReferenceClosedByClientBtn.click();
		Thread.sleep(1000);
	}

	// Check is successfully marked as Closed by Client.
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

	// Current Address Verification --Checks Summary -- Case Summary Details
	// Verifier --(Super Admin)
	public void currentAddressVerificationCheck(String currentAddressArsNo, String pinCode, String verifiedFom,
			String relationshipName, String durationStay, String dateOfVerification, String comments, String address,
			String nameExecutive, String timeVerification, String gateColor, String colorBuilding, String newAddress)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSuperAdminVerifier));
		JavaScriptManuplator.selectOptionFromDropDown(selectSuperAdminVerifier, "Verifier");
		//Select superAdminVerifier = new Select(selectSuperAdminVerifier);
		//superAdminVerifier.selectByIndex(66);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyDigitalVerification));
		txtCurrentAddressVerificationSearchNo.sendKeys(currentAddressArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressSearchBtn);
		//clickOnCurrentAddressSearchBtn.click();
		clickOnCurrentAddressArsNumber.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressVerification);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressVerification);

		// Antecedents to Verify --Current Address Verification
		// Untraceable Check Box- Antecedents
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkOnUntraceableCheckBox);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkOnUntraceableCheckBox));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkOnUntraceableCheckBox);
		Thread.sleep(1000);
		Select residenceStatus = new Select(selectResidenceStatus);
		residenceStatus.selectByIndex(6);
		Select residenceType = new Select(selectResidenceType);
		residenceType.selectByIndex(5);
		Select verificationType = new Select(selectVerificationType);
		verificationType.selectByIndex(2);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSaveVerifiedDataBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectCloseVerificationAction);
		Select closeVerificationAction = new Select(selectCloseVerificationAction);
		closeVerificationAction.selectByIndex(12);

		// Case Check - Close Verification--
		Select verifiedViaEmail = new Select(selectVerifiedViaEmail);
		verifiedViaEmail.selectByIndex(1);

		Select verificationInfo = new Select(selectVerificationInfo);
		verificationInfo.selectByIndex(2);

		Select finalVerificationCountry = new Select(selectFinalVerificationCountry);
		finalVerificationCountry.selectByIndex(1);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBox52171NoResponseReceived);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBox52171NoResponseReceived);
		// checkCheckBox52171NoResponseReceived.click();

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCloseVerification);
		Thread.sleep(1000);
	}

	// Verify -- Current Address Verification(Completed)--Check is successfully
	// marked as "Completed".
	public String verifyCurrentAddressVerificationCompletedTextName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCurrentAddressVerificationCompletedText));
		return verifyCurrentAddressVerificationCompletedText.getText();
	}

	// Verification Quality Allocator-- Check List - Search Result - (14 records)
	public void superAdminVerificationQuality(String enterArsNo, String remarkComments) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleVerificationQualityAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleVerificationQualityAllocator, "Verification Quality Allocator");
		Select userRoleVerificationQualityAllocator = new Select(selectUserRoleVerificationQualityAllocator);
		userRoleVerificationQualityAllocator.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlerts));
		txtEnterArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearchBtn);
		//clickOnArsNoSearchBtn.click();
		clickOnVerifiedCountNumber.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressVerificationCheck));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressVerificationCheck);

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

	// Verification Quality Allocator--Check List - Search Result - (14 records)
	public void superAdminVerificationQualityAllocators(String enterArsNo, String checkComments)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectUserAdminRoleVerificationQualityAllocator));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserAdminRoleVerificationQualityAllocator, "Verification Quality Allocator");
		Select userRoleVerificationQualityAllocator = new Select(selectUserAdminRoleVerificationQualityAllocator);
		userRoleVerificationQualityAllocator.selectByIndex(65);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlert));
		txtEnterArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearch);
		//clickOnArsNoSearch.click();
		clickOnVerifiedCountNumbers.click();

		// Check List - Search Result - (14 records)
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkOnCheckBoxChecksListAll));
		checkOnCheckBoxCheckListAll.click();

		Select actionAllocateToVqc = new Select(selectActionAllocatesToVqc);
		actionAllocateToVqc.selectByIndex(1);

		txtCheckComment.sendKeys(checkComments);
		clickOnGoButton.click();

		WebElement element = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// The selected checks were successfully released for report.
	public String verificationQualityAllocatorSuccessMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyQualityAllocatorSuccesssMsg));
		return verifyQualityAllocatorSuccesssMsg.getText();
	}

	// Reports Manager -- Search Report
	public void superAdminReportManager(String enterArsNo) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(selectUserRoleReportsManager));
		JavaScriptManuplator.selectOptionFromDropDown(selectUserRoleReportsManager, "Reports Manager");
		//Select userRoleReportsManager = new Select(selectUserRoleReportsManager);
		//userRoleReportsManager.selectByIndex(51);
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 240);
		wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlertsReportsStatus));
		clickOnReportsManagerReports.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Search Report')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtArsNumber));
		txtArsNumber.sendKeys(enterArsNo);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchReportBtn);
		//clickOnSearchReportBtn.click();

		// Report List - Search Result -- Single Window Review Report
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectActionWindowReviewReport));
		Select actionWindowReviewReport = new Select(selectActionWindowReviewReport);
		actionWindowReviewReport.selectByIndex(3);

		// Do you wish to continue with the action "Single Window Review Report"?
		WebElement ele = ldriver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		Actions act = new Actions(ldriver);
		act.moveToElement(ele).click().perform();

//		// Case Documents Received-- Permanent Address Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPermanentSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPermanentSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPermanentSubmitBtn);
		submitPermanentAddress.click();

		// Case Documents Received-- Drug Test
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnDrugTestSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDrugTestSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDrugTestSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitDrug);
		//submitDrug.click();

		// Case Documents Received-- Professional Reference Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnProfessionalSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfessionalSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnProfessionalSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitProfessional);
		//submitProfessional.click();

		// Case Documents Received-- Personal Reference Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPersonalSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPersonalSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPersonalSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitPersonal);
		//submitPersonal.click();

		// Case Documents Received-- Previous Employment Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPreviousSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPreviousSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPreviousSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitPrevious);
		//submitPrevious.click();

		// Case Documents Received-- PAN No Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnPanSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPanSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()",submitOnPanSubmitBtn );
		//submitOnPanSubmitBtn.click();

		// Case Documents Received-- India Advanced Web and Media Searches
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaAdvancedSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaAdvancedSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaAdvancedSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()",submitOnIndiaAdvancedSubmitBtn );
		//submitOnIndiaAdvancedSubmitBtn.click();

		// Case Documents Received-- Current Address Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentAddressSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentAddressSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentAddressSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()",submitOnCurrentSubmitBtn );
		//submitOnCurrentSubmitBtn.click();

		// Case Documents Received-- Current Employment Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCurrentEmpSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCurrentEmpSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCurrentEmpSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnCurrentEmpSubmitBtn);
		//submitOnCurrentEmpSubmitBtn.click();

		// Case Documents Received-- India Credit Default Database Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCreditSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCreditSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCreditSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnIndiaSubmitBtn);
		//submitOnIndiaSubmitBtn.click();

		// Case Documents Received-- National Identity Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnNationalSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnNationalSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnNationalSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnNationalSubmitBtn);
		//submitOnNationalSubmitBtn.click();

		// Case Documents Received-- India Civil Litigation Database Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCivilSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCivilSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCivilSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnCivilSubmitBtn);
		//submitOnCivilSubmitBtn.click();

		// Case Documents Received-- India Court Record Check through Law Firm
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnIndiaCourtSubmitBtn);
		//submitOnIndiaCourtSubmitBtn.click();

		// Case Documents Received-- CV Validation
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnCvSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCvSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCvSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnCVSubmitBtn);
		//submitOnCVSubmitBtn.click();

		// Case Documents Received-- India Comprehensive Criminal Record Database Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaComprehensiveSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaComprehensiveSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaComprehensiveSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnIndiaComprehensiveSubmitBtn);
		//submitOnIndiaComprehensiveSubmitBtn.click();

		// Case Documents Received-- India Database Check Level 1
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaDatabaseSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaDatabaseSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaDatabaseSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnIndiaDatabaseSubmitBtn);
		//submitOnIndiaDatabaseSubmitBtn.click();

		// Case Documents Received-- India Court Record Database Check
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndiaCourtRecordSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndiaCourtRecordSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIndiaCourtRecordSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnIndiaCourtRecordSubmitBtn);
		//submitOnIndiaCourtRecordSubmitBtn.click();

		// Case Documents Received-- Global Regulator Compliance and Department Database
		// Verification
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnGlobalSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGlobalSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGlobalSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnGlobalSubmitBtn);
		//submitOnGlobalSubmitBtn.click();

		// Case Documents Received-- Education Verification Written
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnEducationSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEducationSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnEducationSubmitBtn);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", submitOnEducationSubmitBtn);
		//submitOnEducationSubmitBtn.click();

		// Report Review -- Case Documents Received
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnReviewButton);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectReportSeverityName));
		Select reportSeverityName = new Select(selectReportSeverityName);
		reportSeverityName.selectByIndex(8);

		Select standardComment = new Select(selectStandardComment);
		standardComment.selectByIndex(17);
		Thread.sleep(2000);
		String url = ldriver.getCurrentUrl();
		try {

			File output = new File("copySmeReportGenerateCode.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(url);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
//		clickOnReviewButton.click();
		Thread.sleep(1000);
	}

	// Report Successfully Reviewed.
	public String reportSuccessfullyReviewedMessage() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyReportSuccessfullyReviewedMsg));
		return verifyReportSuccessfullyReviewedMsg.getText();
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

}
