package com.iBridge.pageobject;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.utilities.JavaScriptManuplator;

public class PrepaidInitiateNewCase {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Robot rbt;

	public PrepaidInitiateNewCase(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Initiate new case for Ivc
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/a[1]/div[1]/div[1]")
	@CacheLookup
	WebElement clickOnMenu;

	@FindBy(xpath = "//span[contains(text(),'Initiate New Case')]")
	@CacheLookup
	WebElement clickOnInitiateNewCase;

	@FindBy(xpath = "//span[contains(text(),'Initiate Case(s) Individually')]")
	@CacheLookup
	WebElement clickOnInitiateCaseIndividually;

	// Step 2 - Package Selection-- Check Wise
	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/label")
	@CacheLookup
	WebElement clickOnPackageSelection;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[1]/input")
	@CacheLookup
	WebElement txtSearchPackageCheckWiseName;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[1]/input")
	@CacheLookup
	WebElement txtSearchCheckWiseName;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div[1]/div[1]/span[2]/span/span[2]/ul/li[1]")
	@CacheLookup
	WebElement clickOnCheckWiseName;

	@FindBy(xpath = "//a[contains(text(),'Select')]")
	@CacheLookup
	WebElement clickOnSelectCheckWise;

	@FindBy(xpath = "//button[@id='pacakgeSubmitForm']")
	@CacheLookup
	WebElement clickOnPacakgeSubmitFormBtn;

	// Add Candidate Information
	@FindBy(xpath = "//input[@id='first-name']")
	@CacheLookup
	WebElement txtCandidateFname;

	@FindBy(xpath = "//input[@id='middle-name']")
	@CacheLookup
	WebElement txtCandidateMname;

	@FindBy(xpath = "//input[@id='last-name']")
	@CacheLookup
	WebElement txtCandidateLname;

	@FindBy(xpath = "//input[@id='date-of-birth']")
	@CacheLookup
	WebElement txtCandidateDateOfBirth;

	@FindBy(xpath = "//input[@id='email-address']")
	@CacheLookup
	WebElement txtCandidateEmailId;

	@FindBy(xpath = "//input[@id='mobile-no']")
	@CacheLookup
	WebElement txtMobileNumber;

	// Additional Field(s)
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement selectCandidateLocation;// Gurgaon

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateCcEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement txtAdditionalCandidateEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateContactNumber;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidatePermanentAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[8]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateCurrentAddress;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[10]/div[1]/input[1]")
	@CacheLookup
	WebElement txtCandidateGstin;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[11]/div[1]/input[1]")
	@CacheLookup
	WebElement txtBussinessAddress;

	@FindBy(css = "#caseflexfielddata-7")
	@CacheLookup
	WebElement selectPriorityCalculation;

	@FindBy(xpath = "//button[@id='addCandidate']")
	@CacheLookup
	WebElement clickOnCandidateAddToQueueBtn;

	// Candidate information saved successfully
	@FindBy(xpath = "//div[contains(text(),'Candidate information saved successfully')]")
	@CacheLookup
	WebElement verifyCandidateInfoSuccessfully;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement clickOnCandidateName;

	@FindBy(xpath = "//a[@id='continueBtn']")
	@CacheLookup
	WebElement clickOnCandidateContinueBtn;

	@FindBy(xpath = "//a[@id='initiateBtn']")
	@CacheLookup
	WebElement clickOnCandidateInitiateBtn;

	// Congratulations
	@FindBy(xpath = "//label[contains(text(),'Congratulations!')]")
	@CacheLookup
	WebElement verifyCongratulationsText;

	// initiated for candidate(s) successfully.
	@FindBy(xpath = "//span[contains(text(),'1 case(s)')]")
	@CacheLookup
	WebElement verifyCaseInitiatedSuccessfully;

	// Verify Pending Submission Bucket
	@FindBy(xpath = "//a[contains(text(),'View Details')]")
	@CacheLookup
	WebElement clickOnViewDetails;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[2]/label[1]")
	@CacheLookup
	WebElement verifyEmailId;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[1]/label[1]")
	@CacheLookup
	WebElement verifyCandidateName;

	// Initiate new case for Ivc
	public void initiateNewCaseForIvc() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnMenu));
		JavaScriptManuplator.javaScriptExecutor(clickOnMenu, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateNewCase, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateCaseIndividually));
		JavaScriptManuplator.javaScriptExecutor(clickOnInitiateCaseIndividually, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Step 2 - Package Selection-- Check Wise
	public void selectPackageCheckWise() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPackageSelection));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnPackageSelection, "arguments[0].click()", ldriver);
		// clickOnPackageSelection.click();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtSearchPackageCheckWiseName));
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(txtSearchCheckWiseName, "arguments[0].value='Check Wise'", ldriver);
		Thread.sleep(2000);
		txtSearchCheckWiseName.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		clickOnCheckWiseName.click();
		Thread.sleep(2000);
		JavaScriptManuplator.javaScriptExecutor(clickOnSelectCheckWise, "arguments[0].click()", ldriver);
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnPacakgeSubmitFormBtn));
		JavaScriptManuplator.javaScriptExecutor(clickOnPacakgeSubmitFormBtn, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
	}

	// Step 3 - Candidate Summary (Add Candidate Information)
	public void candidateFirstName(String firstName) {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtCandidateFname));
		txtCandidateFname.sendKeys(firstName);
	}

	public void candidateMiddleName(String middleName) {
		txtCandidateMname.sendKeys(middleName);
	}

	public void candidateLastName(String lastName) {
		txtCandidateLname.sendKeys(lastName);
	}

	// Add Candidate Information
	public void addCandidateInformation() throws InterruptedException {
		JavaScriptManuplator.javaScriptExecutor(txtCandidateDateOfBirth, "arguments[0].removeAttribute('readonly')",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateDateOfBirth, "arguments[0].value='04-04-1991'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtMobileNumber, "arguments[0].value='7042718794'", ldriver);
		Thread.sleep(1000);
	}

	public void candidateEmail(String email) {
		txtCandidateEmailId.sendKeys(email);
	}

	// Additional Field(s)
	public void additionFieldInfo() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(selectCandidateLocation));
		JavaScriptManuplator.selectOptionFromDropDown(selectCandidateLocation, "Gurgaon");
		JavaScriptManuplator.javaScriptExecutor(txtCandidateCcEmailId, "arguments[0].value='raju.yadav@authbridge.com'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(selectPriorityCalculation, "arguments[0].scrollIntoView(true);",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtAdditionalCandidateEmailId,
				"arguments[0].value='raju.yadav@gmail.com'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateContactNumber, "arguments[0].value='7007299642'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidatePermanentAddress, "arguments[0].value='New Delhi'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateCurrentAddress, "arguments[0].value='Mayur Vihar'",
				ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtCandidateGstin, "arguments[0].value='27AACCM3174A1ZV'", ldriver);
		JavaScriptManuplator.javaScriptExecutor(txtBussinessAddress, "arguments[0].value='Gurgaow'", ldriver);
		JavaScriptManuplator.selectOptionFromDropDown(selectPriorityCalculation, "P1");
		Thread.sleep(1000);
	}

	public void initiateCaseBtn() throws InterruptedException {
		// ADD TO QUEUE
		List<WebElement> tag = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag.size(); i++) {
			// System.out.println(tag.get(i).getAttribute("id"));
			if (tag.get(i).getAttribute("id").equals("addCandidate")) {
				// tag.get(i).click();
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag.get(i));
				Thread.sleep(1000);
				break;
			}
		}
		// Candidate information saved successfully
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateInfoSuccessfully));
		Thread.sleep(1000);
		clickOnCandidateName.click();
		Thread.sleep(1000);
		clickOnCandidateContinueBtn.click();
		Thread.sleep(1000);

		// Step 4 - Case Preview- INITIATE (Please review the screen before you proceed)
		clickOnCandidateInitiateBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCaseInitiatedSuccessfully));
	}

	// Congratulations
	public String verifyCongratulationsMsg() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyCongratulationsText, 120);
		return verifyCongratulationsText.getText();
	}

	// Verify Pending Submission Bucket
	public void pendingSubmissionBucket() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnViewDetails));
		Thread.sleep(2000);
		clickOnViewDetails.click();
		Thread.sleep(1000);
	}

	// Verify Pending Submission Bucket-- case landing or Not.
	public String verifyPendingSubmissionBucket() {
		JavaScriptManuplator.waitForElementPresent(ldriver, verifyEmailId, 120);
		return verifyEmailId.getText();
	}

}
