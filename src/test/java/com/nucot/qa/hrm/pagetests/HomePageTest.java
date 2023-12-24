package com.nucot.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nucot.qa.hrm.constants.ApplicationConstants;

public class HomePageTest  extends BaseTest{
	
	
	@BeforeClass
	void homePageSetup()
	{
		homePage=loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
		
	}
	
	@Test(priority=1)
	public void homePageUrlTest()
	{
		String actualHomePageUrl=homePage.getHomePageURL();
		Assert.assertEquals(actualHomePageUrl,ApplicationConstants.HOME_PAGE_CURRENTURL);
		
	}
	
	
	@Test(priority=2)
	public void homePageTitleTest()
	{
		String actualHomePageTitle=homePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle,ApplicationConstants.HOME_PAGE_TITLE );
	}
	
	
	
	@Test(priority=3)
	public void systemUserDetailsTest()
	{
		homePage.systemUserDetails();
	}
	
		
	
	@AfterClass
	public void closeApp()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
