package actions;

import elements.EbayHome_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class EbayHome_Actions {

    WebDriver driver;

    EbayHome_Elements ebayHomeElements;

    public EbayHome_Actions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.ebayHomeElements = new EbayHome_Elements(driver);
    }

    public void clickAdvancedLink() {
        ebayHomeElements.advancedLink.click();
    }

    public void clickAmazonLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }

}
