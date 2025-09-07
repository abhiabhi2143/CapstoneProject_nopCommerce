package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Search extends BasePage{

	public Search(WebDriver driver) 
	{
		super(driver);
	}
	
	
	//locators
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
		
		@FindBy(linkText="Log in")
		WebElement ClickOnLogin;
		
		@FindBy(xpath="//button[@class='button-1 login-button']")
		WebElement ClickOnLoginSubmit;
		
		@FindBy(id="small-searchterms")
		WebElement SearchTxtBox;
		
		@FindBy(xpath="//button[text()='Search']")
		WebElement ClickOnSearch;
		
		@FindBy(xpath="//select[@aria-label='Select product sort order']")
		WebElement SortByHighToLow;

		@FindBy(xpath="//div[@class='product-item']")
		List<WebElement> NoOfProducts;
		
		
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
		
		public void clickOnLogin()
		{
			ClickOnLogin.click();
		}
		
		public void clickOnLoginSubmitButton()
		{
			ClickOnLoginSubmit.click();
		}
		
		public void search(String product)
		{
			SearchTxtBox.sendKeys(product);
		}
		
		public void clickOnSearch()
		{
			ClickOnSearch.click();
		}


		public void sortByHighToLow() 
		{
			Select s=new Select(SortByHighToLow);
			s.selectByIndex(4);
		}


		public void verifyNoOfProducts() 
		{
			System.out.println("Total number of apple products are "+NoOfProducts.size());
		}

}
