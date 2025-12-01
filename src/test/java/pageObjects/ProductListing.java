package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListing extends BasePage{
	
	public ProductListing()
	{
		super();
	}

	@FindBy(css="img[title='test123']")
	WebElement testproduct;
	
	
	public void clickonTestProduct()
	{
		testproduct.click();
	}
	
	
	
	
	
}
