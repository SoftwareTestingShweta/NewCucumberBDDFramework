package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\Search.feature"},
		glue = {"stepDefinations","hooks"}
		
		
		)

public class SearchRunner extends AbstractTestNGCucumberTests{

}
