package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Job_Titles.feature"},
        glue = {"stepDefinitions"},
        tags = "@JobTitles_Job",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class RunTest_JT {
}