package com.rodan.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tesing {

	public static void main(String[] args) {
		

		
    System.setProperty("webdriver.chrome.driver", "H:\\Workspace_selenium\\naukri_selenium\\libraries\\chromedriver.exe");
		
		
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver =new ChromeDriver();
		
		Select obj =new Select(driver.findElement(By.id("country")));
		
		obj.selectByValue("4");
		
		
		
		
	}

}
