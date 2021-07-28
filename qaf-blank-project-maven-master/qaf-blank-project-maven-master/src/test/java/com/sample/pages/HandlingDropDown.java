package com.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HandlingDropDown extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	public void handleDropDown() throws InterruptedException
	{
		Thread.sleep(10000);
		Boolean b=driver.findElement(By.id("BodyContentPlaceHolder_lblOrganization")).isDisplayed();
		System.out.println(b);
		driver.findElement(By.id("s2id_BodyContentPlaceHolder_UCDomainList_lstDomain")).click();
		QAFWebElement dropDown=driver.findElement(By.id("//div[@role='option']"));
		Thread.sleep(10000);
		Select sel=new Select(dropDown);
		sel.selectByVisibleText("SUMMITAutomation");
		driver.wait(5000);
		driver.findElement(By.xpath("//input[@id='BodyContentPlaceHolder_btnSearch']")).click();
	}
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}


