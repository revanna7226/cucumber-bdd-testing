package steps;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.fail;

public class EbayHome_Steps {
//    WebDriver driver;
//
//    public EbayHome_Steps(CommonSteps common_steps) {
//        this.driver = common_steps.getDriver();
//    }

    Common_Actions commonActions;
    EbayHome_Actions ebayHomeActions;
    public EbayHome_Steps(Common_Actions commonActions, EbayHome_Actions ebayHomeActions) {
        this.commonActions = commonActions;
        this.ebayHomeActions = ebayHomeActions;
    }

    @Given("I'm on Ebay Home Page")
    public void i_m_on_ebay_home_page() {
//        System.out.println("I'm on Ebay Home Page");
//        driver.get("https://www.ebay.com/");
        commonActions.goToUrl("https://www.ebay.com/");
    }

    @When("I click on Advanced link")
    public void i_click_on_advanced_link() {
//        System.out.println("I click on Advanced link");
//        driver.findElement(By.linkText("Advanced")).click();
        ebayHomeActions.clickAdvancedLink();
    }

    @Then("I navigate to Advanced search Page")
    public void i_navigate_to_advanced_search_page() {
        System.out.println("I navigate to Advanced search Page");
        String url = "https://www.ebay.com/sch/ebayadvsearch";
        // String navigatedUrl = driver.getCurrentUrl();
        String navigatedUrl = commonActions.getCurrentPageUrl();

        if(!url.equals(navigatedUrl)) {
            fail("Not navigated to expected page!");
        }
    }

    @Given("I'm on Amazon Home Page")
    public void i_m_on_amazon_home_page() throws InterruptedException {
        // driver.get("https://amazon.in");
        commonActions.goToUrl("https://amazon.in");
        Thread.sleep(1000);
    }

    @When("I click on {string}")
    public void i_click_on(String string) throws InterruptedException {
        // driver.findElement(By.linkText(string)).click();
        ebayHomeActions.clickAmazonLink(string);
        Thread.sleep(1000);
    }
    @Then("I validate that page navigated to {string} and title contains {string}")
    public void i_validate_that_page_navigated_to_and_title_contains(String string, String string2) {
//        String currentUrl = driver.getCurrentUrl();
        String currentUrl = commonActions.getCurrentPageUrl();
        if(!currentUrl.equalsIgnoreCase(string)) {
            fail("Not loaded this page");
        }
//        String title = driver.getTitle();
        String title = commonActions.getCurrentPageTitle();
        if(!title.contains(string2)) {
            fail("Title is incorrect");
        }
    }
}
