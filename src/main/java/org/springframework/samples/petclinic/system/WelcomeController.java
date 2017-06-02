package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
class WelcomeController {

    static Map<String, String> map = new HashMap<>();

    {

    }

    @RequestMapping("/")
    public String welcome() {
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Map<String, Object> model) {
        return "redirect:/vets.html";
    }

}
