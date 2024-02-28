package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageobjects.LoginFun;
import com.utils.ecx;

public class LoginTest extends TestBase{
	
	LoginFun lf;
	String sheetname = "Sheet1";

	public LoginTest() {

		super();
	}

	

	@BeforeMethod
	public void bm() throws Throwable  {

		lauch();

		lf = new LoginFun(driver);

	}

	@Test
	public void le() {

		lf.valid();
		String title = driver.getTitle();
}
}