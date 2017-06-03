package org.springframework.samples.petclinic.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.samples.petclinic.user.UserRepository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Test class for {@link LoginController}
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(LoginController.class)
public class LoginControllerTests {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;


    @Before
    public void setup() {

    }

    @Test
    public void testRenderLogin() throws Exception {
        mockMvc.perform(get("/login"))
            .andExpect(status().isOk())
            .andExpect(view().name("login/first_form"));
    }

    @Test
    public void testRenderEmailLogin() throws Exception {
        mockMvc.perform(get("/login/email"))
            .andExpect(status().isOk())
            .andExpect(view().name("login/email_login"));
    }

    @Test
    public void testRenderPhoneNumberLogin() throws Exception {
        mockMvc.perform(get("/login/phone_number"))
            .andExpect(status().isOk())
            .andExpect(view().name("login/phone_number_login"));
    }
}
