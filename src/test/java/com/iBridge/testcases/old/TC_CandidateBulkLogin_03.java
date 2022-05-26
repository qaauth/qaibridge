package com.iBridge.testcases.old;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

import org.testng.annotations.Test;

import com.iBridge.pageobject.CandidateBulkLogin;
import com.iBridge.testcases.BaseClass;

import junit.framework.Assert;

public class TC_CandidateBulkLogin_03 extends BaseClass {
	@Test(enabled = true, testName = "Candidate Bulk Login", priority = 1)
	public void candidateBulkLogin() throws InterruptedException, ParseException, IOException {
		driver.get(baseUrl);
		logger.info("Candidate Login iBridge portal Url is opened");
 
		CandidateBulkLogin candidateBulkLogin = new CandidateBulkLogin(driver);
		
		String data = new String(Files.readAllBytes(Paths.get("output1.txt")));
	    String userAndPassword[] = data.split(" ");
	    System.out.println(userAndPassword[0]+"==="+userAndPassword[1]);
	    candidateBulkLogin.candidateLogin(userAndPassword[0], userAndPassword[1]);
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
		candidateBulkLogin.candidateAuthorization();
		logger.info("Digital signature successfully!");
		
		candidateBulkLogin.candidateIdentity("Raju Yadav", "Raju123");
		logger.info("Candidate National Identity Details Setup successfully!");
		
		candidateBulkLogin.candidateProfile("7042718794", "Prakash Yadav");
		logger.info("Candidate Profile Details Setup successfully!");
		
		//ADDRESS--Step 3 - Candidate Summary
		candidateBulkLogin.condidateAddress("23", "Mayur Vihar", "04-04-2019", "323233","hi","Delhi", "Mayur Vihar", "1234", "Mayur Vihar","04-04-2019", "323233","hi","Delhi", "Mayur Vihar", (System.getProperty("user.dir") + "/documents/ARN.pdf"));
		logger.info("Candidate Address setup successfully!");
		
		//Education Details--Step 3 - Candidate Summary
		candidateBulkLogin.candidateEducation("Computer Science & Engineering", "Bundelkhand University, Jhansi", "Bun", "Bundelkhand University, Jhansi", "Jhansi", "Enroll1234", "65%","08/2010","08/2014", "Good");
		logger.info("Candidate Eductaion details Setup successfully!");
		
		//Employment(Current Employment Details)--Step 3 - Candidate Summary
		candidateBulkLogin.candidateEmployment("Agami Technologies", "Quality Analyst", "Greater Noida", "8009744341", "Greater Noida", "Information Technologies","10-01-2019", "Testing software", "Good", "600000", "Agm0035", "A", "Personal and Career Growth", "152745675", "Raju", "Kumar", "Yadav", "QA", "7042718794", "rajuyadav0556@gmail.com","Aman","Kumar","Singh","Human Resource","Agami Technologies","8009744341","ajit@agamitechnologies.com");
		logger.info("Candidate Employment details Setup successfully!");
		
		candidateBulkLogin.candidatePreviousEmployment("HCL Technologies", "Quality Analyst", "Noida", "8009744341", "Noida", "Engineering","10-01-2018", "QA", "Good", "700000", "Hcl210", "A", "Personal and Career Growth", "15289730832","Abhishek","Kumar","Singh","Project Manager","7042718794","abhishek@agamitechnologies.com","Manish","Kumar","Singh","Human Resource","Agami Technologies","8009744341","manish@agamitechnologies.com","07-12-2020","Preparation for the entrance examination");
		logger.info("Candidate Previous Employment details Setup successfully!");
		
		candidateBulkLogin.candidateCasePreview();
		
		if (driver.getPageSource().contains("Thank you.")) {
			Assert.assertTrue(true);
			logger.info("Candidate Case Preview details successfully!");
		} else {
			captureScreen(driver, "candidateCasePreview");
			Assert.assertTrue(false);
			logger.info("Candidate Case Preview has not detailed successfully!");
		}
		
		
	}

}
