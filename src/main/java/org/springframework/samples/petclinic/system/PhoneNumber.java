package org.springframework.samples.petclinic.system;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.owner.Pet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import java.util.Set;

/**
 * Created by jared.li on 6/2/17.
 */
public class PhoneNumber {
    private String phoneNumber;
    private String extensionNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }
}
