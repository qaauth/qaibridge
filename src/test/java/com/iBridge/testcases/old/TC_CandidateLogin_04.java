package com.iBridge.testcases.old;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import org.testng.annotations.Test;

import com.iBridge.pageobject.CandidateLogin;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_CandidateLogin_04 extends BaseClass {
	@Test(enabled = true, testName = "Candidate Login", priority = 1)
	public void candidateLogin() throws IOException, InterruptedException, ParseException {
		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");

		CandidateLogin candidateLogin = new CandidateLogin(driver);
		String data = new String(Files.readAllBytes(Paths.get("output.txt")));
		String userAndPassword[] = data.split(" ");
		System.out.println(userAndPassword[0] + "===" + userAndPassword[1]);
		candidateLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
		logger.info("Entered User Id and Password!");

		String url = driver.getCurrentUrl();
		if (url.contains("http://35.154.153.79/ibridge_aws_debugg/case-initiation")) {
			Assert.assertTrue(true);
			logger.info("Current Url Found Successfully");
		} else {
			captureScreen(driver, "CandidateUrlFound");
			Assert.assertTrue(false);
			logger.info("Current Url Not Found Successfully");
		}

		// Step 3 - Candidate Summary
		candidateLogin.candidateAuthorization();
		logger.info("Digital signature successfully!");

		candidateLogin.candidateIdentity("Raju Yadav", "Raju123");
		logger.info("Candidate National Identity Details Setup successfully!");

		candidateLogin.candidateProfile("7042718794", "Prakash Yadav");
		logger.info("Candidate Profile Details Setup successfully!");

		// ADDRESS--Step 3 - Candidate Summary
		candidateLogin.candidateAddress("23", "Mayur Vihar", "04-04-2019", "323233","hi","Delhi", "Mayur Vihar", "1234",
				"Mayur Vihar", "04-04-2019", "323233","hi","Delhi", "Mayur Vihar",
				(System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address details Setup Successfully!!");

		// Education Details--Step 3 - Candidate Summary
		candidateLogin.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bund",
				"Jhansi", "Enroll1234", "65%", "08/2010", "08/2014", "Good");
		logger.info("Candidate Eductaion details Setup successfully!");

		// Employment(Current Employment Details)--Step 3 - Candidate Summary
		candidateLogin.candidateEmployment("Agami Technologies", "Quality Analyst", "Noida", "8009744341",
				"Greater Noida", "raju.yadav@authbridge.com", "Information Technologies", "10-01-2019", "Testing software", "Good", "600000",
				"Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794",
				"rajuyadav0556@gmail.com", "Aman", "Kumar", "Singh", "Human Resource", "Agami Technologies",
				"8009744341", "ajit@agamitechnologies.com");
		logger.info("Candidate Current Employment details Setup successfully!");

		candidateLogin.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341",
				"Greater Noida","raju.yadav@agamitechnologies.com", "Engineering", "10-01-2018", "QA", "Good", "700000", "Hcl210", "A",
				"Personal and Career Growth", "15289730832", "Abhishek", "Kumar", "Singh", "Project Manager",
				"7042718794", "abhishek@agamitechnologies.com", "Manish", "Kumar", "Singh", "Human Resource",
				"Agami Technologies", "8009744341", "manish@agamitechnologies.com", "07-12-2020",
				"Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");

		//candidateLogin.candidateCasePreview();
		if (driver.getPageSource().contains("Thank you.")) {
			Assert.assertTrue(true);
			logger.info("Candidate Case Preview details Verify successfully!");
		} else {
			captureScreen(driver, "candidateCasePreview");
			Assert.assertTrue(false);
			logger.info("Candidate Case Preview details has not Verified successfully!");
		}

	}

}
