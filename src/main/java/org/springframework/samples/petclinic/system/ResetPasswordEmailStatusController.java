package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public boolean isValidPhoneNumber(String phonenumber) {
        Pattern p = Pattern.compile("\\+?\\d\\s*\\(?\\d{3}\\)?\\s*\\d{3}\\s*[\\-\\s]?\\d{4}");
        Matcher m = p.matcher(phonenumber);
        return m.matches();
    }

    public boolean isValidExtension(String extension) {
        Pattern pattern = Pattern.compile("[1-9][0-9]{0,5}");
        Matcher isNum = pattern.matcher(extension);
        return isNum.matches();
    }
}
