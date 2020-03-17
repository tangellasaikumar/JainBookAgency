package com.cts.stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cts.Base.LaunchWebDriver;
import com.cts.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
	WebDriver driver;

	@Given("I have browser with  JainBookAgencyPage")
	public void i_have_browser_with_JainBookAgencyPage() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
	}

	@When("I enter <validmailId> as {string} ,I enter <repeatEmailAddress> as {string}, I enter <validpassword> as {string} and I enter <Repeat Password> as {string}")
	public void i_enter_validmailId_as_I_enter_repeatEmailAddress_as_I_enter_validpassword_as_and_I_enter_Repeat_Password_as(
			String mail, String mailid1, String password, String password1) {

		HomePage.ClickOnLogin(driver);

		HomePage.ClickOnSignUp(driver);

		HomePage.enterEmailId(driver, mail);

		HomePage.enterPassword(driver, password);

		HomePage.reEnterEmailId(driver, mailid1);

		HomePage.reEnterPassword(driver, password1);

		HomePage.ClickOnSignUpNow(driver);
	}

	@Then("I should create an account successfully.")
	public void i_should_create_an_account_successfully() {
		HomePage.signinMessage(driver);
	}

	@When("I enter <invalidmailId> as {string} ,I enter <repeatEmailAddress> as {string}, I enter <password> as {string} and I enter <Repeat Password> as {string}")
	public void i_enter_invalidmailId_as_I_enter_repeatEmailAddress_as_I_enter_password_as_and_I_enter_Repeat_Password_as(
			String userName1, String password1, String mailid11, String password11) {

		HomePage.ClickOnLogin(driver);

		HomePage.ClickOnSignUp(driver);

		HomePage.enterEmailId(driver, userName1);

		HomePage.enterPassword(driver, password1);

		HomePage.reEnterEmailId(driver, mailid11);

		HomePage.reEnterPassword(driver, password11);

		HomePage.ClickOnSignUpNow(driver);

	}

	@Then("I should get a error message")
	public void i_should_get_a_error_message() {
		HomePage.invalidMessage(driver);
	}
	
	
	

//	@When("I enter <mailId> as {string} ,I enter <validpassword> as {string}")
//	public void i_enter_mailId_as_I_enter_validpassword_as(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

//	@Then("I should login successfully and  search for books.")
//	public void i_should_login_successfully_and_search_for_books() {
//	    
//	}
//
//	
//	@When("I enter <invalidmailId> as {string} , I enter <password> as {string}")
//	public void i_enter_invalidmailId_as_I_enter_password_as(String string, String string2) {
//	   
//	}
//
//	@Then("I should get a invalid mailId message displayed as {string}")
//	public void i_should_get_a_invalid_mailId_message_displayed_as(String string) {
//	   
//	}
//
//
//	@When("I enter <mailId> as {string} , I enter <invalidpassword> as {string}")
//	public void i_enter_mailId_as_I_enter_invalidpassword_as(String string, String string2) {
//	   
//	}
//
//	@Then("I should get a inValid password  message displayed as {string}")
//	public void i_should_get_a_inValid_password_message_displayed_as(String string) {
//	    
//	}
//
//	
//	@When("I connect Excel and get the values from Ecel.")
//	public void i_connect_Excel_and_get_the_values_from_Ecel() {
//	   
//	}
//
//	@Then("I should get the values from Excel and fill in the specified text boxes.")
//	public void i_should_get_the_values_from_Excel_and_fill_in_the_specified_text_boxes() {
//	    
//	}


