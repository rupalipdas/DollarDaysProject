package com.dollardays.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dollardays.commonutilities.BasePage;
import com.dollardays.commonutilities.BaseTest;

public class HomePageScript extends BaseTest {

	public BasePage home ;

	@BeforeMethod
	public void setup() throws IOException {
		//BasePage.Page_Load_Timeout=30;
		initialization();
		  home = new BasePage();

	}

	@Test
	public void verifyhomepage1Url() {

		String Acttitle = "https://www.dollardays.com/";
		String Exptitle = home.verifyHomeUrl();
		Assert.assertEquals(Exptitle, Acttitle);
	}

	@AfterTest
	public void terminateBrowser() throws InterruptedException {
		Thread.sleep(3000);

		termination();

	}

}
