package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\KALYANASHIS\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\features",
glue= {"stepDefinition1"})

public class TestRunner1 {

}
