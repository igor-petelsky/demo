package demo_web_automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static demo_web_automation.utilities.data.Strings.*;

public class TestBase {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @Parameters("startPage")
    @BeforeClass
    public void setup(String startPage) {

        System.setProperty("webdriver.chrome.driver", mac_os_chrome_driver_path);
        driver = new ChromeDriver();
        driver.get(startPage);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}