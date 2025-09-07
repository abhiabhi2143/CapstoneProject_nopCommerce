package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BasePage{

	//constructor
	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(linkText="Register")
	WebElement ClickOnRegister;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement MaleRad;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement FemaleRad;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstNameTxtBox;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastNameTxtBox;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailTxtBox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement PassTxtBox;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement PassConfirmTxtBox;
	
	@FindBy(id="register-button")
	WebElement RegisterSubmit;
	
	@FindBy(linkText="Log out")
	WebElement ClickOnLogout;
	
	//action methods
	public void clickOnRegister() throws InterruptedException
	{
		Thread.sleep(3000);
		ClickOnRegister.click();
	}
	
	
	public void selectGender(String gender) 
	{
	    if (gender.equalsIgnoreCase("male")) 
	    {
	        MaleRad.click();
	    } 
	    else if (gender.equalsIgnoreCase("female")) 
	    {
	        FemaleRad.click();
	    } 
	    else 
	    {
	        throw new IllegalArgumentException("Invalid gender: " + gender);
	    }
	}
	public void setFirstName(String fname) 
	{
	     FirstNameTxtBox.clear();
	     FirstNameTxtBox.sendKeys(fname);
	}

	public void setLastName(String lname) 
	{
	     LastNameTxtBox.clear();
	     LastNameTxtBox.sendKeys(lname);
	}

	public void setEmail(String email) 
	{
		 EmailTxtBox.clear();
	     EmailTxtBox.sendKeys(email);
	}


	public void setPassword(String pwd) 
	{
	     PassTxtBox.clear();
	     PassTxtBox.sendKeys(pwd);
	}

	public void setConfirmPassword(String cpwd) 
	{
	     PassConfirmTxtBox.clear();
	     PassConfirmTxtBox.sendKeys(cpwd);
	}
	
	public void clickOnRegisterSubmit()
	{
		RegisterSubmit.click();
	}
	
	
	public void clickOnLogout() throws InterruptedException 
	{
		Thread.sleep(3000);
		ClickOnLogout.click();
	}

	
}
