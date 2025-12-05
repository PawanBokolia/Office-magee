package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC012_OtherFilters extends BaseClass{

	@Test
	public void OtherFilters() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
	
		ProductListing lp = new ProductListing();
		lp.categoryFilter();
		Assert.assertEquals(lp.verifyCategory(),"Clothing");
		Reusable_Screenshots.Screenshots("TC012_ClothingFilter");
		
		lp.clcikOnClearAllBtn();
		Assert.assertTrue(lp.verifyCategoryFilter());
		
	}
}
