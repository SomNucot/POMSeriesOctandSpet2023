package com.nucot.qa.hrm.driverfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public WebDriver odriver;
	
	
	public Properties prop;
	
	
	public WebDriver initDriver(Properties prop)
	{
		
		
		String browserName=prop.getProperty("browser").trim().toLowerCase();
		
		System.out.println("browser name is :"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			odriver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			odriver=new FirefoxDriver();
		}	
		else if(browserName.equalsIgnoreCase("safari")){
			odriver=new SafariDriver();
		}	
		else if(browserName.equalsIgnoreCase("edge")){
			odriver=new EdgeDriver();
		}	
		else if(browserName.equalsIgnoreCase("ie")){
			odriver=new InternetExplorerDriver();
		}
		else{
			System.out.println("Plz pass the right browser name"+browserName);
		}
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get(prop.getProperty("url"));
		return odriver;	
	}
	
	
	
	
	public Properties initProp()
	{
		
	 prop =new Properties ();
	 
	 try {
		
		 FileInputStream ip=new  FileInputStream("./src/test/resources/config/devconfig.properties");
		 prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
		return prop;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
