package com.babaTest.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.babaTest.pageObjects.FillTextboxPage;
import com.babaTest.utilities.XLUtils;

public class TC_FillTextboxTest_001 extends BabaBaseLibrary {

	@DataProvider(name = "EmployeeData")
	String[][] getdata() throws IOException {

		String path = "C:\\Users\\mtali\\eclipse-workspace\\BabaTest\\src\\main\\resources\\test data.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);

		String[][] logindata = new String[rownum][colnum];

		for (int i = 1; i <= rownum; i++) {

			for (int j = 0; j < colnum; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;

	}

	@BeforeTest
	public void executingBeforeTest() {

		System.out.println("Testing the Before Test method");
	}

	FillTextboxPage ftxt;

	@BeforeClass
	public void getElementSetUp() throws InterruptedException {

		ftxt = new FillTextboxPage();
		logger.info("object created");
		ftxt.clickElement();
		logger.info("Clicked Element");
		ftxt.clickTextbox();
		logger.info("Clicked textbox");
	}

	@Test(dataProvider = "EmployeeData")
	public void FillTextBoxForm(String name, String email, String currentadd, String Padd) {

		ftxt.enterName(name);
		logger.info("Entered name");
		ftxt.enterEmail(email);
		logger.info("Entered email");
		ftxt.enterAddress(currentadd);
		logger.info("Entered current address");
		ftxt.enterPadd(Padd);
		logger.info("Entered permanent address");
		ftxt.clickSubmit();
		logger.info("Clicked on submit");

		System.out.print("Entered value is: " + name + "\t" + email + "\t" + currentadd + "\t" + Padd);

		System.out.println();
		logger.info("Verifying the saved data");

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(name, ftxt.getName()); // verifying that if entered value is same
		softAssert.assertEquals(email, ftxt.getEmail());
		softAssert.assertEquals(currentadd, ftxt.getCurrAddressl());
		softAssert.assertEquals(Padd, ftxt.getPerAddressl());

		logger.info("Verified the saved data");

		logger.info("Clearing textboxes");

		ftxt.clearTextbox();

		logger.info("Textbox cleared");

		softAssert.assertAll();

	}

}

/*
 * In this particual exmaple we have also used the @beforeClass annotation here
 * to: In this example: first before class of the base class will be executed
 * and If we need any thing that needs to be run before the @test we can also
 * specify another @BeforeClass in the test class also.
 */
