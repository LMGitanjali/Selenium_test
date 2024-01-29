package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/login2.feature",
		glue={"Orange_HRM"},  
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports"}
		)

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features="Feature",
//		glue= {"Step_Definition"},//used here package folder
//		//dryRun=true,
//monochrome=true,
//plugin= {"pretty","html:target/HtmlReports"})

public class TestRun2 {

}
