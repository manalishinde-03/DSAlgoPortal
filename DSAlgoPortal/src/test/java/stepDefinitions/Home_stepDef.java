package stepDefinitions;

import java.time.Duration;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class Home_stepDef {
	
	HomePage home = new HomePage(Hooks.driver);
	
	@Then("user clicks Data Structures dropdown and able to see all options")
	public void user_is_able_to_see_all_options_in_data_structures_dropdown() {
		//home = new HomePage();
		this.home.validateDataStructuresDropdown();
		
	}

	@Then("user clicks Register link and navigates to Register page")
	public void user_clicks_register_link_and_navigates_to_register_page() {
		//home = new HomePage();
		this.home.clickRegister();
	}

	@Then("user clicks Sign-in link and navigates to Login page")
	public void user_clicks_sign_in_link_and_navigates_to_login_page() {
		//home = new HomePage();
		this.home.clickSignIn();
		
	}

	@Then("user clicks on Get Started button below any Data Structure topic")
	public void user_clicks_on_get_started_button_below_any_data_structure_topic() {
		 
		// home = new HomePage();
		home.clickGetStartedOnHomePage();
	}

	@Then("^user not logged in (.*) should be displayed$")
	public void user_not_logged_in_warning_message_should_be_displayed(String expectedWarning) {
		
		home.validateWarningUserNotLoggedIn(expectedWarning);
	}

	
	
}
