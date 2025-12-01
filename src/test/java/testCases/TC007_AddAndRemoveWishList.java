package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
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
		lp.emailInputFieldLogin("pawan.bokoliaqa@gmail.com");
		lp.passwordInputLogin("pawan@95");
		lp.clickonSignInBtn();
		
		hp.clickonMenCategory();
		
		ProductListing pl = new ProductListing();
		pl.clickonTestProduct();
		
		ProductDetail pd = new ProductDetail();
		pd.clickonWishlistBtn();
		Reusable_Screenshots.Screenshots("TC007_AddWishList");
	}
	
}
