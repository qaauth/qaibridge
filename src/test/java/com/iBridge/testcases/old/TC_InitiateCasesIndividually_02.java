package com.iBridge.testcases.old;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.iBridge.pageobject.InitiateCasesIndividually;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_InitiateCasesIndividually_02 extends BaseClass {
	@Test(enabled = true, testName = "Initiate Cases Individually", priority = 1)
	public void initiateCasesIndividually() throws InterruptedException, IOException, ParseException {
		driver.get(baseURL);
		logger.info("iBridge Url is opened");

		InitiateCasesIndividually iCasesIndividually = new InitiateCasesIndividually(driver);
		iCasesIndividually.login(username, password);
		logger.info("Entered email and Password!");
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		if (url.equals("http://35.154.153.79/ibridge_aws_debugg/enterprise/dashboard")) {
			logger.info("Current Url Found Successfully!");
			Thread.sleep(2000);
		} else {
			logger.info("Current Url Not Found Successfully!");
			captureScreen(driver, "initiateCasesIndividually");
		}

		// Initiate Via Candidate(IVC)
		iCasesIndividually.sidebarExpandBtn();
		logger.info("Clicked on bar expand");

		iCasesIndividually.clickUnCheckWiseSelect("1");
		logger.info("Clicked on Initiate Via Candidate");

		iCasesIndividually.checkWiseSelect("1");
		logger.info("Select checkBox Accounding to requirements");

		// Step 3 - Candidate Summary (Add Candidate Information)
		String firstName = randomeStringCandidateFirstName() + "r";
		iCasesIndividually.candidateFirstName(firstName);

		String middleName = randomeStringCandidateMiddleName() + "m";
		iCasesIndividually.candidateMiddleName(middleName);
		Thread.sleep(1000);

		String lastName = randomeStringCandidateLastName() + "l";
		iCasesIndividually.candidateLastName(lastName);

		iCasesIndividually.addCandidateInformation("8009744341", "04-04-1991");

		String email = randomeStringCandidateEmail() + "@mailinator.com";
		iCasesIndividually.candidateEmail(email);
		System.out.println("Email id of candidate=>" + email);
		logger.info("Entered condidated information!");
		Thread.sleep(1000);

		// Additional Field(s)===========================================
		iCasesIndividually.additionFieldInfo("rajucs@gmail.com","12345", "04/04/1991", "1100", "Quality Analyst", "Raju Yadav",
				"Senior QA", "12345", "raju12@gmail.com", "10-12-2019", "6098", "SKPAY123", "Aman kumar",
				"hrd@gmail.com", "Scott", "6098", "Gurgaow");
		logger.info("Entered Additional Informations!");
	
		iCasesIndividually.initiateCaseBtn();
		logger.info("Initiated for candidate(s) successfully!");
		Thread.sleep(2000);
		
		if (driver.getPageSource().contains("1 case(s)")) {
			Assert.assertTrue(true);
			logger.info("1 case(s) Initiated for candidate(s) successfully");
		} else {
			Assert.assertTrue(false);
			captureScreen(driver, "InitaiteCaseIndividually");
			logger.info("1 case(s) has not Initiated for candidate(s) successfully");
		}
	}

	public String randomeStringCandidateFirstName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateMiddleName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateLastName() {
		String generateString = RandomStringUtils.randomAlphabetic(3);
		return (generateString);
	}

	public String randomeStringCandidateEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(6);
		try {

			File output = new File("RandomMail.txt");
			FileWriter writer = new FileWriter(output);

			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (generateString);
	}

}
