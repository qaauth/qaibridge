package com.iBridge.pageobject;

import java.io.File;
import java.io.FileWriter;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.utilities.JavaScriptManuplator;

public class SubmitCaseInBulkExcelUpload {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public SubmitCaseInBulkExcelUpload(WebDriver rdriver) {
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
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'If you have complete candidate information, provid')]")
	WebElement clickOnSubmitCaseInBulk;

	// Option selection--(Excel Upload) (Submit cases in bulk using MS Excel
	// consisting candidate info)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Excel Upload')]")
	WebElement clickOnExcelUpload;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='FilUploader']")
	WebElement browseFileToUpload;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Uploaded sheet data saved successfully')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='continueBtn']")
	WebElement clickOnContinueBtn;

	// Preview --Step 2 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/a[1]")
	WebElement clickOnUploadDocuments1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/input")
	WebElement clickOnBrowseFileToUpload1;
	
	// Completed
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Completed')]")
	WebElement verifyCompletedText;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='Capa_1']")
	WebElement clickOnCrossBtn1;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#form_9397 > div.body-row > div.body-list.column7 > a.action-btn.hide-flex-field-btn > svg")
	WebElement clickOnArrowBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/form/div[1]/div[7]/a[1]")
	WebElement clickOnUploadDocuments2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/input")
	WebElement clickOnBrowseFileToUpload2;

	// Completed
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Completed')]")
	WebElement verifyCompletedMsgText;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='Capa_1']")
	WebElement clickOnCrossBtn2;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='continueBtn']")
	WebElement clickOnContinueBtn1;

	// Confirm--Are you sure, you want to CONTINUE with all the records.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmPopup;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsMsg;

	// Excel Upload (Submit cases in bulk using MS Excel consisting candidate info)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsText;

	// Case(s) Submission Summary--(Submitted for Verification)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Case(s) Submission Summary')]")
	WebElement clickOnSubmissionSubmitted;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/ul/li[4]/ul/li[4]/div/a")
	WebElement clickOnsubmitForVerification;


	// Submitted For Verification Candidate First Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[1]/label[1]")
	WebElement verifyCandidateFname;

	// (WIP Cases)--Submitted Case(s) Tracker
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")
	WebElement clickOnSubmittedCasesTracker;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div/div[1]/div[1]/label")
	WebElement verifyCandidateFname1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div/div[1]/div[1]/label")
	WebElement verifyCandidateBulkFname;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsCandidateName1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[2]/p[1]/span[1]")
	WebElement copyArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),' ')]")
	WebElement copyCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(.,'ARS No:')]/parent::div")
	WebElement copyARSNo;

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
		//clickOnSubmitCaseInBulk.click();
		Thread.sleep(1000);
	}

	// Option selection--(Excel Upload) (Submit cases in bulk using MS Excel
	// consisting candidate info)
	public void submitExcelUploadBulk(String fileUpload) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnExcelUpload));
		clickOnExcelUpload.click();
		Thread.sleep(2000);
		browseFileToUpload.sendKeys(fileUpload);
		Thread.sleep(10000);
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}

	// Preview --Step 2 - Candidate Summary
	public void previewUploadDocuments(String browseFileToUpload1, String browseFileToUpload2)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnUploadDocuments1));
		clickOnUploadDocuments1.click();
		Thread.sleep(2000);
		clickOnBrowseFileToUpload1.sendKeys(browseFileToUpload1);
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(verifyCompletedText));
		Thread.sleep(1000);
		ldriver.navigate().refresh();
		// clickOnCrossBtn1.click();
		Thread.sleep(3000);
		// clickOnArrowBtn.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnUploadDocuments2);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnUploadDocuments2));
		clickOnUploadDocuments2.click();
		Thread.sleep(1000);
		clickOnBrowseFileToUpload2.sendKeys(browseFileToUpload2);
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(verifyCompletedMsgText));
		Thread.sleep(1000);
		ldriver.navigate().refresh();
		// clickOnCrossBtn2.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueBtn1));
		clickOnContinueBtn1.click();
		Thread.sleep(2000);
		clickOnConfirmPopup.click();
		Thread.sleep(1000);
	}

	public String verifysubmitCaseInBulkExcelUploadMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCongratulationsText));
		return verifyCongratulationsText.getText();

	}

	public void submittedForVerification() throws InterruptedException {
		
		clickOnSidebarExpandVerification.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSubmitted));
		clickOnSubmissionSubmitted.click();
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnsubmitForVerification, "arguments[0].click()", ldriver);
//		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Submitted for Verification')]"));
//		Actions actions = new Actions(ldriver);
//		actions.moveToElement(element).click().perform();
//		Thread.sleep(1000);
		ldriver.navigate().refresh();
	}

	public String submittedForVerificationCandidateFname() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname));
		return verifyCandidateFname.getText();
	}

	// (WIP Cases)--Submitted Case(s) Tracker
	public void submittedCasesTrackerWipCases(String candidateName, String candidateMname) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'WIP Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(candidateName);
		searchByArsCandidateName1.sendKeys(candidateMname);
		Thread.sleep(2000);
		searchByArsCandidateName.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		try {
			File output = new File("outputArsExcelWip.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(copyARSNo.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCandidateFNameWip() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname1));
		return verifyCandidateFname1.getText();
	}

	public String getCandidateBulkFName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateBulkFname));
		return verifyCandidateBulkFname.getText();
	}

}
