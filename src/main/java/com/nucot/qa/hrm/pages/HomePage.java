package com.nucot.qa.hrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	private WebDriver odriver;
	
	//1.declare as locators private

		//1.private By locators
	
		By userName=By.xpath("//input[@name='username']");
		By passWord=By.xpath("//input[@name='password']");
		By loginBtn=By.xpath("//button[@type='submit']");
	
		By admin=By.xpath("//span[text()='Admin']");
	    By username=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	
	
	//2.page constructor 
	
	    public HomePage(WebDriver odriver) {
			this.odriver=odriver;
			
		}
	
	
	//3.page actions/methods:
	    
	    
	    public String getHomePageTitle(){	
	    	String actualHomepageTitle=odriver.getTitle();
			return actualHomepageTitle;	
		}
			
			
		public String getHomePageURL(){	
			String currenturlHomePage=odriver.getCurrentUrl();
			return currenturlHomePage;	
		}
		
		
		
		public void systemUserDetails()
		{
			
			odriver.findElement(admin).click();
			odriver.findElement(username).sendKeys("Nucot");
			
		}
		
		 
		public ProductListPage  doLogin(String un,String pw)
		{
			
			odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			odriver.findElement(userName).sendKeys(un);
			odriver.findElement(passWord).sendKeys(pw);
			odriver.findElement(loginBtn).click();
			return new ProductListPage(odriver);
			
			

		}
		
		
	    
	    
	    
	    
	    
	    
	    
	    

}
