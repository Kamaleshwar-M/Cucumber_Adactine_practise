package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue= {"com.stepdefinition"}, plugin= {"json:src\\test\\resources\\Reports\\report.json"})

public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport("C:\\Users\\kamal\\eclipse-workspace\\Cucumber_adactine\\src\\test\\resources\\Reports\\report.json");

	}
}
	
	
	


