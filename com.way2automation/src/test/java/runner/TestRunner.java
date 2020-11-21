package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features",
		glue = {"steps"},
		dryRun = false,
		tags = {"@Search_cars-Positive"},
				 plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"},
		monochrome = true
		)
public class TestRunner {
	
	
}
