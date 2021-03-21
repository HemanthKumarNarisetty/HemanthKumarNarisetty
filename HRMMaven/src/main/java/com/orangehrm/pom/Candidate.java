package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Candidate {

	
	@FindBy(id="btnAdd")
	private WebElement add;
	@FindBy(xpath="//input[@name='addCandidate[firstName]']")
	private WebElement first_name;
	@FindBy(name="addCandidate[middleName]")
	private WebElement middle_name;
	@FindBy(name="addCandidate[lastName]")
	private WebElement last_name;
	@FindBy(xpath="//input[@id='addCandidate_email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='addCandidate_contactNo']")
	private WebElement contact;
	@FindBy(xpath="//select[@id='addCandidate_vacancy']")
	private WebElement jobvacancy;
	@FindBy(xpath="//input[@type='file']")
	private WebElement choosefile;
	@FindBy(xpath="//input[@id='addCandidate_appliedDate']")
	private WebElement date;
	@FindBy(xpath="//input[@id='candidateSearch_fromDate']")
	private WebElement from;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement month;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement year;
	@FindBy(xpath="//a[text()='19']")
	private WebElement dayno;
	@FindBy(id="btnSave")
	private WebElement saveBTN;
	
	
	public Candidate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setadd()
	{
		add.click();
	}

	public void getFirst_name(String s) {
		first_name.sendKeys(s);
	}

	public void getMiddle_name(String s) {
		middle_name.sendKeys(s);
	}

	public void getLast_name(String s) {
		last_name.sendKeys(s);
	}

	public void getEmail(String s) {
		email.sendKeys(s);
	}

	public void getContact(String s) {
		contact.sendKeys(s);
	}

	public void getJobvacancy() {
		jobvacancy.click();
	}
	public void getSelectClass(String s1)
	{
		Select s=new Select(jobvacancy);
		s.getOptions();
		s.selectByVisibleText(s1);
	}
	public void getFile()
	{
		
		choosefile.sendKeys("C:/Users/Lenovo/Downloads/Hemanth_Experience.pdf");
	}
	public void setDate()
	{
		date.click();
	}
	public void setMonth()
	{
		month.click();
		Select s=new Select(month);
		s.selectByVisibleText("Feb");
	}
	public void setYear()
	{
		year.click();
		Select s=new Select(year);
		s.selectByVisibleText("2019");
	}
	public void setSaveBTN()
	{
		saveBTN.click();
	}
	public void setdayno()
	{
		dayno.click();
	}
	
	
}
