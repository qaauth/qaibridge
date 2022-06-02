package com.signdrive.pageobject;

import java.util.ArrayList;
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

import com.iBridge.testcases.BaseClass;
import com.iBridge.utilities.ReadConfig;

public class Email_Verification_page extends BaseClass {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) ldriver;
	ReadConfig config = new ReadConfig();

	public Email_Verification_page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Login Functionalities of the Gmail SignDrive Portal

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Sign in']")
	WebElement signIn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='identifierId']")
	WebElement userName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Next']")
	WebElement next;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	WebElement password;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='Next']")
	WebElement nextContinue;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@name='iBridge Support'])[2]")
	WebElement firstReceivedMail;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()=' Link: Signature Request for Mahindra First Choice Wheels Limited']")
	WebElement candidateOffertLetterLink;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\":ak\"]/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td/a/b")
	WebElement linkSignatureRequest;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='inboxConsentCheckbox']")
	WebElement checkBoxOfferLetter;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='startSignBtn']")
	WebElement startSignButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@ng-click='field.onClick($event)']")
	WebElement signHere;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='finishTagBtn']")
	WebElement finishButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='No']")
	WebElement No;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@style='margin:0px 0 0px 0;font-family:arial;font-size:12px;line-height:20px']")
	WebElement BGVUsernameXpath;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@style='margin:0px 0 10px 0;font-family:arial;font-size:12px;line-height:20px']")
	WebElement BGVPasswordXpath;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//*[@name='iBridge Support'])[2]")
	WebElement bgvCreadinalsMailReceive;

	// New link trigger for Instaform to candidate
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='startSignBtn']")
	WebElement startButton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='msb-tag-layer-container signatureTagForm']")
	WebElement signatureTagForm;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='finishTagBtn']")
	WebElement finishbutton;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='msb-tag-layer-container signatureTagForm']")
	WebElement signHereButton;
	
	// Reject by Candidate
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@ng-click='openRejectForm()']")
	WebElement rejectForm;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@ng-change='newTagChange()']")
	WebElement addRejectionReason;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='button-Reject']")
	WebElement reject;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[text()='I am disapproving this document.']")
	WebElement rejectText;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@automation-id='modal-reject']")
	WebElement noRegistraction;

	// Gmail Login Functionality
	public void loginGmailAccount(String GmailUsername, String GmailPassword) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.clear();
		userName.sendKeys(GmailUsername);
		Thread.sleep(2000);
		next.click();
		password.sendKeys(GmailPassword);
		Thread.sleep(2000);
		nextContinue.click();
	}

	// verify Candidate Receive the Offer Letter Link
	public boolean verifyCandidateReceiveOLLink() throws InterruptedException {
		Thread.sleep(6000);
		firstReceivedMail.click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(6000);
		return candidateOffertLetterLink.isDisplayed();
	}

	// Offer Letter Signed By Candidate
	public void offerLetterSignedByCandidate() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(candidateOffertLetterLink));
		candidateOffertLetterLink.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		wait = new WebDriverWait(ldriver, 160);
		wait.until(ExpectedConditions.visibilityOf(checkBoxOfferLetter));
		checkBoxOfferLetter.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(startSignButton));
		startSignButton.click();
		Thread.sleep(2000);
		signHere.click();
		Thread.sleep(3000);
		finishButton.click();
		Thread.sleep(1000);
		No.click();
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

	public ArrayList<String> getBGVCredentials() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(bgvCreadinalsMailReceive));
		bgvCreadinalsMailReceive.click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		ArrayList<String> bgvCredentials = new ArrayList<String>();
		bgvCredentials.add(BGVUsernameXpath.getText().trim().split(" ")[1]);
		bgvCredentials.add(BGVPasswordXpath.getText().trim().split(" ")[1]);

		return bgvCredentials;
	}

	// Candidate receive the instaForm link
	public void instaform() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(candidateOffertLetterLink));
		candidateOffertLetterLink.click();
		ArrayList<String> tabs = new ArrayList<String>(ldriver.getWindowHandles());
		ldriver.switchTo().window(tabs.get(2));
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(checkBoxOfferLetter));
		checkBoxOfferLetter.click();
		
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(startSignButton));
		startSignButton.click();
		Thread.sleep(2000);
		signHere.click();
		Thread.sleep(3000);
		finishButton.click();
		Thread.sleep(2000);

		startButton.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", signatureTagForm);
		signatureTagForm.click();
		Thread.sleep(3000);
		finishbutton.click();

//		wait = new WebDriverWait(ldriver, 120);
//		wait.until(ExpectedConditions.elementToBeClickable(startButton));
		Thread.sleep(3000);
		startButton.click();
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", signHereButton);
		Thread.sleep(3000);
		finishbutton.click();
		
		No.click();
		ldriver.close();
		Thread.sleep(1000);
		ldriver.switchTo().window(tabs.get(1));
		ldriver.close();
		ldriver.switchTo().window(tabs.get(0));
	}
	
	public void olRejectbyCandidate() throws InterruptedException
	{
		wait = new WebDriverWait(ldriver, 180);
		wait.until(ExpectedConditions.visibilityOf(candidateOffertLetterLink));
		candidateOffertLetterLink.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		wait = new WebDriverWait(ldriver, 160);
		wait.until(ExpectedConditions.visibilityOf(checkBoxOfferLetter));
		checkBoxOfferLetter.click();
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(startSignButton));
		startSignButton.click();
		Thread.sleep(2000);
		rejectForm.click();
		Thread.sleep(2000);
		addRejectionReason.click();
		Thread.sleep(1000);
		rejectText.click();
		reject.click();
		noRegistraction.click();
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}
}