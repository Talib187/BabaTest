package com.babaTest.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.babaTest.pageObjects.WebTablePage;
import com.babaTest.utilities.XLUtils;

public class TC_WebTableTest_004 extends BabaBaseLibrary {

	WebTablePage wb;

	@BeforeClass

	public void getElementSetUp() throws InterruptedException {

		wb = new WebTablePage();
		logger.info("object created");
		wb.clickElement();
		logger.info("Clicked Element");
		wb.clickWebTable();
		logger.info("Clicked Web Table");
		wb.changeFrame();
		logger.info("Entered in frame");
	}

	@DataProvider(name = "WebTableData")

	String[][] getdata() throws IOException {

		String path = "C:\\Users\\mtali\\eclipse-workspace\\BabaTest\\src\\main\\resources\\webtable.xlsx";

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

	@Test(dataProvider = "WebTableData", priority = 1)

	public void checkWebTablePage(String name, String email) throws InterruptedException {

		wb.enterName(name);
		logger.info("Entered Name");
		wb.enterEmail(email);
		logger.info("Entered email");
		wb.clickSave();
		logger.info("clicked on save");

		Thread.sleep(100);
	}

	@Test(priority = 2, enabled = true)
	public void getPrint() {

		// List<WebElement> tables =
		// driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td"));

		logger.info("Printing the data from the table");

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 2; j++) {

				System.out.println(driver
						.findElement(By.xpath("/html/body/div/table/tbody/tr[" + i + "]/td[" + j + "]")).getText());
			}
		}
	}

	@Test(priority = 2)
	public void checkEdit() {

		wb.clickEdit();

	}

	@Test(priority = 3)
	public void checkDelete() {
		wb.clickDelete();

	}

}
