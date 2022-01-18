package testRunner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utilities.BrowserUtility;
import utilities.PropertiesFileReader;

@RunWith(Cucumber.class)

@CucumberOptions(features="features", glue={"stepDefinition"},
tags={"@Test"},
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/site/cucumber.json"})

public class Runner {

@BeforeClass
public static void BeforeClass() {
	BrowserUtility.ConfigureBrowser(PropertiesFileReader.getUserDefinedProperty("browser.name"));
	
}


@AfterClass
public static void afterClass(){
	BrowserUtility.exitBrowser();
}
}
