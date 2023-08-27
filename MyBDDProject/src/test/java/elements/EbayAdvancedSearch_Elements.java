package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EbayAdvancedSearch_Elements {

    WebDriver driver;

    public EbayAdvancedSearch_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='gh-la']") public WebElement ebayLogo;
    @FindBy(xpath = "//input[@id='gh-ac']") public WebElement searchInputBox;
    @FindBy(xpath = "//input[@id='gh-btn']") public WebElement searchButton;
    @FindBy(xpath = "//select[@id='gh-cat']/option") public List<WebElement> catSelectOptions;

    @FindBy(css = "h1.srp-controls__count-heading>span.BOLD:first-child") public WebElement numOfItems;

    @FindBy(xpath = "//input[@id='_nkw']") public WebElement searchKeyWord;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeKeyword;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement priceMin;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement priceMax;
    @FindBy(xpath = "//body/div[3]/div[1]/main[1]/form[1]/div[2]/button[1]") public WebElement advancedSearchButton;
}
