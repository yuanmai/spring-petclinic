package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login() {
        return "redirect:/index";
    }
}
