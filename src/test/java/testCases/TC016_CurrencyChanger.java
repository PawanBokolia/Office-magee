package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC016_CurrencyChanger extends BaseClass {

	@Test
	public void currenyChange() throws InterruptedException, IOException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickonCurrenyBtn();
		
		Thread.sleep(2000);
		hp.currencyChanger("GBP");
		hp.clickonCurrenyBtn();
		Assert.assertEquals(hp.currentURL(), "https://stage.magee1866.com/uk/");
		Reusable_Screenshots.Screenshots("TC016_CurrencyChangerToUK");
	
	}
	
	
}
