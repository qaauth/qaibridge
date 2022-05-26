package com.iBridge.sme.pageobject;

import java.awt.Robot;

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

public class WithdrawnSmeCase {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public WithdrawnSmeCase(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// You will be notified once candidate(s) completes his/her profile. Go to Home
	// Page
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Go to Homepage')]")
	WebElement clickOnGoToHomePageBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Total Cases Raised')]")
	WebElement clickOnTotalCasesRaisedBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Form Not Submitted')]")
	WebElement clickOnFormNotSubmittedBucket;

	// Form Not Submitted
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/select[1]")
	WebElement selectActionWithdraw;

	// Confirm-- Press OK if you want to withdraw the case, else press CANCEL.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnOkBtn;

	// Case has been withdrawn Successfully !
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifyWithdraSuccessfullyMessage;

	// Verify Candidate name in Withdrawn/Disabled bucket.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnDashboardModule;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Withdrawn/Disabled')]")
	WebElement clickOnWithdrawnBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	WebElement verifyWithdrawCandidateName;

	// Work In Progress
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'WIP')]")
	WebElement clickOnWipBucket;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/select[1]")
	WebElement selectActionWithdrawName;

	// Confirm-- The amount will NOT be refunded for the same case. Press OK if you
	// want to withdraw the case, else press CANCEL.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnCinfirmOkBtn;

	// Case has been successfully Updated.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[2]")
	WebElement verifySuccessfullyUpdated;

	// Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Closed by Client')]")
	WebElement clickOnClosedByClientBucket;

	// Case Closed By Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	WebElement verifyCandidateFullName;

	// You will be notified once candidate(s) completes his/her profile. Go to Home
	// Page
	public void formNotSubmittedCaseWithdraw() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnGoToHomePageBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnGoToHomePageBtn);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesRaisedBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesRaisedBtn);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnFormNotSubmittedBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnFormNotSubmittedBucket);

		Select actionWithdraw = new Select(selectActionWithdraw);
		actionWithdraw.selectByIndex(1);

		// Confirm-- Press OK if you want to withdraw the case, else press CANCEL.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnOkBtn);
		Thread.sleep(1000);
	}

	// Case has been withdrawn Successfully !
	public String verifyWithdraSuccessfullyMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWithdraSuccessfullyMessage));
		return verifyWithdraSuccessfullyMessage.getText();
	}

	// Verify Candidate name in Withdrawn/Disabled bucket.
	public void verifyCandidateNameInWithdrawnBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnTotalCasesRaisedBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnTotalCasesRaisedBtn);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnWithdrawnBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnWithdrawnBucket);
		Thread.sleep(1000);
	}

	public String verifyWithdrawCandidateFullName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyWithdrawCandidateName));
		return verifyWithdrawCandidateName.getText();
	}

	// Work In Progress
	public void withdrawWorkInProgressBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnWipBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnWipBucket);

		Select actionWithdrawName = new Select(selectActionWithdrawName);
		actionWithdrawName.selectByIndex(1);

		// Confirm-- The amount will NOT be refunded for the same case. Press OK if you
		// want to withdraw the case, else press CANCEL.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCinfirmOkBtn));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnCinfirmOkBtn);
		Thread.sleep(1000);
	}

	// Case has been successfully Updated.
	public String verifySuccessfullyUpdatedMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessfullyUpdated));
		return verifySuccessfullyUpdated.getText();
	}

	public void closedByClientBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnDashboardModule));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnDashboardModule);

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnClosedByClientBucket));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnClosedByClientBucket);
		Thread.sleep(1000);
	}

	// Case has been successfully Updated.
	public String verifyClosedByClientCandidateFullName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFullName));
		return verifyCandidateFullName.getText();
	}

}
