package com.iBridge.testcases.old;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.iBridge.pageobject.CandidateEmailVerification;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_CandidateEmailVerification_03 extends BaseClass {
	@Test(enabled = true, testName = "Candidate Email Verification", priority = 1)
	public void candidateEmailVerification() throws InterruptedException, IOException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		Thread.sleep(3000);
		logger.info("Launch Mailinator URL Launch!");

		CandidateEmailVerification verification = new CandidateEmailVerification(driver);

		verification.mailinatorVerificationMail();
		logger.info("Veification Mailinator Mail!");
		
		String iBridgeMailTitle = "Background Check for British Telecom | Submit your";
		
		if (iBridgeMailTitle.equalsIgnoreCase("Background Check for British Telecom | Submit your")) {
			Assert.assertTrue(true);
			logger.info("Mail has got successfully!");
		} else {
			captureScreen(driver, "candidateEmailVerification");
			Assert.assertTrue(false);
			logger.info("Mail has not got successfully!");
		}

		verification.getUserNameAndPassword();
		logger.info("Get Username and Password!");
		
	}

}
