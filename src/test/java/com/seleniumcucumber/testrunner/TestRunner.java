package com.seleniumcucumber.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Features"}, 
		glue= {"com.seleniumcucumber.stepdef"}, 
		plugin= {"pretty","html:target/cucumber-report/report.html","json:target/cucumber.json"}, 
		monochrome=true,
		tags="@Data_Driven"
		)


public class TestRunner {
	//empty
}
