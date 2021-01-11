package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "pretty", "html:target/cucumber-html-report"},
        tags = {"~@Ignore", "@login, @createPost"},
        features = {"src/test/resources"},
        glue = {"steps"}
)
public class Runner {
}
