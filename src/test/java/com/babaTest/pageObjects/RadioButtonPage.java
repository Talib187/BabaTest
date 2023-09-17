package com.babaTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.babaTest.testCases.BabaBaseLibrary;

public class RadioButtonPage extends BabaBaseLibrary {

	public RadioButtonPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	@CacheLookup
	WebElement btnElement;

	@FindBy(xpath = "//*[text()='radio buttons']")
	@CacheLookup
	WebElement radiobtn;

	@FindBy(xpath = "//*[@value=\"yes\"]")
	@CacheLookup
	WebElement btnRadioYes;

	@FindBy(xpath = "//*[@value=\"impressive\"]")
	@CacheLookup
	WebElement btnRadioimp;

	@FindBy(xpath = "//*[@value=\"no\"]")
	@CacheLookup
	WebElement btnRadioNo;

	public void clickElement() {

		btnElement.click();
	}

	public void clickRadio() {

		radiobtn.click();
	}

	public void clickRadioYes() {

		btnRadioYes.click();
	}

	public void clickRadioImp() {

		btnRadioimp.click();
	}

	public void clickRadioNo() {

		btnRadioNo.click();
	}

	public boolean isYesSelected() {

		boolean isRadioSelected = btnRadioYes.isSelected();

		return isRadioSelected;
	}
	
	public boolean isImpSelected() {

		boolean isImpSelected = btnRadioimp.isSelected();

		return isImpSelected;
	}
	
	public boolean isNoSelected() {

		boolean isNoSelected = btnRadioNo.isSelected();

		return isNoSelected;
	}
}
