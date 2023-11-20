package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features= {"Feature files"},
			glue= {"stepdefinition"},
					
			plugin= {"pretty",
					"html:target/report/cucumber.html",
					"json:target/report/cucumber.json"},
			tags = "@sanity and not @smoke",
			dryRun = false
			
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

