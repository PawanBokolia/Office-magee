package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC002_NewsLetterSuccess extends BaseClass {
	
	@Test
	public void NewsLetterSuccess() throws InterruptedException {
		
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.newletterEmail(faker.randomEmail());
		hp.newsSignupBtnClick();
				
		Assert.assertEquals(hp.newsSuccessMsg(), "Thank you for your subscription.");
		Reusable_Screenshots.Screenshots("TC002_NewsLetterSuccess");
		
		
		
		
		
	}
}
