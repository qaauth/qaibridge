package com.iBridge.pageobject;

import java.awt.AWTException;
import java.util.List;
import java.awt.Robot;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
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
import org.testng.Assert;

import com.iBridge.utilities.JavaScriptManuplator;

public class CatSignOffApplicable {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public CatSignOffApplicable(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the Bridge Portal
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[@id='submitBtn']")
	@CacheLookup
	WebElement clickOnLoginBtn;

	// Verify Client Listing Name
	@FindBy(xpath = "//span[contains(text(),'Client Listing')]")
	@CacheLookup
	WebElement verifyClientListingText;

	// Search Client Name
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	@CacheLookup
	WebElement clickOnSearchBtn;

	@FindBy(xpath = "//input[@id='client_name']")
	@CacheLookup
	WebElement txtClientName;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	@CacheLookup
	WebElement clickOnSearchButton;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	@CacheLookup
	WebElement clickOnClientId;

	@FindBy(xpath = "//select[@id='client-is-signoff-applicable']")
	@CacheLookup
	WebElement selectSignOffApplicable;// Yes

	// Route to Candidate Applicable
	@FindBy(xpath = "//select[@id='client-is-route-to-candidate']")
	@CacheLookup
	WebElement selectRouteToCandidate;// Yes

	// Check Passport CheckBox
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[16]/div[1]/div[1]/div[1]/div[3]/label[1]/input[1]")
	@CacheLookup
	WebElement checkNidPassportCheckBox;

	// Check Pan Card CheckBox
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[16]/div[1]/div[1]/div[1]/div[4]/label[1]/input[1]")
	@CacheLookup
	WebElement checkNidPanCardCheckBox;

	// Gap Reason Applicable(Yes/No)
	@FindBy(xpath = "//select[@id='is_gap_reason']")
	@CacheLookup
	WebElement selectGapReasonApplicable;

	@FindBy(xpath = "//select[@id='client-company-configuration-is-candidate-sign-upload-enable']")
	@CacheLookup
	WebElement selectSignatureTypeOnARN;// Gesture signature(default)

	@FindBy(xpath = "//button[@id='submit_data']")
	@CacheLookup
	WebElement clickOnSubmitBtn;

	// Client updated Successfully
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	@CacheLookup
	WebElement verifyClientUpdatedSuccessfully;

	// Log Out iBridge Cat
	@FindBy(xpath = "//span[contains(text(),'S')]")
	@CacheLookup
	WebElement clickOnProfileName;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement clickOnLogOutBtn;

	@FindBy(xpath = "//h3[contains(text(),'Welcome! Please login to your account')]")
	@CacheLookup
	WebElement verifyPleaseLoginToYourAccountText;

	// Case(s) Submission Summary--(Pending Sign-Off Bucket)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Case(s) Submission Summary')]")
	WebElement clickOnSubmissionSummary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Pending Sign-Off')]")
	WebElement clickOnPendingSignOff;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement verifyPendingSignOffBucket;

	// Verify Pending Sign-Off Candidate First Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[1]/label[1]")
	WebElement verifyCandidateFname;

	// Pending Sign-Off- Copy Candidate Mail
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[2]/label[1]")
	WebElement copyCandidateMailId;
	
	// verify Email Id Of the case in Pending Sign Off Bucket List
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[2]/div[2]/label")
	WebElement verifyEmailIdInSignOffBucket;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[2]/div[1]/label")
	WebElement verifyNameInSignOffBucket;

	// Logout Ibridge-- British Account
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnBritishProfileName;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnBTLogoutButton;

	// Welcome! Please login to your account
	@FindBy(xpath = "//h3[contains(text(),'Welcome! Please login to your account')]")
	@CacheLookup
	WebElement verifyWelcomePleaseLoginToYourAccountName;

	// INSUFFICIENT CASES-- Verify--Present or not.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement clickOnSubmittedCasesTracker;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='search-box']")
	WebElement txtArsNumberPaste;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[2]/p[1]/label[1]/span[1]")
	WebElement verifyCityNameBangulare;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnCandidateNameInsuff;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='route-btn']")
	WebElement verifyRouteToCandidateBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnCadidateName;

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

	// EDUCATION TO EMPLOYMENT GAP
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/textarea[1]")
	String txtGapReason;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/textarea[1]")
	WebElement enterGapReason;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Education to Employment Gap')]")
	WebElement verifyEducationToEmploymentGap;

	// Login functionalities of the Enp Admin
	@FindBy(name = "username")
	@CacheLookup
	WebElement txtEnpAdminUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtEnpAdminPassword;

