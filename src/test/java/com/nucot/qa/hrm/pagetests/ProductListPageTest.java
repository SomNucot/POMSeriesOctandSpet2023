package com.nucot.qa.hrm.pagetests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductListPageTest extends BaseTest{
	
	
	@BeforeClass
	void homePageSetup()
	{
		productListPage=homePage.doLogin("Admin", "admin123");
		
	}
	
	@Test
	public void empInfo()
	{
		productListPage.employeeInformation();
	}
	
		
	
	@AfterClass
	public void closeApp()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	

}
