package com.babaTest.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.babaTest.testCases.BabaBaseLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.testingbaba.com/newdemo.html");
		
		driver.findElement(By.xpath("//*[@data-target=\"#elements\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='text box']")).click();
		
	}
}
