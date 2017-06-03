package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(String username, Map<String, Object> model) {
        if ("110".equals(username)) {
            model.put("errorCode", "1");
            return "welcome";
        } else if ("122".equals(username)) {
            model.put("errorCode", "2");
            return "welcome";
        } else if ("123".equals(username)) {
            model.put("errorCode", "3");
            return "welcome";
        }

        return "redirect:/index";
    }

}
