package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage()
	{
		super();
	}
	
	
	@FindBy(css="input[title='Qty']")
	WebElement quantityFiled;
	
	@FindBy(css= "button[name='update_cart_action']")
	WebElement updateQuntBtn;
	
	public void changeQuntityField()
	{
		quantityFiled.clear();
		quantityFiled.sendKeys("4");
	}
	
	public void clickOnUpdateQnt()
	{
		updateQuntBtn.click();
	}
	
	
	
	
}
