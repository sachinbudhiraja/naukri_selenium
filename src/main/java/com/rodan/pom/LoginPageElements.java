package com.rodan.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rodan.commanmethods.LocateElements;

public class LoginPageElements {
	
	WebDriver driver;
	
	public LoginPageElements( WebDriver driver){
	
		this.driver=driver;
	}

	public WebElement login_layer()
	{
		
	return LocateElements.getelements(driver, "id", "login_Layer");
		
	}
	
	
	
	public WebElement username()
	{
		
	return LocateElements.getelements(driver, "id", "eLogin");
		
	}
	

	public WebElement password()
	{
		
		return LocateElements.getelements(driver, "id", "pLogin");
		
	}
	
	

	public WebElement loginbutton()
	{
		
		//return LocateElements.getelements(driver, "xpath","//button[contains(text(),'log')]");
		
		return LocateElements.getelements(driver, "xpath", "//div//button[@class='blueBtn']");	
		
	}
	
	
	
	
	

}
