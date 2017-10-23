package com.rodan.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.rodan.commanmethods.GetDataProperties;

public class IntializeWebdriver  {
	
	
	public static WebDriver driver;
	public static void getdriver( String browser)
	{
		if (browser.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver", GetDataProperties.getdata("browserdriver_path") +  "\\chromedriver.exe");
		driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     }
		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", GetDataProperties.getdata("browserdriver_path") + "\\geckodriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("acceptInsecureCerts",true);
			driver = new FirefoxDriver(capabilities);
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }

else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", GetDataProperties.getdata("browserdriver_path") + "\\IEDriverServer.exe");
			//DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability("acceptInsecureCerts",true);
			driver = new InternetExplorerDriver();
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
		
		
		
		
			
	}


}
