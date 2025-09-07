package testCase;

import org.testng.annotations.Test;

import pageObjects.Search;
import testBase.BaseClass;

public class EndToEndSearch extends BaseClass{
	
	@Test
	public void searchTest() throws InterruptedException
	{
		Search s=new Search(driver);
		s.clickOnRegister();
		s.selectGender("male");
		s.setFirstName("Abhi");
		s.setLastName("Ram");
		s.setEmail("ramuafjfkgvjafj@gmail.com");
		s.setPassword("ram1234");
		s.setConfirmPassword("ram1234");
		s.clickOnRegisterSubmit();
		s.clickOnLogin();
		s.setEmail("ramuafjfkgvjafj@gmail.com");
		s.setPassword("ram1234");
		s.clickOnLoginSubmitButton();
		s.search("Apple");
		s.clickOnSearch();
		s.sortByHighToLow();
		s.verifyNoOfProducts();
	}
	
}
