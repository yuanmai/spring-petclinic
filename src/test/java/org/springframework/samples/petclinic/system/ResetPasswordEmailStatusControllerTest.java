package org.springframework.samples.petclinic.system;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by coa.ke on 6/3/17.
 */
public class ResetPasswordEmailStatusControllerTest {
    @Test
    public void isValidPhoneNumberTest() {
        ResetPasswordEmailStatusController rpc = new ResetPasswordEmailStatusController();
        Assert.assertFalse(rpc.isValidPhoneNumber("+1650657489"));
        Assert.assertFalse(rpc.isValidPhoneNumber("+16506574895678"));
        Assert.assertFalse(rpc.isValidPhoneNumber("+159809678892"));
        Assert.assertFalse(rpc.isValidPhoneNumber("+1650657489$"));
        Assert.assertTrue(rpc.isValidPhoneNumber("+16506574890"));
    }

    @Test
    public void isValidExtensionTest() {
        ResetPasswordEmailStatusController rpc = new ResetPasswordEmailStatusController();
        Assert.assertFalse(rpc.isValidExtension("+1650657489"));
        Assert.assertFalse(rpc.isValidExtension("23234545"));
        Assert.assertFalse(rpc.isValidExtension("!@#13"));
        Assert.assertTrue(rpc.isValidExtension("1"));
    }
}
