package org.springframework.samples.petclinic;

import org.openqa.selenium.WebElement;

public class AfterLoginPage {
    private WebElement logout;

    public boolean isInAfterLoginPage() {
        return logout.isDisplayed();
    }

    public void logout() {
        logout.click();
    }
}
