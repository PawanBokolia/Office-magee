package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;

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
		pd.sizeSelection();
		pd.clickOnAddToCartBtn();
		pd.clickOnContBtn();
		pd.clickOnCartBtn();
		
		CartPage cp = new CartPage();
		cp.changeQuntityField();
		cp.clickOnUpdateQnt();
		
		Thread.sleep(30000);
		
		
	}
}
