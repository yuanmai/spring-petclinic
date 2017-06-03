package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        isValidPhoneNumber(phoneNumber.getPhoneNumber());
        isValidExtension(phoneNumber.getExtensionNumber());
        return "resetPasswordEmailStatus";
    }

    @ModelAttribute("phoneNumber")
    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }

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
