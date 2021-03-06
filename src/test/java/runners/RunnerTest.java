package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/functionalTests"},
		   glue= {"stepDefinitions"},
		/*
		 * plugin= {"pretty","json:target/cucumber-reports/Cucumber.json",
		 * "junit:target/cucumber-reports/Cucumber.xml",
		 * "html:target/cucumber-reports/Cucumber.html"},
		 */
		   
		   plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		   monochrome = true,
		   tags="@Regression"
		   
	    
		)
public class RunnerTest {
}
