package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC006_LoginLogout extends BaseClass{

	@Test
	public void loginLogout() throws InterruptedException 
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		
		Thread.sleep(3000);
		hp.clickOnSignInBtn();
		
		LoginPage lg = new LoginPage();
		lg.login(p.getProperty("username"),p.getProperty("password"));
		
		MyAccount ac = new MyAccount();
		Assert.assertEquals(ac.myaccountTittle(),"My Account");
		hp.clickOnSignInBtn();
		ac.clickOnSignOutBtn();
		Reusable_Screenshots.Screenshots("TC006_LoginLogout");
	}
	
	
}
