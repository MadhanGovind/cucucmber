package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Adactin.feature",glue="org.stepdefinition",
plugin= {"pretty","json:src\\test\\resources\\Report\\ad.json"},monochrome=true)

public class TestRunner {
	@AfterClass
	public static void jvmRprt() {
		JVMReport.generateReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\ad.json");
	}

}
