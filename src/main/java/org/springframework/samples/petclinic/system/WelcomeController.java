package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    @RequestMapping("/login")
    public String loginLandingPage() {
        return "unifiedLogin/login";
    }
    @RequestMapping("/afterLogin")
    public String afterLoginPage() {
        return "unifiedLogin/afterlogin";
    }
}
