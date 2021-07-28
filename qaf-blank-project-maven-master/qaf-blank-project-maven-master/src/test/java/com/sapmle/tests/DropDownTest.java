package com.sapmle.tests;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.FirstPage;
import com.sample.pages.HandlingDropDown;
import com.utility.methods.CommonMethods;

public class DropDownTest extends WebDriverTestCase{

	@Test()
	public void dropDownTest() throws InterruptedException
	{
		CommonMethods common=new CommonMethods();
		//common.navigateUrl("https://sqa.symphonysummit.com/ALPSSP1HF23B1_GDPROFF/");
		FirstPage first=new FirstPage();
		first.loginPage("STA.AMUser1_EX1_@symphonysummit.com", "test@123");
		HandlingDropDown dd=new HandlingDropDown();
		dd.handleDropDown();
	}
}