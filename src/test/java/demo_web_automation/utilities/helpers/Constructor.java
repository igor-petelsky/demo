package demo_web_automation.utilities.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class Constructor {

    private WebDriver driver;

    Constructor(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    WebDriver getDriver() {
        return driver;
    }
}
