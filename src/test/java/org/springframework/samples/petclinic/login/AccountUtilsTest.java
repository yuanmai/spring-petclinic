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

    @Test
    public void should_recongize_valid_phone_number(){
        assertEquals(true, AccountUtils.isValidPhoneNumber("16502650531"));
        assertEquals(true, AccountUtils.isValidPhoneNumber("+1(650)2650531"));
        assertEquals(true, AccountUtils.isValidPhoneNumber("165026505"));
//        assertEquals(false, AccountUtils.isValidPhoneNumber("XXX@rringcentral.c"));
    }

    @Test
    public void should_recongize_extension_number(){
        assertEquals("(650) 265-0531", AccountUtils.parseAsCountryFormat("1 6502650531"));
    }

    @Test
    public void should_return_number_as_plain_number(){
        assertEquals("8885287464", AccountUtils.parseAsPlainNumber("(888)528-7464"));
        assertEquals("8887776666", AccountUtils.parseAsPlainNumber("(888)777-6666"));
    }

}
