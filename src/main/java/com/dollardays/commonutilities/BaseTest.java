package com.dollardays.commonutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;

	
	public Properties ReadPropertyFile() throws IOException {
		FileInputStream ip;
		prop = new Properties();

		ip = new FileInputStream("config.properties");
		prop.load(ip);
		return prop;
	}

	public void initialization() throws IOException {

		prop = ReadPropertyFile();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		String baseUrl = prop.getProperty("url");

		driver.get(baseUrl);
		

		driver.manage().timeouts().pageLoadTimeout(BasePage.Page_Load_Timeout, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(BasePage.Implicit_Wait, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
	}

	public void termination() {
		driver.close();
	}

}
