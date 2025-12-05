package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC014_MiniCartDisplay extends BaseClass {

	@Test
	public void minicartDisplay() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
	
		ProductListing lp = new ProductListing();
		lp.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
		logger.info("step1");
//		pd.allSizeoption(1);
		logger.info("step2");
		pd.clickOnAddToCartBtn();
		Assert.assertEquals(pd.miniCartDispaly(), true);
		Reusable_Screenshots.Screenshots("TC014_MiniCartDisplay");
		
	}
}
