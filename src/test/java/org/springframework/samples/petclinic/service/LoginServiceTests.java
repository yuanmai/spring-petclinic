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

    @Test
    public void testUserNameEmpty() {
        Assert.assertFalse(loginService.checkUserName(""));
    }

    @Test
    public void testUserNameLength() {
        Assert.assertFalse(loginService.checkUserName("1234567890"));
        Assert.assertFalse(loginService.checkUserName("123456789012"));
        Assert.assertTrue(loginService.checkUserName("12345678901"));
    }

    @Test
    public void testUserNameIllegalCharacters() {
        Assert.assertFalse(loginService.checkUserName("12@45678901"));
    }

    @Test
    public void testUserName650() {
        Assert.assertFalse(loginService.checkUserName("16502223333"));
    }

    @Test
    public void testUserNameAcceptableCharacters() {
        Assert.assertTrue(loginService.checkUserName("+1(655)2223333"));
    }
}
