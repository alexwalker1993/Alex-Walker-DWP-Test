package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber/testRunner.html", "json:target/cucumber/testRunner.json"},
        monochrome = true,
        tags = ("@city or @instructions or @userId or @user"),
        glue = "stepDefs"
)
public class TestRunner {

    private TestRunner() {
        throw new IllegalStateException("Utility Class");
    }
}
