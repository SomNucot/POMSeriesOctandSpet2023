package com.nucot.qa.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

	private WebDriver odriver;
	//1.declare as locators private
	
	By pim=By.xpath("//span[text()='PIM']");
	
	By empName=By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	
	//2.page constructor 
	 public ProductListPage(WebDriver odriver)
	 		{
		 			this.odriver=odriver;
	 		}
	
	
	
	//3.page actions/methods:
	 
	 public void employeeInformation()
	 {
		 odriver.findElement(pim).click();
		 odriver.findElement(empName).sendKeys("Modi");
		 
		 
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
