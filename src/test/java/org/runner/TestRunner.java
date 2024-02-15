package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\welcome\\eclipse-workspace3\\Cucumber\\src\\test\\resources\\Testing",
glue="org.stepdefinition", plugin = {"html:htmlreport","junit:junitreport\\junit.xml","json:jsonreport\\report.json"})

public class TestRunner {
  
	@AfterClass
	
	public static void aftr() {
		
		JvmReport.generatejvmreport("C:\\Users\\welcome\\eclipse-workspace3\\Cucumber\\jsonreport\\report.json");
	}

}

