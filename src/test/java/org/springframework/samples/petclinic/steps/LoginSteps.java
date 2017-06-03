package org.springframework.samples.petclinic.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.samples.petclinic.SeleniumTest;
import org.springframework.samples.petclinic.pages.EmailLoginPage;
import org.springframework.samples.petclinic.pages.PhoneNumberLoginPage;
import org.springframework.samples.petclinic.pages.WelcomePage;

public class LoginSteps {
    private HtmlUnitDriver driver;
    private EmailLoginPage emailLoginPage;
    private PhoneNumberLoginPage phoneNumberLoginPage;
    private WelcomePage welcomePage;

    @Before
    public void before() {
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.get(SeleniumTest.getBase());
        emailLoginPage = PageFactory.initElements(driver, EmailLoginPage.class);
        phoneNumberLoginPage = PageFactory.initElements(driver, PhoneNumberLoginPage.class);
        welcomePage = PageFactory.initElements(driver, WelcomePage.class);
    }

    @When("^user enter \"([^\"]*)\" and next$")
    public void user_enter_and_next(String account) throws Throwable {
//         Write code here that turns the phrase above into concrete actions
        driver.get(driver.getCurrentUrl()+"/login");
        welcomePage.setAccount(account);
        welcomePage.clickSignInButton();
    }

    @Then("^user should go to email login page$")
    public void user_should_go_to_email_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        assert emailLoginPage.email.isDisplayed();
    }

    @Then("^user should go to phone login page$")
    public void user_should_go_to_phone_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assert phoneNumberLoginPage.phoneNumberText.isDisplayed();

    }


    @Given("^user has valid email account in RC$")
    public void user_has_valid_email_account_in_RC() throws Throwable {
    }

    @When("^user enter correct credential$")
    public void user_enter_correct_credential() throws Throwable {
    }

    @Then("^user should login success$")
    public void user_should_login_success() throws Throwable {
    }

    @When("^user enter correct email and invalid password$")
    public void user_enter_correct_email_and_invalid_password() throws Throwable {
    }

    @Then("^user should login fail$")
    public void user_should_login_fail() throws Throwable {
    }

    @Given("^email doesn't exist in RC system$")
    public void email_doesn_t_exist_in_RC_system() throws Throwable {
    }

    @When("^user enter an not exist email$")
    public void user_enter_an_not_exist_email() throws Throwable {
    }

    @Then("^login fail and show \"([^\"]*)\" alert$")
    public void login_fail_and_show_alert(String arg1) throws Throwable {
    }

    @Given("^user has valid company ext number in RC with super admin permission$")
    public void user_has_valid_company_ext_number_in_RC_with_super_admin_permission() throws Throwable {
    }

    @When("^I input the company number,ext,password$")
    public void i_input_the_company_number_ext_password() throws Throwable {
    }

    @Then("^user should login success and can see super admin features$")
    public void user_should_login_success_and_can_see_super_admin_features() throws Throwable {
    }

    @Given("^user has valid DID number in RC with super admin features$")
    public void user_has_valid_DID_number_in_RC_with_super_admin_features() throws Throwable {

    }

    @When("^I input the company DID number,password$")
    public void i_input_the_company_DID_number_password() throws Throwable {
    }

    @Given("^user has valid company ext number in RC with  admin permission$")
    public void user_has_valid_company_ext_number_in_RC_with_admin_permission() throws Throwable {
    }

    @Then("^user should login success and can see  admin features$")
    public void user_should_login_success_and_can_see_admin_features() throws Throwable {
    }

    @Given("^user has valid DID number in RC with  admin features$")
    public void user_has_valid_DID_number_in_RC_with_admin_features() throws Throwable {
    }
}
