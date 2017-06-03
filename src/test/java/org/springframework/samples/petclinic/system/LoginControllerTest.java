package org.springframework.samples.petclinic.system;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.samples.petclinic.owner.User;
import org.springframework.samples.petclinic.owner.UserRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by danbao on 2017/6/3.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    LoginController loginController;

    Map<String, Object> model= new HashMap<>();

    @Test
    public void loginSuccess() throws Exception {
        User user = new User();
        user.setUsername("120");
        user.setPassword("123");
        when(userRepository.findUsers("120")).thenReturn(Arrays.asList(user));
        Assert.assertEquals("redirect:/index",loginController.login(model,"120","123"));
    }
    @Test
    public void loginFailed() throws Exception {
        when(userRepository.findUsers("110")).thenReturn(Collections.emptyList());
        Assert.assertEquals("welcome",loginController.login(model, "110","123"));
    }
}
