package org.springframework.samples.petclinic;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class PetFeatureSteps {
    private HtmlUnitDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Before
    public void before() {
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.get(SeleniumTest.getBase());
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Then("^user can access the home page$")
    public void user_can_access_the_home_page() throws Throwable {
            Assert.assertTrue("Login Success",homePage.checkLogOutButton());
    }

    @Given("^Open \"([^\"]*)\"$")
    public void open(String url) throws Throwable {
        driver.get(url);
    }

    @When("^User login with the correct phone number \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginWithTheCorrectPhoneNumberAndPassword(String username, String password) throws Throwable {
        loginPage.login(username, password);
    }

    @When("^User login with a non-existing phone number \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginWithANonExistingPhoneNumberAndPassword(String username, String password) throws Throwable {
        loginPage.login(username, password);
    }


    @Then("^\"([^\"]*)\" is shown$")
    public void isShown(String errorMesssage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(errorMesssage,loginPage.getErrorMessage());
    }
}
