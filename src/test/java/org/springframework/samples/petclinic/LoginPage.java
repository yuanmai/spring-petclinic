package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    private WebElement logButton;
    private WebElement ssoButton;
    private WebElement googleButton;
    private WebElement forgotPassword;
    private WebElement rememberMeChceckBox;
    private WebElement errorLabel;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
}