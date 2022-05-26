package com.iBridge.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
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

public class InitiateCasesInBulk {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor executor;

	public InitiateCasesInBulk(WebDriver rdriver) {
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

	// Initiate Via Candidate(IVC)--Bulk
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-expand-collapse-btn\"]/div/div/div")
	WebElement clickOnSidebarExpand;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Initiate New Case')]")
	WebElement clickOnInitiateNewCase;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"mode\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/ul/li[2]/a/i")
	WebElement clickOnIvcBulk;

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
	@FindBy(how = How.XPATH, using = "//*[@id='pacakgeSubmitForm']")
	WebElement clickContinue;

	// Drag & Drop file here or browse file to upload
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='form']/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/a")
	WebElement clickOnDownloadTemplate;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='FilUploader']")
	WebElement clickOnBrowse;

	// Uploaded sheet data saved successfully
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Uploaded sheet data saved successfully')]")
	WebElement verifySheetDataToastMsg;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='continueBtn']")
	WebElement clickOnContinueBtn;
	
	// Upload Cv For every Candidate.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[1]/div[1]/h4/div[2]/a[1]/i")
	WebElement clickOnUploadCVDocumentBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Upload CV Document')]")
	WebElement verifyUploadCVDocument;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='cvDocUploadElement']")
	WebElement uploadcvDocUploadElement;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='upload-cvdocs-submit-btn']")
	WebElement clickOnUploadBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'ok')]")
	WebElement clickOnConfirmOkBtn;
	
	// Second Candidate Cv Upload.
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[2]/div[1]/h4/div[2]/a[1]/i")
	WebElement clickOnUploadCvCandidateBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Upload CV Document')]")
	WebElement verifyUploadCVDocText;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='cvDocUploadElement']")
	WebElement clickOnCvUploadElement;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@id='upload-cvdocs-submit-btn']")
	WebElement clickOnUploadSubmitBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'ok')]")
	WebElement clickOnOkBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='initiateBtn']")
	WebElement clickOnInitiateBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='confirmation']/div/div[2]/div/div/div/div/div/h3")
	WebElement verifyConfirmationMsg;

	// 2 Case(s) with missing mandatory information were found!
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='caseSummary']/div/div/div[2]/div[1]/div[2]/a")
	WebElement clickOnmissingMandatoryInformation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div/div/form/div[2]/div[2]/div/div/div/div[1]/select")
	WebElement selectLocation;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div/div/form/div[2]/div[1]/h4/div[2]/a[2]/i")
	WebElement clickOnExpandBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div/div/form/div[3]/div[2]/div/div/div/div[1]/select")
	WebElement selectLocationDropDwn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id='updateCandidate']")
	WebElement clickOnSaveBtn;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Congratulations!')]")
	WebElement verifyCongratulationsText;

	// Action Methods for the Login
	public void login(String uname, String pwd) {
		txtUserName.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}

	// Initiate Via Candidate(IVC)--Bulk
	public void sidebarExpandBtn() throws InterruptedException {
		clickOnSidebarExpand.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateNewCase));
		clickOnInitiateNewCase.click();
		clickOnIvcBulk.click();
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

	// Update the value of cell of the Bulk upload format xls
	public void updateCandidateRecords() {
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/com/iBridge/testdata/bulk_upload_format .xls");

			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Cell cell = null;
			Cell cell1 = null;

			Cell cell2 = null;
			Cell cell3 = null;

			Cell cell4 = null;
			Cell cell5 = null;

			// Update the value of cell
			cell = sheet.getRow(1).getCell(0);
			cell1 = sheet.getRow(1).getCell(4);

			String Firstname1 = randomeStringCandidateFirstName();
			cell.setCellValue(Firstname1);
			System.out.println("First Condidate Random First name text=>" + Firstname1);

			String email1 = randomeStringCandidateEmail();
			cell1.setCellValue(email1 + "@mailinator.com");
			System.out.println("First Condidate Random Email name text=>" + email1);

			cell2 = sheet.getRow(2).getCell(0);
			cell3 = sheet.getRow(2).getCell(4);

			String Firstname2 = randomeStringCandidateFirstName();
			cell2.setCellValue(Firstname2);
			System.out.println("First Condidate Random First name text=>" + Firstname2);

			String email2 = randomeStringCandidateEmail();
			cell3.setCellValue(email2 + "@mailinator.com");
			System.out.println("First Condidate Random Email name text=>" + email2);

			cell4 = sheet.getRow(1).getCell(1);
			cell5 = sheet.getRow(2).getCell(1);

			String middleName1 = randomeStringCandidateMiddleName();
			cell4.setCellValue(middleName1);
			System.out.println("Middle Condidate Random First name text=>" + middleName1);

			String middleName2 = randomeStringCandidateMiddleName();
			cell5.setCellValue(middleName2);
			System.out.println("Middle Condidate Random name text=>" + middleName2);

			file.close();

			FileOutputStream outFile = new FileOutputStream(new File(
					System.getProperty("user.dir") + "/src/test/java/com/iBridge/testdata/bulk_upload_format .xls"));
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String randomeStringCandidateFirstName() {
		String generateString = RandomStringUtils.randomAlphabetic(4);
		return (generateString);
	}

	public String randomeStringCandidateMiddleName() {
		String generateString = RandomStringUtils.randomAlphabetic(4);
		return (generateString);
	}

	public String randomeStringCandidateEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(4);
		try {

			File output = new File("RandomBulkMail.txt");
			FileWriter writer = new FileWriter(output);

			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (generateString);
	}

	// Drag & Drop file here or browse file to upload
	public void browseFileToUpload(String fileUpload) throws InterruptedException {
		// clickOnDownloadTemplate.click();
		clickOnBrowse.sendKeys(fileUpload);
		Thread.sleep(5000);
	}

	// Uploaded sheet data saved successfully
	public String verifySheetDataSavedSuccessToastMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifySheetDataToastMsg));
		return verifySheetDataToastMsg.getText();
	}

	public void clickOnContinueBtn() throws InterruptedException {
		// 2 Case(s) with missing mandatory information were found!
		/*wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnmissingMandatoryInformation));
		clickOnmissingMandatoryInformation.click();
		Select location = new Select(selectLocation);
		location.selectByIndex(1);
		clickOnExpandBtn.click();
		Select locationDwn = new Select(selectLocationDropDwn);
		locationDwn.selectByIndex(1);
		executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", clickOnSaveBtn);*/
		Thread.sleep(2000);
		clickOnContinueBtn.click();
		Thread.sleep(1000);
	}
	
	// Upload Cv For every Candidate.
	public void uploadCandidateCv(String cvDocUploadElement,String cvUploadElement) throws InterruptedException {
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnUploadCVDocumentBtn));
		clickOnUploadCVDocumentBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyUploadCVDocument));
		Thread.sleep(1000);
		uploadcvDocUploadElement.sendKeys(cvDocUploadElement);
		Thread.sleep(2000);
		clickOnUploadBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnConfirmOkBtn));
		Thread.sleep(2000);
		clickOnConfirmOkBtn.click();
		// Second Candidate Cv Upload.
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnUploadCvCandidateBtn));
		clickOnUploadCvCandidateBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(verifyUploadCVDocText));
		clickOnCvUploadElement.sendKeys(cvUploadElement);
		Thread.sleep(2000);
		clickOnUploadSubmitBtn.click();
		wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(clickOnOkBtn));
		clickOnOkBtn.click();
		Thread.sleep(1000);
	}

	public void clickOnInitiateBtn() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickOnInitiateBtn));
		clickOnInitiateBtn.click(); 
		Thread.sleep(1000);
	}

	public String verifyCongratulationMsg() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyCongratulationsText));
		return verifyCongratulationsText.getText();

	}
}
