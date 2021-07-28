package com.utility.methods;

import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CommonMethods extends WebDriverBaseTestPage<WebDriverTestPage> {

	
	@FindBy(locator="adminpage.adminicon.btn")
	private QAFWebElement adminIcon;
	
	@FindBy(locator="loginpage.username.txt")
	private QAFWebElement username;
	
	@FindBy(locator="loginpage.password.txt")
	private QAFWebElement password;
	
	@FindBy(locator="loginpage.submit.button")
	private QAFWebElement submit;
	
	@FindBy(locator="homepage.profile.button")
	private QAFWebElement profileIcon;
	
	@FindBy(locator="homepage.logout.button")
	private QAFWebElement logoutBtn;
	
	public QAFWebElement getAdminIcon() {
		return adminIcon;
	}
	
	public QAFWebElement getUsername() {
		return username;
	}
	public QAFWebElement getPassword() {
		return password;
	}
	public QAFWebElement getSubmit() {
		return submit;
	}
	
	public QAFWebElement getProfileIcon() {
		return profileIcon;
	}
	
	
	public QAFWebElement getLogoutBtn() {
		return logoutBtn;
	}

	public void loginPage(String username,String password)  {

		//Thread.sleep(30000);
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSubmit().click();	
	}
	
	public void logout()
	{
		getProfileIcon().click();
		getLogoutBtn().click();
	}
	


	/**
	 * This method is used to browser the application url and we need to pass url as string data
	 * @param url
	 */

	public void navigateToUrl(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to click on submit button and verifying the successMessage
	 */
	public void verifyMessage(String successMessage)
	{
		//click on submit button
		//verify message
		//click ok button
	}
	
	public void selectDropDownOption(QAFWebElement dropDown,String value)
	{
		Select sel=new Select(dropDown);
		sel.selectByVisibleText(value);		
	}
	
	/**
	 * This method is used to click on Admin Icon
	 */
	public void navigateToAdmin()
	{
		getAdminIcon().click();
	}
	
	/**
	 * we need to pass yes or no in this method to accept or reject alert
	 * @param status
	 * @throws Throwable 
	 */
	public void accepeOrRejectAlert(String status) throws Throwable
	{
		Thread.sleep(5000);
		if(status=="yes")
		{
			driver.switchTo().alert().accept();
		}
		else
			driver.switchTo().alert().dismiss();
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}
