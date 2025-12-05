package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

	public CheckoutPage()
	{
		super();
	}

	//Customer Details
	@FindBy(name="email_address")
	WebElement emailField;
	
	@FindBy(name="firstname")
	WebElement firstnameField;
	
	@FindBy(name="lastname")
	WebElement lastnameField;
	
	@FindBy(name="street[0]")
	WebElement streetField;
	
	@FindBy(name="region")
	WebElement regionFeild;
	
	@FindBy(name="postcode")
	WebElement zipCodeField;
	
	@FindBy(name="city")
	WebElement cityField;
	
	@FindBy(name="telephone")
	WebElement phoneField;
	
	@FindBy(name="company")
	WebElement companyField;
	
	//shadow dom drop down
	@FindBy(css="select#shipping-country_id")
	WebElement countryDrp;
	
	//order type
	@FindBy(xpath="//iframe[@title='Secure payment input frame']")
	WebElement iframe;
	
	@FindBy(css="input#payment-method-stripe_payments")
	WebElement cardPayment;
	
	@FindBy(name="number")
	WebElement cardNo;
	
	@FindBy(name="expiry")
	WebElement expDate;
	
	@FindBy(name="cvc")
	WebElement cvvNo;
	
	@FindBy(id="shipping-method-bestway")
	WebElement shipping;
	
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	WebElement orderplaceBtn;
	
	
	
	public void customerDetails(String email, String firstname, String lastname,String address)
	{
		emailField.sendKeys(email);
		firstnameField.sendKeys(firstname);
		lastnameField.sendKeys(lastname);
		streetField.sendKeys(address);
	}
	
	public void addressDetails(String state, String zipcode, String city,String phoneno,String company)
	{
		regionFeild.sendKeys(state);
		zipCodeField.sendKeys(zipcode);
		cityField.sendKeys(city);
		phoneField.sendKeys(phoneno);
		companyField.sendKeys(company);
	}
	
	//select class work if present
	public void countryDRpSelect()
	{
//		SearchContext shadow = countryDrp.getShadowRoot();
//		shadow.findElement(By.cssSelector("option[value='GB']")).click();

		 Select sel = new Select(countryDrp);
		 sel.selectByValue("GB");
	}
	
	public void cardDetals(String number,String exp,String securityCode) 
	{
		
		driver.switchTo().frame(iframe);
		cardNo.sendKeys(number);
		expDate.sendKeys(exp);
		cvvNo.sendKeys(securityCode);
		driver.switchTo().defaultContent();
		
	}
	
	public void clickOnOrderPlaceBtn()
	{
		orderplaceBtn.click();
	}
	
	public void selectShippingMethod()
	{
		shipping.click();
	}
	
}
