package com.rodan.commanmethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rodan.base.BaseClass;

public class LinkVerification extends BaseClass {
	
	public  static void verify_link() throws IOException
	{
		
		
		
		
			
			List<WebElement> li= driver.findElements(By.tagName("a"));
			
			for(int i=0;i<=li.size();i++)
			{
				
				WebElement el=li.get(i);
				String link=el.getAttribute("href");
				System.out.println(link);
				verify_broken_links(link);
				
			}

			
			
			

		}
		
		
		public static void verify_broken_links(String link) throws IOException
		{
			
			URL url =new URL(link);
			HttpURLConnection httpcon= (HttpURLConnection)url.openConnection();
			
			httpcon.setConnectTimeout(5000);
			
			httpcon.connect();
			if(httpcon.getResponseCode()==200)
			{
				System.out.println("link is working");
			}
			
			if(httpcon.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND )
			{
				System.out.println(httpcon.getResponseMessage());
			}
			
			
		}
		
	
	

}
