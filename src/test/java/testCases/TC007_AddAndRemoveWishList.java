package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.ProductDetail;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC007_AddAndRemoveWishList extends BaseClass{
	
	@Test
	public void AddAndRemoveWishList() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
	
		Thread.sleep(3000);
		hp.clickOnSignInBtn();
		
		LoginPage lp = new LoginPage();
		lp.login(p.getProperty("username"),p.getProperty("password"));
		
		hp.clickonMenCategory();
		
		ProductListing pl = new ProductListing();
		pl.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
		pd.clickonWishlistBtn();
		
		Thread.sleep(3000);
		MyAccount ac = new MyAccount();
		Assert.assertEquals(ac.wishlistConfMsg(), "test123 has been added to your Wish List. Click here to continue shopping.");
		Reusable_Screenshots.Screenshots("TC007_AddWishList");
		
		ac.removeWishlistItem();
		Assert.assertEquals(ac.removeWishlistMsg(), "test123 has been removed from your Wish List.");
		Reusable_Screenshots.Screenshots("TC007_removeWishList");
		
	}
	
}
