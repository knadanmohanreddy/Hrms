package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginFun extends TestBase{
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement usr;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement btn;
	
	public LoginFun(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage valid() {
		
		usr.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		btn.click();
		
		return new HomePage();
	}


}
