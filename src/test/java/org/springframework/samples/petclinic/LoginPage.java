package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    private WebElement rcUserName;
    private WebElement rcPassword;
    private WebElement signIn;
    private WebElement homePageTitle;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public void rcLogin(String rcUserName, String rcPassword){
        this.rcUserName.sendKeys(rcUserName);
        this.rcPassword.sendKeys(rcPassword);
        this.signIn.click();
    }
    public boolean rcHomePageDisplayed(){
        return this.homePageTitle.isDisplayed();
    }
}
