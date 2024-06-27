package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login_stepDef {

	HomePage home = new HomePage(Hooks.driver);
	LoginPage login = new LoginPage(Hooks.driver);

	@Then("^validate the (.*) on home page$")
	public void validate_the_msg_on_home_page(String message) {
		//home = new HomePage(Hooks.driver);
		this.home.validateMsgAfterLogin(message);

	}

	@Then("^validate the (.*) and sign out button display on Home page$")
	public void validate_the_username_and_sign_out_button_display_on_home_page(String username) {
		this.home.verifyUsernameSignOutLinkOnHomePage(username);

	}

	@Then("^validate the (.*) on Login page$")
	public void validate_the_error_on_login_page(String errorMessage) {
		
		 login.validateToolTipErrorMsg(errorMessage);
	}

	@Then("^validate the (.*) on Login page for invalid credential$")
	public void validate_the_error_on_login_page_for_invalid_credential(String errorMessage) {
		//login = new LoginPage(Hooks.driver);
		 login.validateErrorMsg(errorMessage);
	}

	@Then("user clicks on Register link on Login page")
	public void user_clicks_on_register_link_on_login_page() {
//	login1 = new LoginPage(Hooks.driver);
	login.clickRegisterLink();
	}

}
