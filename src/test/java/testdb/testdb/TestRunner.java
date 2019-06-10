package testdb.testdb;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report",
		"json:target/cucumber-report.json" }, features = {
				"src/test/resources" },
		glue = {
				"testdb/steps"
				}, 
		tags = { "@Test"

})

public class TestRunner {

}
