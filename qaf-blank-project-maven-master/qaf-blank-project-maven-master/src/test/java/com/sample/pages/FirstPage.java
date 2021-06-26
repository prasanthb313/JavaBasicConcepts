package com.sample.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FirstPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	
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
		
	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void loginPage(String username,String password) throws Throwable {
		Thread.sleep(30000);
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSubmit().click();
		
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
	}

}
