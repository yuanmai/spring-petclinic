package org.springframework.samples.petclinic.system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.owner.User;
import org.springframework.samples.petclinic.owner.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
class LoginController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(Map<String, Object> model, @RequestParam String username, String password){
        if (!isCredentialValid(username, password)) {
            model.put("errorCode", "1");
            return "welcome";
        }
        return "redirect:/index";
    }

    private boolean isCredentialValid(String username, String password){
        List<User> users = userRepository.findUsers(username);

        if(users.isEmpty() || users.size() >1){
            return false;
        }
        return isPasswordMath(password, users.get(0).getPassword());
    }

    private boolean isPasswordMath(String password,String passwordDb) {
        return passwordDb.equals(password);

    }

}
