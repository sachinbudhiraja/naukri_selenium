package com.rodan.test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.naukri.asertions.HardAssertions;
import com.relevantcodes.extentreports.LogStatus;
import com.rodan.base.BaseClass;
import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.LinkVerification;
import com.rodan.commanmethods.TakeScreeshots;
import com.rodan.pom.HomePageElements;
import com.rodan.pom.LoginPageElements;

public class RodanLoginPage extends BaseClass{
	
		
	public static LoginPageElements login1;
	public static HomePageElements home1;
	static String title;

	
	@Test
	
	public static void login() throws InterruptedException{
		try{
			
			
			
		    login1 =new LoginPageElements(driver);
		    logger=report.startTest("Login naukr");
		    logger.log(LogStatus.INFO, "checking links");
		  //  LinkVerification.verify_link();
		    
		    
		   
		    
		    login1.login_layer().click();
		    logger.log(LogStatus.INFO, "enter username", GetDataProperties.getdata("username"));
		    //driver.findElement(By.id("eLoginNew")).sendKeys("sb");
		    login1.username().sendKeys(GetDataProperties.getdata("username"));
  
     		logger.log(LogStatus.INFO, "enter password" ,GetDataProperties.getdata("password") );
     		login1.password().sendKeys(GetDataProperties.getdata("password"));
     		login1.loginbutton().click();
     		Thread.sleep(3000);
     		title=driver.getTitle();
			 try{
			     
				 String act_res=HardAssertions.textassertion(driver, "Home_Page_text" );
			 	 Assert.assertEquals(act_res,"My Naukri Home");
				 logger.log(LogStatus.INFO, "header text verified");
				 
				 
				 
		
			 }
			 catch(AssertionError e)
			 {
				 String screenshotpath= TakeScreeshots.getscreenshots(driver, "home_text");
					String image=logger.addScreenCapture(screenshotpath);
					logger.log(LogStatus.FAIL,"header text not matching ",image);
				 
			 }
			
		 
		
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		finally
		{
			
		
		      Assert.assertTrue(title.contains("My"));
		      logger.log(LogStatus.PASS, "user has been signed in");	
		}
		
		
		
		}

	//@Test
	public void upload_resume()
	{
		home1= new HomePageElements(driver);
		home1.viewupdateButton().click();
		driver.findElement(By.partialLinkText("Upload New Resume")).click();
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\sachin\\Desktop\\rest_data\\Resume _sachin.docx");
		
	}
	
	//@Test(retryAnalyzer=CustomRetry.class)
	public void upload_resume2()
	{
		logger=report.startTest("Login naukr");
		
		logger.log(LogStatus.INFO, "enter 1");
		Assert.assertEquals(true, false);
	}
	
	
}
