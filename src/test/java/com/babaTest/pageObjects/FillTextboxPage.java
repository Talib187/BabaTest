package com.babaTest.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.babaTest.testCases.BabaBaseLibrary;

public class FillTextboxPage extends BabaBaseLibrary {

	public FillTextboxPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	@CacheLookup
	WebElement btnElement;

	@FindBy(xpath = "//*[@href=\"#tab_1\"]")
	@CacheLookup
	WebElement btnTextbox;

	@FindBy(id = "fullname1")
	@CacheLookup
	WebElement txtFullName;

	@FindBy(id = "fullemail1")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "fulladdresh1")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(id = "paddresh1")
	@CacheLookup
	WebElement txtPAdd;

	@FindBy(xpath = "//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label[2]")
	@CacheLookup
	WebElement enteredName;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label[4]")
	@CacheLookup
	WebElement enteredEmail;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label[6]")
	@CacheLookup
	WebElement enteredCurrAdd;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label[8]")
	@CacheLookup
	WebElement enteredPAdd;

	public void clickElement() {

		btnElement.click();
	}

	public void clickTextbox() {

		btnTextbox.click();

	}

	public void enterName(String name) {

		txtFullName.sendKeys(name);
	}

	public void enterEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void enterAddress(String address) {

		txtAddress.sendKeys(address);
	}

	public void enterPadd(String Padd) {

		txtPAdd.sendKeys(Padd);
	}

	public void clickSubmit() {

		btnSubmit.click();
	}

	public String getName() {

		String savedName = enteredName.getText();

		return savedName;
	}
	
	public String getEmail() {

		String savedEmail = enteredEmail.getText();

		return savedEmail;
	}
	
	public String getCurrAddressl() {

		String savedCurrAddress = enteredCurrAdd.getText();

		return savedCurrAddress;
	}

	public String getPerAddressl() {

		String savedPerAddress = enteredPAdd.getText();

		return savedPerAddress;
	}
	

	public void clearTextbox() {

		txtFullName.clear();
		txtEmail.clear();
		txtAddress.clear();
		txtPAdd.clear();
	}

}
