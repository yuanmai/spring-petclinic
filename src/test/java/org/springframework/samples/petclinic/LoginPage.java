package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    private WebElement forgetPasswordButton;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void forgetPassword() {
        this.forgetPasswordButton.click();

    }


    public boolean isScreenDisplay() {
        return this.username.isDisplayed();
    }
}
