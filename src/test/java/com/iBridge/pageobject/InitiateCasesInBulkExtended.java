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

public class InitiateCasesInBulkExtended {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InitiateCasesInBulkExtended(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Initiate Via Candidate(IVC--Bulk)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/ul/li[2]/a/i")
	WebElement clickOnIvcBulk;

	// Package Selection
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"recent-package-list-box-map\"]/div/div[1]/a[2]")
	WebElement clickCheckWiseSelect;

	// (NATIONAL IDENTITY)--Step 3 - Candidate Summary--Add Document(s)--1
	@FindBy(xpath = "//*[@id='no_pan_card']")
	@CacheLookup
	WebElement checkBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnCnfPopupcheckBoxNoPanCard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div[1]/div/input")
	WebElement uploadPanDocFrontSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/a/i")
	WebElement verifyPanDocsDeleteBtn;

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
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[2]/div[2]/div[1]/a/i")
	WebElement verifyLicenceDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div[4]/div[2]/div[1]/div/input")
	WebElement uploadDocumentBackSide;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[1]/i[1]")
	WebElement verifySecondDocDeleteBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/a[1]/i[1]")
	WebElement verifyLicenDeleteBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
	WebElement txtNameAsPerDocument2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/input[1]")
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

	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
	// Add Reference(s)--1
	// Professional Reference Check
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/input")
	WebElement txtReferenceCompanyName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[1]/div/label[2]/input")
	WebElement clickOnRadioReferenceLevelSenior;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[2]/div/input")
	WebElement txtReferenceName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[3]/div/input")
	WebElement txtReferenceDesignation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/div[4]/div/input")
	WebElement txtReferenceMobileNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[4]/div/h4")
	WebElement verifyReference2;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[3]/div[1]/div/input")
	WebElement txtReferenceEmailId;

	// Add Reference(s) REFERENCE-- 2
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[3]/div/div/div[5]/div[1]/div/label[1]/input")
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
	@FindBy(how = How.XPATH, using = "//button[@id='pacakgeSubmitForm']")
	WebElement clickOnCasePreviewSubmitBtn;
	
	// All the details will be submitted and you will not be able to make changes later. Please review your form and submit
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmOkBtn;

	// Candidate Logout
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/a/span")
	WebElement clickOnCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/ul/li/a")
	WebElement clickOnLogoutBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyThankYouMsg;

	// Initiate Via Candidate(IVC-Bulk)
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIvcBulk));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnIvcBulk);
		//clickOnIvcBulk.click();
		clickCheckWiseSelect.click();//2325-008044
	}

	// (NATIONAL IDENTITY)--Step 3 - Candidate Summary--Add Document(s)--1
	public void nationalIdentity(String docFrontSide, String nameDoc, String docNumber, String docFrontSide1,
			String uploadBackSide1, String nameAsDoc, String docNo) throws InterruptedException {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkBoxNoPanCard);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkBoxNoPanCard));
		JavaScriptManuplator.javaScriptExecutor(checkBoxNoPanCard, "arguments[0].click()", ldriver);
//		checkBoxNoPanCard.click();
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCnfPopupcheckBoxNoPanCard));
		clickOnCnfPopupcheckBoxNoPanCard.click();
		Thread.sleep(2000);
		//ldriver.navigate().refresh();
		uploadPanDocFrontSide.sendKeys(docFrontSide);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyPanDocsDeleteBtn));
		Thread.sleep(1000);
		txtNameAsPerDocument.sendKeys(nameDoc);
		txtDocumentNumber.sendKeys(docNumber);
		
		// Add Document(s)--2
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtDocumentNumber2);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtDocumentNumber2));
		Select documentType = new Select(SelectDocumentType);
		documentType.selectByIndex(2);
		uploadDocumentFrontSide.sendKeys(docFrontSide1);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyLicenceDeleteBtn));
		uploadDocumentBackSide.sendKeys(uploadBackSide1);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySecondDocDeleteBtn));
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
		Thread.sleep(2000);
		clickOnSubmitGapBtn.click();
		Thread.sleep(2000);
	}

	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
	public void professionalReference(String referenceName, String refDesignation, String refMobileNo, String refEmail,
			String nameRef, String desigRef, String mobileRefNo, String emailRef) throws InterruptedException {
		// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary
		// Professional Reference Check
		// Add Reference(s)--1
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtReferenceCompanyName));
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='AuthBridge Private Ltd'", txtReferenceCompanyName);
		Thread.sleep(2000);
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
		//txtReferenceEmailId.clear();
		js = (JavascriptExecutor) ldriver;;
		js.executeScript("arguments[0].value='abhishek@agamitechnologies.com'", txtReferenceEmailId);
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
		clickOnReferenceContinueBtn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCasePreviewSubmitBtn));
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmOkBtn);
		//clickOnCasePreviewSubmitBtn.click();
		Thread.sleep(1000);
	}
	
	// Candidate Logout
	public void candidteSuccessLogout() {
		clickOnCandidateName.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnLogoutBtn));
		clickOnLogoutBtn.click();
	}
	
	public String verifyInitiateCaseThankYouMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyThankYouMsg));
		return verifyThankYouMsg.getText();
		
	}

}
