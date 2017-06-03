package org.springframework.samples.petclinic.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

/**
 * Created by alan.ye on 6/2/17.
 */
@Service
public class LoginService {

    public static final String VALID_PASSWORD = "Test!123";

    public boolean login(String username, String password) {
        if (!checkUserName(username)) {
            return false;
        }
        return VALID_PASSWORD.equals(password);
    }

    public boolean checkUserName(String username) {
        username = StringUtils.replace(username, "+", "");
        username = StringUtils.replace(username, "(", "");
        username = StringUtils.replace(username, ")", "");
        boolean result = true;
        if (!checkUserNameLength(username)) {
            result = false;
        }
        if (username.startsWith("1650")) {
            result = false;
        }
        if (Stream.of("@", "<", ">").anyMatch(username::contains)) {
            result = false;
        }
        return result;
    }

    private boolean checkUserNameLength(String username) {
        int size = username.length();
        return size == 11;
    }
}
