package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListing;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC013_Pagination extends BaseClass{
	
	@Test
	public void pagination() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonMenCategory();
		
		ProductListing lp = new ProductListing();
		lp.clickOnNextBtn();
		Reusable_Screenshots.Screenshots("TC013_Pagination");
	
	
	}

}
