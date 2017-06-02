package org.springframework.samples.petclinic.pages;

import org.openqa.selenium.WebElement;
import org.springframework.util.StringUtils;

public class PhoneNumberLoginPage {

    private WebElement phoneNumber;

    private WebElement password;

    private WebElement extension;

    private WebElement errorMessage;

    private WebElement signInButton;

    public void login(String phoneNumber,String extension,String password){
        this.phoneNumber.sendKeys(phoneNumber);
        if(StringUtils.hasText(extension)){
            this.extension.sendKeys(extension);
        }
        this.password.sendKeys(password);
        this.signInButton.click();
    }

}
