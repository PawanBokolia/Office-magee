package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC003_ContactUs extends BaseClass{

	@Test
	public void contactus()
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnContactUsbtn();
		
		Assert.assertEquals(hp.contactUsTitle(), "Contact Us");
		
	}
	
	
}
