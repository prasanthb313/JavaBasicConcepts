package com.sapmle.tests;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.HandleAmazonDropDown;

public class AmazonTest extends WebDriverTestCase{
	
	@Test()
	public void amazonDropDown() throws InterruptedException
	{
		HandleAmazonDropDown dd=new HandleAmazonDropDown();
		dd.handleAmazonDropDown();
	}
	
}
