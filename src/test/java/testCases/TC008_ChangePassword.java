package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC008_ChangePassword extends BaseClass {

	@Test
	public void changePassword() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		
		Thread.sleep(3000);
		hp.clickOnSignInBtn();
		
		LoginPage lp = new LoginPage();
		lp.login(p.getProperty("username"), p.getProperty("password"));
		lp.clickonChangePass();
		lp.fillPasswordChangeField(p.getProperty("password"),p.getProperty("NewPassword"),(String) p.get("NewPassword"));
		Reusable_Screenshots.Screenshots("TC008_ChangePassword");
		
		
		
	}
}
