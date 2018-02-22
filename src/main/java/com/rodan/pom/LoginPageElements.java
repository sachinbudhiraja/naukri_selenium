package com.rodan.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.LocateElements;

public class LoginPageElements {
	
	WebDriver driver;
	
	public LoginPageElements( WebDriver driver){
	
		this.driver=driver;
	}

	public WebElement login_layer()
	{
		
	return LocateElements.getelements(driver, GetDataProperties.getlocatordata("locator", "login_layer"));
		
	}
	
	
	
	public WebElement username()
	{
		
	return LocateElements.getelements(driver,GetDataProperties.getlocatordata("locator", "user_name"));
		
	}
	

	public WebElement password()
	{
		
		return LocateElements.getelements(driver,GetDataProperties.getlocatordata("locator", "password"));
		
	}
	
	

	public WebElement loginbutton()
	{
		
		//return LocateElements.getelements(driver, "xpath","//button[contains(text(),'log')]");
		
		return LocateElements.getelements(driver, GetDataProperties.getlocatordata("locator", "login_button"));	
		
	}
	
	
	
	
	

}
