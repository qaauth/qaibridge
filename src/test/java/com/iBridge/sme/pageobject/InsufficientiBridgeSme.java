package com.iBridge.sme.pageobject;

import java.awt.Robot;

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

public class InsufficientiBridgeSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public InsufficientiBridgeSme(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Test whether insuff is appearing on iBridge or not for the case
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Insufficiencies ')]")
	WebElement clickOnInsufficienciesRaisedBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement verifyCaseStatusInsuffArsNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[2]/span[1]")
	WebElement verifyInsufficienciesCountNo;

	// Insufficient Insufficient Case Summary--iBridge SME Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Insufficiencies ')]")
	WebElement clickOnInsufficiesCountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/select[1]")
	WebElement selectFulfilInsufficiencyAction;

	// Case Details: Insufficiency Fulfillment Comments
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/div/div/div/form/div[2]/div/span/button")
	WebElement uploadInsuffRaisedDocuments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//textarea[@id='Comments']")
	WebElement txtInsuffFulfillmentComments;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Fulfill Insufficiency')]")
	WebElement clickOnFulfillInsufficiency;

	// Insuff has been sent for review!
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifyInsuffsentForReviewMessage;

	// Insufficient Cases-- Verify--Present or not--iBridge SME Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Insufficiencies')]")
	WebElement clickOnInsuffCountNumber;

	// Verify Cost Approval Required Bucket,Cost Approval Insuff Case got or Not--
	// iBridge SME
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Approval Required ')]")
	WebElement clickOnApprovalReqCountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement verifyApprovalReqArsNumber;

	// Verify -- No Record Found - Insuff Raised By Authbridge
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Record Found!')]")
	WebElement verifyInsuffNoRecordFound;

	// Approval Required -iBridge SME --Overview Action Required
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Approval Required ')]")
	WebElement clickOnApprovalRequiredCountNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	WebElement verifyArsNumber;

	// Approval Required
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Approve')]")
	WebElement clickOnApprovalBtn;

	// Your Check approval is pending, you have not paid yet.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/span[1]/label[1]")
	WebElement clickOnWalletPayCheckBox;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Click here to pay')]")
	WebElement clickOnPayBtn;

	// Your Check has been Approved Successfully
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifyCheckApprovedSuccessfully;

	// Test one cost approval given then whether case getting removed or not from
	// cost approval bucket .
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnApprovalReqDashboard;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Approval Required')]")
	WebElement clickOnApprovalRequiredBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[4]/span[1]")
	WebElement getApprovalRequiredNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Record Found!')]")
	WebElement verifyNoRecordFoundMessage;

	// Insuff Both Verifier-- Action Required -iBridge Portal
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashboardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Insufficiencies')]")
	WebElement clickOnInsufficienciencyountNo;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/select[1]")
	WebElement selectInsuffActionType;

	// Case Details:
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Approve')]")
	WebElement clickOnApproveBtn;

	// Your Check has been Approved Successfully
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifyChecksApprovedSuccessfully;

	// Logout SME Account
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[2]/li[1]/a[1]/span[1]")
	WebElement clickOnProfileName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement clickOnLogoutSmeBtn;

	// Payment Pending Cases-- Discard Case-- Overview Action Required
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Payment Pending')]")
	WebElement clickOnPaymentPending;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/label[1]/input[1]")
	WebElement checkedCheckboxPaymentPendingCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='formdiscardId']")
	WebElement clickOnDiscardCaseBtn;

	// Confirm-- Press OK if you want to withdraw the case, else press CANCEL
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOkWithDrawCaseBtn;

	// Verify--No Record Found- Case(s) has been withdrawn Successfully !
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'No Record Found!')]")
	WebElement verifyCaseNoRecordFoundText;

	// Work In Progress-- Withdraw Functionalities
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'WIP')]")
	WebElement clickOnWIPBucket;

	// Get Cases On Hold Count Number
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[3]/span[1]")
	WebElement getCasesOnHoldCountNumber;

	// SME Cases On Hold Bucket-
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Cases on Hold')]")
	WebElement clickOnCaseOnHoldBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	WebElement verifyCasesOnHoldArsNumber;

	// Go ahead action for Cases On hold
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/select[1]")
	WebElement selectActionGoahead;

	// Confirm-- Do you wish to proceed with the case?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	WebElement clickOnConfirmOkBtn;

	// Case has been successfully Updated.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifySuccessfullyUpdatedMessage;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnCaseOnHoldDashboardModule;

	// Withdraw-- Dashboard --Case Status -Closed By Client-
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashboardModuleHome;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Total Cases Sent')]")
	WebElement clickOnTotalCasesSentBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[9]/select[1]")
	WebElement selectWithdrawAction;

	// Confirm Alert-- The amount will NOT be refunded for the same case.
	// Press OK if you want to withdraw the case, else press CANCEL.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmAlertOkBtn;

	// Case has been successfully Updated.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifySuccessfullyUpdatedText;

	// Verify-- Case Status -Closed By Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")
	WebElement verifyCaseStatusText;

	// Test whether insuff is appearing on iBridge or not for the case
	public void insuffRaiseInInsufficienciesBucket() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsufficienciesRaisedBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsufficienciesRaisedBucket);

	}

	public String verifyCaseStatusInsufficienciesArsNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseStatusInsuffArsNumber));
		return verifyCaseStatusInsuffArsNumber.getText();
	}

	public String verifyInsufficienciesCountNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyInsufficienciesCountNo));
		return verifyInsufficienciesCountNo.getText();
	}

	// Action Required-- Insufficient-- iBridge SME Portal
	public void pendingInsuffRaisedByAuthbridge(String uploadInsuffDocs, String insuffComments)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsufficiesCountNumber));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsufficiesCountNumber);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectFulfilInsufficiencyAction));
		Select fulfilInsufficiencyAction = new Select(selectFulfilInsufficiencyAction);
		fulfilInsufficiencyAction.selectByIndex(1);
		Thread.sleep(1000);
		uploadInsuffRaisedDocuments.sendKeys(uploadInsuffDocs);
		Thread.sleep(2000);
		txtInsuffFulfillmentComments.sendKeys(insuffComments);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnFulfillInsufficiency);
		Thread.sleep(1000);
	}

	// Insufficient has been sent for review!
	public String verifyInsuffsentForReviewMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyInsuffsentForReviewMessage));
		return verifyInsuffsentForReviewMessage.getText();
	}

	// Insufficient Raised By AuthBridge-- Verify--Present or not--iBridge SME
	// Portal
	public void insuffRaisedCasesByAuthbridge() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInsuffCountNumber));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsuffCountNumber);
		Thread.sleep(1000);
	}

	// Verify -- No Record Found!-Insufficient Raised By AuthBridge
	public String verifyInsuffAuthbridgeNoRecordFoundMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyInsuffNoRecordFound));
		return verifyInsuffNoRecordFound.getText();
	}

	// Verify Cost Approval Required Bucket,Cost Approval Insuff Case got or Not--
	// iBridge SME
	public void costApprovalRequiredInsuffCasePresentOrNot() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApprovalReqCountNumber));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApprovalReqCountNumber);
		Thread.sleep(1000);
	}

	public String verifyApprovalReqBucketActionApprove() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyApprovalReqArsNumber));
		return verifyApprovalReqArsNumber.getText();
	}

	// Overview Action Required-- Approval Required -iBridge SME
	public void approvalRequiredInsufficient() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApprovalRequiredCountNumber));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApprovalRequiredCountNumber);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyArsNumber));
		verifyArsNumber.getText();
		// Approval Required
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApprovalBtn);
		Thread.sleep(1000);
		WebElement element = ldriver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		// Your Check approval is pending, you have not paid yet.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnWalletPayCheckBox));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnWalletPayCheckBox);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnPayBtn);
		Thread.sleep(1000);
	}

	// Your Check has been Approved Successfully
	public String verifyCheckApprovedSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCheckApprovedSuccessfully));
		return verifyCheckApprovedSuccessfully.getText();
	}

	// Test one cost approval given then whether case getting removed or not from
	// cost approval bucket.
	public void costApprovalRequiredRemovedOrNot() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApprovalReqDashboard));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApprovalReqDashboard);
		Thread.sleep(1000);
	}

	public void clickOnApprovalReqCountNumber() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApprovalRequiredBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApprovalRequiredBucket);
		Thread.sleep(1000);
	}

	public String approvalRequiredCountNo() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(getApprovalRequiredNo));
		return getApprovalRequiredNo.getText();
	}

	public String verifyApprovalReqNoRecordFoundMsg() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyNoRecordFoundMessage));
		return verifyNoRecordFoundMessage.getText();
	}

	// Reason Insufficient Both Verifier-- Action Required -iBridge Portal
	public void approvalRequiredAndInsufficientBoth() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		clickOnDashboardModule.click();
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnInsufficienciencyountNo);
		Select insuffActionType = new Select(selectInsuffActionType);
		insuffActionType.selectByIndex(1);
		// Case Details:
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnApproveBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnApproveBtn);
		Thread.sleep(1000);
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// Your Check has been Approved Successfully
	public String checkHasBeenApprovedSuccess() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyChecksApprovedSuccessfully));
		return verifyChecksApprovedSuccessfully.getText();
	}

	public void clickOnDashboardVerifyInsufficientCase() throws InterruptedException {
		Thread.sleep(2000);
		clickOnDashboardModule.click();
		Thread.sleep(3000);
	}

	// Logout SME Account
	public void clickOnLogoutSmeBtn() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnProfileName));
		clickOnProfileName.click();
		Thread.sleep(1000);
		// clickOnLogoutSmeBtn.click();
		Thread.sleep(1000);
		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
	}

	// Get Cases On Hold Total Count Number
	public String getCasesOnHoldTotalCountNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(getCasesOnHoldCountNumber));
		return getCasesOnHoldCountNumber.getText();
	}

	// SME Cases On Hold Bucket-
	public void casesOnHoldBucketGoahed() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCaseOnHoldBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCaseOnHoldBucket);
	}

	public String verifyCasesOnHoldListArsNumber() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCasesOnHoldArsNumber));
		return verifyCasesOnHoldArsNumber.getText();
	}

	// Go ahead action for Cases On hold
	public void selectGoAheadActionCaseOnHold() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCaseOnHoldBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCaseOnHoldBucket);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectActionGoahead));
		Select actionGoahead = new Select(selectActionGoahead);
		actionGoahead.selectByIndex(1);
		// Confirm-- Do you wish to proceed with the case?
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmOkBtn);

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCaseOnHoldDashboardModule);
	}

	// Withdraw-- Dashboard --Case Status -Closed By Client-
	public void withdrawCaseStatusClosedByClient() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModuleHome));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModuleHome);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesSentBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesSentBucket);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectWithdrawAction));
		Select withdrawAction = new Select(selectWithdrawAction);
		withdrawAction.selectByIndex(1);

		// Confirm Alert-- The amount will NOT be refunded for the same case.
		// Press OK if you want to withdraw the case, else press CANCEL.
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnConfirmAlertOkBtn);
		ldriver.navigate().refresh();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseStatusText));
		Thread.sleep(1000);
	}

	// Case has been successfully Updated.
	public String verifySuccessfullyUpdatedMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessfullyUpdatedText));
		return verifySuccessfullyUpdatedText.getText();
	}

	// Verify-- Case Status -Closed By Client
	public String verifyCaseStatusTextMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseStatusText));
		return verifyCaseStatusText.getText();
	}
}
