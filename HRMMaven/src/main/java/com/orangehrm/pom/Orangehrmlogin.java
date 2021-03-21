package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrmlogin {

	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement loginBTN;
	
	public Orangehrmlogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getUsername()
	{
		username.clear();
	}

	public void getpassword()
	{
		password.clear();
	}
	public void setUsername(String s) {
		 username.sendKeys(s);
	}

	public void setPassword(String s) {
		 password.sendKeys(s);
	}

	public void setLoginBTN() {
		 loginBTN.click();
	}
}
