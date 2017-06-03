package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    private WebElement rememberMe;
    private WebElement submitBtn;

    public void login(String username, String password) {
        commonLogin(username, password, false);
    }

    public void loginWithRememberMe(String username, String password) {
        commonLogin(username, password, true);
    }

    public void commonLogin(String username, String password, boolean rememberMe) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        if (rememberMe) {
            this.rememberMe.click();
        }
        submitBtn.click();
    }

    public boolean isRememberMeChecked() {
        return rememberMe.isSelected();
    }

    public void uncheckedRememberMe() {
        if (rememberMe.isSelected()) {
            rememberMe.click();
        }
    }

    public boolean hasError(HtmlUnitDriver driver) {
        return driver.findElementById("login-fail").isDisplayed();
    }
}
