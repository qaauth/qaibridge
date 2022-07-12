package com.iBridge.pageobject;

import java.util.List;

import org.openqa.selenium.By;
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

import com.iBridge.utilities.JavaScriptManuplator;

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

	// Are you sure do not have a PAN card? Click on 'OK' to select another identity
	// document to upload.
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

	// All the details will be submitted and you will not be able to make changes
	// later. Please review your form and submit
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

	// Verify Initiate Case Thank You Message
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Thank You!')]")
	WebElement verifyCaseThankYouMsg;

	// National Identity--Add Document(s)--1
	public void nationalIdentity(String docFrontSide, String nameAsDoc, String docNumber, String docFrontSide2,
			String docBackSide, String nameDoc2, String docNumber2) throws InterruptedException {
		// ldriver.navigate().refresh();
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

		// Are you sure do not have a PAN card? Click on 'OK' to select another identity
		// document to upload.
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
		js.executeScript("arguments[0].value='BROPC3435P'", txtDocumentNumber1);
		Thread.sleep(2000);
		clickOnNationalCountinueBtn.click();
		Thread.sleep(1000);
	}

	public void uploadCvDocument(String cvUpload) throws InterruptedException {
		uploadCvDocument.sendKeys(cvUpload);
		Thread.sleep(1000);
	}

	// PROFESSIONAL REFERENCE--Step 3 - Candidate Summary

	// Professional Reference Check
	// Add Reference(s)--1
	public void professionalReference(String companyName, String referenceName, String refDesignation,
			String refMobileNo, String refEmail, String nameRef, String desigRef, String mobileRefNo, String emailRef)
			throws InterruptedException {
		// Professional Reference Check--Step 3 - Candidate Summary
		// Add Reference(s)--1
		// wait = new WebDriverWait(ldriver, 60);
		// wait.until(ExpectedConditions.visibilityOf(verifyProfessionalRef));
		Thread.sleep(10000);
		// txtCompanyName.sendKeys(companyName);
		// JavaScriptManuplator.waitForElementPresent(ldriver,
		// clickOnRadioReferenceLevelSenior, 120);
		// wait = new WebDriverWait(ldriver, 120);
		// wait.until(ExpectedConditions.visibilityOf(clickOnRadioReferenceLevelSenior));

		// ADD TO QUEUE
		List<WebElement> tag = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag.size(); i++) {
			if (tag.get(i).getAttribute("type").equals("radio")) {
				System.out.println("hgeuu");
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag.get(i));
				break;
			}
		}

		// clickOnRadioReferenceLevelSenior.click();
