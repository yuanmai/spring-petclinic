package org.springframework.samples.petclinic;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class PetFeatureSteps {
    // private WebDriver driver;
    private HtmlUnitDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Before
    public void before() {
        //driver = new ChromeDriver();
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.get(SeleniumTest.getBase());
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Then("^user can access the home page$")
    public void user_can_access_the_home_page() throws Throwable {
        Assert.assertTrue("Login Success", homePage.checkLogOutButton());
    }

    @Then("^\"([^\"]*)\" is shown$")
    public void isShown(String errorMesssage) throws Throwable {
        Assert.assertTrue(loginPage.getErrorMessage());
    }

    @When("^User login with a phone number \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginWithAPhoneNumberAndPassword(String username, String password) throws Throwable {
        loginPage.login(username, password);
        loginPage.clickLogin();
    }
}
