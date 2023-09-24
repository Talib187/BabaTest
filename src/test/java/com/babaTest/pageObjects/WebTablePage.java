package com.babaTest.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.babaTest.testCases.BabaBaseLibrary;
import com.babaTest.utilities.WaitUtils;

public class WebTablePage extends BabaBaseLibrary {

	public WebTablePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	@CacheLookup
	WebElement btnElement;

	@FindBy(xpath = "//*[@href=\"#tab_4\"]")
	@CacheLookup
	WebElement btnWebTable;

	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	@CacheLookup
	WebElement frame;

	@FindBy(xpath = "//*[text()='Name:']/following::input[@name='name']")
	@CacheLookup
	WebElement txtName;

	@FindBy(xpath = "//*[text()='Name:']/following::input[@name='email']")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	@CacheLookup
	WebElement btnSave;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[3]/button[1]")
	@CacheLookup
	List<WebElement> btnEdit;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[3]/button[4]")
	@CacheLookup
	List<WebElement> btnDelet;

	public void clickElement() {

		btnElement.click();
	}

	public void clickWebTable() {

		btnWebTable.click();
	}

	public void changeFrame() {

		driver.switchTo().frame(frame);
	}

	public void enterName(String name) {

		// txtName.sendKeys(name);
		WaitUtils.staleElementHandle(txtName);
		txtName.sendKeys(name);
	}

	public void enterEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void clickSave() {

		btnSave.click();
	}

	public void clickEdit() {

		int count = 1;
		for (WebElement ele : btnEdit) {

			logger.info("Clicked on edit button: " + count + " times");
			ele.click();
			count++;
		}
	}

	public void clickDelete() {

		int count = 1;
		for (WebElement ele : btnDelet) {
			logger.info(count + " record deleted");
			ele.click();
			count++;
		}
	}
}
