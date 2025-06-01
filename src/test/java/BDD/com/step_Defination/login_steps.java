package BDD.com.step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_steps {

    WebDriver driver;

    @Given("user is navigate to login page")
    public void user_is_navigate_to_login_page() {
        driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("enter valid credentials")
    public void enter_valid_credentials() throws InterruptedException {

        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("Admin");

       WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));

        pwd.clear();
        pwd.sendKeys("admin123");

        WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));

        login_btn.click();

    }
    @Then("user should be naviate to homepage")
    public void user_should_be_naviate_to_homepage() throws InterruptedException {
        Thread.sleep(2000);

       String Actual_url= driver.getCurrentUrl();

       String exp_url= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

       if (Actual_url.equals(exp_url)){

           System.out.println("Login test is passed");
       }
       else {
           System.out.println("Login test is failed");
       }



    }






}
