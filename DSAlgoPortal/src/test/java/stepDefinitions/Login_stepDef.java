package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login_stepDef {

	HomePage home;
	LoginPage login;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;

	@Then("validate the message from sheet {string} and {int} on home page")
	public void validate_the_msg_on_home_page(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.validateMsgFromExcelAfterLogin(sheetname, rownumber);
	}

	@Then("^validate the (.*) and sign out button display on Home page$")
	public void validate_the_username_and_sign_out_button_display_on_home_page(String username) {
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.verifyUsernameSignOutLinkOnHomePage(username);
	}

	@Then("^validate the (.*) on Login page$")
	public void validate_the_error_on_login_page(String errorMessage) {
		driver = driverFactory.getDriver();
		login = new LoginPage(driver);
		login.validateToolTipErrorMsg(errorMessage);
	}

	@Then("verify the error message from sheet {string} and {int} on Login page")
	public void validate_the_error_on_login_page_excel(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		driver = driverFactory.getDriver();
		login = new LoginPage(driver);
		login.validateToolTipErrorMessageExcel(sheetname, rownumber);
	}

	@Then("verify error for invalid data from sheet {string} and {int} on Login page")
	public void validate_the_error_on_login_page_for_invalid_credential(String sheetname, Integer rownumber)
			throws InvalidFormatException, IOException {
		driver = driverFactory.getDriver();
		login = new LoginPage(driver);
		login.validateErrorMessageExcel(sheetname, rownumber);
	}

	@Then("user clicks on Register link on Login page")
	public void user_clicks_on_register_link_on_login_page() {
		driver = driverFactory.getDriver();
		login = new LoginPage(driver);
		login.clickRegisterLink();
	}

}
