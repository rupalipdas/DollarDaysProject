package com.reusablefunctions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.google.common.io.Files;


public class SeleniumUtility extends Library{
	
	WebDriver driver;	
	public SeleniumUtility(WebDriver driver) {
		this.driver=driver;
		
	}
	public void to_take_screenshot(String path) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(path));
	}
	
	public void getTitle() {
		
		System.out.println(driver.getTitle());
	
	}
	public void Explicitlywait(String Locator) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
	}
	public void quit() {
		driver.close();
		
	}



}