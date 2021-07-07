package com.sapmle.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.FirstPage;

public class DataTest extends WebDriverTestCase{

	@Test()
	@QAFDataProvider(dataFile = "./resources/DataFile/DataTest.csv",sheetName = "DataTest",key = "TC_01")
	public void loginTest(Map<String,String>data)
	
	{
		String username=data.get("username");
		String password=data.get("password");
	//	String success=data.get("successmessage");
		FirstPage ref=new FirstPage();
		ref.navigateToUrl("https://qademo.symphonysummit.com:8084/DenaliSP2B1/Summit_WebLogin.aspx#!");
		ref.loginPage(username, password);
	}
		
}



