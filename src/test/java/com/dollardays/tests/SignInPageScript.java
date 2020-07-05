package com.dollardays.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dollardays.commonutilities.BaseTest;
import com.dollardays.weblocators.SignInPage;

public class SignInPageScript extends BaseTest{
	private SignInPage signInPage=null;	

	@BeforeMethod
	public void setup() throws IOException {
		//BasePage.Page_Load_Timeout=30;
		initialization();
		signInPage = new SignInPage(driver);

	}

	@Test()
	public void Tc_01_SignInPage() throws InterruptedException
	{
		
		signInPage.clickSignInButton();
		signInPage.clickSignInnerLink();
		Thread.sleep(3000);
		signInPage.sendUserNamePassword();
		signInPage.clickSigninActionButton();
		
		
		

	}	
	//@AfterTest
//	public void terminateBrowser() throws InterruptedException {
//		Thread.sleep(3000);
//		termination();
//
//	}
}
