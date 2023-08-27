package steps;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbayAdvancedSearch_Steps {

//    WebDriver driver;
//
//    public EbayAdvancedSearch_Steps(CommonSteps common_steps) {
//        this.driver = common_steps.getDriver();
//    }

    Common_Actions commonActions;
    EbayAdvancedSearch_Actions ebayAdvancedSearchActions;

    public EbayAdvancedSearch_Steps(Common_Actions commonActions, EbayAdvancedSearch_Actions ebayAdvancedSearchActions) {
        this.commonActions = commonActions;
        this.ebayAdvancedSearchActions = ebayAdvancedSearchActions;

    }

    @Given("I am on Advanced Search Page")
    public void i_am_on_advanced_search_page() {
        // driver.get("https://www.ebay.com/sch/ebayadvsearch");
        commonActions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
    }
    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {
        // driver.findElement(By.xpath("//a[@id='gh-la']")).click();
        ebayAdvancedSearchActions.clickOnEbayLogo();
    }
    @Then("I am navigated to Ebay Home Page")
    public void i_am_navigated_to_ebay_home_page() {
        String url = "https://www.ebay.com/";
        // String navigatedUrl = driver.getCurrentUrl();
        String navigatedUrl = commonActions.getCurrentPageUrl();


        if(!url.equals(navigatedUrl)) {
            Assert.fail("Not navigated to Home Page!");
        }
    }

    // -----
    @Given("Iam on Ebay Home Page")
    public void iam_on_ebay_home_page() {
        // driver.get("https://www.ebay.com/");
        commonActions.goToUrl("https://www.ebay.com/");
    }
    @When("I search for {string}")
    public void i_search_for_iphone(String str1) {
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        ebayAdvancedSearchActions.enterSearchString(str1);
        ebayAdvancedSearchActions.clickSearchButton();
    }
    @Then("I get atleast {int} search results")
    public void i_get_atleast_search_results(int count) {
//        String resultCount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText();
//        String resultCount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText();
        int resultCount2 = ebayAdvancedSearchActions.getSeatchItemsCount(); // Integer.parseInt(resultCount.replace(",", ""));
        if(resultCount2 <= count) {
            Assert.fail("Items are less than 1000");
        }
    }

    @When("I search for {string} in {string}")
    public void i_search_for_in(String string, String string2) throws InterruptedException {
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string);
        ebayAdvancedSearchActions.enterSearchString(string);
        ebayAdvancedSearchActions.selectCategoryOption(string2);

        Thread.sleep(2000);
        ebayAdvancedSearchActions.clickSearchButton();
        Thread.sleep(2000);
    }

    @When("I advanced serach on a item")
    public void i_advanced_serach_on_a_item(DataTable dataTable) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
        ebayAdvancedSearchActions.enterSearchString(dataTable.cell(1,0));
        ebayAdvancedSearchActions.enterExcludeString(dataTable.cell(1,1));
        ebayAdvancedSearchActions.enterMinPrice(dataTable.cell(1,2));
        ebayAdvancedSearchActions.enterMaxPrice(dataTable.cell(1,3));
        ebayAdvancedSearchActions.clickOnSearchAdvancedBtn();
//        driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
//        driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1,2));
//        driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1,3));
//        driver.findElement(By.xpath("//body/div[3]/div[1]/main[1]/form[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
    }

}