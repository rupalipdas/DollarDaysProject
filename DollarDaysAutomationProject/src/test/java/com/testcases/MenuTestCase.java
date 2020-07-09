package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.DDsMenuPage;
import com.reusablefunctions.SeleniumUtility;

public class MenuTestCase extends Library{
	
	DDsMenuPage DDM;
	
	@BeforeClass
	public void setup() throws IOException{
		launchApplication();

}
	@Test
	public void Menu() {
		DDM = new DDsMenuPage(driver);
		DDM.menubutton();
		DDM.springsp();
		DDM.menubutton();
		DDM.familyas();
		DDM.menubutton();
		DDM.MadeInTheUSA();
		DDM.menubutton();
		
	}
	
	@AfterClass
	public void teardown() throws IOException{
		SeleniumUtility utility = new SeleniumUtility(driver);
		utility.to_take_screenshot("src/test/resources/Screenshots/Menu_1.png");
		utility.getTitle();
		quit();
}
}

