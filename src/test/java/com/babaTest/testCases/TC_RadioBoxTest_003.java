package com.babaTest.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.babaTest.pageObjects.CheckBoxPage;
import com.babaTest.pageObjects.RadioButtonPage;

public class TC_RadioBoxTest_003 extends BabaBaseLibrary {

	RadioButtonPage rd;

	@BeforeClass
	public void getElementSetUp() throws InterruptedException {

		rd = new RadioButtonPage();
		logger.info("object created");
		rd.clickElement();
		logger.info("Clicked Element");
		rd.clickRadio();
		logger.info("Clicked Radio");
	}

	@Test

	public void checkRadioPage() {

		rd.clickRadioYes();
		logger.info("Clicked on Yes");

		Assert.assertTrue(rd.isYesSelected());
		logger.info("Yes Selected");

		rd.clickRadioImp();
		logger.info("Clicked on Impressive");

		Assert.assertTrue(rd.isImpSelected());
		logger.info("Impressive Selected");

		rd.clickRadioNo();
		logger.info("Clicked on NO");

		Assert.assertTrue(rd.isNoSelected());
		logger.info("No Selected");
		
			

	}
}
