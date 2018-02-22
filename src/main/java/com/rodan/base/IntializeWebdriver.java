package com.rodan.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.rodan.commanmethods.GetDataProperties;

public class IntializeWebdriver  {
	
	
	public static WebDriver driver;
	public static RemoteWebDriver driver1;
	public static void getdriver( String browser, String remoteflag) throws MalformedURLException
	{
		if (browser.equalsIgnoreCase("chrome" )){
			
			if (remoteflag.equalsIgnoreCase("true"))
			{
				 DesiredCapabilities ds=new DesiredCapabilities().chrome();
				   ds.setPlatform(Platform.WINDOWS);
				
				   URL ur=new URL(GetDataProperties.getdata("hubaddress"));
				  // System.setProperty("webdriver.chrome.driver", "H:\\Workspace_selenium\\naukri_selenium\\libraries\\chromedriver.exe");
				   driver =new RemoteWebDriver(ur,ds);
				   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 
			}
			if (remoteflag.equalsIgnoreCase("false")) {
		System.setProperty("webdriver.chrome.driver", GetDataProperties.getdata("browserdriver_path") +  "\\chromedriver.exe");
		driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
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
