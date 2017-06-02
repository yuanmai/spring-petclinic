package org.springframework.samples.petclinic.system;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jared.li on 6/2/17.
 */
public class ForgetPasswordController {
    @RequestMapping("/forgetPassword")
    public String forgetPassword() {
        return "forgetPassword";
    }
}
