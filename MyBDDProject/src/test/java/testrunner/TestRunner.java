package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {"pretty", "html:Report1"}
        // plugin = {"pretty", "json:Report2"},
        // plugin = {"pretty", "junit:Report3"},
        // ,dryRun = true // running to find the feature/scenarios that does not have step definitions
        // strict = true,
        // monochrome = true,
        // ,tags = "@P1 and @P2" // runs scenarios having both @P1 and @P2 tags
        // ,tags = "@P1 or @P2" // runs scenarios having any of the tags
        ,tags = "@P27" // can run scenario's by Tag Name
        // name = "link"
)
public class TestRunner {

}

/*
Cucumber 'Tags Option' syntax is updated for newer versions.

Please use tags = "@tag-name" instead of tags = {"@tag-name"}

Basically, no need of using {} anymore.
 */