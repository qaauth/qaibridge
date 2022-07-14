package com.iBridge.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileWriter;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.testcases.BaseClass;

public class InsufficientiBridge extends BaseClass{
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public InsufficientiBridge(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Insufficient INSUFFICIENT CASE SUMMARY--iBridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div/h4/a")
	WebElement clickOnInsufficientCountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Insuffficient Cases')]")
	WebElement clickOnInsuficientCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement txtInsuffArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnInsuffCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'PAN No Verification')]")
	WebElement clickOnPanNumberPlusIcon;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Indian Database Verification')]")
	WebElement clickOnIndianDatabasePlusIcon;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/textarea")
	WebElement txtAddComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div/div[2]/div/textarea")
	WebElement txtAddIndianDatabaseComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[4]/div/a")
	WebElement clickOnInsuffCaseSubmitBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div/div[4]/div/a")
	WebElement clickOnIndianDatabaseInsuffCaseSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@placeholder=\"Add Comments\"]")
	WebElement  Addcomment;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"upload_input\"]")
	WebElement  Dragdropmultiplefile1;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"upload_input\"]")
	WebElement Dragdropmultiplefile2;
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='insuffcheckboxDocument_1455842']")
	WebElement IDontHaveDocumentCheckbox;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"fullfil_btn_1455862\"]")
	WebElement verifySubmittedText;

	// INSUFFICIENT CASES-- Verify--Present or not.
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
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement clickOnCadidateName;

	// Verify text name of the Partially Approve-- Fulfilled - Pending Review
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fulfilled - Pending Review')]")
	WebElement verifyFulfilledPendingReviewTxt;

	// Verify text name of the Rejected Approve-- Fulfilled - Referred Back
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fulfilled - Referred Back')]")
	WebElement verifyFulfilledRejectedPendingReviewTxt;

	// Verify Insufficient Case Bucket the Fulfilled Referred Back Text name in
	// iBridge
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fulfilled - Referred Back')]")
	WebElement verifyFulfilledReferredBackMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'No case(s) found')]")
	WebElement verifyNoCaseFoundTextMsg;

	// Verify Cost Approval Verifier-- On Hold Cases(iBridge Portal)
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
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/div/input")
	WebElement searchByArsCandidateName1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/label[1]")
	WebElement clickOnCandidateName;

	// Case Summary Level Information
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='goaheadlink']")
	WebElement clickOnApproveBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='Comments']")
	WebElement txtCostApprovalComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='submitBtn']")
	WebElement clickOnCostApprovalSubmitBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Your Check has been Approved Successfully')]")
	WebElement verifyTosatApprovedMsg;

	// Check(s) Routed to the candidate
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='route-btn']")
	WebElement clickOnRouteToCandidateBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/h4[1]/div[1]/label[1]/input[1]")
	WebElement checkPanNoCheckbox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/h4[1]/div[1]/label[1]/input[1]")
	WebElement checkIndianDatabaseCheckbox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='confirm-route-btn']")
	WebElement clickOnConfirmRouteBtn;

	// Confirm --Are you sure you want to route these check(s) to the Candidate.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmOkBtn;

	// Check(s) routed to the candidate successfully.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Check(s) routed to the candidate successfully.')]")
	WebElement verifyRoutedSuccessfulyMessage;

	// Enter Public Mailinator Inbox - Using Mailinator fulfill Insuff.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement txtCandidateMailinator;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement clickOnMailinatorGoBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement clickOnBackgroundCheckForBritishTelecomBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Background Check for British Telecom | Additional ')]")
	WebElement verifyBackgroundCheckForBritishTelecomBtn;

	// INSUFF DETAILS -- Profile Preview
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[1]/div/h4/a")
	WebElement verifyProfilePreview;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/textarea")
	WebElement txtAddCommentsInsuff;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[3]/input")
	WebElement clickOnPanNoSubmitBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[4]/div/a")
	WebElement verifySubmitedText;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Pending - Referred Back')]")
	WebElement clickOnPendingReferredBackText;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/form/div[1]/h4/a")
	WebElement indianDatabaseVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/textarea")
	WebElement txtAddCommentsIndianDb;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='submit-btn fullfillbtn']")
	WebElement clickOnIndianDbSubmitBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Welcome! Please login to your account')]")
	WebElement verifyWelcomePleaseLoginText;

	// Route To Candidate Account Logged Out.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement clickOnRouteToCandidateProfileName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickOnRouteToCandidateLogoutBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[1]/div/div/input")
	WebElement clickOnUploadDocumet1;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[3]/input")
	WebElement idontHaveDocument;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[4]/div/a")
	WebElement submit;
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement browseFileToUpload;

	// Route To candidate has filled by all insuff details.
	// INSUFFICIENT CASE SUMMARY
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/h4[1]/a[1]/div[1]/label[1]")
	WebElement verifyPanNoVerificationSubmitText;

	// Insufficient Insufficient Case Summary--iBridge Portal
	public void pendingForFulfilmentInsufficient(String arsNumber, String addComments) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Insuffficient Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		txtInsuffArsNumber.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffCandidateName);
		Thread.sleep(1000);
		// clickOnIndianDatabasePlusIcon.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtAddComments));
		txtAddComments.sendKeys(addComments);
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(idontHaveDocument));
		idontHaveDocument.click();
		Thread.sleep(1000);
