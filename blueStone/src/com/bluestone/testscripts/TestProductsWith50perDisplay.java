package com.bluestone.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bluestone.generics.BaseClass;
import com.bluestone.generics.WebDriverCommonLib;
import com.bluestone.pom.Flat20offer;
import com.bluestone.pom.OnlineJewelleryShoppingStore;

public class TestProductsWith50perDisplay extends BaseClass{
	
	@Test()
	public void testProducts() throws IOException, InterruptedException
	{
		OnlineJewelleryShoppingStore on=new OnlineJewelleryShoppingStore(driver);
		on.getOffers();
		on.getMakingcharge();
		Flat20offer fi=new Flat20offer(driver);
		WebDriverCommonLib wc=new WebDriverCommonLib();
		wc.waitForElementIntGui(driver);
		fi.getText();
	}
}

