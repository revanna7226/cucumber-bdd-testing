package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class TaggedHooks {

    WebDriver driver;

    public TaggedHooks(CommonSteps steps) {
        this.driver = steps.getDriver();
    }

    @Before(value = "@SenarioSpecificHookBefore", order = 1)
    public void senarioSpecificHookBefore() {

        System.out.println("@SenarioSpecificHookBefore executed...");
    }
    @After("@SenarioSpecificHookAfter")
    public void senarioSpecificHookAfter() {
        System.out.println("SenarioSpecificHookAfter is executed...");
    }
}
