package com.iBridge.sme.pageobject;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateEmailVeificationSme {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public CandidateEmailVeificationSme(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	// Candidate Email Verification
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[5]/div/div/div/table/tbody/tr/td[4]/a")
	@CacheLookup
	WebElement verifyBackgroundCheckforMotherDairyFruit;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[5]/div/div/div/table/tbody/tr/td[4]/a")
	@CacheLookup
	WebElement clickBackgroundCheckforMotherDairyFruit;

	@FindBy(tagName = "tagName")
	@CacheLookup
	WebElement clickOnIframe;

	// Action Methods for the Mailinator
	public String verifyMailinatorSmeMailSubject() {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(verifyBackgroundCheckforMotherDairyFruit));
		return verifyBackgroundCheckforMotherDairyFruit.getText();
	}

	public void mailinatorVerificationMailSme() throws InterruptedException {
		wait = new WebDriverWait(ldriver, 120);
		wait.until(ExpectedConditions.visibilityOf(clickBackgroundCheckforMotherDairyFruit));
		clickBackgroundCheckforMotherDairyFruit.click();
		Thread.sleep(1000);
	}

	public void getUserNameAndPasswordSme() {

		ldriver.switchTo().frame(ldriver.findElement(By.tagName("iframe")));

		List<WebElement> lst = ldriver.findElements(By.tagName("p"));
		String[] usernameAndPassword = new String[2];

		for (int i = 0; i < lst.size(); i++) {
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].scrollIntoView(true);", ((WebElement) lst.get(i)));
			if (lst.get(i).getText().contains("USER")) {
				usernameAndPassword[0] = lst.get(i).getText();
				usernameAndPassword[1] = lst.get(i + 2).getText();
				System.out.print(usernameAndPassword);
				try {

					File output = new File("candidateUserPassSme.txt");
					FileWriter writer = new FileWriter(output);

					writer.write(lst.get(i).getText() + " " + lst.get(i + 2).getText());
					writer.flush();
					writer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}
