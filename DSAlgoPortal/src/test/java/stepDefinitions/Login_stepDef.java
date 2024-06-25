package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.TestBase;

public class Login_stepDef extends TestBase {

	HomePage home;
	LoginPage login;

@Given("user navigates to Login page")
public void user_navigates_to_login_page() {
	home= new HomePage();
	home.clickSignIn();
}

@When("^user enters (.*) and (.*) on Login page$")
public void user_enters_username_and_password_on_login_page(String username, String password) {
	login = new LoginPage();
	home = login.login(username, password);
}

@When("user clicks on Login button")
public void user_clicks_on_login_button() {
    login.clickLoginBtn();
}

@Then("^validate the (.*) on home page$")
public void validate_the_msg_on_home_page(String message) {
	home.validateMsgAfterLogin(message);
    
}

@Then("^validate the (.*) and sign out button display on Home page$")
public void validate_the_username_and_sign_out_button_display_on_home_page(String username) {
	home.verifyUsernameSignOutLinkOnHomePage(username);
    
}

@Then("^validate the (.*) on Login page$")
public void validate_the_error_on_login_page(String errorMessage) {
	
	login.validateToolTipErrorMsg(errorMessage);
}

@Then("^validate the (.*) on Login page for invalid credential$")
public void validate_the_error_on_login_page_for_invalid_credential(String errorMessage) {
	
	login.validateErrorMsg(errorMessage);
}


@Then("user clicks on Register link on Login page")
public void user_clicks_on_register_link_on_login_page() {
	login = new LoginPage();
	login.clickRegisterLink();
}


}
