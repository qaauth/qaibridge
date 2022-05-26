package com.iBridge.testcases.old;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import com.iBridge.pageobject.CandidateBulkEmailVerification;
import com.iBridge.testcases.BaseClass;


public class TC_CandidateBulkEmailVerification_02 extends BaseClass {
	
	@Test(enabled = true, testName = "Candidate Bulk Email Verification", priority = 1)
	public void candidateBulkEmailVerification() throws InterruptedException, IOException {
		String randomString = new String(Files.readAllBytes(Paths.get("RandomBulkMail.txt")));
		String mailinatorUrl = "https://www.mailinator.com/v3/index.jsp?zone=public&query=" + randomString
				+ "#/#inboxpane";
		driver.get(mailinatorUrl);
		logger.info("Launch Mailinator URL Launch!");

		CandidateBulkEmailVerification verification = new CandidateBulkEmailVerification(driver);

		verification.mailinatorVerificationMail();
		logger.info("Veification Mailinator Mail!");
		String iBridgeMailTitle = "Background Check for British Telecom | Submit your";
		if (iBridgeMailTitle.equalsIgnoreCase("Background Check for British Telecom | Submit your")) {
			System.out.println("Mail has got successfully!");
		} else {
			System.out.println("Mail has not got successfully!");
		}

		verification.getUserNameAndPassword();
		logger.info("Get Username and Password!");
		
	}

}

