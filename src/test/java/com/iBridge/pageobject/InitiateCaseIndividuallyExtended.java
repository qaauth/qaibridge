package com.iBridge.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[3]/button")
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
	@FindBy(how = How.XPATH, using = "//small[contains(text(),'(Note : You may provide professional references of')]")
	WebElement verifyProfessionalRef;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/input")
	WebElement txtCompanyName;
	
	// Add Reference(s)--1
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]")
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
		Thread.sleep(2000);
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
		Thread.sleep(3000);
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
			//Professional Reference Check--Step 3 - Candidate Summary
			//Add Reference(s)--1
			//wait = new WebDriverWait(ldriver, 60);
			//wait.until(ExpectedConditions.visibilityOf(verifyProfessionalRef));
	         Thread.sleep(10000);
			//txtCompanyName.sendKeys(companyName);
			//JavaScriptManuplator.waitForElementPresent(ldriver, clickOnRadioReferenceLevelSenior, 120);	
			//wait = new WebDriverWait(ldriver, 120);
			//wait.until(ExpectedConditions.visibilityOf(clickOnRadioReferenceLevelSenior));
			
			// ADD TO QUEUE
			List<WebElement> tag = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag.size(); i++) {
				if (tag.get(i).getAttribute("type").equals("radio")) {
					JavascriptExecutor executor = (JavascriptExecutor) ldriver;
					executor.executeScript("arguments[0].click();", tag.get(i));
					System.out.println("hiiii");
					break;
				}
			}	 
			 
			//clickOnRadioReferenceLevelSenior.click();
