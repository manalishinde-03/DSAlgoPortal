package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login_stepDef {

	HomePage home = new HomePage(Hooks.driver);
	LoginPage login = new LoginPage(Hooks.driver);

	@Then("validate the message from sheet {string} and {int} on home page")
	public void validate_the_msg_on_home_page(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		//home = new HomePage(Hooks.driver);
		this.home.validateMsgFromExcelAfterLogin(sheetname,rownumber);

	}

	@Then("^validate the (.*) and sign out button display on Home page$")
	public void validate_the_username_and_sign_out_button_display_on_home_page(String username) {
		this.home.verifyUsernameSignOutLinkOnHomePage(username);

	}

	@Then("^validate the (.*) on Login page$")
	public void validate_the_error_on_login_page(String errorMessage) {
		
		 login.validateToolTipErrorMsg(errorMessage);
	}
	
	@Then("verify the error message from sheet {string} and {int} on Login page")
	public void validate_the_error_on_login_page_excel(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		
		 login.validateToolTipErrorMessageExcel(sheetname,rownumber);
	}

	@Then("verify error for invalid data from sheet {string} and {int} on Login page")
	public void validate_the_error_on_login_page_for_invalid_credential(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		 login.validateErrorMessageExcel(sheetname, rownumber);
	}

	@Then("user clicks on Register link on Login page")
	public void user_clicks_on_register_link_on_login_page() {
//	login1 = new LoginPage(Hooks.driver);
	login.clickRegisterLink();
	}

}
