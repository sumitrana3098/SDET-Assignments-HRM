package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Pay_Grades_steps {

    WebDriver driver;

    @Given("Open the Browser..")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @When("Navigate to OrangeHRM Login page..")
    public void navigate_to_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Then("Enter valid Username And Password..")
    public void enter_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }
    @Then("Click on Login Button..")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }
    @Then("Able to see dashboard page..")
    public void able_to_see_dashboard_page() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).isDisplayed();
    }
    @Then("Click on Admin..")
    public void click_on_admin() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();

    }
    @Then("Click on Job & select Pay Grades from dropdown")
    public void click_on_user_management_select_users_from_dropdown2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")).click();

    }
    @Given("Click on Add button & fill the details..")
    public void click_on_add_button_fill_the_details() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();


        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys("Sumit Rana");

    }
    @When("Click on Save button...")
    public void click_on_save_button() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

    }

    @Then("Click on Add Currencies button & fill the details")
    public void ClickonAddCurrencies() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/button")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,100)");

        WebElement dropdownele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div"));
        dropdownele.click();
        Robot robot = new Robot();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(7000);
        robot.keyPress(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("1000");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("5000");

    }

    @Then("Click on Save Button..")
    public void ClickonSaveButton1 () {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]")).click();

    }

    @Then("Success message popup should be visible..")
    public void success_message_popup_should_be_visible() {
        driver.close();
    }



    @Given("Click on Edit icon in existing record & fill the details.")
    public void click_on_add_button_fill_the_details1() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[6]/div")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[6]/div/div[4]/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div/div/div[5]/div/button[2]")).click();

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]")).isDisplayed();
      //  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input")).clear();
       // driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("8000");

     //   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")).clear();
     //   driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("12000");

    }
    @When("Click On Save button...")
    public void click_on_save_butt() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]")).click();

    }
    @Then("Able to see the updated record successfully.")
    public void success_message_popup_should_be_visible1() {
        driver.close();
    }



    @Given("Click on delete icon in existing record & fill the details.")
    public void click_on_add_button_fill_the_details2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[6]/div")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[6]/div/div[4]/div/button[1]")).click();

    }
    @When("Click on Yes,Delete popup.")
    public void click_on_save_button2() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();

    }
    @Then("Record deleted successfully.")
    public void success_message_popup_should_be_visible2() {
        driver.close();
    }

}



