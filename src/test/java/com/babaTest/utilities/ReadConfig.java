package com.babaTest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		try {

			File src = new File("./Configuration\\config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println("Issue in cofig file");
		}

	}

	public String getURL() {

		String url = prop.getProperty("baseUrl");

		return url;
	}
	
	public static void main(String[] args) {
		
		ReadConfig obj = new ReadConfig();
		System.out.println(obj.getURL());
	}
}