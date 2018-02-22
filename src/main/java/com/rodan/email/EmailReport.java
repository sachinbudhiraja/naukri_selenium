package com.rodan.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import com.rodan.commanmethods.GetDataProperties;

public class EmailReport {
	
	
	public static  void email() throws EmailException{
		
		if(GetDataProperties.getdata("email").equalsIgnoreCase("true"))
		{
	
	try{	
			EmailAttachment attach =new EmailAttachment();
			attach.setPath(GetDataProperties.getdata("report_path"));
			attach.setDisposition(EmailAttachment.ATTACHMENT);
			attach.setDescription("result sheet");
			attach.setName("result.html");
			
			
			MultiPartEmail email=new MultiPartEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setSSLOnConnect(true);
			email.setAuthenticator(new DefaultAuthenticator("budhirajasachin81", "ChangeMe@sss"));
			email.setFrom("budhirajasachin81@gmail.com");
			email.addTo("gautswat@gmail.com");
			email.setSubject("report");
			email.setMsg("new Extent report");
			email.attach(attach);
			email.send();	
	}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
	
		}
		
		
		else {
			System.out.println("email functionality is off");
		}
		
		
	}	
		

}
