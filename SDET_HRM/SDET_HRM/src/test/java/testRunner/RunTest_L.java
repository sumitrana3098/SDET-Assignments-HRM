package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Login.feature"},
        glue = {"stepDefinitions"},
        tags = "@Login_HRM",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class RunTest_L {
}