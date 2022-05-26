package com.iBridge.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.utilities.JavaScriptManuplator;

public class PrepaidEnpAdmin {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public PrepaidEnpAdmin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Login functionalities of the Enp Admin
	@FindBy(name = "username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@id=\"submitBtn\"]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//span[contains(text(),'Client Listing')]")
	@CacheLookup
	WebElement verifyClientListingTxt;

	// Login functionalities of the Prepaid Candidate Portal
	@FindBy(xpath = "//h3[contains(text(),'Case Submission Summary')]")
	@CacheLookup
	WebElement verifyCaseSubmissionSummaryText;

	// Logout Prepaid Candidate Account
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnProfile;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnPrepaidCandidateLogoutBtn;

	// Prepaid Client Configure
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	@CacheLookup
	WebElement clickOnSearch;

	@FindBy(xpath = "//input[@id='client_name']")
	@CacheLookup
	WebElement txtClientName;// British Telecom

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	@CacheLookup
	WebElement clickOnSearchBtn;

	@FindBy(xpath = "//a[contains(text(),'Enable')]")
	@CacheLookup
	WebElement getEnableText;

	@FindBy(xpath = "//a[contains(text(),'Enable')]")
	@CacheLookup
	WebElement clickOnEnbleBtn;

	// Alert-- Are you sure?
	@FindBy(xpath = "//button[contains(text(),'Confirm and Proceed')]")
	@CacheLookup
	WebElement clickOnConfirmAndProceedBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")
	@CacheLookup
	WebElement clickOnConfugureBtn;

	// Prepaid Configuration
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnEmpAdminMenu;

	@FindBy(xpath = "//span[contains(text(),'Prepaid Configuration')]")
	@CacheLookup
	WebElement clickOnPrepaidConfigurationModule;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/a[1]/i[1]")
	@CacheLookup
	WebElement clickOnCheckWiseEditBtn;

	// Tag Checks-- Check Configuration Part Check Showing or Not!
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/input[2]")
	@CacheLookup
	WebElement uncheckPerAddressVerificationTagCheckBox;

	@FindBy(xpath = "//button[@id='submitFormId']")
	@CacheLookup
	WebElement clickOnSaveBtn;

	// Package Updated Successfully.
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement verifyPackageUpdatedSuccessfullyMsg;

	// Click On Profile Enp Admin
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnEnpAdminBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement clickOnEnpAdminLogoutBtn;

	// Welcome! Please login to your account
	@FindBy(xpath = "//h3[contains(text(),'Welcome! Please login to your account')]")
	@CacheLookup
	WebElement verifyWelcomePleaseLoginToYourAccount;

	// Initiate new case for Ivc
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnMenu;

	@FindBy(xpath = "//span[contains(text(),'Initiate New Case')]")
	@CacheLookup
	WebElement clickOnInitiateNewCase;

	@FindBy(xpath = "//span[contains(text(),'Initiate Case(s) Individually')]")
	@CacheLookup
	WebElement clickOnInitiateCaseIndividually;
	
	// Step 2 - Package Selection-- Check Wise
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/label")
	@CacheLookup
	WebElement clickOnPackageSelection;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[1]/input")
	@CacheLookup
	WebElement txtSearchPackageCheckWiseName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[1]/input")
	@CacheLookup
	WebElement txtSearchCheckWiseName;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[2]/ul/li[1]")
	@CacheLookup
	WebElement clickOnCheckWiseName;

	@FindBy(xpath = "//label[contains(text(),'Check Wise')]")
	@CacheLookup
	WebElement verifyCheckWiseText;

	// Verify Count Tag Checks Count Number
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/span[1]")
	@CacheLookup
	WebElement verifyTagChecksCountNumber;

