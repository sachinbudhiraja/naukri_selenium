package com.rodan.commanmethods;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreeshots {
	
	
	public static String getscreenshots(WebDriver driver ,String name)
	{
		try{
	
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String dest=GetDataProperties.getdata("screenshot_path")+name +".png";
		    File Destination =new File(dest);
		    FileUtils.copyFile(source, Destination);
		    return dest;
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		return null;
		
	}

}
