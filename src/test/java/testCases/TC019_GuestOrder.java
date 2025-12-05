package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;

public class TC019_GuestOrder extends BaseClass{
	
	@Test
	public void guestOrder() throws InterruptedException
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
		cp.clickonCheckoutBtn();
		
		CheckoutPage ccp = new CheckoutPage();
		ccp.customerDetails(faker.randomEmail(), faker.randomFirstName(),"chilliapple",faker.randomStreetAddress());
		ccp.addressDetails(faker.randomState(), faker.randomPostalCode(), faker.randomCity(), faker.randomPhoneNum(),"test");
		ccp.countryDRpSelect();
		ccp.cardDetals("4242424242424242", "0530", "123");
		//need to complete 
		
		
		
		
		
	}

}
