package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/cucumber"}, features="src/test/resources/FeatureFiles", glue="classpath:stepDefinitions", tags="@case1")
public class Runner {

}