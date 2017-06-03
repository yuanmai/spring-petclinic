package org.springframework.samples.petclinic.domain;

/**
 * Created by alan.ye on 6/2/17.
 */
public class LoginForm {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
