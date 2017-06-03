package org.springframework.samples.petclinic.service;

import org.springframework.stereotype.Service;

/**
 * Created by alan.ye on 6/2/17.
 */
@Service
public class LoginService {

    public static final String VALID_PASSWORD = "Test!123";

    public boolean login(String username, String password) {
        return VALID_PASSWORD.equals(password);
    }
}
