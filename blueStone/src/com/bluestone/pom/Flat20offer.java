package com.bluestone.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bluestone.generics.FileLib;

public class Flat20offer {

	@FindBy(xpath="//span[contains(text(),'50% off on making charge')]")
	private WebElement makingcharge;
	
	@FindBy(xpath="//span[contains(text(),'50% off on making charge')]")
	private List<WebElement> text;

	@FindBy(xpath="(//img[@class='hc img-responsive center-block'])[1]")
	private WebElement viewDetails;
	
	public Flat20offer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void getMakingcharge() {
		makingcharge.click();
	}
	
	public void getText() {
		 for(WebElement e:text)
		 {
			String s1=e.getText();
			System.out.println(s1);
			 Assert.assertEquals(s1, "text1");
		 }
	}

	public void setText(List<WebElement> text) {
		this.text = text;
	}

	public void getViewDetails() {
		viewDetails.click();
	}
}
