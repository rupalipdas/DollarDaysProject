package com.dollardays.commonutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	//launchApp
	//Instantiate web driver
	//closeApp
	
	private static WebDriver driver;



	public static WebDriver getWebDriver() {
		if (BaseTest.driver == null) {
			BaseTest.driver = new ChromeDriver();
		}
		return BaseTest.driver;
	}
}
