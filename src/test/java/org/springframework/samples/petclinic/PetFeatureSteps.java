package org.springframework.samples.petclinic;

import cucumber.api.PendingException;
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

    @Given("^user has valid account$")
    public void user_has_valid_account() throws Throwable {
    }

    @Then("^user can access the home page$")
    public void user_can_access_the_home_page() throws Throwable {
            Assert.assertTrue("Login Fail",homePage.checkLogOutButton());
    }

    @When("^User login with the phone number and password$")
    public void userLoginWithThePhoneNumberAndPassword() throws Throwable {
        loginPage.login("username", "password");
    }

    @Given("^User has a non-existing phone number$")
    public void userHasANonExistingPhoneNumber() throws Throwable {
    }

    @Then("^<ErrorMessage> is shown$")
    public void errorMessageIsShown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
