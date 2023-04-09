package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Login.feature",
        "C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Users.feature",
        "C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Job_Titles.feature",
        "C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Pay_Grades.feature",
        "C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Emp_Status.feature",
        "C://Users//sumit.rana//IdeaProjects//SDET_HRM//src//Features//Job_Categories.feature",},
        glue = {"stepDefinitions"},
        tags = "@Login_HRM or @Users_UserManagement or @JobTitles_Job or @PayGrades_Job or @EmpStatus_Job or @JobCategories_Job",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class RunTest_All {
}