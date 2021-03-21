package com.orangehrm.generic;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest extends Base implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			FileLib.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
