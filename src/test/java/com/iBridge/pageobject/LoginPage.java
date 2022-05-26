package com.iBridge.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
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

	// Verify After Login By BT Account-- Case Submission Summary Text
	@FindBy(xpath = "//h3[contains(text(),'Case Submission Summary')]")
	@CacheLookup
	WebElement verifyCaseSubmissionSummaryText;

	// Verify After Login By SME Account --Dashboard Text
	@FindBy(xpath = "//div[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement verifyDashboardText;

	// Action Methods for the Login
	public void login(String uname, String pwd) {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	public String verifyDashboardCaseSubmissionSummaryText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseSubmissionSummaryText));
		return verifyCaseSubmissionSummaryText.getText();
	}

	public String verifySmeDashboardText() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyDashboardText));
		return verifyDashboardText.getText();
	}
}
