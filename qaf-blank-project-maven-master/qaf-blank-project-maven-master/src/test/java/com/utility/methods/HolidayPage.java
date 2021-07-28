package com.utility.methods;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HolidayPage extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	@FindBy (locator="admin.holiday.link")
	private QAFWebElement holidayPage;

	public QAFWebElement getHolidayPage() {
		return holidayPage;
	}
	
	/**
	 *  This method is used to navigate to Holiday Page
	 */
	public void navigateToHolidayPage()
	{
		getHolidayPage().click();
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}
