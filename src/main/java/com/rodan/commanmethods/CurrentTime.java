package com.rodan.commanmethods;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime {
	
	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String time =(sdf.format(cal.getTime())).replace("/", "") ;

		System.out.println(sdf.format(cal.getTime()));
		return time.replace("\\s", "");
		
		}

}