package com.sapmle.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.FirstPage;

public class DataDriven extends WebDriverTestCase{

	@Test
	@QAFDataProvider(dataFile = "./resources/DataFile/DataDriven.csv", sheetName="Sheet1",key = "FirstTest")
	public void dataRead(Map<String,String>data)
	{
		FirstPage ref=new FirstPage();
		ref.navigateToUrl("https://sqa.symphonysummit.com/DENALISP3HF05B002_GDPROFF/Summit_WebLogin.aspx");
		String username=data.get("username");
		String password=data.get("password");
		ref.loginPage(username, password);
	}
}
