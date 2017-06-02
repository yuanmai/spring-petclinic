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

    @Before
    public void before() {
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.get(SeleniumTest.getBase());
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    /*
     * Forget password
     */
    @Given("^user forget password$")
    public void user_forget_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user click the forget password button$")
    public void user_click_the_forget_password_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Forget password page displayed$")
    public void forget_password_page_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
