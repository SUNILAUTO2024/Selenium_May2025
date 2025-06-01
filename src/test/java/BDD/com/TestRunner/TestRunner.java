package BDD.com.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "BDD.com.step_Defination",
        plugin = {
                "pretty","html:target/cucuber-reports.html"
        },
        dryRun = true,
        tags = "@verify_static_Elements"
)

public class TestRunner {


}
