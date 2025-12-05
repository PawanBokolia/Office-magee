package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC010_BlackColourFilter extends BaseClass{

	@Test
	public void BlackFilterSelection() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		
		Thread.sleep(3000);
		hp.clickonMenCategory();
		
		ProductListing pl = new ProductListing();
		pl.redColourfilerSelection();
		Assert.assertEquals(pl.checkBlackFilterApply(), "Black");
		Reusable_Screenshots.Screenshots("TC010_BlackColourFilter");
		
	}
}
