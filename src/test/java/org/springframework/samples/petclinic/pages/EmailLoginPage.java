package org.springframework.samples.petclinic.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailLoginPage {

    @FindBy(id="email_login_text")
    public WebElement email;

    @FindBy(id="password_input")
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
