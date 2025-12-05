package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC011_LengthFilersActions extends BaseClass{

	@Test
	public void LengthFilterActions() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
		
		ProductListing lp = new ProductListing();
		lp.lengthFilter();
		Assert.assertEquals(lp.verifySmallLength(), "S");
		Reusable_Screenshots.Screenshots("TC011_LengthFilterAdded");
		
		lp.clcikOnClearAllBtn();
		
		Assert.assertTrue(lp.filerIsCleared());
		Reusable_Screenshots.Screenshots("TC011_allFliterCleared");
		
		
	}
	
}
