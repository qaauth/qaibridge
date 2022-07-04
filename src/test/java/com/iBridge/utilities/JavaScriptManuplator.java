package com.iBridge.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptManuplator {

	// Generic Method for DropDown values of Candidate Details
	public static void selectOptionFromDropDown(WebElement element, String value) {
		Select dropDown = new Select(element);
		List<WebElement> allOptions = dropDown.getOptions();
		for (WebElement option : allOptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

	// Generic Method for Explicit Wait
	public static WebElement waitForElementPresent(WebDriver ldriver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(ldriver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return ldriver.findElement(locator);
	}

	// Generic Method for JavaExecutor
	public static void javaScriptExecutor(WebElement element, String value, WebDriver ldriver) {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js = (JavascriptExecutor) ldriver;
		js.executeScript(value, element);
	}

	public static void waitForElementPresent(WebDriver ldriver, WebElement selectClientName, int timeout) {

	}

	/**
	 * @author sapna.chaudhary
	 * 
	 *         File uploading
	 * @param path
	 *//*
		 * 
		 * public static void fileUpload(String path) { try { StringSelection sel = new
		 * StringSelection(path); Clipboard clipboard =
		 * Toolkit.getDefaultToolkit().getSystemClipboard(); clipboard.setContents(sel,
		 * null);
		 * 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_DOWN);
		 * robot.keyRelease(KeyEvent.VK_DOWN); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * } catch (Exception e) { System.out.println("issue in getreaddata" + e); }
		 * 
		 * }
		 */
}
