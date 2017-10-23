package com.rodan.commanmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocateElements {
	
	
	public static  WebElement  getelements(WebDriver driver,String locatortype ,String locatorvalue)
	{
		if(locatortype.equalsIgnoreCase("id"))	{
			
			return driver.findElement(By.id(locatorvalue));
			
		}
		
		else if (locatortype.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorvalue));
			
		}
		
		else if (locatortype.equalsIgnoreCase("class")) {
			return driver.findElement(By.className(locatorvalue));
			
		}
		
		else if (locatortype.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(locatorvalue));
			
		}
		else if (locatortype.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locatorvalue));
			
		}
	
			
	return null;
		
		
		
		
		
	}
	
	

}
