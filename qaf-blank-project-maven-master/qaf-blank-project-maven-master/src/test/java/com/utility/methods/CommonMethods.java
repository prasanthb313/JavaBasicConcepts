package com.utility.methods;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class CommonMethods extends WebDriverBaseTestPage<WebDriverTestPage> {

	/**
	 * This method is used to browser the application url and we need to pass url as string data
	 * @param url
	 */
	public void navigateUrl(String url)
	{
		driver.get(url);
	}
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

}
