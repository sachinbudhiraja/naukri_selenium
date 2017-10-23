package com.naukri.asertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rodan.commanmethods.LocateElements;

public class HardAssertions {
	
	public static String textassertion(WebDriver driver,String locatorvalue, String locatortype){
	
  
    	String act_res=LocateElements.getelements(driver, locatortype, locatorvalue).getText();
    	return act_res;
    
  
	}
	
	
	
	
	public static void elementassertion()
	{
		
		
		
		
	}
	
	
	
	

}
