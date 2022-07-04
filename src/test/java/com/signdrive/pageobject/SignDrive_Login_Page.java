package com.signdrive.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignDrive_Login_Page {

	WebDriver ldriver;
	WebDriverWait wait;

	public SignDrive_Login_Page(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login functionalities of the SignDrive Portal

	@FindBy(xpath = "//*[@id=\"username\"]")
	@CacheLookup
	WebElement text_Username;

	@FindBy(xpath = "//*[@id=\"password\"]")
	@CacheLookup
	WebElement text_Password;

	@FindBy(xpath = "//*[@id=\"submitBtn\"]")
	@CacheLookup
	WebElement login_Btn;
	
	// Action Methods for Login functionalities of the SignDrive Portal

	public void loginSignDriveAccount(String username, String password) throws InterruptedException {

		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(text_Username));
		text_Username.sendKeys(username);
		text_Password.sendKeys(password);
		login_Btn.click();
		Thread.sleep(2000);
	}
	
	
}
