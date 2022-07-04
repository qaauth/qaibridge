package com.iBridge.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.iBridge.utilities.ReadConfig;

public class BaseClass {
	// Create ReadConfig class object
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplication();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();

	// iBridge Candidate Login Details
	public String baseUrl = readconfig.getCandidateApplication();
	public String userId = readconfig.getCandidateUserId();
	public String candidatePassword = readconfig.getCandidatePassword();

	// iBridge Candidate Login Details
	public String bridgeUrl = readconfig.getBridgeApplication();
	public String bridgeUsername = readconfig.getBridgeCandidateUsername();
	public String bridgePassword = readconfig.getBridgeCandidatePassword();

	// Bridge Login Details
	public String bridgeURL = readconfig.getBridgeApp();
	public String bridgeEmail = readconfig.getBridgeUsername();
	public String bridgeUserPassword = readconfig.getBridgePassword();
	public String catRoleUsername = readconfig.getSuperUserCatUsername();
	public String catRolePassword = readconfig.getSuperUserCatPassword();

	// SME Client Login Details
	public String usernameSme = readconfig.getUsernameSme();
	public String passwordSme = readconfig.getpasswordSme();

	// Enp Admin Prepaid Client
	public String EnpAdminURL = readconfig.getEnpAdminApplication();
	public String enpAdminUsername = readconfig.getEnpAdminUsername();
	public String enpAdminPassword = readconfig.getEnpAdminPassword();

	// Prepaid Candidate Client
	public String candidateUsername = readconfig.getPrepaidCandidateUsername();
	public String candidatePrePassword = readconfig.getPrepaidCandidatePassword();

	// iBridge Cat Login Details
	public String iBridgeCatUsername = readconfig.getiBridgeCatUsername();
	public String iBridgeCatPassword = readconfig.getiBridgeCatPassword();

	// SignDrive Canidate login url
	public String SignDrivebaseUrl = readconfig.getSignDriveApplication();
	public String iBridgeSignDriveUsername = readconfig.getiBridgeSignDriveUsername();
	public String iBridgeSignDrivePassword = readconfig.getiBridgeSignDrivePassword();

	// Gmail Login Url
	public String GmailUrl = readconfig.getGmailUrl();
	public String GmailUserNameSignDrive = readconfig.getemail();
	public String GmailPasswordSignDrive = readconfig.getGmailpassword();
	
	// Hit the Cron
	public String cronUrl = readconfig.getCronUrl();

	// BGV Url
	public String bgvUrl = readconfig.getbgvUrl();
	
	public static WebDriver driver;
	public static Logger logger;

	// Mailinator Base Url
	public String BASEURL = readconfig.getMailinatorBaseURL();

	// Route to candidate Mailinator Url Check
	public String mailinatorUrl = readconfig.getMailinatorMailUrl();

	// Prepaid Candidate Login Url
	public String candidatePrepaidUrl = readconfig.getPrepaidCandidateUrl();

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger = Logger.getLogger("iBridge"); // import right package Apache POI logger
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");
		// PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			// WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
			 driver = new ChromeDriver(new ChromeOptions().setHeadless(true));

		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
//			driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIePath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);// it is copy to TestCase_001
	}

//	@AfterClass
	public void tearDown() {
		driver.quit();
		// driver.close();
	}
	// If you want to catch failed test cases you will have to add "captureScreen"
	// method.

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
