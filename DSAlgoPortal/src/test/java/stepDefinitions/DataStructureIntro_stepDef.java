package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import pages.DataStructureIntroPage;
import pages.HomePage;

public class DataStructureIntro_stepDef{
	
	HomePage home ;
	//LoginPage login;
	DataStructureIntroPage dsIntro;
	CommonPage commonPage;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	@Then("user navigates to Data Structures-Introduction page")
	public void user_navigates_to_data_structures_introduction_page() {
		//home= new HomePage();
		driver = driverFactory.getDriver();
		home = new HomePage(driver);
		home.clickGetStartedOnHomePage();
	   
	}

	@Then("user clicks on Time Complexity link")
	public void user_clicks_on_time_complexity_link() {
		//dsIntro = new DataStructureIntroPage();
		driver = driverFactory.getDriver();
		dsIntro = new DataStructureIntroPage(driver);
		dsIntro.clickTimeComplexityLink();
	    
	}

	@Then("user clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
		driver = driverFactory.getDriver();
		dsIntro = new DataStructureIntroPage(driver);
		dsIntro.clickPracticeQuestionsLink();
	    
	}

	@Then("user clicks on Try Here button on Time Complexity page")
	public void user_clicks_on_try_here_button_on_time_complexity_page() {
		driver = driverFactory.getDriver();
		dsIntro = new DataStructureIntroPage(driver);
		dsIntro.clickTryHereButton();
	   
	}

	@Then("^user executes (.*) successfully$")
	public void user_executes_pythonCode_successfully(String pythonCode) {
		
		dsIntro.executePythonCode(pythonCode);
	   
	}

	@Then("^user gets alert for invalid (.*)$")
	public void user_gets_alert_for_invalid_pythonCode(String pythonCode) throws AWTException {
		
		dsIntro.validateAlert(pythonCode);
	   
	}

}
