package pageObjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class HomePage extends BasePage{

	public HomePage()
	{
		super();
	}

	@FindBy(xpath ="//button[@title='Accept all cookies']")
	WebElement cookies;
	
	
	//Category
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[1]")
	WebElement category1;
	
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[2]")
	WebElement category2;
	
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[3]")
	WebElement category3;
	
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[4]")
	WebElement category4;
	
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[5]")
	WebElement category5;
	
	@FindBy(xpath="//ul[@class='flex flex-wrap']/div[6]")
	WebElement category6;
	
	
	//newsLetter home page 
	@FindBy(css ="input[type='email']")
	WebElement newsletter;
	
	@FindBy(xpath="//button[normalize-space()='sign up']")
	WebElement signupButton;
	
	@FindBy(css ="div[class='message success']")
	WebElement newsSucces;
	
	//Contact us
	@FindBy(linkText="Contact Us")
	WebElement contactUs;
	
	@FindBy(css="span[class='base']")
	WebElement contactUsTitle;
	
	
	//about us
	@FindBy(css="a[class='pagebuilder-button-secondary']")
	WebElement aboutUsBtn; 
	
	@FindBy(xpath = "//span[normalize-space()='Our']")
	WebElement aboutUsTitlt1;
	
	@FindBy(xpath = "//span[normalize-space()='Story']")
	WebElement aboutUsTitlt2;
	
	@FindBy(xpath="//div[@class='relative inline-block']")
	WebElement signInBtn;
	
	
	//Search Functionality
	@FindBy(id="menu-search-icon")
	WebElement searchIcon;
	
	@FindBy(id="search")
	WebElement searchField;
	
	@FindBy(xpath= "(//div[@class='font-normal text-xs text-primaryNew min-h-8'])[1]") //indexing used
	WebElement productNameInSearch;
	
	@FindBy(xpath="//button[normalize-space()='View All Products']")
	WebElement viewAllBtn;
	
	@FindBy(xpath="//a[normalize-space()='Houndstooth Scarf in Blue']") //need to change according to product name 
	WebElement searchResultInViewAll;
	
	
	//Currency changer
	@FindBy(xpath="//button[@class='inline-flex justify-center w-full focus:outline-none']")
	WebElement currencyBtn;
	
	@FindBy(css="button[class='inline-flex items-center w-full text-left  font-medium text-primaryNew text-sm focus:outline-none']")
	WebElement currencyDrp;
	
	
	
	//cookies
	public void acceptCookies() throws InterruptedException 
	{
		try 
		{
			if(cookies.isDisplayed())
			{
				wait.elementClickable(cookies);
			}
		}
		catch(Exception e )
		{
			System.out.println("cookies pop not present");
		}
		
		Thread.sleep(3000);
		
	}
	
	
	// Mega menu 
	public void megamenuopen() throws InterruptedException
	{
		act.mouseHover(category1);
		Thread.sleep(3000);
		act.mouseHover(category2);
		Thread.sleep(3000);
		act.mouseHover(category3);
		Thread.sleep(3000);
		act.mouseHover(category4);
		Thread.sleep(3000);
		act.mouseHover(category5);
		Thread.sleep(3000);
		act.mouseHover(category6);
		Thread.sleep(3000);
	}
	
	//newsLetter
	public void newletterEmail(String email) 
	{
		js.scrollTo(newsletter);
		newsletter.sendKeys(email);
	}
	
	//newsletter
	public void newsSignupBtnClick()
	{
		wait.elementClickable(signupButton);
	}
	
	public String newsSuccessMsg()
	{
		return newsSucces.getText();
	}
	
	//contact us
	public void clickOnContactUsbtn()
	{
		js.scrollTo(contactUs);
		wait.elementClickable(contactUs);
	}

	public String contactUsTitle()
	{
		return contactUsTitle.getText();
	}

	//about us 
	public void aboutUsBtn()
	{
		wait.elementClickable(aboutUsBtn);
	}
	
	public String aboutUsTitle()
	{
		js.scrollTo(aboutUsTitlt1);
		return aboutUsTitlt1.getText()+aboutUsTitlt2.getText();
	}
	
	//sign in button 
	public void clickOnSignInBtn()
	{
		act.mouseClick(signInBtn);
	}
	
	
	//wishList
	public void clickonMenCategory()
	{
		category1.click();
	}
	
	
	//search Functionality
	public void clickonSearchIcon()
	{
		searchIcon.click();
	}
	
	public void searchFieldText(String productOrSku)
	{
		searchField.sendKeys(productOrSku);
	}
	
	public String searchResultProNameInrecommendation()
	{
		wait.elementPresent(productNameInSearch);
		return	productNameInSearch.getText();
	}
	
	public String seachResultInViewAll()
	{
		viewAllBtn.click();
		wait.elementPresent(searchResultInViewAll);
		js.scrollTo(searchResultInViewAll);
		return searchResultInViewAll.getText();
	}
	
	
	//currency change
	public void clickonCurrenyBtn()
	{
		currencyBtn.click();
	}
	
	
	
	public void currencyChanger(String name) throws IOException
	{
		currencyDrp.click();
		
		HashMap<String,String> map = new HashMap<>();
		ExcelUtility excel = new ExcelUtility(System.getProperty("user.dir")+"//test-data//Magee-currency.xlsx");
		int totalrow = excel.getRowCount("Sheet1");
		
		for(int i=1; i<=totalrow; i++)
		{
			String code = excel.getCellData("Sheet1", i, 0);
			String xpath= excel.getCellData("Sheet1", i, 1);
		
			map.put(code, xpath);
		}
	
		String finalXpath = map.get(name);
		WebElement Element = driver.findElement(By.xpath(finalXpath));
		js.scrollTo(Element);
		Element.click();
	}
	
	public String currentURL()
	{
		 String CurrentURL = driver.getCurrentUrl();
		 return CurrentURL;
	}
	
	
	
}
