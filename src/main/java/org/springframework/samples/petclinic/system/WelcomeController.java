package org.springframework.samples.petclinic.system;


import org.springframework.samples.petclinic.owner.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
class WelcomeController {

    static boolean isLogin = false;
    static Map<String, String> map = new HashMap<>();

    {
        map.put("admin", "admin123");
    }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("isLogin", isLogin);
        model.put("userName", "Welcome admin");
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(User user, Map<String, Object> model) {
        if (map.containsKey(user.getUserName()) && map.get(user.getUserName()).equals(user.getPassword())) {
            isLogin = true;
            return "redirect:/vets.html";
        } else {
            model.put("hasError", 1);
            model.put("error", "Incorrect userName or password.");
        }
        return "login/login";
    }

}
