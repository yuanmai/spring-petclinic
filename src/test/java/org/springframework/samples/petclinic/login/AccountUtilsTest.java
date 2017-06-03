package org.springframework.samples.petclinic.login;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountUtilsTest {

    @Test
    public void should_reconginze_valid_email(){
        assertEquals(true, AccountUtils.isValidEmail("XXX@rringcentral.com"));
        assertEquals(true, AccountUtils.isValidEmail("XXX123313+213@centralc.cc"));
    }

    @Test
    public void should_recongize_invalid_email_as_false(){
        assertEquals(false, AccountUtils.isValidEmail("XXX@rringcentral.c"));
        assertEquals(false, AccountUtils.isValidEmail("XXXcentral.ccc"));

    }

}
