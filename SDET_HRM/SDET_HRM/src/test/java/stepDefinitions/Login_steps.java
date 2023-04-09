package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Login_steps {
WebDriver driver;

    @Given("Open the browser")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @When("Navigate to OrangeHRM login page")
    public void navigate_to_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Given("OrangeHRM logo should Exist")
    public void orange_hrm_logo_should_exist() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[1]/img")).isDisplayed();
    }
    @When("Login button should Exist")
    public void login_button_should_exist() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isDisplayed();
    }
    @Then("Close browser")
    public void close_browser() {
        driver.close();
    }


    @Given("^Enter invalid (.*) and (.*)$")
    public void enter_invalid_standard_user_and_rana123(String UserName, String PassWord) {
        driver.findElement(By.name("username")).sendKeys(UserName);
        driver.findElement(By.name("password")).sendKeys(PassWord);
    }
    @When("Click on Login button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }
    @Then("Invalid credentials message should be displayed")
    public void message_should_be_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).isDisplayed());
        driver.close();
    }

    @Given("Enter valid Username and Password")
    public void enter_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }
    @When("Click on login button")
    public void click_on_login_button2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }
    @Then("User should be login")
    public void user_should_be_login() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).isDisplayed();
       driver.close();
    }

}
