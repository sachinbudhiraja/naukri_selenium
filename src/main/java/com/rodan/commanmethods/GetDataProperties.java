package com.rodan.commanmethods;

import java.util.ResourceBundle;

public class GetDataProperties {
	
	
	public static String getdata(String var)
	{
		ResourceBundle rb = ResourceBundle.getBundle("conf");
		
		
		return  rb.getString(var);
		
	}
	
	
	

}
