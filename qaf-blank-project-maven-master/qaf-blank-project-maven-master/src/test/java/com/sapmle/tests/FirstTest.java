package com.sapmle.tests;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.AmazonAutomation;
import com.sample.pages.FirstPage;

public class FirstTest extends WebDriverTestCase{

	@Test
	public void login() throws Throwable {
		
	/*	String username="STA.CMSAUser1_EX1_@symphonysummit.com";
		String password="test@123";
		FirstPage login=new FirstPage();
		@SuppressWarnings("deprecation")
		String someprop = props.getString("env.baseurl");
		login.navigateToUrl(someprop);
		login.loginPage(username, password);
		//com.sapmle.tests.FirstTest.java */
		
		AmazonAutomation amazon=new AmazonAutomation();
		amazon.amazonSignIn();
	}
	
}



