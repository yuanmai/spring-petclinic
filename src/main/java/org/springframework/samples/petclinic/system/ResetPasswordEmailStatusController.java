package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jared.li on 6/2/17.
 */
@Controller
public class ResetPasswordEmailStatusController {

    private PhoneNumber phoneNumber;

    @RequestMapping("/resetPasswordEmailStatus")
    public String resetPassword(HttpServletRequest request) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneNumber(request.getParameter("phoneNumber"));
        phoneNumber.setExtensionNumber(request.getParameter("extensionNumber"));

        System.out.println(phoneNumber.getPhoneNumber());
        System.out.println(phoneNumber.getExtensionNumber());
        return "resetPasswordEmailStatus";
    }

    @ModelAttribute("phoneNumber")
    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }
}
