package com.orangehrm.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.pom.Homeorangehrm;
import com.orangehrm.pom.Orangehrmlogin;


public class Base {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
	}
	public static WebDriver driver;
	public static FileLib f=new FileLib();
	@BeforeClass
	@Parameters("browser")
	public static void openBrowser(@Optional("abc") String browser) throws IOException
	{
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(FileLib.getPropertyValue("url"));
	}
	@BeforeMethod
	public static void loginTOApplication() throws IOException
	{
		Orangehrmlogin o=new Orangehrmlogin(driver);
		o.getUsername();
		o.getpassword();
		o.setUsername(FileLib.getPropertyValue("username"));
		o.setPassword(FileLib.getPropertyValue("password"));
		o.setLoginBTN();
	}
	@AfterMethod
	public static void logoutFromApplication()
	{
		Homeorangehrm h=new Homeorangehrm(driver);
		h.setwelcome();
		h.setlogout();
	}
	@AfterClass
	public static void closeBrowser() throws IOException 
	{
//		String name=result.getTestName();
//		int i=result.getStatus();
//		if(i==1)
//		{
//			
//		}
//		else
//		{
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File src=ts.getScreenshotAs(OutputType.FILE);
//			File des=new File("./Errorimage"+name+".png");
//			FileUtils.copyFile(src, des);
//		}
		driver.close();
	}
}
