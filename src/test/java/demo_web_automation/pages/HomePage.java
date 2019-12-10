package demo_web_automation.pages;

import demo_web_automation.utilities.helpers.DriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends DriverWait {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static String homePageUrl = "http://book.theautomatedtester.co.uk/";

    @FindBy(xpath = "//*[@href='/chapter1']")
    private WebElement chapter1Link;

    public void clickChapter1() {
        waitForElementDisplayed(chapter1Link).click();
    }
}