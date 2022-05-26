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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmittedCasesTracker {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public SubmittedCasesTracker(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

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
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a[1]/div/div[1]/div[1]/label")
	WebElement verifyCandidateFname;

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

	// Stop Case Close By Client-- The case has been successfully marked as Closed
	// By
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]")
	WebElement clickOnCandidateFullName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='stop-case']")
	WebElement clickOnStopCaseBtn;
	
	// REASON
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='withdraw_reason_id']")
	WebElement selectReasonToOthers;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[8]/div/div/form/div[2]/div/div/div[2]/div/textarea")
	WebElement txtEnterRemarks;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='stop-case-submit-btn']")
	WebElement clickOnReasonSubmitBtn;
	

	// Confirm Alert Popup-- Do you still want to stop the case?
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmAlertOkButton;

	// Verify-- The case has been successfully marked as Closed By
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'The case has been successfully marked as Closed By')]")
	WebElement verifySuccessfullyMarkedAsClosedByText;

	// Click On Search Text Field--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement clickOnSearchTextField;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='ars-filter']")
	WebElement txtByArsNumberFilter;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='filter-status']")
	WebElement selectByCaseStatusClosedFilter;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='global-filter-search-btn']")
	WebElement clickOnApplyBtn;

	// Verify-- Current Status: Closed by Client
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Current Status: Closed by Client')]")
	WebElement verifyCurrentStatusText;

	// (WIP Cases)--Submitted Case(s) Tracker
	public void submittedCasesTrackerWipCases(String firstName,String middleName) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'WIP Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(firstName);
		searchByArsCandidateName1.sendKeys(middleName);
		Thread.sleep(2000);
		searchByArsCandidateName.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		try {
			File output = new File("outputArs.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(copyARSNo.getText());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCandidateFName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname));
		return verifyCandidateFname.getText();
	}

	public String getCandidateBulkFName() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateBulkFname));
		return verifyCandidateBulkFname.getText();
	}

	// Stop Case Close By Client--The case has been successfully marked as Closed By
	public void stopCaseCloseByClient(String enterRemarks) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnCandidateFullName));
		clickOnCandidateFullName.click();
		Thread.sleep(1000);
		clickOnStopCaseBtn.click();
		Thread.sleep(2000);
		
		// REASON
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectReasonToOthers));//7905225102
		Select reasonToOthers = new Select(selectReasonToOthers);
		reasonToOthers.selectByIndex(5);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtEnterRemarks));
		txtEnterRemarks.sendKeys(enterRemarks);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnReasonSubmitBtn);
		
		// Confirm Alert Popup-- Do you still want to stop the case?
		//wait = new WebDriverWait(ldriver, 60);
		//wait.until(ExpectedConditions.visibilityOf(clickOnConfirmAlertOkButton));
		//js = (JavascriptExecutor) ldriver;
		//js.executeScript("arguments[0].click()", clickOnConfirmAlertOkButton);
		Thread.sleep(1000);
	}

	// Verify-- The case has been successfully marked as Closed By
	public String verifySuccessfullyMarkedAsClosedByMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySuccessfullyMarkedAsClosedByText));
		return verifySuccessfullyMarkedAsClosedByText.getText();
	}

	// Search Result(s) -Click On Search Text Field--
	public void currentStatusSearchResult(String byArsNumber) throws InterruptedException {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSearchTextField);
		txtByArsNumberFilter.sendKeys(byArsNumber);
		txtByArsNumberFilter.sendKeys(Keys.RETURN);
		Select byCaseStatusClosedFilter = new Select(selectByCaseStatusClosedFilter);
		byCaseStatusClosedFilter.selectByIndex(6);
		clickOnApplyBtn.click();
		Thread.sleep(1000);
	}

	// Verify-- Current Status: Closed by Client
	public String verifyCurrentStatusMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCurrentStatusText));
		return verifyCurrentStatusText.getText();
	}

}
