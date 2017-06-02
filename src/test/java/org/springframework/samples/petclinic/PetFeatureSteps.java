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
    private ForgetPasswordPage forgetPasswordPage;

    @Before
    public void before() {
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.get(SeleniumTest.getBase());
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        forgetPasswordPage = PageFactory.initElements(driver, ForgetPasswordPage.class);
    }

    /*
     * Forget password
     */
    @Given("^user forget password$")
    public void user_forget_password() throws Throwable {
        Assert.assertTrue(loginPage.isScreenDisplay());
    }

    @When("^user click the forget password button$")
    public void user_click_the_forget_password_button() throws Throwable {
        loginPage.forgetPassword();
    }

    @Then("^Forget password page displayed$")
    public void forget_password_page_displayed() throws Throwable {
        Assert.assertTrue(forgetPasswordPage.isScreenDisplay());
    }
}
