package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC018_ApplyCouponCode extends BaseClass{

	@Test
	public void applyCouponCode() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
		
		ProductListing lp = new ProductListing();
		lp.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
		pd.clickOnAddToCartBtn();
		pd.clickOnContBtn();
		pd.clickOnCartBtn();
		
		CartPage cp = new CartPage();
		cp.applyCouponCode("");
		
		Reusable_Screenshots.Screenshots("TC018_ApplyCouponCode");
		
		//need to completed add assertions 
		
		
		
	}
}
