package com.rodan.commanmethods;

import java.util.ResourceBundle;

public class GetDataProperties {
	
	
	public static String getdata(String var)
	{
		ResourceBundle rb = ResourceBundle.getBundle("conf");
		
		
		return  rb.getString(var);
		
	}
	
	
	
	public static String[] getlocatordata(String file,String var)
	{
		ResourceBundle rb = ResourceBundle.getBundle(file);
		
		
		String str1[]=  rb.getString(var).split(":");
		return str1;
		
		
		
		
	}
	
	
	
	

}
