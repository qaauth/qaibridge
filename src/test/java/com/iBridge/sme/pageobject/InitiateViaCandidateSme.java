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

public class InitiateViaCandidateSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InitiateViaCandidateSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Initiate Via Candidate SME --Initiate new case
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Initiate Via Candidate')]")
	WebElement clickOnInitiateViaCandidate;

	// Step 1-Package Selection-- Buy Checks - Packages
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'PAN No Verification')]")
	WebElement checkedChekBoxPanNoVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Education Verification')]")
	WebElement checkedCheckBoxEducation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Global Regulatory Compliance and Debarment Databas')]")
	WebElement checkedCheckBoxGlobalRegulatory;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Court Record Database Check')]")
	WebElement checkedCheckboxIndiaCourtCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Database Check Level 1')]")
	WebElement checkedCheckboxIndiaDatabase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Comprehensive Criminal Record Database Check')]")
	WebElement checkedCheckboxIndiaComprehensive;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'CV Validation')]")
	WebElement checkedCheckboxCvValidation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Court Record Check through Law Firm')]")
	WebElement checkedCheckboxIndiaCourtRecord;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Civil Litigation Database Check')]")
	WebElement checkedCheckboxIndiaCivil;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'National Identity Check')]")
	WebElement chekedCheckboxNationalIdentity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Credit Default Database Check')]")
	WebElement checkCheckedIndiaCredit;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Current Employment Verification')]")
	WebElement checkedCheckboxCurrentEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Current Address Verification')]")
	WebElement checkedCheckboxCurrentAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'India Advanced Web and Media Searches')]")
	WebElement checkedCheckboxIndiaAdvanced;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Previous Employment Verification')]")
	WebElement checkedCheckboxPreviousEmployment;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Personal Reference Check')]")
	WebElement checkedCheckboxPersonalReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Professional Reference Check')]")
	WebElement checkedCheckboxProfessionalReference;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Drug Test')]")
	WebElement checkedCheckboxDrugTest;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Permanent Address Verification')]")
	WebElement checkedCheckboxPermanentAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[3]/div[2]/div[3]/button[1]")
	WebElement clickOnChooseCustomBtn;

	// Candidate Details-- Initiate Via Candidate
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement txtCandidateFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement txtCandidateMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement txtCandidateLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement txtCandidateEmailAddress;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]")
	WebElement txtCandidateMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
	WebElement uploadCandidateCv;

	// Package Details: No. of verification(s)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaCourtRecordCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaDatabaseCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaComprehensiveCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaCourtRecordLawFirmCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[10]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectNationalIdentityCheck;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[14]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/select[1]")
	WebElement selectIndiaAdvancedWeb;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement clickOnInitiateCaseBtn;

	// Verify-- Thank You Message
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you')]")
	WebElement verifyThankYouText;
	
	// Total Case Raised-- Form Not Submitted Case
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/nav/div[2]/div/ul[1]/li[1]/a")
	WebElement clickOnDashBoardModule;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Cases Raised')]")
	WebElement clickOnTotalCasesRaised;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Form Not Submitted')]")
	WebElement clickOnFormNotSubmittedBucket;
	
	// Verify Candidate Name-- Form Not Submitted
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	WebElement verifyCandidateFirstName;
	
	/*// Form Not Submitted -- 
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/select[1]")
	WebElement selectActionWithdraw;
	
	// Press OK if you want to withdraw the case, else press CANCEL.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOKWithdrawCase;
	
	// Case has been withdrawn Successfully !
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifyWithdrawnSuccessfullyText;*/
	
	

	// Initiate Self --Initiate new case
	public void initiateViaCandidateNewCase() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateViaCandidate));
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Initiate Via Candidate')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
	}

	// Step 1-Package Selection-- Buy Checks - Packages
	public void buyChecksPackagesSelectionCustom() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(checkedChekBoxPanNoVerification));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedChekBoxPanNoVerification);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckBoxEducation);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckBoxGlobalRegulatory);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCourtCheck);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxIndiaDatabase);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaDatabase);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaComprehensive);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCvValidation);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCourtRecord);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxIndiaCivil);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaCivil);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", chekedCheckboxNationalIdentity);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkCheckedIndiaCredit);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCurrentEmployment);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxCurrentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxCurrentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxIndiaAdvanced);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPreviousEmployment);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPersonalReference);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxProfessionalReference);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkedCheckboxDrugTest);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxDrugTest);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkedCheckboxPermanentAddress);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnChooseCustomBtn);
		Thread.sleep(1000);
	}

	// Candidate Details-- Initiate Via Candidate
	public void candidateFirstName(String firstName) {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtCandidateFirstName));
		txtCandidateFirstName.sendKeys(firstName);
	}

	public void candidateMiddleName(String middleName) {
		txtCandidateMiddleName.sendKeys(middleName);
	}

	public void candidateLastName(String lastName) {
		txtCandidateLastName.sendKeys(lastName);
	}

	public void candidateEmailAddress(String emailAddress) throws InterruptedException {
		txtCandidateEmailAddress.sendKeys(emailAddress);
		Thread.sleep(1000);
	}

	// Package Details: No. of verification(s)
	public void initiateViaCandidateCaseCustom(String mobile, String cvUpload) throws InterruptedException {
		Thread.sleep(1000);
		txtCandidateMobileNumber.sendKeys(mobile);
		Thread.sleep(1000);
		uploadCandidateCv.sendKeys(cvUpload);
		Thread.sleep(2000);

		// Package Details: No. of verification(s)
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectIndiaCourtRecordCheck);
		Select indiaCourtRecordCheck = new Select(selectIndiaCourtRecordCheck);
		indiaCourtRecordCheck.selectByIndex(1);

		Select indiaDatabaseCheck = new Select(selectIndiaDatabaseCheck);
		indiaDatabaseCheck.selectByIndex(1);

		Select indiaComprehensiveCheck = new Select(selectIndiaComprehensiveCheck);
		indiaComprehensiveCheck.selectByIndex(1);

		Select indiaCourtRecordLawFirmCheck = new Select(selectIndiaCourtRecordLawFirmCheck);
		indiaCourtRecordLawFirmCheck.selectByIndex(1);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectNationalIdentityCheck);
		Select nationalIdentityCheck = new Select(selectNationalIdentityCheck);
		nationalIdentityCheck.selectByIndex(4);

		Select indiaAdvancedWeb = new Select(selectIndiaAdvancedWeb);
		indiaAdvancedWeb.selectByIndex(1);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInitiateCaseBtn);
		Thread.sleep(1000);
	}

	// Verify-- Thank You message
	public String verifyThankYouMessage() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyThankYouText));
		return verifyThankYouText.getText();
	}
	
	// Total Case Raised-- Form Not Submitted Case
	public void formNotSubmittedCaseList() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashBoardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashBoardModule);
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesRaised));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesRaised);
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnFormNotSubmittedBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnFormNotSubmittedBucket);
		Thread.sleep(1000);
	}
	
	// Verify Candidate Name-- Form Not Submitted
	public String verifyCandidateNameInFormNotSubmittedList() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFirstName));
		return verifyCandidateFirstName.getText();
	}
}
