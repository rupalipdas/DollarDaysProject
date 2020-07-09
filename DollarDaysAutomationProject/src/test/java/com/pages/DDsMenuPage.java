package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DDsMenuPage {
	
	WebDriver driver;
	
	@FindBy(id="sm_menu_ham")
	WebElement Menubutton;
	
	@FindBy(xpath="//a[contains(text(),'Spring & Summer Shop')]")
	WebElement springsummershop;
	
	@FindBy(xpath="//a[contains(text(),'Family Activity Shop')]")
	WebElement familyactivityshop;
	
	@FindBy(xpath="//a[contains(text(),'Made in the USA')]")
	WebElement madeintheusa;
	
	public DDsMenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void menubutton() {
		Menubutton.click();
	}
	public void springsp() {
		springsummershop.click();
		}
	public void familyas() {
		familyactivityshop.click();
	}
	public void MadeInTheUSA() {
		madeintheusa.click();

}
}
