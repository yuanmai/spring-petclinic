package org.springframework.samples.petclinic.system;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by danbao on 2017/6/3.
 */
public class LoginControllerTest {
    LoginController loginController =new LoginController();
    Map<String, Object> model= new HashMap<>();

    @Test
    public void loginSuccess() throws Exception {
        Assert.assertEquals("redirect:/index",loginController.login("120",model));
    }
    @Test
    public void loginFailed() throws Exception {
        Assert.assertEquals("welcome",loginController.login("110",model));
    }
}
