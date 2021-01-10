package com.bluestone.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineJewelleryShoppingStore {

	@FindBy(xpath="//span[contains(text(),'Offers ')]")
	private WebElement offers;
	@FindBy(xpath="//span[text()='Flat 50% Making Charge off on Diamond Jewellery']")
	private WebElement makingcharge;
	
	public OnlineJewelleryShoppingStore(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getOffers() {
		offers.click();
	}

	public void getMakingcharge() {
		makingcharge.click();
	}
}
