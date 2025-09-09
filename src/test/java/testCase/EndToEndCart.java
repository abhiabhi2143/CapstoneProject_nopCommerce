package testCase;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Cart;
import pageObjects.HomePage;
import pageObjects.Register;
import pageObjects.Search;
import testBase.BaseClass;

public class EndToEndCart extends BaseClass{
  @Test(dataProvider = "SearchData", dataProviderClass = utilities.DataProviders.class)
  public void verify_addToCart(String productName) {
	  
	  try {
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

			Search searchProduct = new Search(driver);
			searchProduct.setsearchTxtBox(productName);
			searchProduct.clicksearchBtn();
			searchProduct.verifyNoOfProducts();
			searchProduct.sortByHighToLow();
			
			Cart addCart = new Cart(driver);
			Thread.sleep(5000);
			addCart.addToCart();
			Thread.sleep(5000);
			addCart.clickaddingProductTocartBtn();
			addCart.clickShoppingCartBtn();
			hp.selectLogout();
		} catch (Exception e) {
			Assert.fail("Exception in registration: " + e.getMessage());
		}

	}
}