package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class Home_stepDef {
	
	HomePage home;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	@Then("user clicks Data Structures dropdown and able to see all options")
	public void user_is_able_to_see_all_options_in_data_structures_dropdown() {
		System.out.println("user_is_able_to_see_all_options_in_data_structures_dropdown >>>>>Thread ID :"+Thread.currentThread().threadId());
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.validateDataStructuresDropdown();
		
	}

	@Then("user clicks Register link and navigates to Register page")
	public void user_clicks_register_link_and_navigates_to_register_page() {
		System.out.println("user_clicks_register_link_and_navigates_to_register_page >>>>>Thread ID :"+Thread.currentThread().threadId());
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.clickRegister();
	}

	@Then("user clicks Sign-in link and navigates to Login page")
	public void user_clicks_sign_in_link_and_navigates_to_login_page() {
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.clickSignIn();
		
	}

	@Then("user clicks on Get Started button below any Data Structure topic")
	public void user_clicks_on_get_started_button_below_any_data_structure_topic() {
		driver = driverFactory.getDriver();
		home = new HomePage(driver); 
		home.clickGetStartedOnHomePage();
	}

	@Then("^user not logged in (.*) should be displayed$")
	public void user_not_logged_in_warning_message_should_be_displayed(String expectedWarning) {
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		
		home.validateWarningUserNotLoggedIn(expectedWarning);
	}

	
	
}
