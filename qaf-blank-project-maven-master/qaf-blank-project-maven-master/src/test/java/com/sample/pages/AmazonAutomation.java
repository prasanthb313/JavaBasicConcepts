package com.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class AmazonAutomation extends WebDriverBaseTestPage<WebDriverTestPage>{

		
	public void amazonSignIn() throws Throwable
	{
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone mobiles");
		
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> element=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(element.get(i).getText()+" Price is  "+price.get(i).getText());
		}
		
		
	}
		
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}
