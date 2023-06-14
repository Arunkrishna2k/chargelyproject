package Merchant.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"C:\\Users\\Arun\\eclipse-workspace\\sub\\features\\overtesting.feature"},
glue={"Merchant.stepdefinition",},
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true,
dryRun=false,
publish = true)
public class TestRunner {

}


