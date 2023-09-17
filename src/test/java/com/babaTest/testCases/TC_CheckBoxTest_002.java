package com.babaTest.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.babaTest.pageObjects.CheckBoxPage;
import com.babaTest.pageObjects.FillTextboxPage;

public class TC_CheckBoxTest_002 extends BabaBaseLibrary {

	CheckBoxPage ch;

	@BeforeClass
	public void getElementSetUp() throws InterruptedException {

		ch = new CheckBoxPage();
		logger.info("object created");
		ch.clickElement();
		logger.info("Clicked Element");
		ch.clickCheckBox();
		logger.info("Clicked Checkbox");
	}

	@Test

	public void checkBoxes() {

		ch.changeFrame();
		logger.info("Entered in frame");
		ch.clickCheckMobile();
		logger.info("Mobile checked");
		ch.clickCheckLaptop();
		logger.info("Laptop checked");
		ch.clickCheckDesktop();
		logger.info("Desktop checked");

		Assert.assertTrue(ch.isMobileSelected(), "Mobile should be selected");
		Assert.assertTrue(ch.isLaptopSelected(), "Laptop should be selected");
		Assert.assertTrue(ch.isDesktopSelected(), "Desktop should be selected");

		ch.defaultFrame();

		logger.info("Switch to default frame");

	}

}
