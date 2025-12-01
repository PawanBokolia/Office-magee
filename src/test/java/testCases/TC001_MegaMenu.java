package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC001_MegaMenu extends BaseClass{
	
	@Test
	public void megamenu() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.megamenuopen();
		Reusable_Screenshots.Screenshots("TC001_MegaMenu");
	}
	
}