//			JavascriptExecutor js=(JavascriptExecutor)ldriver;
//			((JavaScriptManuplator) js).javaScriptExecutor(clickOnRadioReferenceLevelSenior, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		// txtReferenceName.clear();
		// txtReferenceName.sendKeys(referenceName);
		// ADD TO QUEUE
		List<WebElement> tag1 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag1.size(); i++) {
			if (tag1.get(i).getAttribute("id").equals("check-data-91594-data-1-129")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag1.get(i), "arguments[0].value='Raju Yadav'", ldriver);
				System.out.println("hiiii");
				break;
			}
		}

		// JavaScriptManuplator.javaScriptExecutor(txtReferenceName,
		// "arguments[0].value='Raju Yadav'", ldriver);
		// txtReferenceDesignation.clear();
		List<WebElement> tag2 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag2.size(); i++) {
			if (tag2.get(i).getAttribute("id").equals("check-data-91594-data-1-130")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag2.get(i), "arguments[0].value='qa'", ldriver);
				System.out.println("hgeuu");
				break;

			}
		}

		// JavaScriptManuplator.javaScriptExecutor(txtReferenceDesignation,
		// "arguments[0].value='qa'", ldriver);
		// txtReferenceDesignation.sendKeys(refDesignation);
		// txtReferenceMobileNo.clear();
		List<WebElement> tag4 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag4.size(); i++) {
			if (tag4.get(i).getAttribute("id").equals("check-data-91594-data-1-131")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag4.get(i), "arguments[0].value='7042718794'", ldriver);
				System.out.println("hgufru");
				break;
			}
		}

		// JavaScriptManuplator.javaScriptExecutor(txtReferenceMobileNo,
		// "arguments[0].value='7042718794'", ldriver);
		// txtReferenceMobileNo.sendKeys(refMobileNo);
		Thread.sleep(2000);
		// js = (JavascriptExecutor) ldriver;
		// js.executeScript("arguments[0].scrollIntoView(true);", verifyReferenceTwo);
		Thread.sleep(1000);
		List<WebElement> tag5 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag5.size(); i++) {
			if (tag5.get(i).getAttribute("id").equals("check-data-91594-data-1-132")) {
				JavaScriptManuplator.javaScriptExecutor(tag5.get(i), "arguments[0].value='krishnaKant@gmail.com'",
						ldriver);
				System.out.println("hgufru");
				break;
			}
		}

		/// js = (JavascriptExecutor) ldriver;
		// js.executeScript("arguments[0].value='krishnaKant@gmail.com'",
		/// txtReferenceEmailId);
		// txtReferenceEmailId.clear();
		// txtReferenceEmailId.sendKeys(refEmail);

		// Add Reference(s) REFERENCE-- 2
		List<WebElement> tag6 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag6.size(); i++) {
			if (tag6.get(i).getAttribute("id").equals("check-data-90742-data-2-128-peer")) {
				System.out.println("hgeuu");
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag6.get(i));
				System.out.println("hgufru");
				break;
			}
		}
		
		// clickOnPeerRadioBtn.click();
		// txtNameReference.clear();
		List<WebElement> tag7 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag7.size(); i++) {
			if (tag7.get(i).getAttribute("id").equals("check-data-91594-data-2-129")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag7.get(i), "arguments[0].value='Sunil'", ldriver);
				System.out.println("hgufru");
				break;
			}
		}
		
		// txtNameReference.sendKeys(nameRef);
		// txtDesignationReference.clear();
		List<WebElement> tag8 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag8.size(); i++) {
			if (tag8.get(i).getAttribute("id").equals("check-data-91594-data-2-130")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag8.get(i), "arguments[0].value='Quality Analyst'", ldriver);
				System.out.println("hgufru");
				break;
			}
		}
		
		// txtDesignationReference.sendKeys(desigRef);
		// txtReferenceMobileNumber.clear();
		List<WebElement> tag9 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag9.size(); i++) {
			if (tag9.get(i).getAttribute("id").equals("check-data-91594-data-2-131")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag9.get(i), "arguments[0].value='7007299642'", ldriver);
				System.out.println("hgufru");
				break;
			}
		}
		System.out.println("hoo");
		// txtReferenceMobileNumber.sendKeys(mobileRefNo);
		List<WebElement> tag10 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag10.size(); i++) {
			if (tag10.get(i).getAttribute("id").equals("check-data-91594-data-2-132")) {
				System.out.println("hgeuu");
				JavaScriptManuplator.javaScriptExecutor(tag10.get(i), "arguments[0].value='sunil.kumar@gmail.com'",
						ldriver);
				System.out.println("hgufru");
				break;
			}
		}
		// txtEmailIdReference.sendKeys(emailRef);
		List<WebElement> tag11 = ldriver.findElements(By.tagName("input"));
		for (int i = 0; i < tag11.size(); i++) {
			if (tag11.get(i).getAttribute("name").equals("continue")) {
				System.out.println("hgeuu");
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag11.get(i));
				System.out.println("hgufru");
				break;
			}
		}
		
		// clickOnReferenceContinueBtn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCasePreviewSubmitBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCasePreviewSubmitBtn);
		Thread.sleep(2000);
		// Confirm- alert Ok Button
		List<WebElement> tag12 = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag12.size(); i++) {
			if (tag12.get(i).getAttribute("type").equals("button")) {
				System.out.println("hgeuu");
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag12.get(i));
				break;
			}
		}
		
		// clickOnConfirmAlertOkBtn.click();
		// js = (JavascriptExecutor) ldriver;
		// js.executeScript("arguments[0].click()", clickOnConfirmAlertOkBtn);
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
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseThankYouMsg));
		return verifyCaseThankYouMsg.getText();

	}

}
