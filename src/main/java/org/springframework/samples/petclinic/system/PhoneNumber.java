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
    @Column(name = "account")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String accountNumber;

    @Column(name = "extensionNumber")
    @Digits(fraction = 0, integer = 3)
    private String extensionNumber;
}
