package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"html:target/test-output/htmlReport/report.html"}, //reporting purpose
			monochrome=false,  //console output colour
			//tags = "@DSAlgoHomePageValidation", //tags from feature file
			//tags = "@TC_Login_07",
			//tags = "@DSAlgoDataStructureIntro",
			//tags = "@DSAlgoHomePageValidation",
			features = {"src/test/resources/features"}, //location of feature files
			glue= "stepDefinitions") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		

	
}
