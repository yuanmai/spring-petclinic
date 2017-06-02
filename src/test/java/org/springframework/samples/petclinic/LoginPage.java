package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    private WebElement rememberMe;
    private WebElement submitBtn;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitBtn.click();
    }
}
