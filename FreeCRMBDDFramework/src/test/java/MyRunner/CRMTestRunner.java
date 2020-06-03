package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="CRMFeatures", glue={"CRMStepDefinition"})
public class CRMTestRunner {

}
