package com.dollardays.weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	@FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
	private WebElement signInButton;
	@FindBy(xpath = "//a[contains(text(),'Create account')]")
	private WebElement createAccount;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtFName']")
	private WebElement userFirstNameTextField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtLName']")
	private WebElement userLastNameTextField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtClientEmail']")
	private WebElement userEmailTextField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtPhoneMain']")
	private WebElement userPhoneTextField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtPassword']")
	private WebElement userPasswordField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtPasswordConfirm']")
	private WebElement userConfirmPasswordField;
	@FindBy(xpath = "//input[@id='ctl00_cphContent_btnRegister']")
	private WebElement userSignUpButton;
	
	
	
	
	
	public CreateAccountPage(WebDriver driver) {
		// super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignInButton() {

		signInButton.click();
	}

	public void clickCreateAccount() {

		createAccount.click();
	}
	public void sendSignUpInfomration() {

		userFirstNameTextField.sendKeys("abc");
		userLastNameTextField.sendKeys("abcLast");
		userEmailTextField.sendKeys("dummy@gmail.com");
		userPhoneTextField.sendKeys("9999999999");
		userPasswordField.sendKeys("dummypassword");
		userConfirmPasswordField.sendKeys("dummypassword");
	}
	public void clickSignUpButton() {

		//userSignUpButton.click();
	}
}
