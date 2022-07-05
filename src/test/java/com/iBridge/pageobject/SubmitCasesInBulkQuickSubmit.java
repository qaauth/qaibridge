package com.iBridge.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

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

import com.iBridge.utilities.JavaScriptManuplator;


public class SubmitCasesInBulkQuickSubmit {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public SubmitCasesInBulkQuickSubmit(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
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

	// Do It Yourself(DIY)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[3]/ul/li[2]/a/i")
	WebElement clickOnSubmitCaseInBulk;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Quick Submit')]")
	WebElement clickOnQuickSubmit;

	// Quick Submit Form--Step 3 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@id='bridge-process-id']")
	WebElement selectPackageName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div/select")
	WebElement selectLocationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='first-name']")
	WebElement txtFirstName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='middle-name']")
	WebElement txtMiddleName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='last-name']")
	WebElement txtLastName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='date-of-birth']")
	WebElement txtDateOfBirthName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='mobile-no']")
	WebElement txtMobileNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='email-address']")
	WebElement txtEmailAddress;

	// ADDITIONAL INFORMATION-- Step 3 - Candidate Summary
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-1']")
	WebElement txtEinName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-2']")
	WebElement txtDateOfJoining;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-3']")
	WebElement txtDateOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-4']")
	WebElement txtBusinessUnit;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-5']")
	WebElement selectOucName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-6']")
	WebElement txtDesignationName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-7']")
	WebElement txtLineManager;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-8']")
	WebElement txtRoleCode;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-9']")
	WebElement txtLegalEntity;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-10']")
	WebElement txtBtEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-11']")
	WebElement txtDateOfProvisionOffice;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-12']")
	WebElement txtRecordId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-13']")
	WebElement txtPanNumber;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-14']")
	WebElement selectRecruiterEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-15']")
	WebElement selectRecruiterName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-16']")
	WebElement selectCeGoAheadRequired;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-17']")
	WebElement selectBgvSpocName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-18']")
	WebElement selectBgvSpocEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-19']")
	WebElement txtHrdpName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-20']")
	WebElement txtHrdpEmailId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-21']")
	WebElement txtClientProcessName;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-22']")
	WebElement txtCandidateId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseflexfielddata-23']")
	WebElement txtAddress;

	// SELECT CUSTOM CHECKS
	@CacheLookup
	@FindBy(how = How.CSS, using = "#checksUpdSubmit_0")
	WebElement clickOnChooseChecksBtn;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_34")
	WebElement txtProfessionalReferenceCheck;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_41")
	WebElement txtPreviousEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_47")
	WebElement txtIndianDatabaseVerification;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_62")
	WebElement txtCriminalRecordsVerification;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_72")
	WebElement txtNationalIdentityCheck;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_83")
	WebElement txtEducationVerificationW;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_90")
	WebElement txtIndiaCourtRecordCheckLawFirm;

	@CacheLookup
	@FindBy(how = How.CSS, using = "#checkwise_count_108")
	WebElement txtCreditDefault;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div/div/div[2]/form/div[3]/input")
	WebElement clickOnCustomChecksUpdateBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Save')]")
	WebElement clickOnSaveBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Candidate information saved successfully')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/a[4]")
	WebElement clickOnUploadDocumet1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Completed')]")
	WebElement verifyCompletedText;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement browseFileToUpload;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='continueBtn']")
	WebElement clickOnContinueBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsMsg;

	// Confirm--Are you sure, you want to CONTINUE with all the records.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
	WebElement clickOnConfirmOkBtn;

	// Submit Cases In Bulk Quick Submit (Submit cases in bulk using MS Excel
	// consisting candidate info)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsText;

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
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div/div[1]/div[1]/label")
	WebElement verifyCandidateFname1;

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

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div/div[1]/div[1]/label")
	WebElement verifyCandidateFname;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	@CacheLookup
	WebElement verifyCandidateBulkArsNoInBridge;

	// Action Methods for the Login
	public void login(String uname, String pwd) {
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	// Do It Yourself(DIY)
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmitCaseInBulk));
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", clickOnSubmitCaseInBulk);
		// clickOnSubmitCaseInBulk.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnQuickSubmit));
		clickOnQuickSubmit.click();
		Thread.sleep(1000);
	}

	// Quick Submit Form--Step 3 - Candidate Summary
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
		txtEmailAddress.sendKeys(email);
	}

	public void quickSubmitForm(String dob, String mNumber, String einName, String dateJoining, String dateOfBirth,
			String businessUnit, String designation, String lineManager, String roleCode, String legalEntity,
			String btEmail, String dateOfProvision, String recordId, String panNumber, String hrdpName,
			String hrdpemail, String clientProcessName, String candidateId, String address)
			throws InterruptedException {
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(selectPackageName));
		Select packageName = new Select(selectPackageName);
		packageName.selectByIndex(2);
		// SELECT CUSTOM CHECKS
