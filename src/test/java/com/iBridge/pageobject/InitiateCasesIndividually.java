package com.iBridge.pageobject;

import java.text.ParseException;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitiateCasesIndividually {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public InitiateCasesIndividually(WebDriver rdriver) {
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

	// Initiate Via Candidate(IVC)
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

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

	// CHECK(S) SELECTED
	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][id]")
	WebElement previousEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[41][count]")
	WebElement txtPreviousEmploymentVerificationCount;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[57][id]")
	WebElement currentAddressVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[58][id]")
	WebElement currentEmploymentVerification;

	@CacheLookup
	@FindBy(how = How.NAME, using = "checkwise[83][id]")
	WebElement educationVerificationW;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='customized-check']/li[11]/div/input")
	WebElement txtEucationVerificationWCount;

	@CacheLookup
	@FindBy(how = How.NAME, using = "continue")
	WebElement clickContinue;

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

	// Date of Birth (DOB)
	@CacheLookup
	@FindBy(how = How.ID, using = "date-of-birth")
	WebElement clickDateOfBirth;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'24')]")
	WebElement clickDate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "email_address")
	WebElement txtEmailId;

	@CacheLookup
	@FindBy(how = How.ID, using = "mobile-no")
	WebElement txtMobileNumber;

	// Additional Field(s)===========================================
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/select[1]")
	WebElement clickBridgeLocationId;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/input[1]")
	WebElement txtCc_Email_Address;

	@CacheLookup
	@FindBy(how = How.ID, using = "caseflexfielddata-1")
	WebElement txtEIN;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[8]/div[1]/table/tbody/tr[5]/td[7]")
	WebElement selectJoinigDate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[3]")
	WebElement txtDateOfBirth;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[4]")
	WebElement txtBusinessUnit;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[5]")
	WebElement clickOnOUC;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[6]")
	WebElement txtDesignation;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[7]")
	WebElement txtLineManager;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[8]")
	WebElement txtRoleCode;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[9]")
	WebElement txtLegalEntity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[10]")
	WebElement txtBtEmailId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[11]")
	WebElement txtDateOfProvisionalOffce;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[12]")
	WebElement txtRecordId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[13]")
	WebElement txtPanNumber;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[14]")
	WebElement clcikOnRecruiterEmailId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[15]")
	WebElement clickOnRecruiterName;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[16]")
	WebElement clickOnCeoGoAheadReq;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[17]")
	WebElement clickOnBgvSpoc;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[18]")
	WebElement clickOnBgvSpocEmailId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[19]")
	WebElement txtHrdpName;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[20]")
	WebElement txtHrdpEmailId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[21]")
	WebElement txtClientProcessName;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[22]")
	WebElement txtCandidateId;

	@CacheLookup
	@FindBy(how = How.NAME, using = "CaseFlexFieldData[23]")
	WebElement txtAddress;

	// ADD TO QUEUE
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Additional Field(s)')]")
	WebElement VerifyTextName;

	@CacheLookup
	@FindBy(how = How.ID, using = "addCandidate")
	WebElement clickAddCandidate;

	// Candidate information saved successfully
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Candidate information saved successfully')]")
	WebElement verifyToastMsg;

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "candidate-name")
	WebElement clickCandidateName;

	@CacheLookup
	@FindBy(how = How.ID, using = "continueBtn")
	WebElement clickOnContinueBtn;

	// Step 4 - Case Preview- INITIATE (Please review the screen before you proceed)
	@CacheLookup
	@FindBy(how = How.ID, using = "initiateBtn")
	WebElement clickInitiateBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@class='initiated-cases-msg']")
	WebElement verifyInitiatedCasesMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='confirmation']/div/div[2]/div/div/div/div/div/h3")
	WebElement verifyCaseSuccessfullyText;

	// Action Methods for the Login
	public void login(String uname, String pwd) {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	// Initiate Via Candidate(IVC)
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		clickOnIvc.click();
		clickCheckWiseSelect.click();
	}

	public void clickUnCheckWiseSelect(String empCount) {
		List<WebElement> allCheckBoxList = ldriver.findElements(By.className("checkwise-check"));
		System.out.println("Number of elements:" + allCheckBoxList.size());
		int checkBoxSizeList = allCheckBoxList.size();
		for (int i = 0; i < checkBoxSizeList; i++) {
			try {
				if (i == 0 || i == 2) {
					txtPreviousEmploymentVerificationCount.clear();
					txtPreviousEmploymentVerificationCount.sendKeys(empCount);
					continue;
				}
				((WebElement) allCheckBoxList.get(i)).click();
			} catch (Exception e) {
				JavascriptExecutor js = (JavascriptExecutor) ldriver;
				js.executeScript("arguments[0].scrollIntoView(true);", ((WebElement) allCheckBoxList.get(i)));
				((WebElement) allCheckBoxList.get(i)).click();
			}
		}
	}

	public void checkWiseSelect(String count) {
		// Clicked on Pan number Verification and Continue button
		educationVerificationW.click();
		txtEucationVerificationWCount.sendKeys(count);
		currentAddressVerification.click();
		currentEmploymentVerification.click();
		clickContinue.click();
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

	public void addCandidateInformation(String mobileNumber, String dob) throws ParseException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].removeAttribute('readonly')", clickDateOfBirth);
		clickDateOfBirth.sendKeys(dob);
		txtMobileNumber.sendKeys(mobileNumber);
		Thread.sleep(1000);
	}

	public void candidateEmail(String email) {
		txtEmailId.sendKeys(email);
	}

	// Additional Field(s)
	public void additionFieldInfo(String ccEmail, String ein, String dob, String businessUnit, String designation,
			String lineManager, String roleName, String legalEntity, String btEmailId, String dateProvisionalOffice,
			String recordId, String panNumber, String hrdName, String hrdpEmailId, String clientProcessName,
			String candidateId, String address) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(txtMobileNumber));
		
		//Adding new code for headless======================
		Thread.sleep(3000);
        WebElement xWL = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/select[1]"));
        Actions xAct = new Actions(ldriver);
        xAct.moveToElement(xWL).build().perform();
      //Adding new code for headless
        
		Select location = new Select(clickBridgeLocationId);
		location.selectByIndex(1);
		Thread.sleep(6000);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value='rajucs@gmail.com'", txtCc_Email_Address);
		txtEIN.sendKeys(ein);

		WebElement element = ldriver
				.findElement(By.xpath("//*[@id='addCandidateForm']/div[3]/div[2]/div[5]/div/label"));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(element).click().perform();
		selectJoinigDate.click();
		txtDateOfBirth.sendKeys(dob);
		txtBusinessUnit.sendKeys(businessUnit);
		Select ouc = new Select(clickOnOUC);
		ouc.selectByIndex(5);
		txtDesignation.sendKeys(designation);
		txtLineManager.sendKeys(lineManager);
		txtRoleCode.sendKeys(roleName);
		txtLegalEntity.sendKeys(legalEntity);
		txtBtEmailId.sendKeys(btEmailId);
		txtDateOfProvisionalOffce.sendKeys(dateProvisionalOffice);
		txtRecordId.sendKeys(recordId);
		txtPanNumber.sendKeys(panNumber);

		Select recruiterEmail = new Select(clcikOnRecruiterEmailId);
		recruiterEmail.selectByIndex(4);

		Select recruiterName = new Select(clickOnRecruiterName);
		recruiterName.selectByIndex(3);

		Select ceoGoaAheadReq = new Select(clickOnCeoGoAheadReq);
		ceoGoaAheadReq.selectByIndex(3);

		Select bgv = new Select(clickOnBgvSpoc);
		bgv.selectByIndex(3);

		Select bgvSpocEmail = new Select(clickOnBgvSpocEmailId);
		bgvSpocEmail.selectByIndex(3);

		txtHrdpName.sendKeys(hrdName);
		txtHrdpEmailId.sendKeys(hrdpEmailId);
		txtClientProcessName.sendKeys(clientProcessName);
		txtCandidateId.sendKeys(candidateId);
		txtAddress.sendKeys(address);
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
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyToastMsg));
		clickCandidateName.click();
		clickOnContinueBtn.click();
		Thread.sleep(1000);

		// Step 4 - Case Preview- INITIATE (Please review the screen before you proceed)
		clickInitiateBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyInitiatedCasesMsg));
	}

	public String verifyInitiateCaseTextMsg() {
		List<WebElement> tag = ldriver.findElements(By.tagName("label"));
		String messageCongrats = "";
		for (int i = 0; i < tag.size(); i++) {
			// System.out.println(tag.get(i).getAttribute("id"));
			if (tag.get(i).getAttribute("className").equals("thank-you")) {
				messageCongrats = tag.get(i).getText();
				// System.out.println(messageCongrats);
			}
		}
		return messageCongrats;

	}

}
