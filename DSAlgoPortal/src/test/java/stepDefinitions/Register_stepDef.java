package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.TestBase;

public class Register_stepDef extends TestBase {
	
	HomePage home;
	LoginPage login;
	RegisterPage register;
	
	
	
	@Given("user navigates to Register page")
	public void user_navigates_to_register_page() {
		home= new HomePage();
		home.clickRegister();
		
	}
	
	@When("^user enters (.*) in username field on Register page$")
	public void user_enters_username_on_register_page(String username) {
		register = new RegisterPage();
		register.enterUsername(username);
		
		
	}
	@When("^user enters (.*) and (.*) in password fields on Register page$")
	public void user_enters_password_and_Passwordconfirm_on_register_page(String password, String confirmPassword) {
		register.enterPassword(password);
		register.enterPasswordConfirmation(confirmPassword);
	}
	
	
	@When("user clicks on Register button")
	public void user_clicks_on_register_button() {
		register= new RegisterPage();
		home = register.clickRegisterBtn();
	}
	
	@Then("^validate the error (.*) on Register page for invalid data$")
	public void validate_message_registerPage(String expectedMessage) {
		register.validateErrorMsgRegistration(expectedMessage);
	}
	
	@Then("^validate (.*) on Register page$")
	public void validate_toolTipmessage_registerPage(String expectedMessage) {
		register.validateToolTipErrorMsgRegistration(expectedMessage);
	}
	
	@Then("^validate the (.*) on home page after registration for (.*)$")
	public void validate_the_msg_on_home_page_afterReg(String message, String username) {
		home = new HomePage();
		home.validateMsgAfterRegistration(message, username);
	    
	}
	
	@Then("user clicks on Login link")
	public void navigateToLogin() {
		login = new LoginPage();
		login = register.clickLoginLink();
	}

}
