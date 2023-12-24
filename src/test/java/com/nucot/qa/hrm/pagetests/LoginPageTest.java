package com.nucot.qa.hrm.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nucot.qa.hrm.constants.ApplicationConstants;



public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void loginPageCurrentUrl()
	{
		String actualUrl=loginPage.getLoginPageUrl();
		
		Assert.assertEquals(actualUrl,ApplicationConstants.LOGIN_PAGE_CURRENTURL);
		
		
		
	}
	
	@Test(priority=2)
	public void loginPageTitle()
	{
		
		String actualTitle=loginPage.getLoginPageTitle();
		
		Assert.assertEquals(actualTitle,ApplicationConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test(priority=3)
	public void doLoginPageTest()
	{
		loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
		
		
	}
	
	
	
	
	
	
	

}
