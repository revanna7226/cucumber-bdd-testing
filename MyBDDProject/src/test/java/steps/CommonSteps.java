package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class CommonSteps {

    private WebDriver driver;

    @Before(order = 0)
    public void setUp() {
        System.out.println("Gobal Before Hook is executed...");
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tierDown() throws InterruptedException {
        System.out.println("Global After Hook executed...");
        driver.quit();
        Thread.sleep(2000);
    }

//    @Before("@SenarioSpecificHookBefore")
//    public void senarioSpecificHookBefore() {
//
//        System.out.println("@SenarioSpecificHookBefore executed...");
//    }
//    @After("@SenarioSpecificHookAfter")
//    public void senarioSpecificHookAfter() {
//        System.out.println("SenarioSpecificHookAfter is executed...");
//    }

    public WebDriver getDriver() {
        return driver;
    }

}
