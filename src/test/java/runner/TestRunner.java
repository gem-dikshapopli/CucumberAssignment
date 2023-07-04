package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue = "stepdefination"
        ,tags = "@test1"
        ,monochrome = true
        ,publish = true
        ,plugin = {"pretty", "html:target/cucumber-report/report.html"}
)
public class TestRunner {

}
