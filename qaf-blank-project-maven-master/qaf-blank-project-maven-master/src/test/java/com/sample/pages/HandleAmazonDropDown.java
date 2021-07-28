package com.sample.pages;

import org.openqa.selenium.By;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.utility.methods.CommonMethods;

public class HandleAmazonDropDown extends WebDriverBaseTestPage<WebDriverTestPage> {

	public void handleAmazonDropDown() throws InterruptedException
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		QAFWebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		
		
		CommonMethods common=new CommonMethods();
		common.selectDropDownOption(dropDown,"Amazon Fashion");
		common.selectDropDownOption(dropDown, "Electronics");
		
		System.out.println("executed the method");
		
		
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	
}

