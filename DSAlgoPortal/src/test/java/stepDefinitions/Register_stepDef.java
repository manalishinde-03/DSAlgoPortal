package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Register_stepDef {
	
	HomePage homePage = new HomePage(Hooks.driver);
	LoginPage loginPage = new LoginPage(Hooks.driver);
	RegisterPage registerPage = new RegisterPage(Hooks.driver);
	
	
	
	@Given("user navigates to Register page")
	public void user_navigates_to_register_page() {
		homePage.clickRegister();
		
	}
	
	@When("^user enters (.*) in username field on Register page$")
	public void user_enters_username_on_register_page(String username) {
		registerPage.enterUsername(username);
		
		
	}
	@When("^user enters (.*) and (.*) in password fields on Register page$")
	public void user_enters_password_and_Passwordconfirm_on_register_page(String password, String confirmPassword) {
		registerPage.enterPassword(password);
		registerPage.enterPasswordConfirmation(confirmPassword);
	}
	
	
	@When("user clicks on Register button")
	public void user_clicks_on_register_button() {
		homePage = registerPage.clickRegisterBtn();
	}
	
	@Then("^validate the error (.*) on Register page for invalid data$")
	public void validate_message_registerPage(String expectedMessage) {
		registerPage.validateErrorMsgRegistration(expectedMessage);
	}
	
	@Then("^validate (.*) on Register page$")
	public void validate_toolTipmessage_registerPage(String expectedMessage) {
		registerPage.validateToolTipErrorMsgRegistration(expectedMessage);
	}
	
	@Then("^validate the (.*) on home page after registration for (.*)$")
	public void validate_the_msg_on_home_page_afterReg(String message, String username) {
		homePage.validateMsgAfterRegistration(message, username);
	    
	}
	
	@Then("user clicks on Login link")
	public void navigateToLogin() {
		loginPage = registerPage.clickLoginLink();
	}

}
