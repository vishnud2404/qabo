package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ={"features"},
        glue={"stepDefinition"},
        plugin = {"pretty","html:Reporting/report.html"},
        dryRun = false,
        monochrome = true

      //tags= "@F1"
       // name = {"home"}
)
public class TestRunner {
}
