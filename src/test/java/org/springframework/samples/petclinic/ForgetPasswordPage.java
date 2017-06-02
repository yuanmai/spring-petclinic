package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

/**
 * Created by coa.ke on 6/2/17.
 */
public class ForgetPasswordPage {
    private WebElement title;
    private WebElement sendEmailButton;
    private WebElement emailSentMessage;

    public boolean isScreenDisplay() {
        return title.isDisplayed();
    }

    public void clickSendEmailButton() {
        sendEmailButton.click();
    }

    public boolean isEmailSentMessageDisplay() {
        return emailSentMessage.isDisplayed();
    }
}
