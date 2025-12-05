package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;

public class TC020_LoggedInOrder extends BaseClass{

	@Test
	public void orderplace() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSignInBtn();
		
		LoginPage lp = new LoginPage();
		lp.login(p.getProperty("username"), p.getProperty("password"));
		
		hp.clickonMenCategory();
		
		ProductListing pl = new ProductListing();
		pl.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
		pd.clickOnAddToCartBtn();
		pd.clickOnContBtn();
		pd.clickOnCartBtn();
		
		CartPage cp = new CartPage();
		cp.clickonCheckoutBtn();
		
		CheckoutPage ccp = new CheckoutPage();
		ccp.cardDetals("4242424242424242", "0530", "123");
		ccp.selectShippingMethod();
		
		//need to complete
		
	}
}
