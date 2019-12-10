package demo_web_automation.tests;

import demo_web_automation.pages.Chapter1Page;
import demo_web_automation.pages.HomePage;
import demo_web_automation.utilities.TestBase;
import demo_web_automation.utilities.helpers.GlobalMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static demo_web_automation.pages.Chapter1Page.demoText;
import static demo_web_automation.pages.HomePage.homePageUrl;
import static org.assertj.core.api.Assertions.assertThat;


public class Chapter1Test extends TestBase {

    private Chapter1Page chapter1Page;
    private HomePage homePage;
    private GlobalMethods globalMethods;

    @BeforeClass
    public void beforeSuit() {
        homePage = new HomePage(getDriver());
        chapter1Page = new Chapter1Page(getDriver());
        globalMethods = new GlobalMethods(getDriver());
    }

    @Test
    public void Test_01() {
        homePage.clickChapter1();
        assertThat(getDriver().getPageSource().contains(demoText)).as("Text should be displayed: " + demoText).isTrue();
    }

    @Test
    public void Test_02() {
        chapter1Page.clickHomePageLink();
        assertThat(globalMethods.waitForUrlEquals(homePageUrl)).as("Home page URL should equal to: " + homePageUrl).isTrue();
    }
}