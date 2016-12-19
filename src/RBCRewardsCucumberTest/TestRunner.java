package RBCRewardsCucumberTest;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"RBCStepDefn"},
		plugin = {"json:C:/a/j.json"}
		)

public class TestRunner {

}