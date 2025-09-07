package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//constructor
	public LoginPage(WebDriver driver){
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailTxtBox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement PasswordTxtBox;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement ClickOnLoginSubmit;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	WebElement loginUnsuccessfulErrorMsg;
	
	//action methods
	
	public void setEmail(String email) {
        EmailTxtBox.clear();
        EmailTxtBox.sendKeys(email);
    }
	
	public void setPassword(String pwd) {
        PasswordTxtBox.clear();
        PasswordTxtBox.sendKeys(pwd);
    }
	
	public void loginSubmit()
	{
		ClickOnLoginSubmit.click();
	}
	
	public String getLoginErrorMessage() {
	    try {
	       // adjust selector
	        return loginUnsuccessfulErrorMsg.getText();
	    }
	    catch(Exception e)
	    {
	    	return "";
	    }
	}
	
}
