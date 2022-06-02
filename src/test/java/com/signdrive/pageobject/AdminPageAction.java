package com.signdrive.pageobject;

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

public class AdminPageAction 
{
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js= (JavascriptExecutor)ldriver;
	
	public AdminPageAction(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	// Login Functionalities of the Admin SignDrive Portal

	@FindBy(xpath = "//*[@id='username']")
	@CacheLookup
	WebElement usernameField;

	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@id='submitBtn']")
	@CacheLookup
	WebElement login_Btn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='todo-rightside-block']")
	WebElement searchButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='client_name']")
	WebElement clientName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='client_name']")
	WebElement clientSearch;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/a")
	WebElement searchClientId;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Sign Drive']")
	WebElement signDrive;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div[28]/div[1]/a")
	WebElement searchMfcwlOfferLetter;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='seach_tag_by_form']")
	WebElement selectFromDropDown;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='select_all']")
	WebElement selectAllField;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='add_selected_checkbox']")
	WebElement addAllCheckbox;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='tag-mapping-row-2240']/div[2]/select")
	WebElement selectName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='tag-mapping-row-2241']/div[2]/select")
	WebElement selectDesignation;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='tag-mapping-row-2242']/div[2]/select")
	WebElement selectGrade;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='tag-mapping-row-2243']/div[2]/select")
	WebElement selectDepartment;
	
	public void loginEnpSignDriveAccount(String username, String password) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		//js.executeScript("arguments[0].click();", username);
		usernameField.sendKeys(username);
		Thread.sleep(2000);
		passwordField.sendKeys(password);
		login_Btn.click();
		
	}
	
	public void selectClientListing() throws InterruptedException
	{
		searchButton.click();
		clientName.sendKeys("test");
		clientSearch.click();
		Thread.sleep(1000);
		searchClientId.click();
		signDrive.click();
		searchMfcwlOfferLetter.click();
		Thread.sleep(1000);
		Select dropdown = new Select(selectFromDropDown);
		dropdown.selectByVisibleText("Offer Letter");
		Thread.sleep(1000);
		selectAllField.click();
		addAllCheckbox.click();
		Thread.sleep(1000);
		Select name = new Select(selectName);
		name.selectByVisibleText("City");
		Thread.sleep(1000);
		Select designation = new Select(selectDesignation);
		designation.selectByVisibleText("City");
		Thread.sleep(1000);
		Select grade = new Select(selectGrade);
		grade.selectByVisibleText("State");
		Thread.sleep(1000);
		Select department = new Select(selectDepartment);
		department.selectByVisibleText("State");
		Thread.sleep(1000);	
	}
}
