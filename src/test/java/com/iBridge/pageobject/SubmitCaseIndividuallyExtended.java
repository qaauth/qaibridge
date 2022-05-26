package com.iBridge.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitCaseIndividuallyExtended {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public SubmitCaseIndividuallyExtended(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// National Identity--Add Document(s)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div[1]/div/input")
	WebElement uploadDocumentFrontSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/i[1]")
	WebElement verifyDocsDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div/input")
	WebElement txtNameAsPerDocument;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/input")
	WebElement txtDocumentNumber;

	// Please check here if you do not have a PAN Card
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Please check here if you do not have a PAN Card')]")
	WebElement checkCheckBoxdonothaveaPANCard;
	
	// Are you sure do not have a PAN card? Click on 'OK' to select another identity document to upload.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOkButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[1]/div/select")
	WebElement selectDocumentType;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[2]/div[1]/div/input")
	WebElement uploadDocumentFrontSide2;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/a[1]/i[1]")
	WebElement verifyDocsDeleteButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[4]/div[2]/div[1]/div/input")
	WebElement uploadDocumentBackSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[4]/div[2]/div[2]/div[1]/a/i")
	WebElement verifyLinceDocsDeleteButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[5]/div[2]/div/input")
	WebElement txtNameAsPerDocument2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[5]/div[3]/div/input")
	WebElement txtDocumentNumber2;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/div/input")
	WebElement txtNameAsPerDocument1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/input")
	WebElement txtDocumentNumber1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/button")
	WebElement clickOnNationalCountinueBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div[5]/div[1]/div/div/input")
	WebElement uploadCvDocument;

	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
	// Add Reference(s)--1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/input")
	WebElement txtReferenceCompanyName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[1]/div/label[2]/input")
	WebElement clickOnRadioReferenceLevelSenior;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[2]/div/input")
	WebElement txtReferenceName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[3]/div/input")
	WebElement txtReferenceDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[4]/div/input")
	WebElement txtReferenceMobileNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[4]/div/h4")
	WebElement verifyReference2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[3]/div[1]/div/input")
	WebElement txtReferenceEmailId;

	// Add Reference(s) REFERENCE-- 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[1]/div/label[1]/input")
	WebElement clickOnPeerRadioBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[2]/div/input")
	WebElement txtNameReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[3]/div/input")
	WebElement txtDesignationReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[4]/div/input")
	WebElement txtReferenceMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[6]/div[1]/div/input")
	WebElement txtEmailIdReference;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickOnReferenceContinueBtn;

	// Step 4 - Case Preview--Please review the screen before you proceed
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='pacakgeSubmitForm']")
	WebElement clickOnCasePreviewSubmitBtn;
	
	// All the details will be submitted and you will not be able to make changes later. Please review your form and submit
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmOkBtn;

	// Verify Initiate Case Thank You Message
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyCaseThankYouMsg;

	// National Identity--Add Document(s)--1
	public void nationalIdentity(String docFrontSide, String nameAsDoc, String docNumber, String docFrontSide2,
			String docBackSide, String nameDoc2, String docNumber2) throws InterruptedException {
		//ldriver.navigate().refresh();
		uploadDocumentFrontSide.sendKeys(docFrontSide);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyDocsDeleteBtn));
		Thread.sleep(2000);
		txtNameAsPerDocument.sendKeys(nameAsDoc);
		txtDocumentNumber.sendKeys(docNumber);
		Thread.sleep(2000);
		// Add Document(s)--2
		// Please check here if you do not have a PAN Card
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkCheckBoxdonothaveaPANCard);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckBoxdonothaveaPANCard);
		
		// Are you sure do not have a PAN card? Click on 'OK' to select another identity document to upload.
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkButton));
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnOkButton);
		
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectDocumentType);
		Select documentType = new Select(selectDocumentType);
		documentType.selectByIndex(2);
		uploadDocumentFrontSide2.sendKeys(docFrontSide2);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyDocsDeleteButton));
		uploadDocumentBackSide.sendKeys(docBackSide);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyLinceDocsDeleteButton));
		txtNameAsPerDocument2.sendKeys(nameDoc2);
		txtDocumentNumber2.sendKeys(docNumber2);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Raju'", txtNameAsPerDocument1);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='Raju123'", txtDocumentNumber1);
		Thread.sleep(2000);
		clickOnNationalCountinueBtn.click();
		Thread.sleep(1000);
	}

	public void uploadCvDocument(String cvUpload) throws InterruptedException {
		uploadCvDocument.sendKeys(cvUpload);
		Thread.sleep(1000);
	}

	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
	public void professionalReference(String referenceName, String refDesignation, String refMobileNo, String refEmail,
			String nameRef, String desigRef, String mobileRefNo, String emailRef) throws InterruptedException {
		// Professional Reference Check
		// Add Reference(s)--1
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtReferenceCompanyName));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='AuthBridge Reaserch Pvt Ltd'", txtReferenceCompanyName);
		clickOnRadioReferenceLevelSenior.click();
		txtReferenceName.clear();
		txtReferenceName.sendKeys(referenceName);
		txtReferenceDesignation.clear();
		txtReferenceDesignation.sendKeys(refDesignation);
		txtReferenceMobileNo.clear();
		txtReferenceMobileNo.sendKeys(refMobileNo);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", verifyReference2);
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
		txtEmailIdReference.clear();
		txtEmailIdReference.sendKeys(emailRef);
		Thread.sleep(1000);
		clickOnReferenceContinueBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCasePreviewSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
		// All the details will be submitted and you will not be able to make changes later. Please review your form and submit
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmOkBtn);
		Thread.sleep(1000);
	}

	public String verifyInitiateCaseThankYouMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();

	}

}
