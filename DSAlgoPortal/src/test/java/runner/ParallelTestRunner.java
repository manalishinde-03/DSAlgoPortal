package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/report/parallel.html"},
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepDefinitions" //location of step definition files
		) 

public class ParallelTestRunner extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();	
    }
}
