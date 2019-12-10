package demo_web_automation.pages;

import demo_web_automation.utilities.helpers.DriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Chapter1Page extends DriverWait {
    public Chapter1Page(WebDriver driver) {
        super(driver);
    }

    public static String demoText = "Assert that this text is on the page";

    @FindBy(xpath = "//a[contains(text(),'Home Page')]")
    private WebElement homePageLink;

    public void clickHomePageLink() {
        waitForElementDisplayed(homePageLink).click();
    }
}