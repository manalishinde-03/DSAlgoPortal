package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.GraphPage;

public class Graph_StepDef {
	//GraphPage graph=new GraphPage(Hooks.driver);
	GraphPage GraphPF;
	CommonPage CommonPF;
	public Graph_StepDef() 
	{
		this.GraphPF = new GraphPage(Hooks.driver);
		this.CommonPF = new CommonPage(Hooks.driver);
	}
//	@Given ("user navigates to Homegraph page")
//	public void home_page() {}
//    @And ("user navigates to Logingraph page")
//	public void login_page() {
//    	GraphPF.signin();
//    }
//    @When ("^user enters (.*) and (.*) on Logingraph page$")
//    public void enter_login_details(String username,String password) {
//    GraphPF.enteruserpassword(username, password);	}
//    @And ("user clicks on Login button to explore graph")
//    public void clicks_login_button() {
//    	GraphPF.login();
//    	}
//    
//    @Then("validate the You are logged in on home page")
//	public void validate_the_you_are_logged_in_on_home_page() {
//	}
//    @And ("validate the techtitans and sign out button display on Homegraph page")


	
	@When("User selects Graph item from the drop down menu")
	public void user_selects_graph_item_from_the_drop_down_menu() {
		CommonPF.Handledropbox();
	}

	@Then("User should be navigated to Graph Page")
	public void user_should_be_navigated_to_Graphpage() {
		GraphPF.GraphOptions();
	}

	@Then("User goes to previous page")
	public void user_goes_to_previous_page() {
		CommonPF.driver.navigate().back();
	}

	@When("User clicks the GetStarted button in Graph Panel")
	public void user_clicks_the_button_in_graph_panel() {
		GraphPF.GetStarted();
	}

	@Then("User clicks Graph link")
	public void user_clicks_Graph_link() {
		GraphPF.Graph(Hooks.driver,10);
	}

	@Then("Graph user clicks tryhere button")
	public void graph_user_clicks_tryhere_button() {
		CommonPF.click_tryhere_with_timeout(Hooks.driver, 20);
	}

	@Then("Graph user should be directed to tryEditor write non python code and clicks run button")
	public void graph_user_should_be_directed_to_try_editor_write_non_python_code_and_clicks_run_button() {
		CommonPF.try_python_script(Hooks.driver, "Hello World");
		CommonPF.driver.navigate().back();// negative test.. it should fail
	}

	@Then("Graph user write python code and clicks run button and it will display output")
	public void graph_user_write_python_code_and_clicks_run_button_and_it_will_display_output() {
		CommonPF.click_tryhere_with_timeout(Hooks.driver, 10);
		CommonPF.try_python_script(Hooks.driver, "print('Hello World')");
	}

	@Then("Graph user goes to previous page")
	public void graph_user_goes_to_previous_page() {
		CommonPF.driver.navigate().back();
	}
	
	@Then("Graph user goes back to graph page")
	public void graph_user_goes_back_to_previous_page() {
		CommonPF.driver.navigate().back();
	}
	
	@Then ("Graph user goes back to home page")
	public void graph_user_goes_back_to_home_page() {
		CommonPF.driver.navigate().back();
	}

	@Then("User clicks GraphRepresentations link")
	public void user_clicks_GraphRepresentations_link() {
	GraphPF.GraphRepresentations();
	}
	@Then("user clicks signout link")
	public void user_clicks_signout_link() {
		  CommonPF.Signout();
	}

	@Then("logged out successfully message will be displayed")
	public void logged_out_successfully_message_will_be_displayed() {
		WebElement signout=Hooks.driver.findElement(By.xpath("/html/body/div[2]"));
		System.out.println(signout.getText());
	}



}
