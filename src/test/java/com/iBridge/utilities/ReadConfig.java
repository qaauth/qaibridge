package com.iBridge.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	{
		// properties class object

		File src = new File("./configuration/config.properties");
		// src is refering config file variable src.
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);// Load every text values
		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
	}

	// To read each and every value from this variable create different method
	// (config.properties)
	public String getApplication() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getIePath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

	// To read each and every value from this variable for Candidate Login
	public String getCandidateApplication() {
		String baseUrl = pro.getProperty("baseUrl");
		return baseUrl;
	}

	public String getCandidateUserId() {
		String userId = pro.getProperty("userId");
		return userId;
	}

	public String getCandidatePassword() {
		String candidatePassword = pro.getProperty("candidatePassword");
		return candidatePassword;
	}

	public String getMailinatorBaseURL() {
		String BASEURL = pro.getProperty("BASEURL");
		return BASEURL;
	}

	// To read each and every value from this variable for iBridge Login
	public String getBridgeApplication() {
		String bridgeUrl = pro.getProperty("bridgeUrl");
		return bridgeUrl;
	}

	public String getBridgeCandidateUsername() {
		String bridgeUsername = pro.getProperty("bridgeUsername");
		return bridgeUsername;
	}

	public String getBridgeCandidatePassword() {
		String bridgePassword = pro.getProperty("bridgePassword");
		return bridgePassword;
	}

	// To read each and every value from this variable for Bridge Login
	public String getBridgeApp() {
		String bridgeURL = pro.getProperty("bridgeURL");
		return bridgeURL;
	}

	public String getBridgeUsername() {
		String bridgeEmail = pro.getProperty("bridgeEmail");
		return bridgeEmail;
	}

	public String getBridgePassword() {
		String bridgeUserPassword = pro.getProperty("bridgeUserPassword");
		return bridgeUserPassword;
	}

	// To read each and every value from Cat role for bridge Login--Raju Yadav
	public String getSuperUserCatUsername() {
		String catRoleUsername = pro.getProperty("catRoleUsername");
		return catRoleUsername;
	}

	public String getSuperUserCatPassword() {
		String catRolePassword = pro.getProperty("catRolePassword");
		return catRolePassword;
	}

	// To read each and every value from SME for iBridge Login
	public String getUsernameSme() {
		String usernameSme = pro.getProperty("usernameSme");
		return usernameSme;
	}

	public String getpasswordSme() {
		String passwordSme = pro.getProperty("passwordSme");
		return passwordSme;
	}

	// To read each and every value from Route to candidate for Mailinator mail
	// Login
	public String getMailinatorMailUrl() {
		String mailinatorUrl = pro.getProperty("mailinatorUrl");
		return mailinatorUrl;
	}

	// To read each and every value from Enp Admin-- Prepaid Client
	public String getEnpAdminApplication() {
		String url = pro.getProperty("EnpAdminURL");
		return url;
	}

	public String getEnpAdminUsername() {
		System.out.println(pro.getProperty("enpAdminUsername"));
		String enpAdminUsername = pro.getProperty("enpAdminUsername");
		return enpAdminUsername;
	}

	public String getEnpAdminPassword() {
		System.out.println(pro.getProperty("enpAdminPassword"));
		String enpAdminPassword = pro.getProperty("enpAdminPassword");
		return enpAdminPassword;
	}

	// To read each and every value from Candidate-- Prepaid Client
	public String getPrepaidCandidateUsername() {
		String candidateUsername = pro.getProperty("candidateUsername");
		return candidateUsername;
	}

	public String getPrepaidCandidatePassword() {
		String candidatePrePassword = pro.getProperty("candidatePrePassword");
		return candidatePrePassword;
	}

	public String getPrepaidCandidateUrl() {
		String candidatePrepaidUrl = pro.getProperty("candidatePrepaidUrl");
		return candidatePrepaidUrl;
	}

	// To read each and every value from Candidate-- iBridge Cat Account
	public String getiBridgeCatUsername() {
		String iBridgeCatUsername = pro.getProperty("iBridgeCatUsername");
		return iBridgeCatUsername;
	}

	public String getiBridgeCatPassword() {
		String iBridgeCatPassword = pro.getProperty("iBridgeCatPassword");
		return iBridgeCatPassword;
	}

	//// To read each and every value from Candidate-- SignDrive
	public String getSignDriveApplication() {
		String baseUrl = pro.getProperty("baseUrl");
		return baseUrl;
	}

	public String getiBridgeSignDriveUsername() {
		String iBridgeSignDriveUsername = pro.getProperty("usernameSignDriveUsername");
		return iBridgeSignDriveUsername;
	}

	public String getiBridgeSignDrivePassword() {
		String iBridgeSignDrivePassword = pro.getProperty("passwordSignDrivePassword");
		return iBridgeSignDrivePassword;
	}

	// Get SignDrive Client Name
	public String getiBridgeClientname() {
		return pro.getProperty("ClientName");
	}

	// Get SignDrive Pending CTC Upload Status Message
	public String getPendingCTCUploadStatusMsg() {
		return pro.getProperty("pendingCTCUploadStatusMsg");
	}

	// Get SignDrive Pending CTC Upload Status Message
	public String getPendingCandidateSignatureStatusMsg() {
		return pro.getProperty("getPendingCandidateSignatureStatusMsg");
	}
	
	// Verify Cron Hit Message
	public String getHitCronStatus()
	{
		return pro.getProperty("pendingReviewToday");
	}
	
	// Verify Complete Status
	public String getCompleteStatus()
	{
		return pro.getProperty("completedtoday");
	}
	
	// Verify Reject Offer Letter by Candidate
	public String getrejectOfferLetter()
	{
		return pro.getProperty("OfferRejectedCandidateToday");
	}
	// Get SignDrive Email details
	public String getemail() {
		return pro.getProperty("email");
	}
	
	public String getGmailUrl()
	{
		return pro.getProperty("Gmailurl");
	}

	public String getGmailUserName() {
		return pro.getProperty("GmailUsername");
	}

	public String getGmailpassword() {
		return pro.getProperty("GmailPassword");
	}
	
	// Cron url
	public String getCronUrl()
	{
		return pro.getProperty("CronUrl");
	}

	//BGV Url
	public String getbgvUrl()
	{
		return pro.getProperty("BgvUrl");
	}
	
}
