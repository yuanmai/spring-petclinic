package org.springframework.samples.petclinic;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class PetFeatureSteps {
    private HtmlUnitDriver driver;
    private LoginPage loginPage;
    private AfterLoginPage afterLoginPage;

    @Before
    public void before() {
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver(true);
        driver.get(SeleniumTest.getBase() + "/login");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Given("^user has valid account$")
    public void user_has_valid_account() throws Throwable {
    }

    @When("^use login with correct username and password$")
    public void use_login_with_correct_username_and_password() throws Throwable {
        loginPage.login("username", "Test!123");
    }

    @Then("^user can access the home page$")
    public void user_can_access_the_home_page() throws Throwable {
        afterLoginPage = PageFactory.initElements(driver, AfterLoginPage.class);
        Assert.assertTrue(afterLoginPage.isActive());
    }

    @When("^user login successfully with remember me$")
    public void userLoginSuccessfullyWithRememberMe() throws Throwable {
        loginPage.loginWithRememberMe("username", "Test!123");
    }

    @And("^user logout$")
    public void userLogout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        afterLoginPage.logout();
    }

    @Then("^User name and password are remembered$")
    public void userNameAndPasswordAreRemembered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(loginPage.isRememberMeChecked());
    }

    @When("^user enter an incorrect credential$")
    public void userEnterAnIncorrectCredential() throws Throwable {
        loginPage.login("username", "wrongpass");
    }

    @Then("^user get an error popup message$")
    public void userGetAnErrorPopupMessage() throws Throwable {
        Assert.assertTrue(loginPage.hasError(driver));
    }

    @And("^leave remember me unchecked$")
    public void leaveRememberMeUnchecked() throws Throwable {
        loginPage.uncheckedRememberMe();
    }

    @And("^user will sign out automatically if there is no operation for (\\d+) minutes$")
    public void userWillSignOutAutomaticallyIfThereIsNoOperationForMinutes(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
