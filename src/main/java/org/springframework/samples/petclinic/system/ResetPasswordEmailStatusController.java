package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jared.li on 6/2/17.
 */
@Controller
public class ResetPasswordEmailStatusController {

    @RequestMapping(value = "/resetPasswordEmailStatus", method = RequestMethod.GET)
    public String resetPasswordEmailStatus(@ModelAttribute("phoneNumber") PhoneNumber phoneNumber, Model model) {
        /*
         * Validate phone number and extension number
         * Get email addr
         * Send email
         */
        Result result = new Result();
        result.setMessage(Result.MSG_SUCCESS);
        result.setKlass(Result.STYLE_SUCCESS);
        model.addAttribute(result);
        return "resetPasswordEmailStatus";
    }

    @ModelAttribute("phoneNumber")
    public PhoneNumber getPhoneNumber(){
        return new PhoneNumber();
    }

//    @ModelAttribute("result")
//    public Result getResult() {
//        return new Result();
//    }
}
