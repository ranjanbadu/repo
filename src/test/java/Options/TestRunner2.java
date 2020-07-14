package Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/FlightTrip.feature", glue = {"Steps","util_cucu"}, dryRun = false

		, monochrome = true, plugin = { "pretty", "summary","html:target/cucumber-reports/cucumber-pretty",
            "json:target/cucumber-reports/cucumber.json"
            }, strict = false,tags= {"not @Scenario"}


)
public class TestRunner2 extends AbstractTestNGCucumberTests {

//Regression
}

