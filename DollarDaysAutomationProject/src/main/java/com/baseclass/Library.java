package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	
	protected WebDriver driver;
	public static Properties prop;
	Logger log = LogManager.getLogger(Library.class);
	public void launchApplication()throws IOException {
		//Logger logger = LogManager.getLogger(Library.class.getName());
		FileInputStream file=new FileInputStream("src/test/resources/Configuration/config.properties"); 
	
	prop=new Properties();
	prop.load(file);
	//Logger.info("Property file is loaded");
	String browser = prop.getProperty("browser");
	String url = prop.getProperty("url");
		try {
			if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				
			}else if(browser.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup(); 
				driver=new ChromeDriver();
				log.info("chrome Browser is launched "); 
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
			
		}catch(WebDriverException e) {
			System.out.println("browser could not be launched");
		}
			}
			
		public void quit() {
				driver.close();
				
			}


}
