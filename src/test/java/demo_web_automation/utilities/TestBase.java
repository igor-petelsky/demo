package demo_web_automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static demo_web_automation.utilities.data.Strings.mac_os_chrome_driver_path;

public class TestBase {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @Parameters("startPage")
    @BeforeClass
    public void setup(String startPage) {

        System.setProperty("webdriver.chrome.driver", mac_os_chrome_driver_path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
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