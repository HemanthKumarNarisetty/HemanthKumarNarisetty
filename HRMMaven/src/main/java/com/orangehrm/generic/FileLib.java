package com.orangehrm.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class FileLib extends Base{

	public static String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	public static String getExcelvalue(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/input.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
	public static File getScreenShot(String screenshot) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//String dest=System.getProperty("HRMMaven")+"/Errorimage/"+screenshot+".png";
		File des= new File("./Errorimage/"+screenshot+".png");
		FileUtils.copyFile(src, des);
		return des;
		
	}
}
