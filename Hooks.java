package stepdefinition;

import config.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Driver{
	
	@Before
	public void beforeScenario()
	{
		
		Driver.launchBrowser();
	}
	//@After
	public void afterScenario()
	{
		Driver.closeBrowser();
	}
	@Before("@DB")
	public void beforeScenario1()
	{
		System.out.println("******** Connecting data base connection *********");
		
	}
	@After("@DB")
	public void afterScenario1()
	{
		System.out.println("******** Close the data base connection ***********");
	}
	

}
