package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC004_AboutUs extends BaseClass{

	@Test
	public void aboutUs() 
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.aboutUsBtn();
		Assert.assertEquals(hp.aboutUsTitle(),"OurStory");
	}
	
	
}
