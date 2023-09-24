package com.babaTest.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.babaTest.testCases.BabaBaseLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		

		String dir = System.getProperty("user.dir")+"\\src\\main\\resources"+"\\webtable.xlsx";
		
		String dir1 = "C:\\Users\\mtali\\eclipse-workspace\\BabaTest\\src\\main\\resources\\webtable.xlsx";
		System.out.println(dir);
		
		boolean result = dir.equalsIgnoreCase(dir1);
		
		if(result==true) {
			
			System.out.println("Equals");
		}
	}
}
