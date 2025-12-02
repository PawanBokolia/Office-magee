package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC004_AboutUs extends BaseClass{

	@Test
	public void aboutUs() throws InterruptedException 
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.aboutUsBtn();
		Assert.assertEquals(hp.aboutUsTitle(),"OurStory");
		Reusable_Screenshots.Screenshots("TC004_AboutUs");
	}
	
	
}
