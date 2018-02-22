package com.naukri.asertions;

import org.openqa.selenium.WebDriver;

import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.LocateElements;

public class HardAssertions {
	
	public static String textassertion(WebDriver driver,String locatorvar){
	
  
    	String act_res=LocateElements.getelements(driver, GetDataProperties.getlocatordata("locator", locatorvar)).getText();
    	return act_res;
    
  
	}
	
	
	
	
	public static void elementassertion()
	{
		
		
		
		
	}
	
	
	
	

}
