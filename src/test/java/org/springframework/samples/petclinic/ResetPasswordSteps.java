package org.springframework.samples.petclinic;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 6/2/2017
 */
public class ResetPasswordSteps {
    private ChromeDriver driver;
    private ResetPasswordPage resetPasswordPage;
    private final static String resetPasswordPageUrl = "http://localhost:8080/resetpassword/";

//    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "D:\\ProgramFiles\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(resetPasswordPageUrl);
        resetPasswordPage = PageFactory.initElements(driver, ResetPasswordPage.class);
    }

    @Given("user has redirect to reset password page successfully")
    public void user_redirect_to_resetPassword_page(){

    }

    @When("^user reset password with incorrect previous password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void reset_with_incorrect_password(String previousPassword, String newPassword, String newPasswordConfirmation) throws Throwable {
        resetPasswordPage.resetPassword(previousPassword,newPassword,newPasswordConfirmation);
    }
    @Then("^UI shows the error message$")
    public void ui_shows_the_error_message() throws Throwable {
        Assert.assertTrue(resetPasswordPage.errorMessageIsShow());
    }


}
