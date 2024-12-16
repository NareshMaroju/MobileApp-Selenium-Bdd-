package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"stepDefinations"},                     // Path to step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true                         // Makes console output readable
)
public class TestRunner {
}
