package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import uk.kainos.seleniumframework.driver.DriverManager;

import uk.kainos.seleniumframework.site.pageobjects.KainosHomePage;

public class KainosCareerPageStepDefinitions {
    private final String KAINOS_HOME_PAGE = "https://www.kainos.com/";
    protected WebDriver driver = DriverManager.getDriver();

    @Given("^the client is on Kainos home page$")
    public KainosCareerPageStepDefinitions theClientOpenKainosHomePage() {
        driver.navigate().to(KAINOS_HOME_PAGE);
        KainosHomePage kainosHomePage= new KainosHomePage(driver);
        kainosHomePage.acceptCookies();
        return this;
    }
    @Given("^the client clicks on careers$")
    public KainosCareerPageStepDefinitions theClientOpenAmazonCareerPage() {
        driver.navigate().to(KAINOS_HOME_PAGE);
        KainosHomePage kainosHomePage= new KainosHomePage(driver);
        kainosHomePage.acceptCookies();
        kainosHomePage.clickCareers();
        return this;
    }

    @Given("^the client is on Kainos home page$")
    public KainosCareerPageStepDefinitions theClientOpenAmazonHomePage() {
        driver.navigate().to(KAINOS_HOME_PAGE);
        KainosHomePage kainosHomePage= new KainosHomePage(driver);
        kainosHomePage.acceptCookies();
        return this;
    }

}