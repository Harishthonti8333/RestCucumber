package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features=".\\src\\test\\java\\com.featurefiles\\GetRequests",
			glue="stepdef",
			//dryRun= false,
			//monochrome= false,
			plugin = "pretty"
			)
public class Run extends AbstractTestNGCucumberTests {

}
