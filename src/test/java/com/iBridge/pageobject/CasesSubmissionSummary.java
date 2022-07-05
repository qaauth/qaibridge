package com.iBridge.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.iBridge.utilities.JavaScriptManuplator;

public class CasesSubmissionSummary {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CasesSubmissionSummary(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// PENDING INITIATION--(Submitted for Verification)
	// Candidate information saved successfully (ADD TO QUEUE)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Candidate information saved successfully')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@id='saveForLaterBtn']")
	WebElement clickOnSaveForLaterBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Case(s) have been saved for later successfully.')]")
	WebElement verifyToastMsgSaveLater;

	// Case(s) Submission Summary(Pending Initiation)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Case(s) Submission Summary')]")
	WebElement clickOnSubmissionSummary;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'ugMmoS@mailinator.com')]")
	WebElement verifyEmailAddress;

	// PENDING SUBMISSION--(Submitted for Verification)
	// Step 3 - Candidate Summary (Add Candidate Information)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='middle-name']")
	WebElement txtMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='last-name']")
	WebElement txtLastName;

	@CacheLookup
	@FindBy(how = How.NAME, using = "email_address")
	WebElement txtEmailId;

	// Initiate Via Candidate(IVC)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"mode\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/ul/li[1]/a/i")
	WebElement clickOnIvc;

	// Package Selection
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"recent-package-list-box-map\"]/div/div[1]/a[2]")
	WebElement clickCheckWiseSelect;

	// Case(s) Submission Summary--(Pending Submission)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandSub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Case(s) Submission Summary')]")
	WebElement clickOnSubmissionSummarySub;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[1]/label[1]")
	WebElement verifyCandidateFName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'ashhGp@mailinator.com')]")
	WebElement verifyEmailAddressSub;

	// Case(s) Submission Summary--(Submitted for Verification)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpandVerification;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/ul/li[4]/ul/li[3]/div/a")
	WebElement pendingSignOff;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/a[2]")
	WebElement submit;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[1]/label/input")
	WebElement clickCheckBox;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[7]/a")
	WebElement confirmSubmit;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[6]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")
	WebElement okButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/ul/li[4]/ul/li[4]/div/a")
	WebElement clickOnsubmitForVerification;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Case(s) Submission Summary')]")
	WebElement clickOnSubmissionSubmitted;

	// Submitted For Verification Candidate First Name
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[2]/div[1]/label")
	WebElement verifyCandidateFname;
	
	// Submitted For Verification- Copy Candidate Mail
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[2]/div[2]/label")
	WebElement copyCandidateMailId;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'axoDkh@mailinator.com')]")
	WebElement verifyEmailAddressVerification;

	// LogOut iBridge Portal(BtFive Logout)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li[3]/a/span")
	WebElement clickOnBtFiveName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li[3]/ul/li[3]/a")
	WebElement clickOnLogoutBtn;

	// LogOut iBridge Portal(Candidate Logout)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/a/span")
	WebElement clickOnCandidateName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li/ul/li/a")
	WebElement clickOnCandidateLogoutBtn;

	// LogOut iBridge Portal(DIY Logout)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li[3]/a/span")
	WebElement clickOnDiyName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/nav/div[2]/div/ul/li[3]/ul/li[2]/a")
	WebElement clickOnDiyLogoutBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/h4/div[2]/div[1]/label")
	WebElement candidateBulkFnameSubForVerification;
	
	//Verify case pending initiation bucket--
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[2]/div[1]/label[1]")
	WebElement verifyCasePendingInitiationCandidateFname;

	// Case(s) Submission Summary--(Pending Initiation)
	// Action Methods
	public void addToQueueBtn() throws InterruptedException {
		// ADD TO QUEUE
		List<WebElement> tag = ldriver.findElements(By.tagName("button"));
		for (int i = 0; i < tag.size(); i++) {
			// System.out.println(tag.get(i).getAttribute("id"));
			if (tag.get(i).getAttribute("id").equals("addCandidate")) {
				// tag.get(i).click();
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag.get(i));
				break;
			}
		}
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyToastMsg));
		clickOnSaveForLaterBtn.click();
		Thread.sleep(1000);
	}
	
	public String verifySaveLaterToastMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyToastMsgSaveLater));
		return verifyToastMsgSaveLater.getText();	
	}

	// Case(s) Submission Summary--(Pending Initiation)
	public void pendingCaseInitiation() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSummary));
		clickOnSubmissionSummary.click();

		WebElement element = ldriver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[4]/ul/li[1]/div/a"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		ldriver.navigate().refresh();
	}
	
	public String verifyCasePendingInitiationFname() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCasePendingInitiationCandidateFname));
		return verifyCasePendingInitiationCandidateFname.getText();
		
	}

	// Step 3 - Candidate Summary (Add Candidate Information)
	public void candidateFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}

	public void candidateMiddleName(String middleName) {
		txtMiddleName.sendKeys(middleName);
	}

	public void candidateLastName(String lastName) {
		txtLastName.sendKeys(lastName);

	}

	public void candidateEmail(String email) {
		txtEmailId.sendKeys(email);
	}

	public void expandSideMenu() {
		clickOnSidebarExpand1.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
	}

	// Do you wish to start a fresh?
	public void confirmOkButton() throws InterruptedException {
		WebElement element = ldriver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnIvc));
		clickOnIvc.click();
		// Package Selection
		clickCheckWiseSelect.click();
	}

	// Case(s) Submission Summary--(Pending Submission)
	public void pendingCaseSubmission() throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSummarySub));
		clickOnSubmissionSummarySub.click();
		WebElement element = ldriver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[4]/ul/li[2]/div/a"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		ldriver.navigate().refresh();
	}

	public String pendingCaseVerificationCandidateName() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFName));
		return verifyCandidateFName.getText();
	}

	// Case(s) Submission Summary--(Submitted for Verification)
	public void btFiveLogout() {
		clickOnBtFiveName.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnLogoutBtn));
		clickOnLogoutBtn.click();
	}

	public void candidateLogout() {
		// LogOut iBridge Portal(Candidate Logout)
		clickOnCandidateName.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnCandidateLogoutBtn));
		clickOnCandidateLogoutBtn.click();
	}

	public void diyLogout() {
		// LogOut iBridge Portal(DIY Logout)
		clickOnDiyName.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnDiyLogoutBtn));
		clickOnDiyLogoutBtn.click();
	}

	public void submittedForVerification() throws InterruptedException {
		clickOnSidebarExpandVerification.click();
		Thread.sleep(1000);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmissionSubmitted));
		clickOnSubmissionSubmitted.click();
		pendingSignOff.click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(2000);
		clickCheckBox.click();
		confirmSubmit.click();
		Thread.sleep(1000);
		okButton.click();
		Thread.sleep(1000);
		JavaScriptManuplator.javaScriptExecutor(clickOnsubmitForVerification, "arguments[0].click()", ldriver);
		Thread.sleep(1000);
		ldriver.navigate().refresh();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(copyCandidateMailId));
		Thread.sleep(1000);
		try {
        	File output = new File("copyCandidateMail.txt");
        	FileWriter writer = new FileWriter(output);
        	writer.write(copyCandidateMailId.getText());
        	writer.flush();
        	writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String submittedForVerificationCandidateFname() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateFname));
		return verifyCandidateFname.getText();
	}
	
	public void copyCandidateMailId() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(copyCandidateMailId));
		try {
        	File output = new File("copyCandidateMail.txt");
        	FileWriter writer = new FileWriter(output);
        	writer.write(copyCandidateMailId.getText());
        	System.out.println("RAJU============="+copyCandidateMailId.getText());
        	writer.flush();
        	writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String candidateBulkFnameSubmittedForVerification() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(candidateBulkFnameSubForVerification));
		return candidateBulkFnameSubForVerification.getText();
	}
}
