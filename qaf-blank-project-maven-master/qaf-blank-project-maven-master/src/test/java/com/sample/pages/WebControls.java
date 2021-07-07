package com.sample.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class WebControls extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	@FindBy(locator="loginpage.username.txt")
	private QAFWebElement username;
	
	@FindBy(locator="loginpage.password.txt")
	private QAFWebElement password;
	
	@FindBy(locator="loginpage.submit.button")
	private QAFWebElement submit;
	
		
	public QAFWebElement getUsername() {
		return username;
	}

	public QAFWebElement getPassword() {
		return password;
	}

	public QAFWebElement getSubmit() {
		return submit;
	}

	public void webLoginTest(String userName,String password)
	{
		Boolean user=getUsername().isDisplayed();
		Boolean pass=getPassword().isDisplayed();
		Boolean submit=getSubmit().isDisplayed();
		
		if(user)
		{
			getUsername().sendKeys(userName);	
			Reporter.log("successsfully entered username");
		}
		else
		{
		   Reporter.log("username field is not displayed");
		}
		
		Reporter.log("password status is "+pass);
		Reporter.log("submit button status is "+submit);
		
		getPassword().sendKeys(password);
		getSubmit().click();
		
		Reporter.log("Sucessfully logged into application");
	}
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}

