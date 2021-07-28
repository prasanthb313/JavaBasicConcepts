package com.sapmle.tests;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.sample.pages.DeleteHoliday;
import com.utility.methods.CommonMethods;
import com.utility.methods.HolidayPage;

public class HolidayTest extends WebDriverTestCase{

	//this test is used to to check the  alert behavior in the holiday page TC_01
	@Test
	public void deleteHolidayTest() throws Throwable
	{
		CommonMethods common=new CommonMethods();
		HolidayPage holiday=new HolidayPage();
		DeleteHoliday delete=new DeleteHoliday();
		common.navigateToUrl("https://sqa.symphonysummit.com/DENALIHF11B001_GDPROFF/Summit_WebLogin.aspx#!");
		common.loginPage("STA.CMSAUser1_EX1_@symphonysummit.com", "test@123");
		common.navigateToAdmin();
		holiday.navigateToHolidayPage();		
		delete.deleteHoliday("no");
		delete.deleteHoliday("yes");
		common.logout();
	}
	
	
	
}

