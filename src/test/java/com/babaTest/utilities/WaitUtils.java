package com.babaTest.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.babaTest.testCases.BabaBaseLibrary;

public class WaitUtils extends BabaBaseLibrary {

	static WebDriverWait wait;

	public static void staleElementHandle(WebElement ele) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(xpath)));

		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
