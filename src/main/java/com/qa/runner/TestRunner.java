package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/bunty/Desktop/QA/Selenium_WorkSpace/CucumberPOMFreeCRM/src/main/java/com/qa/feature/freecrm.feature",//the path of the feature files
		glue={"com/qa/StepDefinitions"},//Path of the step Defination Package Name
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // To generate different types of reports such as HTML report, JSON, JUNIT reports
		monochrome = true, //Readable Console Output in a proper format // Use everytime 
		strict = true, // Use always // It will check if any step is not defined in Step Definition file
		dryRun = false // To check the mapping is proper between feature file and Step Definition // Check the steps with feature files without running test // Use before executing the test to make sure every annotations are used.
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"} 
		
		)


public class TestRunner {

}
