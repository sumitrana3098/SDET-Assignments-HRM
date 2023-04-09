package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Emp_Status.feature"},
        glue = {"stepDefinitions"},
        tags = "@EmpStatus_Job",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class RunTest_ES {
}