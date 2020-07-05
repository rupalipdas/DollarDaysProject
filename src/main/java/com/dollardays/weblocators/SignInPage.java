package com.dollardays.weblocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	@FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
	private WebElement signInButton;

	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	private WebElement signInnerlink;

	@FindBy(xpath = "//input[@id='inputLoginUsername']")
	private WebElement userNameTextBox;

	@FindBy(xpath = "//input[@id='inputLoginPassword']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//button[@class='btn']")
	private WebElement signinButtonClick;

	public SignInPage(WebDriver driver) {
		// super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickSignInButton() {

		signInButton.click();
	}

	public void clickSignInnerLink() {

		signInnerlink.click();
	}

	public void sendUserNamePassword() {

		userNameTextBox.sendKeys("dollardaysproject@gmail.com");
		passwordTextBox.sendKeys("seleniumproj");
	}

	public void clickSigninActionButton() {

		signinButtonClick.click();
	}

}
