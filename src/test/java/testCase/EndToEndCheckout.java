package testCase;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Cart;
import pageObjects.Checkout;
import pageObjects.HomePage;
import pageObjects.Register;
import pageObjects.Search;
import pageObjects.Wishlist;
import testBase.BaseClass;

public class EndToEndCheckout extends BaseClass{
	
  @Test(dataProvider = "CheckoutData", dataProviderClass = utilities.DataProviders.class)
  public void verify_checkout(String agreeTerms, String country, String state,
        String city, String town, String postalCode, String phone, String productName) throws Exception 
  {
	  
	  HomePage hp = new HomePage(driver);
	  hp.selectRegister();
		
	  Register accpage = new Register(driver);
		Map<String, String> userData = generateRegistrationData();
		accpage.selectGender(userData.get("gender"));
		accpage.setFirstName(userData.get("firstName"));
		accpage.selectGender(userData.get("gender"));
		accpage.setFirstName(userData.get("firstName"));
		accpage.setLastName(userData.get("lastName"));
		accpage.setEmail(userData.get("email"));
		accpage.setCompanyName(userData.get("companyName"));
		accpage.setPassword(userData.get("password"));
		accpage.setConfirmPassword(userData.get("password"));
		accpage.clickSubmit();

		Assert.assertTrue(accpage.isRegistrationSuccessMessageDisplayed(),
				"Registration failed for: " + userData.get("email"));

		// hp.selectLogout();

		Search searchProduct = new Search(driver);
		Checkout cp = new Checkout(driver);
		Cart addCart = new Cart(driver);
		Wishlist wp = new Wishlist(driver);
		
        searchProduct.setsearchTxtBox(productName);
		searchProduct.clicksearchBtn();
		wp.addToWishlist();
		
		
		Thread.sleep(3000);
		addCart.addToCart();
		Thread.sleep(5000);
		addCart.clickShoppingCartBtn();
	//	apply agree terms if specified in Excel (yes/no)
	     if (agreeTerms != null && agreeTerms.trim().equalsIgnoreCase("yes")) 
	     {
	           cp.agreeTerms();
	      }	
	     
		cp.clickOnCheckout();
		cp.billingCountry(country);
		Thread.sleep(3000);
		cp.billingState(state);
		cp.billingCity(city);
		cp.billingTown(town);
		cp.billingPostalCode(postalCode);
		cp.billingPhNo(phone);
		cp.blilingConBtn();
		cp.shippingMethod();
		cp.paymentMethod();
		cp.paymentInformation();
		cp.confirmCheckout();
		hp.selectLogout();
  }
	}