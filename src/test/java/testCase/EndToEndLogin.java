package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class EndToEndLogin extends BaseClass {
	
	@Test(dependsOnMethods = {"testCase.EndToEndRegister.registrationTest"})
	public void TC001_VerifyLoginCredentialValidData() 
	{
		try {
			
			HomePage hp = new HomePage(driver);
	        hp.selectLogin();
	        
	        
	        LoginPage lp = new LoginPage(driver);
	     // read saved credentials from TS001
	        String email = EndToEndRegister.registeredEmail;
	        String password = EndToEndRegister.registeredPassword;
	        
	        // fail fast with clear message if credentials are missing
	        if (email == null || email.trim().isEmpty()) {
	            Assert.fail("Login aborted: registeredEmail is null/empty. Ensure registrationTest ran and stored credentials.");
	        }
	        if (password == null || password.trim().isEmpty()) {
	            Assert.fail("Login aborted: registeredPassword is null/empty. Ensure registrationTest ran and stored credentials.");
	        }
	       
	        lp.setLoginEmail(EndToEndRegister.registeredEmail);     // reuse saved email
	        lp.setLoginPassword(EndToEndRegister.registeredPassword); // reuse saved password
	        lp.clickLoginSubmitBtn();
	
	        Assert.assertTrue(lp.isLogoutDisplayed(),
	                "Login failed for user: " + EndToEndRegister.registeredEmail);
	
	        hp.selectLogout();
	    } 
		catch (Exception e) 
		{
	        Assert.fail("Exception in login test: " + e.getMessage());
	    }
	
	}
}