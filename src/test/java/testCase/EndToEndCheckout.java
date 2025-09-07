package testCase;

import org.testng.annotations.Test;

import pageObjects.Checkout;
import testBase.BaseClass;

public class EndToEndCheckout extends BaseClass{
	
	@Test
	public void checkoutTest() throws InterruptedException
	{
		Checkout ch=new Checkout(driver);
		ch.clickOnRegister();
		ch.selectGender("male");
		ch.setFirstName("Abhi");
		ch.setLastName("Ram");
		ch.setEmail("ramuafkgvjafj@gmail.com");
		ch.setPassword("ram1234");
		ch.setConfirmPassword("ram1234");
		ch.clickOnRegisterSubmit();
		ch.clickOnLogin();
		ch.setEmail("ramuafjfkgvjafj@gmail.com");
		ch.setPassword("ram1234");
		ch.clickOnLoginSubmitButton();
		ch.search("MacBook");
		ch.clickOnSearch();
		ch.clickOnComputers();
		ch.clickOnDesktops();
		ch.clickOnOneProduct();
		ch.search("Adobe Photoshop");
		ch.clickOnSearch();
		ch.addToWishlist();
		ch.addToCart();
		ch.goToCart();
		ch.agreeTerms();
		ch.clickOnCheckout();
		ch.billingCountry("India");
		ch.billingState("Andhra Pradesh");
		ch.billingCity("Rajahmundry");
		ch.billingTown("Mandapeta");
		ch.billingPostalCode("533232");
		ch.billingPhNo("9988776699");
		ch.blilingConBtn();
		ch.shippingMethod();
		ch.paymentMethod();
		ch.paymentInformation();
		ch.confirmCheckout();
		//ch.clickOnLogout();
	}
}
