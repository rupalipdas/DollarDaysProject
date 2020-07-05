package com.dollardays.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dollardays.commonutilities.BaseTest;
import com.dollardays.weblocators.CreateAccountPage;


	public class CreateAccountScript extends BaseTest{
		private CreateAccountPage createAccountPage=null;	

		@BeforeMethod
		public void setup() throws IOException {
			//BasePage.Page_Load_Timeout=30;
			initialization();
			createAccountPage = new CreateAccountPage(driver);

		}

		@Test()
		public void Tc_01_ClickSignUpButton() throws InterruptedException
		{
			createAccountPage.clickSignInButton();
			createAccountPage.clickCreateAccount();
			createAccountPage.sendSignUpInfomration();
			
			

		}	
}
