package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

/**
 * Created by danbao on 2017/6/2.
 */
public class HomePage {
    private WebElement logOutButton;
    public boolean checkLogOutButton() {
        return this.logOutButton.isDisplayed();
    }
}
