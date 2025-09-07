package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlist extends BasePage{

	public Wishlist(WebDriver driver) {
		super(driver);
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
		
		@FindBy(linkText="Log in")
		WebElement ClickOnLogin;
		
		@FindBy(xpath="//button[@class='button-1 login-button']")
		WebElement ClickOnLoginSubmit;
		
		@FindBy(id="small-searchterms")
		WebElement SearchTxtBox;
		
		@FindBy(xpath="//button[text()='Search']")
		WebElement ClickOnSearch;
		
		@FindBy(xpath="//span[text()='Wishlist']")
		WebElement GoToWishlist;
		
		@FindBy(xpath="//button[@title='Add to wishlist']")
		WebElement AddToWishlist;
		
		@FindBy(xpath="//tbody/tr/td[@class='product']")
		List<WebElement> Products;
		
		
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
			SearchTxtBox.clear();
			SearchTxtBox.sendKeys(product);
		}
		
		public void clickOnSearch()
		{
			ClickOnSearch.click();
		}
		
		public void addToWishlist() throws InterruptedException
		{
			Thread.sleep(2000);
			AddToWishlist.click();
		}
		
		public void goToWishlist()
		{
			GoToWishlist.click();
		}
		
		public void wishlistedProducts()
		{
			System.out.println("The Wishlisted Products are : ");
			for(WebElement prod: Products)
			{
				System.out.println(prod.getText());
			}
			System.out.println();
		}
		

}
