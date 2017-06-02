package org.springframework.samples.petclinic.steps;

import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement username;
    private WebElement password;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
}
