package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Users_steps {
    WebDriver driver;

    @Given("Open the Browser")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("Navigate to OrangeHRM Login page")
    public void navigate_to_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("Enter valid Username And Password")
    public void enter_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @Then("Click on Login Button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }

    @Then("Able to see dashboard page")
    public void able_to_see_dashboard_page() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).isDisplayed();
    }

    @Then("Click on Admin")
    public void click_on_admin() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();

    }

    @Then("Click on User Management & select Users from dropdown")
    public void click_on_user_management_select_users_from_dropdown() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")).click();

    }

    @Given("Click on Add button & fill the details")
    public void click_on_add_button_fill_the_details() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        WebElement dropdownele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div"));
        dropdownele.click();
        Robot robot = new Robot();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(7000);
        robot.keyPress(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("Li");
        WebElement dropdowne = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
        dropdowne.click();
        Robot robote = new Robot();
        Thread.sleep(4000);
        robote.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robote.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(5000);
        robote.keyPress(KeyEvent.VK_ENTER);


        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div"));
        dropdown.click();
        Robot robo = new Robot();
        Thread.sleep(2000);
        robo.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robo.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(7000);
        robo.keyPress(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Sumit");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Rana@123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Rana@123");

    }

    @When("Click on Save button")
    public void click_on_save_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
        Thread.sleep(7000);
    }

    @Then("Success message popup should be visible")
    public void success_message_popup_should_be_visible() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]")).isDisplayed();

        driver.close();
    }


    @Given("In system users fill the details")
    public void in_system_users_fill_the_details() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Sumit");


    }

    @When("Click on Search button")
    public void click_on_search_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
    }

    @Then("Able to see the record successfully")
    public void able_to_see_the_record_successfully() {
        driver.close();
    }


    @Given("In system users fill the existing details")
    public void in_system_users_fill_the_existing_details() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Sumit");

    }

    @When("Click on search button")
    public void click_on_search_button2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
        Thread.sleep(2000);
    }

    @Then("Click on delete icon of record")
    public void click_on_delete_icon_of_record() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
    }

    @Then("Successfully deleted message should be visible")
    public void successfully_deleted_message_should_be_visible() {
        driver.close();
    }

}
