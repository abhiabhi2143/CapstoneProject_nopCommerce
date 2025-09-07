package testCase;

import org.testng.annotations.Test;

import pageObjects.Cart;
import testBase.BaseClass;

public class EndToEndCart extends BaseClass{
	
	@Test
	public void cartTest() throws InterruptedException
	{
		Cart c=new Cart(driver);
		c.clickOnRegister();
		c.selectGender("male");
		c.setFirstName("Abhi");
		c.setLastName("Ram");
		c.setEmail("ramuafjfkgvjafj@gmail.com");
		c.setPassword("ram1234");
		c.setConfirmPassword("ram1234");
		c.clickOnRegisterSubmit();
		c.clickOnLogin();
		c.setEmail("ramuafjfkgvjafj@gmail.com");
		c.setPassword("ram1234");
		c.clickOnLoginSubmitButton();
		c.search("microsoft");
		c.clickOnSearch();
		c.addToCart();
	}
}
