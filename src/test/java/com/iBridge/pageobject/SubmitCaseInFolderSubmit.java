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

import com.iBridge.utilities.JavaScriptManuplator;

public class SubmitCaseInFolderSubmit {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public SubmitCaseInFolderSubmit(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the iBridge
	@FindBy(name = "username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@id=\"submitBtn\"]")
	@CacheLookup
	WebElement btnLogin;

	// Do It Yourself(DIY)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[3]/ul/li[2]/a/i")
	WebElement clickOnSubmitCaseInBulk;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Folder Submit')]")
	WebElement clickOnFolderSubmit;

	// Folder Submit Form--Step 3 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement selectPackageName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"package-select-cntr\"]/span[2]/span/span[1]/input")
	WebElement txtPackageName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/span[2]/span[1]/span[2]/ul[1]/li[1]")
	WebElement clickOnCheckWise;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/form/div/div[2]/div/label")
	WebElement clickOnLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/form/div/div[2]/div/span[2]/span/span[1]/input")
	WebElement txtLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/form/div/div[2]/div/span[2]/span/span[2]/ul/li")
	WebElement clickOnLocationName;

	// Drag & Drop file here or rowse file to upload (Zip Format Only)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='FilUploader']")
	WebElement browseFileToUpload;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='upload-folder']")
	WebElement clickOnSubmit;

	// Confirm--We have received 1 case(s). Do you wish to CONTINUE?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Case has been uploaded successfully.')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='continueBtn']")
	WebElement clickOnContinueBtn;

	// Confirm-- Are you sure, you want to CONTINUE with all the records.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmOkBtn;

	// Submit Case In Folder Submit (Submit cases in bulk using MS Excel
	// consisting candidate info)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsText;

	// LogOut Bridge Account
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickOnBridgeLogoutBtn;

	// Super Admin Dropdown List Role--Bridge
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='user_current_role']")
	WebElement selectDocumentProcessor;

	// iBridge Folder Upload – Bulk-- Number Click
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[1]/h4[2]/a")
	WebElement clickLoadResultLink;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div/div[2]/table/tbody/tr/td[4]/a")
	WebElement clickOniBridgeFolderCountNumber;

	// iBridge Uploaded Case(s) Client wise count
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[2]/table/tbody/tr[4]/td[2]/a")
	WebElement getBritishTelecomNewCasesCountNo;

	// Click on Dashboard Module
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Action Methods for the Login
	public void login(String uname, String pwd) {
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	// Do It Yourself(DIY)
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmitCaseInBulk));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSubmitCaseInBulk);
		// clickOnSubmitCaseInBulk.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnFolderSubmit));
		clickOnFolderSubmit.click();
		Thread.sleep(1000);
	}

	// Folder Submit Form--Step 3 - Candidate Summary
	public void folderCaseSubmit(String check, String bangalore, String zipFolderUpload) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectPackageName));
		selectPackageName.click();
		txtPackageName.sendKeys(check);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCheckWise));
		clickOnCheckWise.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnLocation));
		clickOnLocation.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtLocation));
		txtLocation.sendKeys(bangalore);
		clickOnLocationName.click();
		Thread.sleep(1000);
		browseFileToUpload.sendKeys(zipFolderUpload);
		clickOnSubmit.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmBtn));
		Thread.sleep(1000);
		// Confirm--We have received 1 case(s). Do you wish to CONTINUE?
		clickOnConfirmBtn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyToastMsg));
		Thread.sleep(1000);
		clickOnContinueBtn.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		Thread.sleep(1000);
		clickOnConfirmOkBtn.click();
		Thread.sleep(1000);
	}

	public String verifySubmitCaseInFolderSubmitMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCongratulationsText));
		return verifyCongratulationsText.getText();

	}

	public void logoutBridgeAccount() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnBridgeLogoutBtn));
		clickOnBridgeLogoutBtn.click();
	}

	// Super Admin Drop-down List Role--Bridge
	public void selectDocumentProcessor() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectDocumentProcessor));
		JavaScriptManuplator.selectOptionFromDropDown(selectDocumentProcessor, "Document Processor");
		Thread.sleep(3000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboard);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickLoadResultLink));
		JavaScriptManuplator.javaScriptExecutor(clickLoadResultLink, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOniBridgeFolderCountNumber));
		clickOniBridgeFolderCountNumber.click();
		Thread.sleep(1000);
	}

	// iBridge Uploaded Case(s) Client wise count
	public String verifyBritishTelecomNewCasesCountNo() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(getBritishTelecomNewCasesCountNo));
		return getBritishTelecomNewCasesCountNo.getText();

	}
}
