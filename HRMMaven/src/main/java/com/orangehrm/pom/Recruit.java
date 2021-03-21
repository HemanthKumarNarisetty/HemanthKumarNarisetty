package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruit {

	@FindBy(xpath="//a[text()='Candidates']")
	private WebElement candidate;
	
	public Recruit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setcandidate()
	{
		candidate.click();
	}
}
