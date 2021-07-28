package com.sapmle.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

public class DataDrivenXML {

	@Test
	@QAFDataProvider(dataFile = "./resources/DataFile/xmlData.xml",key = "Login.data")
	public void dataXml(Map<String,String>data)
	{
		String username="data.username";
		String password="data.password";
		System.out.println(username+password);
	}
}

