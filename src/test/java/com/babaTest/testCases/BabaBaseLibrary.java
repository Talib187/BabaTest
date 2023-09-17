package com.babaTest.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.babaTest.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BabaBaseLibrary {

	public static WebDriver driver;
	public static org.apache.log4j.Logger logger;

	ReadConfig readConfig;
	
	@BeforeClass
	public void setUp() {

		logger = org.apache.log4j.Logger.getLogger("testingbaba");
		PropertyConfigurator
				.configure("C:\\Users\\mtali\\eclipse-workspace\\BabaTest\\Configuration\\log4j.properties");

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		driver = new ChromeDriver();
		logger.info("Driver initiated");
	//	driver.get("https://www.testingbaba.com/newdemo.html");
		driver.get(readConfig.getURL());
		logger.info("URL opened");
		// driver.manage().window().maximize();

		/*
		 * driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
		 * logger.info("Clicked on cross");
		 * driver.findElement(By.xpath("//a[@class='kbt'][normalize-space()='Practice']"
		 * )).click(); logger.info("Clicked on Practice");
		 */
	}

	@AfterClass
	public void tearDown() {

	//	driver.quit();
	}
}
