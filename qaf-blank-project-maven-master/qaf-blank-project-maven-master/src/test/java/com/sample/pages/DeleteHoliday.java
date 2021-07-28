package com.sample.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.utility.methods.CommonMethods;

public class DeleteHoliday extends WebDriverBaseTestPage<WebDriverTestPage> {

	CommonMethods common=new CommonMethods();
	
	@FindBy(locator="holiday.delete.btn")
	private QAFWebElement deleteButton;
	
	public QAFWebElement getDeleteButton() {
		return deleteButton;
	}
	
		
	/**
	 * This method is used to delete the holiday 
	 * @throws Throwable 
	 */
	public void deleteHoliday(String value) throws Throwable
	{
		
		getDeleteButton().click();
		Thread.sleep(5000);
		common.accepeOrRejectAlert(value);
		Thread.sleep(5000);		
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	
	
}

