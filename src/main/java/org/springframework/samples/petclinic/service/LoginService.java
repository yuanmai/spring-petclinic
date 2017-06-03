package org.springframework.samples.petclinic.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

/**
 * Created by alan.ye on 6/2/17.
 */
@Service
public class LoginService {

    private static final String VALID_PASSWORD = "Test!123";
    private static final String CHARS_TO_DELETE = "+()";
    private static final String ILLEGAL_PREFIX = "1650";
    private static final String[] ILLEGAL_CHARS = {"@", "<", ">"};
    private static final int USERNAME_LENGTH = 11;

    public boolean login(String username, String password) {
        return checkUserName(username) && VALID_PASSWORD.equals(password);
    }

    boolean checkUserName(String username) {
        username = StringUtils.deleteAny(username, CHARS_TO_DELETE);
        if (!checkUserNameLength(username)) {
            return false;
        }
        if (username.startsWith(ILLEGAL_PREFIX)) {
            return false;
        }
        if (Stream.of(ILLEGAL_CHARS).anyMatch(username::contains)) {
            return false;
        }
        return true;
    }

    private boolean checkUserNameLength(String username) {
        return username.length() == USERNAME_LENGTH;
    }
}
