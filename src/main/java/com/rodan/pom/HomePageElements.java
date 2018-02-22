package com.rodan.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.LocateElements;

public class HomePageElements {
	
	
WebDriver driver;
	
	public HomePageElements( WebDriver driver){
	
		this.driver=driver;
	}
	
	
	
	public WebElement viewupdateButton()
	{
		return  LocateElements.getelements(driver,GetDataProperties.getlocatordata("locator", "viewupdate_Button"));
	}


}
