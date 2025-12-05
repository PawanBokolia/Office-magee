package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;

public class TC017_CartActions extends BaseClass{

	@Test
	public void cartActions() throws InterruptedException 
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
		cp.clickOnEditButton();
		
		//need to 
		
		cp.clickOnDeleteBtn();
		
		
	}
}
