package org.springframework.samples.petclinic;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class PetFeatureSteps {
    private FirefoxDriver driver;
    private LoginPage loginPage;

    @Before
    public void before() {
//        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver = new FirefoxDriver();
        driver.get(SeleniumTest.getBase());
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @After
    public void after() {
//        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.close();
    }

    @Given("^user has valid account$")
    public void user_has_valid_account() throws Throwable {
    }

    @When("^use login with correct username and password$")
    public void use_login_with_correct_username_and_password() throws Throwable {
        loginPage.login("username", "password");
    }

    @Then("^user can access the home page$")
    public void user_can_access_the_home_page() throws Throwable {
    }

    @When("^use login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void use_login_with_and(String userName, String passWord) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.rcLogin(userName,passWord);
    }

    @Then("^user can access RC home page$")
    public void user_can_access_RC_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(loginPage.rcHomePageDisplayed());
    }

    @Then("^click find own$")
    public void click_find_own() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickFindOwn();
    }
    @Then("^input last name \"([^\"]*)\"$")
    public void click_find_own(String inputLastName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.inputLastName(inputLastName);
    }



}
