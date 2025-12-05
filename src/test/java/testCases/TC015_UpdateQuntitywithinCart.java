package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC015_UpdateQuntitywithinCart extends BaseClass{

	@Test
	public void updateQuntity() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
		
		ProductListing pl= new ProductListing();
		pl.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
//		pd.allSizeoption(1);
		
		pd.clickOnAddToCartBtn();
		pd.clickOnContBtn();
		pd.clickOnCartBtn();
		
		CartPage cp = new CartPage();
		cp.changeQuntityField("4");
		cp.clickOnUpdateQnt();
		
		Thread.sleep(3000);
		Assert.assertEquals(cp.PriceCheck(), "€180.00");
		Reusable_Screenshots.Screenshots("TC015_UpdateQuntitywithinCart");
		
	}
}
