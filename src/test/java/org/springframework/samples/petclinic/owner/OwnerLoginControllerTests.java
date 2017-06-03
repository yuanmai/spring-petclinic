package org.springframework.samples.petclinic.owner;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 6/3/2017
 */

@RunWith(SpringRunner.class)
@WebMvcTest(OwnerController.class)
public class OwnerLoginControllerTests {

    private static final int TEST_OWNER_ID = 1;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OwnerRepository owners;

    private Owner george;

    @Before
    public void setup() {
        george = new Owner();
        george.setId(TEST_OWNER_ID);
        george.setFirstName("George");
        george.setLastName("Franklin");
        george.setPassword("Test!123");
        george.setAddress("110 W. Liberty St.");
        george.setCity("Madison");
        george.setTelephone("6085551023");
        given(this.owners.findById(TEST_OWNER_ID)).willReturn(george);
    }


    @Test
    public void testAccessHomePage() throws Exception {
        mockMvc.perform(get("/")).
            andExpect(view().name("login/login"));
    }


    @Test
    public void testLoginSuccess() throws Exception {
        given(this.owners.findByLastNameAndPassword(george.getLastName(), george.getPassword())).willReturn(george); //Test the service
        mockMvc.perform(get("/login")
            .param("lastName", "Franklin")
            .param("password", "Test!123")
        )
            .andExpect(status().is3xxRedirection())
            .andExpect(view().name("redirect:/owners/" + TEST_OWNER_ID));
    }


    @Test
    public void testLoginFail() throws Exception {
        mockMvc.perform(get("/login")
            .param("lastName", "Franklin")
            .param("password", "Test!123-wrong")
        )
            .andExpect(status().isOk())
            .andExpect(view().name("login/login"));
    }
}
