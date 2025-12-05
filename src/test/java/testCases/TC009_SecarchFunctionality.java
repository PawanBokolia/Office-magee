package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC009_SecarchFunctionality extends BaseClass{
	
	@Test
	public void searchFuntionality() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonSearchIcon();
		hp.searchFieldText(p.getProperty("searchProduct"));
		
		Thread.sleep(3000);
		Assert.assertEquals(hp.searchResultProNameInrecommendation(),p.getProperty("searchProduct"));
		Reusable_Screenshots.Screenshots("TC009_SecarchFunctionalityinAutoRecomendation");

		Assert.assertEquals(hp.seachResultInViewAll(), p.getProperty("searchProduct"));
		Reusable_Screenshots.Screenshots("TC009_SecarchFunctionality");
		
	}
}
