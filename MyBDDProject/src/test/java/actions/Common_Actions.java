package actions;

import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class Common_Actions {
    private WebDriver driver;

    CommonSteps common_steps;

    public Common_Actions(CommonSteps common_steps) {
        this.driver = common_steps.getDriver();
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public void closeTheDriver() {
        this.driver.quit();
    }
}
