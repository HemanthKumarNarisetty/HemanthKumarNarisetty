package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeorangehrm {

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	@FindBy(xpath="//b[text()='Recruitment']")
	private WebElement recuirment;

	
	public Homeorangehrm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setwelcome()
	{
		welcome.click();
	}
	public void setlogout()
	{
		logout.click();
	}
	public void setrecuirment(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(recuirment).perform();
	}

}
