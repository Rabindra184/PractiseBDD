package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java8.Scenario;

public class Hooks {

	TestContext testContext;
	
	public Hooks(TestContext context) {
		 testContext = context;
		 }
	
	
	
	@Before
	public void setup() {
		 /*What all you can perform here
		 Starting a webdriver
		 Setting up DB connections
		 Setting up test data
		 Setting up browser cookies
		 Navigating to certain page
		 or anything before the test
		 */
		 }
	
	@After
		public void tearDown() {
		testContext.getWebDriverManager().closeDriver();
		
		/*
		 * try { Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f"); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		 }
	
	@AfterStep
	public void before_or_after(io.cucumber.java.Scenario scenario){
		
		// if(scenario.isFailed()) {}

	     final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
	     scenario.attach(screenshot, "image/png", "image"); 
		
		
		
		
	}
	
}
