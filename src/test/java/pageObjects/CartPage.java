package pageObjects;

import java.util.List;

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
	
	//price and tax (Text)
	@FindBy(css="div[x-text='hyva.formatPrice(segment.value)']")
	List<WebElement> priceAndTaxText;
	
	//edit button
	@FindBy(css="a[aria-label='Edit Houndstooth Scarf in Blue']")
	WebElement editBtn;
	
	//delete button
	@FindBy(css="button[aria-label='Remove Houndstooth Scarf in Blue']")
	WebElement deteleBtn;
	
	//coupon code
	@FindBy(css="input#coupon_code")
	WebElement couponCode;
	
	@FindBy(css="button[value='Apply']")
	WebElement couponApplyBtn;
	
	//checkout button
	@FindBy(id="checkout-link-button")
	WebElement checkoutBtn;
	
	
	
	public void changeQuntityField(String quntity)
	{
		quantityFiled.clear();
		quantityFiled.sendKeys(quntity);
	}
	
	public void clickOnUpdateQnt()
	{
		updateQuntBtn.click();
	}
	
	//0-tax  1-price 
	public String PriceCheck()
	{
		return priceAndTaxText.get(1).getText();
	}
	
	public void clickOnEditButton()
	{
		editBtn.click();
	}
	
	public void clickOnDeleteBtn()
	{
		deteleBtn.click();
	}
	
	//coupon code
	public void applyCouponCode(String code)
	{
		couponCode.sendKeys(code);
		wait.elementClickable(couponApplyBtn);
	}
	
	//checkout button 
	public void clickonCheckoutBtn()
	{
		checkoutBtn.click();
	}
}
