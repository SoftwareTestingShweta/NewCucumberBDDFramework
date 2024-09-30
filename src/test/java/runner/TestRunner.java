package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
		
		features = {"src\\test\\resources\\features"},
		glue = {"stepDefinations","hooks"},
		publish = true,
		plugin ={"pretty","html:target/CucumberReports/CucumberReport.html"}		
		
		)
	

public class TestRunner extends AbstractTestNGCucumberTests {

}
