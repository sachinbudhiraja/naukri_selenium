package com.rodan.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.naukri.asertions.HardAssertions;
import com.relevantcodes.extentreports.LogStatus;
import com.rodan.base.BaseClass;
import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.TakeScreeshots;
import com.rodan.pom.LoginPageElements;

public class RodanLoginPage extends BaseClass{
	
		
	public static LoginPageElements login1;
	static String title;

	
	@Test
	public static void login() throws InterruptedException{
		try{
		    login1 =new LoginPageElements(driver);
		    logger=report.startTest("Login naukri");
		
		    login1.login_layer().click();
		    logger.log(LogStatus.INFO, "enter username", GetDataProperties.getdata("username"));
		    login1.username().sendKeys(GetDataProperties.getdata("username"));
  
     		logger.log(LogStatus.INFO, "enter password" ,GetDataProperties.getdata("password") );
     		login1.password().sendKeys(GetDataProperties.getdata("password"));
     		login1.loginbutton().click();
     		Thread.sleep(3000);
     		title=driver.getTitle();
			 try{
			     
				 String act_res=HardAssertions.textassertion(driver, "//div[@id='colL']//h2", "xpath");
				 Assert.assertEquals(act_res,"My Naukr Home");
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
			
		
		      Assert.assertTrue(title.contains("Mynaukri"));
		      logger.log(LogStatus.PASS, "user has been signed in");	
		}
		
		
		
		}

	
	
	
	
}