	@FindBy(xpath = "//*[@id=\"submitBtn\"]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//span[contains(text(),'Client Listing')]")
	@CacheLookup
	WebElement verifyClientListingTxt;
	
	// Client Configuration Emp Admin
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnEmpAdmimProfileName;
	
	@FindBy(xpath = "//a[contains(text(),'Client Configuration')]")
	@CacheLookup
	WebElement clickOnClientConfigurationModule;
	
	@FindBy(xpath = "//select[@id='client-name']")
	@CacheLookup
	WebElement selectClientName;//British Telecom
	
	@FindBy(xpath = "//select[@id='check-id']")
	@CacheLookup
	WebElement selectEducationVerificationCheck;//Education Verification
	
	@FindBy(xpath = "//input[@id='selectidbtn']")
	@CacheLookup
	WebElement clickOnSelectBtn;
	
	

	public void ibridgeCatLoginDetails(String username, String password) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		Thread.sleep(1000);
		clickOnLoginBtn.click();
		Thread.sleep(1000);
	}

	public String verifyClientListingName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyClientListingText));
		return verifyClientListingText.getText();
	}

	// Search Client Name-- British Client Sign Off Applicable (Yes)
	public void britishClientSignOffApplicableYes() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, selectSignOffApplicable, 60);
		JavaScriptManuplator.selectOptionFromDropDown(selectSignOffApplicable, "Yes");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Client updated Successfully
	public String verifyClientUpdatedSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyClientUpdatedSuccessfully));
		return verifyClientUpdatedSuccessfully.getText();
	}

	// Search Client Name-- British Client Sign Off Applicable (No)
	public void britishClientSignOffApplicableNo() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, selectSignOffApplicable, 60);
		JavaScriptManuplator.selectOptionFromDropDown(selectSignOffApplicable, "No");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Log Out iBridge Cat
	public void iBridgeCatLogout() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfileName));
		clickOnProfileName.click();
		Thread.sleep(1000);
		clickOnLogOutBtn.click();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyPleaseLoginToYourAccountText));
		Thread.sleep(1000);
	}

	// Case(s) Submission Summary--(Pending Sign-Off Bucket)
	public void pendingSignOffBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSidebarExpand));
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSummary));
		clickOnSubmissionSummary.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSummary));
		Thread.sleep(1000);
		WebElement element = ldriver.findElement(
				By.xpath("//a[contains(text(),'Pending Sign-Off')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyPendingSignOffBucket));
		ldriver.navigate().refresh();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(copyCandidateMailId));
		Thread.sleep(1000);
	}
	
	// verify Name Of the case in Pending Sign Off Bucket List
	public String PendingSignOffBucketListCandidateFname() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNameInSignOffBucket));
		return verifyNameInSignOffBucket.getText();
	}

	public String submittedForVerificationCandidateFname() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname));
		return verifyCandidateFname.getText();
	}

	// Logout Ibridge-- British Account
	public void logoutBritishTelecomAccount() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnBritishProfileName));
		JavaScriptManuplator.javaScriptExecutor(clickOnBritishProfileName, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnBTLogoutButton));
		JavaScriptManuplator.javaScriptExecutor(clickOnBTLogoutButton, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Welcome! Please login to your account
	public String verifyWelcomNameBt() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWelcomePleaseLoginToYourAccountName));
		return verifyWelcomePleaseLoginToYourAccountName.getText();
	}

	// Route to Candidate Applicable (Yes)
	public void routeToCandidateApplicableYes() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, selectRouteToCandidate, 60);
		JavaScriptManuplator.selectOptionFromDropDown(selectRouteToCandidate, "Yes");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Route to Candidate Applicable (Yes)
	public void routeToCandidateApplicableNo() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, selectRouteToCandidate, 60);
		JavaScriptManuplator.selectOptionFromDropDown(selectRouteToCandidate, "No");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// INSUFFICIENT CASES-- Verify--Present or not.
	public void verifyInsufficientCaseRejectedArsNumber(String arsNumber) throws AWTException, InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Insuffficient Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		txtArsNumberPaste.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		clickOnCadidateName.click();
		Thread.sleep(1000);
	}

	public void verifyRouteToCandidateButtonPresentOrNot() throws InterruptedException {
		Thread.sleep(4000);
		try {
			ldriver.findElement(By.xpath("//a[@id='route-btn']"));
			System.out.println("Route To Candidate Button Has Present Successfully!");
		} catch (NoSuchElementException e) {
			System.out.println("Route To Candidate Button Has Not Present Successfully!");
		}
	}

	// NID Dropdown Settings-- Check Passport CheckBox
	public void nidPassportDropdownSettings() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		// Check Passport CheckBox
		JavaScriptManuplator.waitForElementPresent(ldriver, checkNidPassportCheckBox, 60);
		JavaScriptManuplator.javaScriptExecutor(checkNidPassportCheckBox, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// NID Dropdown Settings-- Check Passport CheckBox-- Check Pan Card CheckBox
	public void nidPanCardAndPassportDropdownSettings() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		// Check Passport CheckBox
		JavaScriptManuplator.waitForElementPresent(ldriver, checkNidPassportCheckBox, 60);
		JavaScriptManuplator.javaScriptExecutor(checkNidPassportCheckBox, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		// Check Pan Card CheckBox
		JavaScriptManuplator.waitForElementPresent(ldriver, checkNidPanCardCheckBox, 60);
		JavaScriptManuplator.javaScriptExecutor(checkNidPanCardCheckBox, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// National Identity--Add Document(s)--1
	public void passpotNationalIdentity(String docFrontSide, String nameAsDoc, String docNumber, String docFrontSide2,
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
		Thread.sleep(10000);
	}

	public void verifyPassportNidInDropdownList() {
		String arr[] = { "--Select--", "VOTER ID", "DRIVING LICENSE", "PASSPORT" };
		Select select = new Select(selectDocumentType);
		List<WebElement> allOptions = select.getOptions();
		// System.out.println(allOptions.size());
		for (int i = 0; i < allOptions.size(); i++) {
			Assert.assertEquals(arr[i], allOptions.get(i).getText());
		}
		System.out.println("The Dropdown Nid List has verified Successfully!");
	}

	public void voterIdAndDrivingLicenseNidInDropdownList() {
		String arr[] = { "--Select--", "VOTER ID", "DRIVING LICENSE" };
		Select select = new Select(selectDocumentType);
		List<WebElement> allOptions = select.getOptions();
		System.out.println("Dropdown List=="+allOptions.size());
		for (int i = 0; i < allOptions.size(); i++) {
			Assert.assertEquals(arr[i], allOptions.get(i).getText());
		}
		System.out.println("The Dropdown Nid List has verified Successfully!");
	}

	// Gap Reason Applicable No
	public void gapReasonApplicableNo() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectGapReasonApplicable, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectGapReasonApplicable));
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectGapReasonApplicable, "No");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Gap Reason Applicable Yes
	public void gapReasonApplicableYes() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearchBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		JavaScriptManuplator.waitForElementPresent(ldriver, txtClientName, 60);
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='British Telecom'", ldriver);
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchButton, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnClientId));
		JavaScriptManuplator.javaScriptExecutor(clickOnClientId, "arguments[0].click()", ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectGapReasonApplicable, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectGapReasonApplicable));
		Thread.sleep(1000);
		JavaScriptManuplator.selectOptionFromDropDown(selectGapReasonApplicable, "Yes");
		JavaScriptManuplator.javaScriptExecutor(selectSignatureTypeOnARN, "arguments[0].scrollIntoView(true);",
				ldriver);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(selectSignatureTypeOnARN));
		JavaScriptManuplator.selectOptionFromDropDown(selectSignatureTypeOnARN, "Gesture signature(default)");
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].scrollIntoView(true);", ldriver);
		JavaScriptManuplator.javaScriptExecutor(clickOnSubmitBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// EDUCATION TO EMPLOYMENT GAP
	public void verifyEducationToEmpGapFoormPresentNot() throws InterruptedException {
		Thread.sleep(4000);
		try {
			ldriver.findElement(By.xpath(txtGapReason));
			System.out.println("Enter Gap Reason Text Field Has Present Successfully!");
		} catch (NoSuchElementException e) {
			System.out.println("Enter Gap Reason Text Field Has Not Present Successfully!");
		}
	}

	// EDUCATION TO EMPLOYMENT GAP-- Fulfil
	public void verifyEnterGapReasonEducationAndEmp() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(enterGapReason));
		JavaScriptManuplator.javaScriptExecutor(enterGapReason,
				"arguments[0].value='Preparation for the entrance examination'", ldriver);
		Thread.sleep(1000);
	}

	// Enp- Admin for Configuration
	public void loginEnpAdminAccount(String enpAdminUsername, String enpAdminPassword) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtEnpAdminUserName.sendKeys(enpAdminUsername);
		txtEnpAdminPassword.sendKeys(enpAdminPassword);
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(1000);
	}

	public String verifyClientListingText() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyClientListingTxt));
		return verifyClientListingTxt.getText();
	}
}
