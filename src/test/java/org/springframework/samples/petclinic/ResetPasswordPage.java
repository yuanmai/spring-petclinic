package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

/**
 * Created by raymond on 2017/6/2.
 */
public class ResetPasswordPage {
    private WebElement previousPassword;
    private WebElement newPassword;
    private WebElement newPasswordConfirmation;
    private WebElement resetPasswordButton;
    private WebElement errorMessageLabel;

    public void resetPassword(String previousPassword, String newPassword, String newPasswordConfirmation) {
        this.previousPassword.sendKeys(previousPassword);
        this.newPassword.sendKeys(newPassword);
        this.newPasswordConfirmation.sendKeys(newPasswordConfirmation);
        this.resetPasswordButton.click();
    }

    public Boolean errorMessageIsShow(){
        return this.errorMessageLabel.isDisplayed();
    }
}
