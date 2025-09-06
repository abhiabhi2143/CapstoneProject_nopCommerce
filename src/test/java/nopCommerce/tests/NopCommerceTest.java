package nopCommerce.tests;

import org.testng.annotations.Test;

import coreUtilities.testbase.TestBase;

public class NopCommerceTest extends TestBase{
	
	@Test(priority=1)
	public void register() throws InterruptedException
	{
		Register r=new Register(driver);
		r.clickOnRegister();
		r.fillRegisterDetails();
		r.clickOnRegisterSubmit();
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		Login l=new Login(driver);
		l.clickOnLogin();
		l.enterCredentials();
		l.clickOnLoginSubmit();
	}
	
	@Test(priority=3)
	public void search()
	{
		Search s=new Search(driver);
		s.searchForProduct();
	}
	
	@Test(priority=4)
	public void productCatalog()
	{
		ProductCatalog p=new ProductCatalog(driver);
		p.clickOnComputers();
		p.clickOnDesktops();
		p.clickOnOneProduct();
	}
	
	@Test(priority=5)
	public void wishlist()
	{
		Wishlist w=new Wishlist(driver);
		w.searchForAnotherProduct();
		w.addToWishlist();
	}
	
	@Test(priority=6)
	public void cart() throws InterruptedException
	{
		AddToCart a=new AddToCart(driver);
		a.addToCart();
		a.goToCart();
		a.retrieveProductData();
	}
	
	@Test(priority=7)
	public void checkout() throws InterruptedException
	{
		CheckOut c=new CheckOut(driver);
		c.agreeTerms();
		c.clickOnCheckout();
		c.billingAddressDetails();
		c.shippingMethod();
		c.paymentMethod();
		c.paymentInformation();
		c.confirmCheckout();
	}
	
	@Test(priority=8)
	public void logout()
	{
		Logout l=new Logout(driver);
		l.clickOnLogout();
		
	}
	
}
