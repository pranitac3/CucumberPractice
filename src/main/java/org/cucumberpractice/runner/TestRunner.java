package org.cucumberpractice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org.cucumberpractice.stepdefinations",

        plugin = {
                "pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        tags = "@ExampleTableTestHmeWork"

)
public class TestRunner {
}
