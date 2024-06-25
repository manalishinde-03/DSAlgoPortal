package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import utilities.TestBase;

public class Common_stepDef extends TestBase{
	
	
	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() {
	
		TestBase.initialization();
	}
	
}
