package com.rodan.commanmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocateElements {
	
	
	public static  WebElement  getelements(WebDriver driver,String arr[])
	{
		if(arr[0].equalsIgnoreCase("id"))	{
			
			return driver.findElement(By.id(arr[1]));
			
		}
		
		else if (arr[0].equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(arr[1]));
			
		}
		
		else if (arr[0].equalsIgnoreCase("class")) {
			return driver.findElement(By.className(arr[1]));
			
		}
		
		else if (arr[0].equalsIgnoreCase("name")) {
			return driver.findElement(By.name(arr[1]));
			
		}
		else if (arr[0].equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(arr[1]));
			
		}
	
			
	return null;
		
		
		
		
		
	}
	
	

}
