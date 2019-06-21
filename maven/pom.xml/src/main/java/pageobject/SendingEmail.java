package pageobject;

import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import java.util.Properties;

public class SendingEmail {
	
	  public static void main(String args[]) { 
		  try { 
			  Properties props = new java.util.Properties(); 
			  props.put("username","proxyuser");
			  props.put("password","proxypass");
			  props.put("host","193.56.47.20");
			  props.put("port","8080");
			  
			
			  props.put("mail.smtp.host", "smtp.gmail.com");
			  props.put("mail.smtp.socketFactory.port", "587");
			  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			  props.put("mail.smtp.auth", "true");
			  props.put("mail.smtp.port", "587");
			 
	  System.out.println("started");
	  Email email = new SimpleEmail();
	 email.setHostName("smtp.gmail.com"); 
	 email.setSSLCheckServerIdentity(true);
	 email.setSmtpPort(587); 
	 email.setAuthenticator(new DefaultAuthenticator("skwaseem511@gmail.com", "9618770218"));
	  email.setSSLOnConnect(true); 
	  email.setFrom("skwaseem511@gmail.com");
	  email.setSubject("TestMail"); 
	  email.setMsg("This is a test mail");
	  email.addTo("skwaseem511@gmail.com");
	  email.send();
	  System.out.println("success");
	  } 
	  catch (EmailException e) {
		  // TODO
	  e.printStackTrace(); }
		  }
	 
	
}
