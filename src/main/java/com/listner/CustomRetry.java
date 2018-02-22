package com.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetry implements IRetryAnalyzer{

	
	int retrycount=0;
	int maxretry=5;
	
	
	public boolean retry(ITestResult result) {
	
		if(result.getStatus()== ITestResult.FAILURE && retrycount <= maxretry )
		{
			try{
			
				retrycount++;
				return true;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
		return false;
	}

	
	
	
}
