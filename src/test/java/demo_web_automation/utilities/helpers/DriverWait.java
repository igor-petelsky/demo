package demo_web_automation.utilities.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverWait extends Constructor {

    public DriverWait(WebDriver driver) {
        super(driver);
    }

    protected WebElement waitForElementDisplayed(WebElement element) {
        return new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitForElementDisplayedFlexibleTime(WebElement element, int secondsForWait) {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return getWait(secondsForWait).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitForElementToBeClickable(WebElement element) {
        return new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected List<WebElement> waitForListElementsVisible(List<WebElement> elementList) {
        return getWait(10).until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    protected List<WebElement> waitForListElementsPresent(List<WebElement> elementList) {
        return getWait(10).until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) elementList));
    }

    protected Boolean waitForElementInvisible(WebElement element) {
        return new WebDriverWait(getDriver(), 10).until(ExpectedConditions.invisibilityOf(element));
    }

    private WebDriverWait getWait(int seconds) {
        return new WebDriverWait(getDriver(), seconds);
    }
}