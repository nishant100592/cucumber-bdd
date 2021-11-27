package testrunner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/nishant.dwivedi/IdeaProjects/BDDFramework/src/main/java/features", glue="stepdefinition",
monochrome = true,
        plugin = {"pretty", "html:test-report/HTMLReport.html"}
)

public class TestRunner {

}
