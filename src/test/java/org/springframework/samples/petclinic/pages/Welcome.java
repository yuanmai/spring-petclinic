package org.springframework.samples.petclinic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome {

    @FindBy(id="login_account_input")
    public WebElement account;

    public WebElement errorMessage;

    @FindBy(id="next_button")
    public WebElement signInButton;


    public void setAccount(String credential){
        account.sendKeys(credential);
    }

    public void resetAccount(){
        account.sendKeys("");
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
