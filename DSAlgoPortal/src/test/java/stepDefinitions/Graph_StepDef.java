package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
