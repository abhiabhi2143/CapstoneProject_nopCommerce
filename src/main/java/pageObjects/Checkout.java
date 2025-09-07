package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Checkout extends BasePage{

	//constructor
	public Checkout(WebDriver driver) {
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
	
	@FindBy(linkText="Computers")
	WebElement ClickOnComputers;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
	WebElement ClickOnDekstops;
	
	@FindBy(linkText="Build your own computer")
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//button[normalize-space()='Add to wishlist']")
	WebElement AddToWishlist;
	
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	WebElement AddToCart;
	
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement GoToCart;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement ClickOnCheckout;
	
	@FindBy(id="termsofservice")
	WebElement AgreeTerms;
	
	@FindBy(id="ShipToSameAddress")
	WebElement SameAddressCheckbox;
	
	@FindBy(id="delete-billing-address-button")
	WebElement DeleteBtn;
	
	@FindBy(id="BillingNewAddress_FirstName")
	WebElement BillingFirstName;
	
	@FindBy(id="BillingNewAddress_LastName")
	WebElement BillingLastName;
	
	@FindBy(id="BillingNewAddress_Email")
	WebElement BillingEmail;
	
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement BillingCountryId;
	
	@FindBy(id="BillingNewAddress_StateProvinceId")
	WebElement BillingStateId;
	
	@FindBy(id="BillingNewAddress_City")
	WebElement BillingCity;
	
	@FindBy(id="BillingNewAddress_Address1")
	WebElement BillingTown;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement BillingPostalCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement BillingPhNo;
	
//	@FindBy(xpath="")	//if the address is already saved, then we use this
//	WebElement SaveAddressButton;
	
	@FindBy(xpath="//button[text()='Continue' and @class='button-1 new-address-next-step-button']")
	WebElement BillingConBtn;
	
	@FindBy(xpath="//button[text()='Continue' and @onclick='if (!window.__cfRLUnblockHandlers) return false; Shipping.save()']")
	WebElement ShippingAddConBtn;
	
	//button[text()='Continue' and @class='button-1 shipping-method-next-step-button' and@type='button']
	@FindBy(xpath="//button[text()='Continue' and @class='button-1 shipping-method-next-step-button' and@type='button']")
	WebElement ShippingMethodConBtn;
	
	@FindBy(xpath="//button[text()='Continue' and @name='save' and @class='button-1 payment-method-next-step-button']")
	WebElement PaymentMethodConBtn;
	
	@FindBy(xpath="//button[text()='Continue' and @class='button-1 payment-info-next-step-button']")
	WebElement PaymentInfoConBtn;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement ConfirmCheckout;
	
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
	
	public void clickOnComputers()
	{
		ClickOnComputers.click();
	}
	
	public void clickOnDesktops()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ClickOnDekstops );

	}
	
	public void clickOnOneProduct()
	{
		ClickOnProduct.click();
	}
	
	public void addToWishlist()
	{
		AddToWishlist.click();
	}
	
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		AddToCart.click();
	}
	
	
	public void goToCart()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		js.executeScript("arguments[0].click();", GoToCart);
	}
	
	public void agreeTerms()
	{
		AgreeTerms.click();
	}
	
	public void clickOnCheckout()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 100)");
		
		ClickOnCheckout.click();
		
	}
	
//	public void sameAddressCheckbox() throws InterruptedException
//	{
//		if(SameAddressCheckbox.isSelected())
//		{
//			SameAddressCheckbox.click();
//		}
//		Thread.sleep(2000);
//		if(DeleteBtn.isDisplayed())
//		{
//			DeleteBtn.click();
//		}
//	}
	
	public void billingCountry(String country)
	{
		Select sle1=new Select(BillingCountryId);
		sle1.selectByVisibleText(country);
		BillingCountryId.sendKeys(Keys.TAB);
	}
	
	public void billingState(String state) throws InterruptedException
	{
		Thread.sleep(2000);
	    Select sle=new Select(BillingStateId);
	    sle.selectByVisibleText(state);
	}
	
	public void billingCity(String city)
	{
		BillingCity.sendKeys(city);
	}
	
	public void billingTown(String town)
	{
		BillingTown.sendKeys(town);
	}
	
	public void billingPostalCode(String code)
	{
		BillingPostalCode.sendKeys(code);
	}
	
	public void billingPhNo(String phno)
	{
		BillingPhNo.sendKeys(phno);
	}
	
	
//	public void saveButton()  //use when address is already saved
//	{
//		driver.findElement(By.cssSelector("button[name='save']")).click();
//    	Thread.sleep(2000);
//	}
	
	public void blilingConBtn() 
	{
		BillingConBtn.click();
	}
	
	public void shippingMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ShippingMethodConBtn);
	}
	
	public void paymentMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("paymentmethod_0")).click(); 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", PaymentMethodConBtn);
       // PaymentMethodConBtn.click();
	}
	
	public void paymentInformation() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", PaymentInfoConBtn);
		Thread.sleep(2000);
		//PaymentInfoConBtn.click();
	}
	
	public void confirmCheckout() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ConfirmCheckout);
		//ConfirmCheckout.click();
		Thread.sleep(3000);
	}
	
	public void clickOnLogout() throws InterruptedException 
	{
		Thread.sleep(3000);
		ClickOnLogout.click();
	}


}
