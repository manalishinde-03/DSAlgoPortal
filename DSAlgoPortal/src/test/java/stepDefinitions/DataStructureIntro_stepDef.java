package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.DataStructureIntroPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.TestBase;

public class DataStructureIntro_stepDef extends TestBase {
	
	HomePage home;
	LoginPage login;
	DataStructureIntroPage dsIntro;
	
	@Then("user navigates to Data Structures-Introduction page")
	public void user_navigates_to_data_structures_introduction_page() {
		home= new HomePage();
		home.clickGetStartedOnHomePage();
	   
	}

	@Then("user clicks on Time Complexity link")
	public void user_clicks_on_time_complexity_link() {
		dsIntro = new DataStructureIntroPage();
		dsIntro.clickTimeComplexityLink();
	    
	}

	@Then("user clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
		
		dsIntro.clickPracticeQuestionsLink();
	    
	}

	@Then("user clicks on Try Here button on Time Complexity page")
	public void user_clicks_on_try_here_button_on_time_complexity_page() {
		
		dsIntro.clickTryHereButton();
	   
	}

	@Then("^user executes (.*) successfully$")
	public void user_executes_pythonCode_successfully(String pythonCode) {
		
		dsIntro.executePythonCode(pythonCode);
	   
	}

	@Then("^user gets alert for invalid (.*)$")
	public void user_gets_alert_for_invalid_pythonCode(String pythonCode) {
		
		dsIntro.validateAlert(pythonCode);
	   
	}

}