	// Logout User Account
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]")
	@CacheLookup
	WebElement clickOnUserProfileName;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnUserLogoutBtn;

	public void loginEnpAdminAccount(String enpAdminUsername, String enpAdminPassword) {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(enpAdminUsername);
		txtPassword.sendKeys(enpAdminPassword);
		btnLogin.click();
	}

	public String verifyClientListingText() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyClientListingTxt));
		return verifyClientListingTxt.getText();
	}

	public String verifyCaseSubmissionSummaryName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseSubmissionSummaryText));
		return verifyCaseSubmissionSummaryText.getText();
	}

	// Logout Prepaid Candidate Account
	public void verifyPrepaidCandidateLogout() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfile));
		Thread.sleep(1000);
		clickOnProfile.click();
		Thread.sleep(1000);
		clickOnPrepaidCandidateLogoutBtn.click();
		Thread.sleep(1000);
	}

	// Prepaid Client Configure
	public void prepaidClientAction() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSearch));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearch, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtClientName));
		JavaScriptManuplator.javaScriptExecutor(txtClientName, "arguments[0].value='Delhivery Pvt. Ltd.'", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSearchBtn, "arguments[0].click()", ldriver);
		String expectedName = "Enable";
		String getText = ldriver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/a[1]"))
				.getText();

		if (expectedName.equalsIgnoreCase(getText)) {
			JavaScriptManuplator.javaScriptExecutor(clickOnEnbleBtn, "arguments[0].click()", ldriver);
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(clickOnConfirmAndProceedBtn));
			JavaScriptManuplator.javaScriptExecutor(clickOnConfirmAndProceedBtn, "arguments[0].click()", ldriver);
			JavaScriptManuplator.javaScriptExecutor(clickOnConfugureBtn, "arguments[0].click()", ldriver);
			Thread.sleep(1000);
		}

		else {
			wait = new WebDriverWait(ldriver, 60);
			wait.until(ExpectedConditions.visibilityOf(clickOnConfugureBtn));
			JavaScriptManuplator.javaScriptExecutor(clickOnConfugureBtn, "arguments[0].click()", ldriver);
			Thread.sleep(1000);
		}
	}

	// Prepaid Configuration for Tag Check-- Uncheck
	public void prepaidClientConfigureForTagCheck() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEmpAdminMenu));
		clickOnEmpAdminMenu.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPrepaidConfigurationModule));
		clickOnPrepaidConfigurationModule.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckWiseEditBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnCheckWiseEditBtn, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(uncheckPerAddressVerificationTagCheckBox, "arguments[0].click()",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSaveBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnSaveBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Package Updated Successfully.
	public String verifyPackageUpdatedSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPackageUpdatedSuccessfullyMsg));
		return verifyPackageUpdatedSuccessfullyMsg.getText();
	}

	// Click On Profile Enp Admin
	public void verifyEnpAdminAcountLogoutTag() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEnpAdminBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnEnpAdminBtn, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEnpAdminLogoutBtn));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnEnpAdminLogoutBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Welcome! Please login to your account
	public String verifyWelcomeEmpAdminTextTag() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWelcomePleaseLoginToYourAccount));
		return verifyWelcomePleaseLoginToYourAccount.getText();
	}

	// User Logged in Details
	// Initiate new case for Ivc
	public void initiateNewCaseForIvc() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnMenu));
		JavaScriptManuplator.javaScriptExecutor(clickOnMenu, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateNewCase, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateCaseIndividually));
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateCaseIndividually, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Step 2 - Package Selection-- Check Wise
	public void selectPackageCheckWise() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPackageSelection));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnPackageSelection, "arguments[0].click()", ldriver);
		//clickOnPackageSelection.click();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtSearchPackageCheckWiseName));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtSearchCheckWiseName, "arguments[0].value='Check Wise'", ldriver);
		Thread.sleep(2000);
		txtSearchCheckWiseName.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		clickOnCheckWiseName.click();
		Thread.sleep(2000);
	}

	// Verify Count Tag Checks Count Number
	public String verifyCheckWiseCountNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyTagChecksCountNumber));
		return verifyTagChecksCountNumber.getText();
	}

	// Logout User Account
	public void userLogoutAccount() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnUserProfileName));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnUserLogoutBtn, "arguments[0].click()", ldriver);
		//clickOnUserLogoutBtn.click();
		Thread.sleep(1000);
	}

	// Prepaid Configuration
	public void prepaidClientConfigure() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEmpAdminMenu));
		clickOnEmpAdminMenu.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPrepaidConfigurationModule));
		clickOnPrepaidConfigurationModule.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckWiseEditBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnCheckWiseEditBtn, "arguments[0].click()", ldriver);
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(uncheckPerAddressVerificationTagCheckBox, "arguments[0].click()",
				ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSaveBtn));
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSaveBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Package Updated Successfully.
	public String verifyPackageUpdatedSuccessfullyMessage() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyPackageUpdatedSuccessfullyMsg));
		return verifyPackageUpdatedSuccessfullyMsg.getText();
	}

	// Click On Profile Enp Admin
	public void verifyEnpAdminAcountLogout() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEnpAdminBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnEnpAdminBtn, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnEnpAdminLogoutBtn));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnEnpAdminLogoutBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Welcome! Please login to your account
	public String verifyWelcomeEmpAdminText() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWelcomePleaseLoginToYourAccount));
		return verifyWelcomePleaseLoginToYourAccount.getText();
	}

}
