package org.springframework.samples.petclinic.owner;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.*;

/**
 * Created by lance.zhou on 03/06/2017.
 */
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(name = "username")
    @NotEmpty
    private String username;

    @Column(name = "password")
    @NotEmpty
    private String password;

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
