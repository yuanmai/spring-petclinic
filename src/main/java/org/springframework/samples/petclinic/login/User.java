package org.springframework.samples.petclinic.login;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.Column;

public class User extends BaseEntity{

    @Column(name = "phoneNumber")
    @NotEmpty
    private String phoneNumber;

    @Column(name = "extension")
    @NotEmpty
    private String extension;

    @Column(name = "password")
    @NotEmpty
    private String password;

    @Column(name = "password")
    @NotEmpty
    @Email(message = "invalid Email Address")
    private String email;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
