package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\lenovo\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SimpleForm\\src\\test\\resources\\SimpleForm\\SimpleForm.feature",
                 glue = "Steps1")

public class SimpleFormRunner extends AbstactTestNGCucumber {

}