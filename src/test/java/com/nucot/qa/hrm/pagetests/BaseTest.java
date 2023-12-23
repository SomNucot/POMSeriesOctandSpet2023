package com.nucot.qa.hrm.pagetests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.nucot.qa.hrm.driverfactory.DriverFactory;
import com.nucot.qa.hrm.pages.HomePage;
import com.nucot.qa.hrm.pages.LoginPage;
import com.nucot.qa.hrm.pages.ProductListPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver odriver;
	Properties prop;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected ProductListPage productListPage;
	
	
	@BeforeTest
	public void setUp()
	{
		df=new DriverFactory();
		prop=df.initProp();
		odriver=df.initDriver(prop);
		loginPage=new LoginPage(odriver);
		//homePage=new HomePage(odriver);
		

		
	}
	
	@AfterTest
	public void appClose()
	{
		odriver.quit();
		
	}
	
	

}
