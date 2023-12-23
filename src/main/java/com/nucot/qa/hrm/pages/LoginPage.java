package com.nucot.qa.hrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver odriver;
	
	//1.declare as locators private

	//1.private By locators
	
			By userName=By.xpath("//input[@name='username']");
			By passWord=By.xpath("//input[@name='password']");
			By loginBtn=By.xpath("//button[@type='submit']");
			
	//2.page constructor 
			
		public 	LoginPage(WebDriver odriver)
				{
				
					this.odriver=odriver;
				
				}
			
		
	//3.page actions/methods:
		
		public String getLoginPageUrl()
		{
			String url=odriver.getCurrentUrl();
			System.out.println("Login page ur is"+ url);
			return url;
		}
		
		public String getLoginPageTitle()
		{
			String title=odriver.getTitle();
			System.out.println("Login page ur is"+ title);
			return title;
		}
		
		
		
		public HomePage  doLogin(String un,String pw)
		{
			
			odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			odriver.findElement(userName).sendKeys(un);
			odriver.findElement(passWord).sendKeys(pw);
			odriver.findElement(loginBtn).click();
			return new HomePage(odriver);
			
			

		}
		
		
		
		
		
		
			
			
			
			
			
	
	
	

}
