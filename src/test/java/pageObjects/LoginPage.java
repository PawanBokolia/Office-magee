package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage()
	{
		super();
	}

	//registration
	@FindBy(xpath ="//span[text()='Create an Account']/parent::a")
	WebElement createAccontbtn;
	
	@FindBy(name="firstname")
	WebElement firstnamefield;
	
	@FindBy(id ="lastname")
	WebElement lastNameInput;
	
	@FindBy(css ="input[title='Sign Up for Newsletter']")
	WebElement newsletterCheckBox;
	
	@FindBy(id="email_address")
	WebElement emailaddressfield;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(name="password_confirmation")
	WebElement confPassword;
	
	@FindBy(css="button[title='Create an Account']")
	WebElement createAcoountBtn;
	
	//login
	@FindBy(id="email")
	WebElement emailInput;
	
	@FindBy(id="pass")
	WebElement passwordFieldlogin;
	
	@FindBy(name="send")
	WebElement singInButton;
	
	public void clickOnCreateAccBtn()
	{
		createAccontbtn.click();
	}
	
	public void firstNameTextField(String firstname)
	{
		firstnamefield.sendKeys(firstname);
	}
	
	public void LastNameTextField(String lastName)
	{
		lastNameInput.sendKeys(lastName);
	}
	
	public void clickNewsLetterCheckBox()
	{
		newsletterCheckBox.click();
	}
	
	public void emailAddressInputField(String email)
	{
		emailaddressfield.sendKeys(email);
	}
	
	public void passwordInputField(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void confirmPasswordInputField(String ConfirmPassword)
	{
		confPassword.sendKeys(ConfirmPassword);
	}
	
	public void clickOnCreateAccount()
	{
		createAcoountBtn.click();
	}
	

	//login
	public void emailInputFieldLogin(String email)
	{
		emailInput.sendKeys(email);
	}

	public void passwordInputLogin(String password)
	{
		passwordFieldlogin.sendKeys(password);
	}
	
	public void clickonSignInBtn()
	{
		singInButton.click();
	}
}
