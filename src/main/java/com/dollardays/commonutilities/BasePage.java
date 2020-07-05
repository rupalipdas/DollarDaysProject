package com.dollardays.commonutilities;

public class BasePage extends BaseTest {
	
	public static final int Page_Load_Timeout=20;
	
	public static final int Implicit_Wait=10;
			
	public String verifyHomeTitle() {
		System.out.println("VerifyHomeTitle method executed");
		String abc = driver.getTitle();
		System.out.println(abc);
		return abc;

	}

	public String verifyHomeUrl() {
		System.out.println("VerifyHomeUrl method executed");
		String abc = driver.getCurrentUrl();
		System.out.println(abc);
		return abc;

	}

	public void verifyHomeSource() {
		System.out.println("VerifyHomeTitle method executed");
		String abc = driver.getPageSource();
		System.out.println(abc);
	}
	
	
	
	
	
}