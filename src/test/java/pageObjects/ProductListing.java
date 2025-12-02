package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListing extends BasePage{
	
	public ProductListing()
	{
		super();
	}

	//product 
	@FindBy(css="img[title='test123']")
	WebElement testproduct;
	
	//Filters
	@FindBy(xpath="//h2[@id='filters-heading']//button")
	WebElement filterbutton;
	
	@FindBy(xpath="//details[@id='color']//span")
	WebElement colorfilter;
	
	@FindBy(css="a[aria-label='Filter Color Red']")
	WebElement redcolorFilter;
	
	
	public void clickonTestProduct()
	{
		testproduct.click();
	}
	
	public void redColourfilerSelection()
	{
		filterbutton.click();
		wait.elementClickable(colorfilter);
		wait.elementClickable(redcolorFilter);
	}
	
	
	
	
}
