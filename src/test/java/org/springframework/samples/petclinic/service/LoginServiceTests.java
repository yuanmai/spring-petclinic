package org.springframework.samples.petclinic.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alan.ye on 6/2/17.
 */
public class LoginServiceTests {
    LoginService loginService = new LoginService();

    @Test
    public void testLoginPass() {
        boolean isPassed = loginService.login("username", "Test!123");
        Assert.assertTrue(isPassed);
    }

    @Test
    public void testLoginFail() {
        boolean isPassed = loginService.login("username", "");
        Assert.assertTrue(!isPassed);
    }
}
