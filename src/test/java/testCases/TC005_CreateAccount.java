package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC005_CreateAccount  extends BaseClass{

	@Test
	public void registration() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		
		Thread.sleep(3000);
		hp.clickOnSignInBtn();
		
		//login page
		LoginPage lp = new LoginPage();
		lp.clickOnCreateAccBtn();
		lp.firstNameTextField("test");
		lp.LastNameTextField("chilliapple");
		lp.clickNewsLetterCheckBox();
		lp.emailAddressInputField(faker.randomEmail());
		lp.passwordInputField("pawan@96");
		lp.confirmPasswordInputField("pawan@96");
	
		lp.clickOnCreateAccount();
		Thread.sleep(4000);
		MyAccount ac = new MyAccount();
		Assert.assertEquals(ac.myaccountTittle(), "My Account");
		Reusable_Screenshots.Screenshots("TC005_CreateAccount");
	
	
	
	}
}
