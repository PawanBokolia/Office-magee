package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC003_ContactUs extends BaseClass{

	@Test
	public void contactus() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnContactUsbtn();
		Assert.assertEquals(hp.contactUsTitle(), "Contact Us");
		Reusable_Screenshots.Screenshots("TC003_ContactUs");
	}
	
	
}
