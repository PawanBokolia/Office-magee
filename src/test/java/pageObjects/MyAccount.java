package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{
	
	public MyAccount()
	{
		super();
	}
	
	@FindBy(css ="span[data-ui-id='page-title-wrapper']")
	WebElement myAccountTitle;
	
	@FindBy(css="a[id='customer.header.sign.out.link']")
	WebElement signOutBtn;
	
	public String myaccountTittle()
	{
		return myAccountTitle.getText();
	}
	
	public void clickOnSignOutBtn()
	{
		wait.elementClickable(signOutBtn);
	}
	
	
}
