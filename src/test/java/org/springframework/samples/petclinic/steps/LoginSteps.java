package org.springframework.samples.petclinic.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^user has valid email account in RC$")
    public void user_has_valid_email_account_in_RC() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enter correct credential$")
    public void user_enter_correct_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user enter correct email and invalid password$")
    public void user_should_login_success() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Then("^user should login fail$")
    public void user_should_login_fail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^email doesn't exist in RC system$")
    public void email_doesn_t_exist_in_RC_system() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enter an not exist email$")
    public void user_enter_an_not_exist_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^login fail and show \"([^\"]*)\" alert$")
    public void login_fail_and_show_alert(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Network is not accessible$")
    public void network_is_not_accessible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enter credential$")
    public void user_enter_credential() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
