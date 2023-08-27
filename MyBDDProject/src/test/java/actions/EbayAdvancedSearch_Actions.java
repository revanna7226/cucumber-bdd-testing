package actions;

import elements.EbayAdvancedSearch_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.CommonSteps;

import java.util.List;

public class EbayAdvancedSearch_Actions {

    WebDriver driver;

    EbayAdvancedSearch_Elements ebayAdvancedSearchElements;

    public EbayAdvancedSearch_Actions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.ebayAdvancedSearchElements = new EbayAdvancedSearch_Elements(driver);
    }

    public void searchAnItem(String srchString) {
        ebayAdvancedSearchElements.searchInputBox.sendKeys(srchString);
    }

    public void clickSearchButton() {
        ebayAdvancedSearchElements.searchButton.click();
    }

    public int getSeatchItemsCount() {
        String itemCount = ebayAdvancedSearchElements.numOfItems.getText().trim();
        String itemCount2 = itemCount.replace(",", "");
        int itemCountInt = Integer.parseInt(itemCount2);
        return itemCountInt;
    }

    public void selectCategoryOption(String option) {
        List<WebElement> cat = ebayAdvancedSearchElements.catSelectOptions;
        for(WebElement x : cat) {
            if(x.getText().trim().equalsIgnoreCase(option)) {
                x.click();
                break;
            }
        }
    }

    public void clickOnLinkByText(String Text) {
        driver.findElement(By.linkText(Text)).click();
    }

    public void clickOnEbayLogo() {
        ebayAdvancedSearchElements.ebayLogo.click();
    }

    public void enterSearchString(String string) {
        ebayAdvancedSearchElements.searchKeyWord.sendKeys(string);
    }

    public void enterExcludeString(String string) {
        ebayAdvancedSearchElements.excludeKeyword.sendKeys(string);
    }

    public void enterMinPrice(String string) {
        ebayAdvancedSearchElements.priceMin.sendKeys(string);
    }

    public void enterMaxPrice(String string) {
        ebayAdvancedSearchElements.priceMax.sendKeys(string);
    }

    public void clickOnSearchAdvancedBtn() {
        ebayAdvancedSearchElements.advancedSearchButton.click();
    }
}