//		browseFileToUpload.sendKeys(System.getProperty("user.dir") + "/documents/ARN.pdf");
		Thread.sleep(2000);
		clickOnInsuffCaseSubmitBtn.click();
		Thread.sleep(1000);
	}

	// Insufficient Insufficient Case Summary--iBridge Portal
	public void pendingForFulfilmentInsuffPanNumber(String arsNumber, String addComments) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Insuffficient Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		txtInsuffArsNumber.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffCandidateName);
		Thread.sleep(1000);
		// clickOnPanNumberPlusIcon.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtAddComments));
		txtAddComments.sendKeys(addComments);
		clickOnInsuffCaseSubmitBtn.click();
		Thread.sleep(1000);
	}

	// Insufficient Insufficient Case Summary--iBridge Portal
	public void pendingForFulfilmentInsuffIndianDatabase(String arsNumber, String addComments)
			throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Insuffficient Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		txtInsuffArsNumber.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffCandidateName);
		Thread.sleep(1000);
		// clickOnIndianDatabasePlusIcon.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtAddIndianDatabaseComments));
		// txtAddComments.sendKeys(addComments);
		txtAddIndianDatabaseComments.sendKeys(addComments);
		// clickOnInsuffCaseSubmitBtn.click();
		clickOnIndianDatabaseInsuffCaseSubmitBtn.click();
		Thread.sleep(1000);
	}
	
	/**
	 * @author sapna.chaudhary
	 */
	// Add comment
	/*
	 * public void addComment() { Addcomment.sendKeys("upload the file"); }
	 */
	
	/*
	 * // Drag & Drop file here or browse file to upload public void
	 * browseFileToUpload(String fileUpload) throws InterruptedException { //
	 * clickOnDownloadTemplate.click(); Dragdropmultiplefile1.sendKeys(fileUpload);
	 * Thread.sleep(5000);}
	 */
		
	//Click I don't have document CheckBox
	public void clickOnIDontHaveDocumentCheckBox()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(IDontHaveDocumentCheckbox));
		//IDontHaveDocumentCheckbox.click();
		js.executeScript("arguments[0].click();", IDontHaveDocumentCheckbox);
	}

	// Verify Candidate Submitted text message successfully.
	public String verifySubmittedTextMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySubmittedText));
		return verifySubmittedText.getText();
	}

	// INSUFFICIENT CASES-- Verify--Present or not.
	public void verifyInsufficientArsNumber(String arsNumber) throws AWTException, InterruptedException {
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
		Thread.sleep(1000);
	}

	// INSUFFICIENT CASES-- Verify--Present or not.
	public void verifyInsufficientPartiallyApprovedArsNumber(String arsNumber)
			throws AWTException, InterruptedException {
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
		clickOnCandidateNameInsuff.click();
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
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCadidateName));
		Thread.sleep(2000);
		clickOnCadidateName.click();
		Thread.sleep(1000);
	}

	// Verify the Updated Successfully Message
	public String verifyFulfilledPendingReview() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyFulfilledPendingReviewTxt));
		return verifyFulfilledPendingReviewTxt.getText();
	}

	// Verify the Updated Successfully Message
	public String verifyFulfilledRejectedPendingReview() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyFulfilledRejectedPendingReviewTxt));
		return verifyFulfilledRejectedPendingReviewTxt.getText();
	}

	public String verifyNoCaseFoundMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyNoCaseFoundTextMsg));
		return verifyNoCaseFoundTextMsg.getText();
	}

	// Verify Cost Approval Case On Hold Bucket Or Not-- Appearing
	public void verifyCostApprovalCaseOnHoldBucketOrNot(String arsNumber) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'On Hold Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}

	// Verify Candidate Name of the On Hold Bucket--Case Appearing
	public String verifyCandidateNameAppearingCostApprovalCase() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCityNameBangulare));
		return verifyCityNameBangulare.getText();
	}

	// Verify Cost Approval Verifier-- On Hold Cases(iBridge Portal)
	public void submittedCasesTrackerOnHoldCases(String arsNumber, String costComments) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'On Hold Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		clickOnCandidateName.click();

		// Case Summary Level Information--------
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApproveBtn));
		clickOnApproveBtn.click();

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtCostApprovalComments));
		txtCostApprovalComments.sendKeys(costComments);
		clickOnCostApprovalSubmitBtn.click();
		Thread.sleep(1000);
	}

	// Verify Cost Approval Case Present Or Not in On Hold Bucket.
	public void verifyCostApprovalCasePresentOrNot(String arsNumber) throws InterruptedException {
		
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
		Thread.sleep(1000);
	}

	// Verify Cost Approval Case Present Or Not in On Hold Bucket.
	public void verifyOnHoldCasePresentOrNot(String arsNumber) throws InterruptedException {
		
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'On Hold Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		txtArsNumberPaste.sendKeys(arsNumber);
		Thread.sleep(2000);
		txtArsNumberPaste.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
	}

	public String verifyOnHoldCaseApprovedMsg() {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyTosatApprovedMsg));
		return verifyTosatApprovedMsg.getText();
	}

	// Check(s) Routed to the candidate
	public void checkRoutedToCandidate() throws InterruptedException {
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnRouteToCandidateBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnRouteToCandidateBtn);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkIndianDatabaseCheckbox);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkPanNoCheckbox);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkPanNoCheckbox));
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", checkPanNoCheckbox);
		Thread.sleep(1000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmRouteBtn);
		// Confirm --Are you sure you want to route these check(s) to the Candidate.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmOkBtn);
		Thread.sleep(1000);
	}

	// Check(s) routed to the candidate successfully.
	public String verifyRoutedSuccessfulyMsg() {
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyRoutedSuccessfulyMessage));
		return verifyRoutedSuccessfulyMessage.getText();
	}

	// Enter Public Mailinator Inbox - Using Mailinator fulfill Insufficient.
	public void verifyMailinatorMailSubjectName() throws InterruptedException {
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnBackgroundCheckForBritishTelecomBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnBackgroundCheckForBritishTelecomBtn);
		Thread.sleep(1000);
	}

	public String verifyMailinatorMailSubject() {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyBackgroundCheckForBritishTelecomBtn));
		return verifyBackgroundCheckForBritishTelecomBtn.getText();
	}

	public void getRouteToCandidateUserNameAndPassword() {
		
		ldriver.switchTo().frame(ldriver.findElement(By.tagName("iframe")));
		List<WebElement> lst = ldriver.findElements(By.tagName("p"));
		String[] usernameAndPassword = new String[2];

		for (int i = 0; i < lst.size(); i++) {
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].scrollIntoView(true);", ((WebElement) lst.get(i)));
			if (lst.get(i).getText().contains("_")) {
				usernameAndPassword[0] = lst.get(i).getText();
				usernameAndPassword[1] = lst.get(i + 2).getText();
				System.out.print(usernameAndPassword);
				try {
					File output = new File("routeToCandidate.txt");
					FileWriter writer = new FileWriter(output);
					writer.write(lst.get(i).getText() + " " + lst.get(i + 2).getText());
					writer.flush();
					writer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// INSUFF DETAILS -- Profile Preview
	public void fullfilInsuffRouteToCandidate(String insuffComments, String insuffCommentsDb)
			throws InterruptedException {
		
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyProfilePreview));
		txtAddCommentsInsuff.sendKeys(insuffComments);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPanNoSubmitBtn);
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(verifySubmitedText));
		Thread.sleep(2000);
//		clickOnPendingReferredBackText.click();
		indianDatabaseVerification.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtAddCommentsIndianDb));
		Thread.sleep(2000);
		txtAddCommentsIndianDb.sendKeys(insuffCommentsDb);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnIndianDbSubmitBtn);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIndianDbSubmitBtn));
		clickOnIndianDbSubmitBtn.click();
		// Route To Candidate Account Logged Out.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnRouteToCandidateProfileName));
		clickOnRouteToCandidateProfileName.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnRouteToCandidateLogoutBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnRouteToCandidateLogoutBtn);
		Thread.sleep(1000);
	}

	public String verifyWelcomePleaseLoginText() {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyWelcomePleaseLoginText));
		return verifyWelcomePleaseLoginText.getText();
	}

	// Route To candidate has filled by all insuff details.
	public String verifyPanNoVerificationSubmit() {
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyPanNoVerificationSubmitText));
		return verifyPanNoVerificationSubmitText.getText();
	}

}
