package org.springframework.samples.petclinic.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String renderLogin(){
        return "login/first_form";
    }


    @RequestMapping(value = "/login/email", method= RequestMethod.GET)
    public String renderEmailLogin(){
        return "login/email_login";
    }
}
