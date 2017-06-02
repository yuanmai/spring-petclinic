package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebElement username;
    private WebElement password;
    @FindBy(id="rc-login-number")
    @CacheLookup
    private WebElement rcUserName;
    @FindBy(id="rc-login-password")
    @CacheLookup
    private WebElement rcPassword;
    private WebElement signIn;
    private WebElement homePageTitle;

    @FindBy(xpath=".//*[@id='main-navbar']//*[@title='find owners']")
    @CacheLookup
    private WebElement ownButton;

    @FindBy(xpath=".//input[@id='lastName']")
    @CacheLookup
    private WebElement lastNameInput;


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
    public void clickFindOwn(){
        this.ownButton.click();
    }
    public void inputLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

}
