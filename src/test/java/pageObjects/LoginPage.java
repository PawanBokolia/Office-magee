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
	
	
	//Change Password
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement changePasswordBtn;
	
	@FindBy(id="current-password")
	WebElement currentPasswordField;
	
	@FindBy(id="password")
	WebElement newPasswordField;
	
	@FindBy(id ="password-confirmation")
	WebElement ConfNewPasswordField;
	
	@FindBy(css="button[type='submit']")
	WebElement saveNewPassBtn;
	
	
	//create account
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
	public void login(String email, String password)
	{
		emailInput.sendKeys(email);
		passwordFieldlogin.sendKeys(password);
		singInButton.click();
	}

	public void clickonChangePass()
	{
		changePasswordBtn.click();
	}
	
	public void fillPasswordChangeField(String currentPassword,String newPAssword,String ConfNewPassword)
	{
		currentPasswordField.sendKeys(currentPassword);
		newPasswordField.sendKeys(newPAssword);
		ConfNewPasswordField.sendKeys(ConfNewPassword);
		saveNewPassBtn.click();
	}
	
 
	
	
}
