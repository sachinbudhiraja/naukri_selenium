package com.rodan.commanmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.security.UserAndPassword;

import com.rodan.base.BaseClass;

public class HandleAlert extends BaseClass{
	
	static Alert al;
	public  static void accept()
	{
		al=driver.switchTo().alert();
		al.accept();
		
	
		
	}
	
	public  static void dismiss()
	{
		al=driver.switchTo().alert();
		al.dismiss();
	
		
	}
	
	public  static void authentication()
	{
		al=driver.switchTo().alert();
		al.authenticateUsing(new UserAndPassword("", ""));
	
		
	}
	
	
	

}
