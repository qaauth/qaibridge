package com.iBridge.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iBridge.pageobject.PrepaidEnpAdmin;

public class TC_PrepaidEnpAdmin_01 extends BaseClass {
	// Verify Enp Admin Account Login
	@Test(enabled = true, testName = "Verify Enp Admin Account Login", priority = 1)
	public void verifyEnpAdminLoginAccount() throws IOException, InterruptedException {
		driver.get(EnpAdminURL);
		logger.info("Prepaid Enp Admin Url has opened Successfully!");
		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
		enpAdminLogin.loginEnpAdminAccount(enpAdminUsername, enpAdminPassword);
		logger.info("Prepaid Enp Admin account has Logged successfully!");
		if (enpAdminLogin.verifyClientListingText().contains("Client Listing")) {
			Assert.assertTrue(true);
			logger.info("Client Listing Name has Verified Successfully!");
		} else {
			logger.info("Client Listing Name has Not Verified Successfully!");
			captureScreen(driver, "verifyClientListingText");
			Assert.assertTrue(false);
		}
	}

	// Verify Enp Admin Prepaid Configuration Tag Check
	@Test(enabled = true, testName = "Verify Prepaid Client Configuration Tag Check", priority = 2, dependsOnMethods = {
			"verifyEnpAdminLoginAccount" })
	public void verifyEnpAdminPrepaidConfigurationTagCheck() throws InterruptedException, IOException {
		PrepaidEnpAdmin enpAdminConfigure = new PrepaidEnpAdmin(driver);
		enpAdminConfigure.prepaidClientAction();
		logger.info("Verify Prepaid Client Configuration Successfully!");
		enpAdminConfigure.prepaidClientConfigureForTagCheck();
		if (enpAdminConfigure.verifyPackageUpdatedSuccessfullyMsg().contains("Package Updated Successfully.")) {
			Assert.assertTrue(true);
			logger.info("Package Updated has Verified Successfully!");
		} else {
			logger.info("Package Updated has Not Verified Successfully!");
			captureScreen(driver, "verifyPackageUpdatedSuccessfullyMessage");
			Assert.assertTrue(false);
		}
		enpAdminConfigure.verifyEnpAdminAcountLogoutTag();
		logger.info("Enp Admin Account Has Logged Out Successfully!");
	}

	// Verify User side, Checkwise Tag Checks Count Number
	@Test(enabled = true, testName = "Verify User side, Checkwise Tag Checks Count Number", priority = 3, dependsOnMethods = {
			"verifyEnpAdminPrepaidConfigurationTagCheck" })
	public void verifyUserPrepaidConfigurationTagCheck() throws InterruptedException, IOException {
		driver.get(EnpAdminURL);
		logger.info("Prepaid Enp Admin Url has opened Successfully!");
		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
		enpAdminLogin.loginEnpAdminAccount(candidateUsername, candidatePrePassword);
		logger.info("Prepaid Enp Admin account has Logged successfully!");

		PrepaidEnpAdmin enpAdminConfigure = new PrepaidEnpAdmin(driver);
		enpAdminConfigure.initiateNewCaseForIvc();
		logger.info("Verify Prepaid Tag Check Count Successfully!");
		enpAdminConfigure.selectPackageCheckWise();
		logger.info("Selection CheckWise Package has Successfully!");

		/*if (enpAdminConfigure.verifyCheckWiseCountNumber().contains("10")) {
			Assert.assertTrue(true);
			logger.info("CheckWise Tag Check has Verified Successfully!");
		} else {
			logger.info("CheckWise Tag Check has Not Verified Successfully!");
			captureScreen(driver, "verifyCheckWiseCountNumber");
			Assert.assertTrue(false);
		}*/
		enpAdminConfigure.userLogoutAccount();
		logger.info("User Account Has Logged Out Successfully!");
	}

	// Verify Prepaid Client Configuration
	@Test(enabled = true, testName = "Verify Prepaid Client Configuration", priority = 4, dependsOnMethods = {
			"verifyUserPrepaidConfigurationTagCheck" })
	public void verifyEnpAdminPrepaidClientConfiguration() throws InterruptedException, IOException {
		driver.get(EnpAdminURL);
//		driver.close();
		logger.info("Prepaid Enp Admin Url has opened Successfully!");
		PrepaidEnpAdmin enpAdminLogin = new PrepaidEnpAdmin(driver);
		enpAdminLogin.loginEnpAdminAccount(enpAdminUsername, enpAdminPassword);
		logger.info("Prepaid Enp Admin account has Logged successfully!");
		PrepaidEnpAdmin enpAdminConfigure = new PrepaidEnpAdmin(driver);
		enpAdminConfigure.prepaidClientAction();
		logger.info("Verify Prepaid Client Configuration Successfully!");
		enpAdminConfigure.prepaidClientConfigure();
		if (enpAdminConfigure.verifyPackageUpdatedSuccessfullyMessage().contains("Package Updated Successfully.")) {
			Assert.assertTrue(true);
			logger.info("Package Updated has Verified Successfully!");
		} else {
			logger.info("Package Updated has Not Verified Successfully!");
			captureScreen(driver, "verifyPackageUpdatedSuccessfullyMessage");
			Assert.assertTrue(false);
		}
		enpAdminConfigure.verifyEnpAdminAcountLogout();
		logger.info("Enp Admin Account Has Logged Out Successfully!");
	}
}
