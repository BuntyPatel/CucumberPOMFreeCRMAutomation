package com.qa.StepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	
	
	@Given("^user opens browser$")
	public void user_opens_browser()  {
		TestBase.initialization();
		testUtil = new TestUtil();

	}

	@When("^user is on login Page$")
	public void user_is_on_login_Page(){
	    loginPage = new LoginPage(); // initialize the instance variable
	    String title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}


	@Then("^user logs into app$")
	public void user_enters_username_and_password() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page title$")
	public void validate_home_page_title()  {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO",homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() {
		testUtil.SwitchToFrame();
		boolean flag = homePage.verifyCorrectUserName();
		Assert.assertTrue(flag);

	}
	
	@Then ("^close the browser$")
	public void tearDown() {
		driver.quit();
	}
		
	
	
	
}
