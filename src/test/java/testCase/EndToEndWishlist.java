package testCase;

import org.testng.annotations.Test;

import pageObjects.Wishlist;
import testBase.BaseClass;

public class EndToEndWishlist extends BaseClass{

	@Test
	public void wishlistTest() throws InterruptedException
	{
		Wishlist w=new Wishlist(driver);
		w.clickOnRegister();
		w.selectGender("male");
		w.setFirstName("Abhi");
		w.setLastName("Ram");
		w.setEmail("ramuafjfkgvjafj@gmail.com");
		w.setPassword("ram1234");
		w.setConfirmPassword("ram1234");
		w.clickOnRegisterSubmit();
		w.clickOnLogin();
		w.setEmail("ramuafjfkgvjafj@gmail.com");
		w.setPassword("ram1234");
		w.clickOnLoginSubmitButton();
		w.search("camera");
		w.clickOnSearch();
		w.addToWishlist();
		w.search("sunglasses");
		w.clickOnSearch();
		w.addToWishlist();
		w.goToWishlist();
		w.wishlistedProducts();
	}
}
