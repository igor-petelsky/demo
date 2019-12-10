package demo_web_automation.utilities.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GlobalMethods extends Constructor {

    public GlobalMethods(WebDriver driver) {
        super(driver);
    }

    public Boolean waitForUrlEquals(String url) {
        return new WebDriverWait(getDriver(), 5).until(ExpectedConditions.urlToBe(url));
    }

    public Boolean waitForUrlContains(String url) {
        return new WebDriverWait(getDriver(), 5).until(ExpectedConditions.urlContains(url));
    }
}