package stepDefinitions;

import java.io.IOException;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
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
	
	@When("user fills registration form from sheetname {string} and row {int}")
	public void user_fills_registration_form_register_page(String sheetname, int row) throws InvalidFormatException, IOException {
		registerPage.fillRegistrationForm(sheetname,row);
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
	
	@Then("verify error for invalid data from sheetname {string} and row {int} on Register page")
	public void validate_error_registerPage(String sheetname, int row) throws InvalidFormatException, IOException {
		registerPage.validateErrorMsgFromExcel(sheetname,row);
	}
	
	@Then("^validate (.*) on Register page$")
	public void validate_toolTipmessage_registerPage(String expectedMessage) {
		registerPage.validateToolTipErrorMsgRegistration(expectedMessage);
	}
	
	@Then("Tooltip error validation from sheetname {string} and row {int} on Register page")
	public void validate_toolTipFromExcel_registerPage(String sheetname, int row) throws InvalidFormatException, IOException {
		registerPage.validateToolTipErrorMsgExcel(sheetname,row);
	}
	
	@Then("^validate the (.*) on home page after registration for (.*)$")
	public void validate_the_msg_on_home_page_afterReg(String message, String username) {
		homePage.validateMsgAfterRegistration(message, username);
	    
	}
	
	@Then("validate the message after registration from sheetname {string} and row {int} on home page")
	public void validate_success_msg_from_Excel_onHomePage(String sheetname, int row) throws InvalidFormatException, IOException {
		homePage.validateMsgFromExcelAfterRegistration(sheetname,row);
		
	}
	
	@Then("user clicks on Login link")
	public void navigateToLogin() {
		loginPage = registerPage.clickLoginLink();
	}

}
