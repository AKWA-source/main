package com.maven.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pageobject.ReadExcel;
import pageobject.Screenshot;

public class AppTest {
	public  WebDriver driver;
	public static String path = "./src/main/resources/Data.xlsx";
	public String url ="http://newtours.demoaut.com/index.php";
	String doc1,doc2,doc3,doc4;
	
	Screenshot ss = new Screenshot();
	
	
	@BeforeClass
	 public void setUp() throws Exception { 
		
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/browserDriver/chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
			
	  }
	
	
	
	@Test
	public void withoutmain() throws Exception {
		Thread.sleep(3000);
		ss.captureScreenShot(driver);
		System.out.println("In Test");
		ReadExcel obj1 = new ReadExcel(path);
		doc1=obj1.getData("Documents", 1, 0);
		doc2=obj1.getData("Documents", 1, 1);
		doc3=obj1.getData("Documents", 1, 2);
		doc4=obj1.getData("Documents", 1, 3);
		System.out.println(doc1);
		System.out.println(doc2);
		Properties obj = new Properties();
		try {
		
		FileInputStream objfile = new FileInputStream("./src/test/java/com/maven/selenium/Repository.properties");
		obj.load(objfile);
		//call the elements over here
		driver.findElement(By.xpath(obj.getProperty("usern"))).sendKeys("warn");
		
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		
		
		


	}


