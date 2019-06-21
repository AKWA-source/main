package pageobject;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {

	
		 
		public static void captureScreenShot(WebDriver ldriver){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("./src/test/resources/Screenshots/"+System.currentTimeMillis()+".png"));   } 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		  
		 
		}
}
