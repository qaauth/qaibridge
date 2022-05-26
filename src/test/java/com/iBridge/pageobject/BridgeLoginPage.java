package com.iBridge.pageobject;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BridgeLoginPage {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public BridgeLoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the Bridge Portal
	@FindBy(xpath = "//input[@id='login_email']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='login_password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement btnLogin;

	// Verify After Login By BT Account-- Case Submission Summary Text
	@FindBy(xpath = "//h3[contains(text(),'Case Submission Summary')]")
	@CacheLookup
	WebElement verifyCaseSubmissionSummaryText;

	// Enter Ars No / Check Id--Search
	@FindBy(xpath = "//h4[contains(text(),'Notification Alerts')]")
	@CacheLookup
	WebElement verifyNotificationAlerts;

	@FindBy(xpath = "//input[@id='complete_search_no']")
	@CacheLookup
	WebElement txtEnterArsNo;

	@FindBy(xpath = "//button[@id='complete_search']")
	@CacheLookup
	WebElement clickOnArsNoSearch;

	// Verify Candidate First name In Bridge
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	@CacheLookup
	WebElement verifyCandidateArsNoInBridge;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	@CacheLookup
	WebElement verifyCandidateBulkArsNoInBridge;
	
	// Click on Dashboard Module test
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	@CacheLookup
	WebElement clickOnDashboard;

	// Action Methods for Login functionalities of the Bridge Portals
	public void loginBridgeAccount(String username, String password) {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String verifyDashboardCaseSubmissionSummaryText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseSubmissionSummaryText));
		return verifyCaseSubmissionSummaryText.getText();
	}

	public void arsNumberSearch(String arsNumer) {
		//wait = new WebDriverWait(ldriver, 120);
		//wait.until(ExpectedConditions.visibilityOf(verifyNotificationAlerts));
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtEnterArsNo));
		txtEnterArsNo.sendKeys(arsNumer);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnArsNoSearch);
		//clickOnArsNoSearch.click();
	}

	public String verifyCandidateArsNumberInBridge() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateArsNoInBridge));
		return verifyCandidateArsNoInBridge.getText();
	}

	public String verifyCandidateBulkArsNumberInBridge() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateBulkArsNoInBridge));
		return verifyCandidateBulkArsNoInBridge.getText();
	}

}
