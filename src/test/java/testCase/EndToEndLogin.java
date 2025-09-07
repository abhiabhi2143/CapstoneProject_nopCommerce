package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class EndToEndLogin extends BaseClass {
	@Test(priority = 1)
	public void TC001_VerifyLoginCredentialValidData() {

		//System.out.println("Trying login with: " + email + " / " + password);
		HomePage hp = new HomePage(driver);
		hp.selectLogin();

		LoginPage lp = new LoginPage(driver);
		lp.setEmail("ram001@gmail.com");
		lp.setPassword("ram1234");
		lp.loginSubmit();

		// inside your test method, after lp.clickLoginSubmitBtn();
		String err = lp.getLoginErrorMessage(); // implement this in LoginPage if not present
		if (err != null && err.trim().length() > 0) {
			Assert.fail("Login failed with error: " + err);
		}

		// or explicit check for expected text
		// Assert.assertFalse(err.contains("Login was unsuccessful"), "Login failed: " +
		// err);
	}
}
