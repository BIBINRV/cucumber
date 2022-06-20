package org.run;

import org.junit.runner.RunWith;
import org.jvm.JVMReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\babin\\eclipse\\AdactinCucumber\\src\\test\\resources\\AdactinData.feature",
glue="org.step",plugin= {"json:src\\test\\resources\\new\\adactin.json"})
public class TestRunner {
	public static void cucumberreport() {
		JVMReports.reports("src\\test\\resources\\new\\adactin.json");
	}

}
