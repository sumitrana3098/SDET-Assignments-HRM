package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Emp_Status_steps {

    WebDriver driver;

    @Given("Open The Browser.")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("Navigate To OrangeHRM Login page.")
    public void navigate_to_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("Enter Valid Username And Password.")
    public void enter_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @Then("Click On Login Button.")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }

    @Then("Able To see dashboard page.")
    public void able_to_see_dashboard_page() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).isDisplayed();
    }

    @Then("Click On Admin.")
    public void click_on_admin() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();

    }

    @Then("Click On Job & select Employment Status from dropdown")
    public void click_on_user_management_select_users_from_dropdown() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a")).click();

    }

    @Given("Click On Add button & fill the details.")
    public void click_on_add_button_fill_the_details() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();


        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Self Employed");

    }

    @When("Click On Save button.")
    public void click_on_save_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

    }

    @Then("Success message Popup should be visible.")
    public void success_message_popup_should_be_visible() {
        driver.close();
    }


    @Given("Click On Edit icon in existing record & fill the details")
    public void click_on_add_button_fill_the_details1() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[7]/div")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[7]/div/div[3]/div/button[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).clear();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("QA-Intern");

    }

    @When("Click On Save button..")
    public void click_on_save_button1() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

    }

    @Then("Able To see the updated record successfully")
    public void success_message_popup_should_be_visible1() {
        driver.close();
    }


    @Given("Click On delete icon in existing record & fill the details")
    public void click_on_add_button_fill_the_details2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[7]/div")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[7]/div/div[3]/div/button[1]")).click();

    }

    @When("Click On Yes,Delete popup")
    public void click_on_save_button2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();

    }

    @Then("Record Deleted successfully")
    public void success_message_popup_should_be_visible2() {
        driver.close();
    }


}
