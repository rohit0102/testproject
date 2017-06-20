package StepDefs;

import PageObjects.ContactsPage;
import PageObjects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Common.Driver.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by rohitsamala on 20/06/2017.
 */
public class HomePageStepdefs {

    HomePage homePage;
    ContactsPage contactsPage;

    @Given("^I navigate to valtech homepage$")
    public void iNavigateToValtechHomepage() throws Throwable {
        driver.get("https://www.valtech.com/");
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @When("^I click on (.*)$")
    public void iClickOn(String tagName) throws Throwable {
        homePage.clickPage(tagName);
    }

    @Then("^(.*) page is displayed$")
    public void titlePageIsDisplayed(String pageTitle) throws Throwable {

        Thread.sleep(3000);
        String title = driver.findElement(By.cssSelector(".page-header>h1")).getText();

        Assert.assertEquals(pageTitle,title);
    }

    @When("^I navigate to contact Page$")
    public void iNavigateToContactPage() throws Throwable {
        homePage.clickOnContacts();
    }


    @Then("^All (\\d+) Valtech offices are displayed$")
    public void allValtechOfficesAreDisplayed(int count) throws Throwable {
        contactsPage = PageFactory.initElements(driver, ContactsPage.class);
        int officesCount = contactsPage.findOfficeCount();
        Assert.assertEquals(count,officesCount);
    }

    @Then("^Latest News section is displayed$")
    public void latestNewsSectionIsDisplayed() throws Throwable {
        Assert.assertTrue(homePage.checkLatestNews());
    }
}