//		wait = new WebDriverWait(ldriver, 20);
//		wait.until(ExpectedConditions.visibilityOf(clickOnChooseChecksBtn));
//		JavaScriptManuplator.javaScriptExecutor(clickOnChooseChecksBtn, "arguments[0].click()", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtProfessionalReferenceCheck, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtPreviousEmploymentVerification, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtIndianDatabaseVerification, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtCriminalRecordsVerification, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtNationalIdentityCheck, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtEducationVerificationW, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtIndiaCourtRecordCheckLawFirm, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(txtCreditDefault, "arguments[0].value='1'", ldriver);
//		JavaScriptManuplator.javaScriptExecutor(clickOnCustomChecksUpdateBtn, "arguments[0].click()", ldriver);
//		Thread.sleep(1000);
		Select location = new Select(selectLocationName);
		location.selectByIndex(2);
		txtDateOfBirthName.sendKeys(dob);
		txtMobileNumber.sendKeys(mNumber);

		// ADDITIONAL INFORMATION-- Step 3 - Candidate Summary
		txtEinName.sendKeys(einName);
		txtDateOfJoining.sendKeys(dateJoining);
		txtDateOfBirth.sendKeys(dateOfBirth);
		txtBusinessUnit.sendKeys(businessUnit);
		Select oucName = new Select(selectOucName);
		oucName.selectByIndex(2);
		txtDesignationName.sendKeys(designation);
		txtLineManager.sendKeys(lineManager);
		txtRoleCode.sendKeys(roleCode);
		txtLegalEntity.sendKeys(legalEntity);
		txtBtEmailId.sendKeys(btEmail);
		txtDateOfProvisionOffice.sendKeys(dateOfProvision);
		txtRecordId.sendKeys(recordId);
		txtPanNumber.sendKeys(panNumber);
		Select recruiterEmail = new Select(selectRecruiterEmailId);
		recruiterEmail.selectByIndex(2);

		Select recruiterName = new Select(selectRecruiterName);
		recruiterName.selectByIndex(2);

		Select ceGoAheadReq = new Select(selectCeGoAheadRequired);
		ceGoAheadReq.selectByIndex(2);

		Select bgvSpoc = new Select(selectBgvSpocName);
		bgvSpoc.selectByIndex(2);

		Select gvSpocEmail = new Select(selectBgvSpocEmailId);
		gvSpocEmail.selectByIndex(2);

		txtHrdpName.sendKeys(hrdpName);
		txtHrdpEmailId.sendKeys(hrdpemail);
		txtClientProcessName.sendKeys(clientProcessName);
		txtCandidateId.sendKeys(candidateId);
		wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.visibilityOf(txtAddress));
		txtAddress.sendKeys(address);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", selectPackageName);
	}

	public void clickOnSaveBtn(String uploadFile) throws InterruptedException {
		// Click On Save Button
		List<WebElement> tag = ldriver.findElements(By.tagName("a"));
		for (int i = 0; i < tag.size(); i++) {
			// System.out.println(tag.get(i).getAttribute("title"));
			if (tag.get(i).getAttribute("title").equals("Save Record")) {
				// tag.get(i).click();
				JavascriptExecutor executor = (JavascriptExecutor) ldriver;
				executor.executeScript("arguments[0].click();", tag.get(i));
				Thread.sleep(1000);
				break;
			}
		}

		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnUploadDocumet1));
		clickOnUploadDocumet1.click();
		Thread.sleep(1000);
		browseFileToUpload.sendKeys(uploadFile);
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCompletedText));
		Thread.sleep(1000);
		ldriver.navigate().refresh();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueBtn));
		clickOnContinueBtn.click();
		// Confirm--Are you sure, you want to CONTINUE with all the records.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		Thread.sleep(1000);
		clickOnConfirmOkBtn.click();
		Thread.sleep(2000);
	}

	public String submitCasesInBulkQuickSubmitMsg() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCongratulationsText));
		return verifyCongratulationsText.getText();

	}

	// (WIP Cases)--Submitted Case(s) Tracker
	public void submittedCasesTrackerWipCases(String candidateName, String candidateMname) throws InterruptedException {
		clickOnSidebarExpandSub.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubmittedCasesTracker));
		clickOnSubmittedCasesTracker.click();

		WebElement element = ldriver.findElement(By.xpath("//a[contains(text(),'WIP Cases')]"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		searchByArsCandidateName.sendKeys(candidateName);
		searchByArsCandidateName1.sendKeys(candidateMname);
		Thread.sleep(2000);
		searchByArsCandidateName1.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		try {
			File output = new File("outputArsQuickSubmitWip.txt");
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
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateBulkFname));
		return verifyCandidateBulkFname.getText();
	}

	public String verifyQuickSubmitBulkArsNumberInBridge() {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyCandidateBulkArsNoInBridge));
		return verifyCandidateBulkArsNoInBridge.getText();
	}

}
