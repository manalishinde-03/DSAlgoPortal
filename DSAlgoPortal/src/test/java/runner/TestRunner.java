package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	

	@CucumberOptions(
			plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"html:target/htmlReport/report.html"}, //reporting purpose
			monochrome=false,  //console output colour
			features = {"src/test/resources/features/Login.feature"}, //location of feature files
			glue= "stepDefinitions") //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		

	
}
