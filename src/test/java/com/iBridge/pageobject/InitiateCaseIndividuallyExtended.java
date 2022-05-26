package com.iBridge.pageobject;

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

public class InitiateCaseIndividuallyExtended {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InitiateCaseIndividuallyExtended(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Initiate Via Candidate(IVC)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"mode\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/ul/li[1]/a/i")
	WebElement clickOnIvc;

	// Package Selection
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"recent-package-list-box-map\"]/div/div[1]/a[2]")
	WebElement clickCheckWiseSelect;

	// CHECK(S) SELECTED=================================
	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[34][count]")
	WebElement txtProfessionalReferenceCheck;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][count]")
	WebElement txtPreviousEmploymentVerificationCount;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[47][count]")
	WebElement txtIndianDatabaseVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[62][count]")
	WebElement txtCriminalRecordsVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[72][count]")
	WebElement txtNationalIdentityCheck;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[90][count]")
	WebElement txtIndiaCourtRecordCheckLawFirm;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[108][count]")
	WebElement txtCreditDefault;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[83][count]")
	WebElement txtEucationVerificationW;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickContinue;

	// Upload CV Documents--Additional Field(s)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='cv_document_file']")
	WebElement uploadCvDocuments;

	// (NATIONAL IDENTITY)--Step 3 - Candidate Summary--Add Document(s)--1
	@FindBy(xpath = "//span[normalize-space()='Please check here if you do not have a PAN Card']")
	@CacheLookup
	WebElement checkBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnCnfPopupcheckBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div[1]/div/input")
	WebElement uploadPanDocFrontSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='PAN_CARD']/div[2]/div[2]/div[1]/a/i")
	WebElement verifyDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div/input")
	WebElement txtNameAsPerDocument;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/input")
	WebElement txtDocumentNumber;

	// Add Document(s)--2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[1]/div/select")
	WebElement SelectDocumentType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[2]/div[1]/div/input")
	WebElement uploadDocumentFrontSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='NID_Default_0']/div[2]/div[2]/div[1]/a/i")
	WebElement verifyNIDDefaultDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[4]/div[2]/div[1]/div/input")
	WebElement uploadDocumentBackSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='NID_back_div_0']/div[2]/div[1]/a/i")
	WebElement verifyNidDefaultDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[5]/div[2]/div/input")
	WebElement txtNameAsPerDocument2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[5]/div[3]/div/input")
	WebElement txtDocumentNumber2;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickOnContinueBtn;

	// Education to Employment Gap
	@FindBy(css = "#gapreason-0-gap-reason")
	@CacheLookup
	WebElement txtGapReason;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement clickOnSubmitGapBtn;

	// Professional Reference Check--Step 3 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/input")
	WebElement txtCompanyName;
	// Add Reference(s)--1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[1]/div/label[2]/span")
	WebElement clickOnRadioReferenceLevelSenior;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[2]/div/input")
	WebElement txtReferenceName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[3]/div/input")
	WebElement txtReferenceDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[4]/div/input")
	WebElement txtReferenceMobileNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[4]/div/h4")
	WebElement verifyReferenceTwo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[3]/div[1]/div/input")
	WebElement txtReferenceEmailId;

	// Add Reference(s) REFERENCE-- 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[1]/div/label[1]/span")
	WebElement clickOnPeerRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[2]/div/input")
	WebElement txtNameReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[3]/div/input")
	WebElement txtDesignationReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[4]/div/input")
	WebElement txtReferenceMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[6]/div[1]/div/input")
	WebElement txtEmailIdReference;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickOnReferenceContinueBtn;

	// Step 4 - Case Preview--Please review the screen before you proceed
	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickOnCasePreviewSubmitBtn;
	
	// Confirm--  All the details will be submitted and you will not be able to make changes later. Please review your form and submit
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmAlertOkBtn;

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

	// Initiate Via Candidate(IVC)
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		clickOnIvc.click();
		clickCheckWiseSelect.click();
	}

	public void clickUnCheckWiseSelect(String professionalRefe, String empCount, String indianDatabase,
			String criminalRecord, String nationalIdentity, String educationVerify, String indianCourtLaw,
			String creditDefault) throws InterruptedException {
		txtProfessionalReferenceCheck.clear();
		txtProfessionalReferenceCheck.sendKeys(professionalRefe);
		txtPreviousEmploymentVerificationCount.clear();
		txtPreviousEmploymentVerificationCount.sendKeys(empCount);
		txtIndianDatabaseVerification.clear();
		txtIndianDatabaseVerification.sendKeys(indianDatabase);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(txtCriminalRecordsVerification, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCriminalRecordsVerification));
		// Clicked on Pan number Verification and Continue button
		txtCriminalRecordsVerification.clear();
		txtCriminalRecordsVerification.sendKeys(criminalRecord);
		txtNationalIdentityCheck.clear();
		txtNationalIdentityCheck.sendKeys(nationalIdentity);
		JavaScriptManuplator.javaScriptExecutor(txtEucationVerificationW, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtEucationVerificationW));
		txtEucationVerificationW.clear();
		txtEucationVerificationW.sendKeys(educationVerify);
		txtIndiaCourtRecordCheckLawFirm.clear();
		txtIndiaCourtRecordCheckLawFirm.sendKeys(indianCourtLaw);
		JavaScriptManuplator.javaScriptExecutor(txtCreditDefault, "arguments[0].scrollIntoView(true);", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCreditDefault));
		txtCreditDefault.clear();
		txtCreditDefault.sendKeys(creditDefault);
		clickContinue.click();
		Thread.sleep(1000);
	}

	// Step 3 - Candidate Summary (Add Candidate Information)
	public void additionFieldInfo(String uploadCvDoc) throws InterruptedException {
		uploadCvDocuments.sendKeys(uploadCvDoc);
		Thread.sleep(1000);
	}

	// (NATIONAL IDENTITY)--Step 3 - Candidate Summary--Add Document(s)--1
	public void nationalIdentity(String docFrontSide, String nameDoc, String docNumber, String docFrontSide1,
			String uploadBackSide1, String nameAsDoc, String docNo) throws InterruptedException {
		Thread.sleep(3000);
		JavaScriptManuplator.javaScriptExecutor(checkBoxNoPanCard, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkBoxNoPanCard));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(checkBoxNoPanCard, "arguments[0].click()", ldriver);
		//checkBoxNoPanCard.click();
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCnfPopupcheckBoxNoPanCard));
		clickOnCnfPopupcheckBoxNoPanCard.click();
		Thread.sleep(2000);
		ldriver.navigate().refresh();
		uploadPanDocFrontSide.sendKeys(docFrontSide);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyDeleteBtn));
		Thread.sleep(1000);
		txtNameAsPerDocument.sendKeys(nameDoc);
		txtDocumentNumber.sendKeys(docNumber);
		// Add Document(s)--2
		Select documentType = new Select(SelectDocumentType);
		documentType.selectByIndex(2);
		uploadDocumentFrontSide.sendKeys(docFrontSide1);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNIDDefaultDeleteBtn));
		uploadDocumentBackSide.sendKeys(uploadBackSide1);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNidDefaultDeleteBtn));
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtNameAsPerDocument2);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtNameAsPerDocument2));
		Thread.sleep(1000);
		txtNameAsPerDocument2.sendKeys(nameAsDoc);
		txtDocumentNumber2.sendKeys(docNo);
		Thread.sleep(1000);
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}

	// Education to Employment Gap
	public void educationToEmploymentGap(String gapReason) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtGapReason));
		txtGapReason.clear();
		txtGapReason.sendKeys(gapReason);
		clickOnSubmitGapBtn.click();
		Thread.sleep(1000);
	}

	// Professional Reference Check
	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
	public void professionalReference(String companyName,String referenceName, String refDesignation, String refMobileNo, String refEmail,
			String nameRef, String desigRef, String mobileRefNo, String emailRef) throws InterruptedException {
		// Professional Reference Check--Step 3 - Candidate Summary
		// Add Reference(s)--1
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtCompanyName));
		txtCompanyName.sendKeys(companyName);
		clickOnRadioReferenceLevelSenior.click();
		txtReferenceName.clear();
		txtReferenceName.sendKeys(referenceName);
		txtReferenceDesignation.clear();
		txtReferenceDesignation.sendKeys(refDesignation);
		txtReferenceMobileNo.clear();
		txtReferenceMobileNo.sendKeys(refMobileNo);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", verifyReferenceTwo);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='krishnaKant@gmail.com'", txtReferenceEmailId);
		//txtReferenceEmailId.clear();
		//txtReferenceEmailId.sendKeys(refEmail);

		// Add Reference(s) REFERENCE-- 2
		clickOnPeerRadioBtn.click();
		txtNameReference.clear();
		txtNameReference.sendKeys(nameRef);
		txtDesignationReference.clear();
		txtDesignationReference.sendKeys(desigRef);
		txtReferenceMobileNumber.clear();
		txtReferenceMobileNumber.sendKeys(mobileRefNo);
		txtEmailIdReference.sendKeys(emailRef);
		clickOnReferenceContinueBtn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCasePreviewSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
		Thread.sleep(2000);
		// Confirm- alert Ok Button
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmAlertOkBtn);
		Thread.sleep(1000);
	}

	public void CandidteLogout() {
		// Candidate Logout
		clickOnCandidateName.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnLogoutBtn));
		clickOnLogoutBtn.click();
	}

	public String verifyInitiateCaseThankYouMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();
	}

}
