package com.babaTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.babaTest.testCases.BabaBaseLibrary;

public class CheckBoxPage extends BabaBaseLibrary {

	public CheckBoxPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	@CacheLookup
	WebElement btnElement;

	@FindBy(xpath = "//a[@href=\"#tab_2\"]")
	@CacheLookup
	WebElement btnCheckboxt;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	@CacheLookup
	WebElement checkboxFrame;

	@FindBy(xpath ="//*[@id=\"myCheck\"]")
	@CacheLookup
	WebElement checkMobile;

	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	@CacheLookup
	WebElement checkLaptop;

	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	@CacheLookup
	WebElement checkDesktop;

	public void clickElement() {

		btnElement.click();
	}

	public void clickCheckBox() {

		btnCheckboxt.click();
	}

	public void changeFrame() {

		driver.switchTo().frame(checkboxFrame);
	}

	public void defaultFrame() {

		driver.switchTo().defaultContent();
	}

	public void clickCheckMobile() {

		checkMobile.click();
	}

	public void clickCheckLaptop() {

		checkLaptop.click();
	}

	public void clickCheckDesktop() {

		checkDesktop.click();
	}

	public boolean isMobileSelected() {

		return checkMobile.isSelected();
	}

	public boolean isLaptopSelected() {

		return checkLaptop.isSelected();
	}

	public boolean isDesktopSelected() {

		return checkDesktop.isSelected();
	}

}
