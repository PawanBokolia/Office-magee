package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetail extends BasePage{
	
	
	public ProductDetail()
	{
		super();
	}

	@FindBy(css= "button[title='Add to Wish List']")
	WebElement wishListBtn;
	
	
	public void clickonWishlistBtn()
	{
		wishListBtn.click();
	}

}
