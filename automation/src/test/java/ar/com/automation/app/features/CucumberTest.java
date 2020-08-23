package ar.com.automation.app.features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
		"json:target/cucumber-json-report.json", "pretty" }, tags = { "@Register" }, glue = {
				"ar.com.automation.app.steps.definitions" }, features = { "src/main/resources/features/" })
public class CucumberTest {

}
