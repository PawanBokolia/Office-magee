package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListing extends BasePage{

	public ProductListing()
	{
		super();
	}

	//product 
	@FindBy(xpath="//img[@title='Cavan Donegal Tweed Gilet in Navy Herringbone' and @loading='eager']")
	WebElement testproduct;

	//Filters
	@FindBy(xpath="//h2[@id='filters-heading']//button")
	WebElement filterbutton;

	@FindBy(xpath="//details[@id='colour_filter']//span")
	WebElement colorfilter;

	//black filter
	@FindBy(css="a[style='background-color:#141414']")
	WebElement blackColorFilter;

	@FindBy(css="span[class='filter-value font-bold']")
	WebElement filterColourVerify;

	//length filter
	@FindBy(id="fit")
	WebElement lengthFilteropen;

	@FindBy(css="a[aria-label='Filter Length S']")
	WebElement smallLength;

	@FindBy(css="span[class='filter-value font-bold']")
	WebElement lengthVerify;

	//clear all button
	@FindBy(xpath="//a[normalize-space()='Clear All']")
	WebElement clearAllBTN;

	//Category
	@FindBy(id="cat")
	WebElement categoryFilterOption;

	@FindBy(xpath="//a[@class='flex items-center py-1 hover:text-black']/span[text()='Clothing']")
	WebElement clothingCategory;

	@FindBy(css="span[class='filter-value font-bold']")
	WebElement verifyClothingCategory;

	@FindBy(css="a[aria-label='Next']")
	WebElement paginationNextbtn;

	//product click
	public void clickonTestProduct()
	{
		testproduct.click();
	}

	//color filter
	public void redColourfilerSelection()
	{
		filterbutton.click();
		wait.elementClickable(colorfilter);
		wait.elementClickable(blackColorFilter);
	}

	public String checkBlackFilterApply()
	{
		filterbutton.click();
		wait.elementWait(filterColourVerify);
		return filterColourVerify.getText();
	}

	//length filter
	public void lengthFilter()
	{
		filterbutton.click();
		lengthFilteropen.click();
		smallLength.click();
	}

	public String verifySmallLength()
	{
		filterbutton.click();
		wait.elementWait(lengthVerify);
		return lengthVerify.getText();		
	}

	//clear all button
	public void clcikOnClearAllBtn()
	{
		wait.elementClickable(clearAllBTN);
	}

	public boolean filerIsCleared()
	{
		filterbutton.click();
		try {
			return !lengthVerify.isDisplayed();	
		}
		catch(Exception e)
		{
			return true;
		}

	}

	//category filter
	public void categoryFilter()
	{
		filterbutton.click();
		wait.elementClickable(categoryFilterOption);
		wait.elementClickable(clothingCategory);
	}

	public String verifyCategory()
	{
		filterbutton.click();
		wait.elementWait(verifyClothingCategory);
		return verifyClothingCategory.getText();
	}

	public boolean verifyCategoryFilter()
	{
		filterbutton.click();
		try {
			return	!verifyClothingCategory.isDisplayed();	
		}
		catch (Exception e) {
			return true;
		}
	}

	public void clickOnNextBtn()
	{
		js.scrollTo(paginationNextbtn);
		int count = 0;
		while(6 > count)
		{
			try 
			{			
				wait.elementWait(paginationNextbtn);
				paginationNextbtn.click();
				count++;
			}

			catch(Exception e)
			{
				break;
			}
		}
		js.scrollTo(paginationNextbtn);
	}



	}
