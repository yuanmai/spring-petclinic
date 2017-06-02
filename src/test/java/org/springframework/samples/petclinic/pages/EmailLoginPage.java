package org.springframework.samples.petclinic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailLoginPage {

    public WebElement email;

    public WebElement password;

    public WebElement errorMessage;

    public WebElement signInButton;

    public void setEmail(String value){

        email.sendKeys(value);
    }

    public void resetEmail(){
        email.sendKeys("");
    }

    public void setPassword(String value) {
        password.sendKeys(value);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

}