//			JavascriptExecutor js=(JavascriptExecutor)ldriver;
//			((JavaScriptManuplator) js).javaScriptExecutor(clickOnRadioReferenceLevelSenior, "arguments[0].click()", ldriver);
			Thread.sleep(2000);
			//txtReferenceName.clear();	
			//txtReferenceName.sendKeys(referenceName);
			// ADD TO QUEUE
					List<WebElement> tag1 = ldriver.findElements(By.tagName("input"));
					for (int i = 0; i < tag1.size(); i++) {
						if (tag1.get(i).getAttribute("id").equals("check-data-91594-data-1-129")) {
							JavaScriptManuplator.javaScriptExecutor(tag1.get(i), "arguments[0].value='Raju Yadav'", ldriver);
							System.out.println("hi");
							break;
						}
					}	
				
			//JavaScriptManuplator.javaScriptExecutor(txtReferenceName, "arguments[0].value='Raju Yadav'", ldriver);
			//txtReferenceDesignation.clear();
					List<WebElement> tag2 = ldriver.findElements(By.tagName("input"));
					for (int i = 0; i < tag2.size(); i++) {
						if (tag2.get(i).getAttribute("id").equals("check-data-91594-data-1-130")) {
							JavaScriptManuplator.javaScriptExecutor(tag2.get(i), "arguments[0].value='qa'", ldriver);	
							System.out.println("hgeuu");
							break;
							
						}
					}	 
					
					
			//JavaScriptManuplator.javaScriptExecutor(txtReferenceDesignation, "arguments[0].value='qa'", ldriver);		
			//txtReferenceDesignation.sendKeys(refDesignation);
			//txtReferenceMobileNo.clear();
					List<WebElement> tag4 = ldriver.findElements(By.tagName("input"));
					for (int i = 0; i < tag4.size(); i++) {
						if (tag4.get(i).getAttribute("id").equals("check-data-91594-data-1-131")) {
							JavaScriptManuplator.javaScriptExecutor(tag4.get(i), "arguments[0].value='7042718794'", ldriver);
							System.out.println("hgufru");
							break;
						}
					}	
					
			//JavaScriptManuplator.javaScriptExecutor(txtReferenceMobileNo, "arguments[0].value='7042718794'", ldriver);
			//txtReferenceMobileNo.sendKeys(refMobileNo);
			Thread.sleep(2000);
			//js = (JavascriptExecutor) ldriver;
			//js.executeScript("arguments[0].scrollIntoView(true);", verifyReferenceTwo);
			Thread.sleep(1000);
			List<WebElement> tag5 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag5.size(); i++) {
				if (tag5.get(i).getAttribute("id").equals("check-data-91594-data-1-132")) {
					JavaScriptManuplator.javaScriptExecutor(tag5.get(i), "arguments[0].value='krishnaKant@gmail.com'", ldriver);
					System.out.println("hguf");
					break;
				}
			}	 
			
			///js = (JavascriptExecutor) ldriver;
			//js.executeScript("arguments[0].value='krishnaKant@gmail.com'", txtReferenceEmailId);
			//txtReferenceEmailId.clear();
			//txtReferenceEmailId.sendKeys(refEmail);

			// Add Reference(s) REFERENCE-- 2
			List<WebElement> tag6 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag6.size(); i++) {
				if (tag6.get(i).getAttribute("id").equals("check-data-90742-data-2-128-peer")) {
					JavascriptExecutor executor = (JavascriptExecutor) ldriver;
					executor.executeScript("arguments[0].click();", tag6.get(i));
					System.out.println("hgufru");
					break;
				}
			}	
			
			//clickOnPeerRadioBtn.click();
			//txtNameReference.clear();
			List<WebElement> tag7 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag7.size(); i++) {
				if (tag7.get(i).getAttribute("id").equals("check-data-91594-data-2-129")) {
					JavaScriptManuplator.javaScriptExecutor(tag7.get(i), "arguments[0].value='Sunil'", ldriver);
					System.out.println("hgufru");
					break;
				}
			}	
			
			//txtNameReference.sendKeys(nameRef);
			//txtDesignationReference.clear();
			List<WebElement> tag8 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag8.size(); i++) {
				if (tag8.get(i).getAttribute("id").equals("check-data-91594-data-2-130")) {
					JavaScriptManuplator.javaScriptExecutor(tag8.get(i), "arguments[0].value='Quality Analyst'", ldriver);
					System.out.println("hgufru");
					break;
				}
			}
			
			//txtDesignationReference.sendKeys(desigRef);
			//txtReferenceMobileNumber.clear();
			List<WebElement> tag9 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag9.size(); i++) {
				if (tag9.get(i).getAttribute("id").equals("check-data-91594-data-2-131")) {
					JavaScriptManuplator.javaScriptExecutor(tag9.get(i), "arguments[0].value='7007299642'", ldriver);
					System.out.println("hgufru");
					break;
				}
			}	 
			
			//txtReferenceMobileNumber.sendKeys(mobileRefNo);
			List<WebElement> tag10 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag10.size(); i++) {
				if (tag10.get(i).getAttribute("id").equals("check-data-91594-data-2-132")) {
					JavaScriptManuplator.javaScriptExecutor(tag10.get(i), "arguments[0].value='sunil.kumar@gmail.com'", ldriver);
					System.out.println("hgufru");
					break;
				}
			}	 
			//txtEmailIdReference.sendKeys(emailRef);
			List<WebElement> tag11 = ldriver.findElements(By.tagName("input"));
			for (int i = 0; i < tag11.size(); i++) {
				if (tag11.get(i).getAttribute("name").equals("continue")) {
					JavascriptExecutor executor = (JavascriptExecutor) ldriver;
					executor.executeScript("arguments[0].click();", tag11.get(i));
					System.out.println("hgufru");
					break;
				}
			}	
			
			//clickOnReferenceContinueBtn.click();
			wait = new WebDriverWait(ldriver, 120);
			wait.until(ExpectedConditions.visibilityOf(clickOnCasePreviewSubmitBtn));
			js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
			Thread.sleep(2000);
			// Confirm- alert Ok Button
			List<WebElement> tag12 = ldriver.findElements(By.tagName("button"));
			for (int i = 0; i < tag12.size(); i++) {
				if (tag12.get(i).getAttribute("type").equals("button")) {
					JavascriptExecutor executor = (JavascriptExecutor) ldriver;
					executor.executeScript("arguments[0].click();", tag12.get(i));
					break;
				}
			}	 
			
			//clickOnConfirmAlertOkBtn.click();
			//js = (JavascriptExecutor) ldriver;
			//js.executeScript("arguments[0].click()", clickOnConfirmAlertOkBtn);
			Thread.sleep(1000);
		}

		public void CandidteLogout() throws InterruptedException {
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
