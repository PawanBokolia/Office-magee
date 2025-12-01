package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	
	
	
	//cookies
	public void acceptCookies() 
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
	
	public void clickOnSignInBtn()
	{
		act.mouseClick(signInBtn);
	}
	
	//wishList
	public void clickonMenCategory()
	{
		category1.click();
	}
	
	
	
	
	
	
	
	
}
