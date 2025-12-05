package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetail extends BasePage{
	
	
	public ProductDetail()
	{
		super();
	}

	//wish list
	@FindBy(css= "button[title='Add to Wish List']")
	WebElement wishListBtn;
	
	@FindBy(css="a[title='Navy']")
	WebElement navColorSelect;
	
	@FindBy(xpath="//label[@for='attribute-option-92925-35-1']")
	WebElement sizeSectionOption;
	
	
	//Add to cart button 
	@FindBy(css="button[title='Add to Bag']")
	WebElement addtoCartBtn;
	
	//mini cart
	@FindBy(xpath="//template[@x-if='open && cartItem']/parent::dialog")
	WebElement miniCart;
	
	@FindBy(xpath="//button[normalize-space()='Continue Shopping']")
	WebElement contShopBtn;
	
	
	//cartbutton
	@FindBy(css="a[id='menu-cart-icon']")
	WebElement cartBtn;
	
	public void clickonWishlistBtn()
	{
		wishListBtn.click();
	}

	//option selection 
	public void colorSelection()
	{
		navColorSelect.click();
	}
	
	public void sizeSelection()
	{
		sizeSectionOption.click();
	}
	
	//add to cart 
	public void clickOnAddToCartBtn()
	{
		addtoCartBtn.click();
	}
	

	//mini cart present 
	public boolean miniCartDispaly()
	{
		wait.elementWait(miniCart);
		return miniCart.isDisplayed();
	}
	
	public void clickOnContBtn()
	{
		js.scrollTo(contShopBtn);
		wait.elementWait(contShopBtn);
		contShopBtn.click();
	}
	
	public void clickOnCartBtn()
	{
		wait.elementClickable(cartBtn);
	}
	
}
