package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductListing;
import testBase.BaseClass;

public class TC010_RedColourFilter extends BaseClass{

	@Test
	public void redFilterSelection() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		
		Thread.sleep(3000);
		hp.clickonMenCategory();
		
		ProductListing pl = new ProductListing();
		pl.redColourfilerSelection();
		
		//need to complete
		
		
		
	}
}
