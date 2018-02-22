package com.rodan.base;

import java.net.MalformedURLException;
import java.util.Set;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.rodan.commanmethods.GetDataProperties;
import com.rodan.commanmethods.TakeScreeshots;
import com.rodan.email.EmailReport;


public class BaseClass  extends IntializeWebdriver{
	
	public String authid;
	public String authpass;
 	public String url;
	public static ExtentReports report;
	public static ExtentTest logger;
	Set<String> windows;
	String parentwin;
	
	
	
	@BeforeSuite
	public void setup() throws MalformedURLException  {
		IntializeWebdriver.getdriver(GetDataProperties.getdata("browser"),GetDataProperties.getdata("remoteflag"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		authid=GetDataProperties.getdata("authid");
	    authpass=GetDataProperties.getdata("authpass");
	    url=GetDataProperties.getdata("url");
		
		String baseurl="https://" + url;
		//String baseurl="https://" + url;
		driver.get(baseurl);
		report =new ExtentReports(GetDataProperties.getdata("report_path"));
		
	}
	
    @BeforeTest
	public void closeadvwindows(){
		try{
  windows =driver.getWindowHandles();
  for(String window :windows ){
	  driver.switchTo().window(window);
	 
	if( driver.getTitle().contains("Jobs")){
		parentwin=window;
		  
	  }
	else {
		driver.close();
	}
	
  }
	driver.switchTo().window(parentwin);	
		}
		
	catch(Exception e){
		System.out.println("single window");
	}
		
		
		
		
	}
	
	
	@AfterMethod
    public void checkresult(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			String screenshotpath= TakeScreeshots.getscreenshots(driver, result.getName());
			String image=logger.addScreenCapture(screenshotpath);
			logger.log(LogStatus.FAIL,"testcase fail ",image);
			
		}
		
		report.endTest(logger);
		report.flush();
	
    }
	
	
	
  @AfterSuite
	public void teardown() throws Exception  {
		
	  Thread.sleep(5000);
		//driver.quit();
	  driver.get("H:\\Workspace_selenium\\naukri_selenium\\reports\\report.html");
		EmailReport.email();
		
		
	}
	
	

	
	

}
