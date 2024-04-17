package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/reports/html-reports/default-cucumber-reports.html",
                "json:target/reports/json-reports/cucumber1.json",//json formatinda rapor almak icin
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatinda capor almak icin ke
                "rerun:target/failedRerun.txt",

        },

        glue = "stepDefinitions",
        features = "src/test/resources/features",
        tags = "@SignIn",
        dryRun = false


)
public class Runner {

}