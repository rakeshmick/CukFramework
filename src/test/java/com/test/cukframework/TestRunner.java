package com.test.cukframework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/resources/End2EndTests.feature",
		glue= {"com.test.cukframework.stepDefinition"}
		)
public class TestRunner {

}