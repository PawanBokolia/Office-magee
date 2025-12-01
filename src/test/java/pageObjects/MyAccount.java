package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class MyAccount extends BasePage{
	
	public MyAccount()
	{
		super();
	}
	
	@FindBy(css ="span[data-ui-id='page-title-wrapper']")
	WebElement myAccountTitle;
	
	@FindBy(css="a[id='customer.header.sign.out.link']")
	WebElement signOutBtn;
	
	@FindBy(xpath ="//span[@x-html='message.text']")
	WebElement wishlistConfMsg;
	
	@FindBy(css="a[title='Remove Item']")
	WebElement removeWishListItem;
	
	@FindBy(xpath="//span[@x-html='message.text']")
	WebElement removeWishlistItemMsg;
	
	
	public String myaccountTittle()
	{
		return myAccountTitle.getText();
	}
	
	public void clickOnSignOutBtn()
	{
		wait.elementClickable(signOutBtn);
	}
	
	public String wishlistConfMsg()
	{
		return wishlistConfMsg.getText();
	}

	public void removeWishlistItem()
	{
		js.scrollTo(removeWishListItem);
		wait.elementClickable(removeWishListItem);
	}
	
	public String removeWishlistMsg()
	{
		return removeWishlistItemMsg.getText();
	}
	
	
	
	
}
