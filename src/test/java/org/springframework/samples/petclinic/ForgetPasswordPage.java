package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

/**
 * Created by coa.ke on 6/2/17.
 */
public class ForgetPasswordPage {
    private WebElement title;

    public boolean isScreenDisplay() {
        return title.isDisplayed();
    }
}
