package stepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Register_stepDef {
	
	HomePage homePage; 
	LoginPage loginPage; 
	RegisterPage registerPage; 
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	
	@Given("user navigates to Register page")
	public void user_navigates_to_register_page() {
		driver = driverFactory.getDriver();
		homePage = new HomePage(driver);
		homePage.clickRegister();
		
	}
	
	@When("user fills registration form from sheetname {string} and row {int}")
	public void user_fills_registration_form_register_page(String sheetname, int row) throws InvalidFormatException, IOException, Exception {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
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
		driver = driverFactory.getDriver();
		homePage =  new HomePage(driver);
		homePage = registerPage.clickRegisterBtn();
	}
	
	@Then("^validate the error (.*) on Register page for invalid data$")
	public void validate_message_registerPage(String expectedMessage) {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		registerPage.validateErrorMsgRegistration(expectedMessage);
	}
	
	@Then("verify error for invalid data from sheetname {string} and row {int} on Register page")
	public void validate_error_registerPage(String sheetname, int row) throws Exception {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		registerPage.validateErrorMsgFromExcel(sheetname,row);
	}
	
	@Then("^validate (.*) on Register page$")
	public void validate_toolTipmessage_registerPage(String expectedMessage) {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		registerPage.validateToolTipErrorMsgRegistration(expectedMessage);
	}
	
	@Then("Tooltip error validation from sheetname {string} and row {int} on Register page")
	public void validate_toolTipFromExcel_registerPage(String sheetname, int row) throws Exception {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		registerPage.validateToolTipErrorMsgExcel(sheetname,row);
	}
	
	@Then("^validate the (.*) on home page after registration for (.*)$")
	public void validate_the_msg_on_home_page_afterReg(String message, String username) {
		homePage.validateMsgAfterRegistration(message, username);
	    
	}
	
	@Then("validate the message after registration from sheetname {string} and row {int} on home page")
	public void validate_success_msg_from_Excel_onHomePage(String sheetname, int row) throws Exception {
		driver = driverFactory.getDriver();
		homePage = new HomePage(driver);
		homePage.validateMsgFromExcelAfterRegistration(sheetname,row);
		
	}
	
	@Then("user clicks on Login link")
	public void navigateToLogin() {
		driver = driverFactory.getDriver();
		registerPage = new RegisterPage(driver);
		loginPage = registerPage.clickLoginLink();
	}

}
