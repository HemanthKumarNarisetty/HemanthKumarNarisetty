package com.orangehrm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Priority {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public WebDriver driver;
	@Test(priority=1)
	public void b_method()
	{
		driver=new ChromeDriver();
	}
	@Test(priority=2)
	public void a_method()
	{
		driver.get("http://www.google.com");
	}
	@Test(priority=3)
	public void c_method()
	{
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook",Keys.ENTER);
	}
	@Test(priority=4)
	public void d_method()
	{
		//driver.findElement(By.xpath(".//*[@value='Search']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title.contains("Facebook - Google Search"),true);
		Reporter.log(title,true);
	}
}
