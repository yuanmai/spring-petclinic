package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.domain.LoginForm;
import org.springframework.samples.petclinic.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alan.ye on 6/2/17.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String loginLandingPage() {
        return "unifiedLogin/login";
    }

    @RequestMapping(value = "/after-login", method = RequestMethod.POST)
    public String afterLoginPage(LoginForm loginForm, ModelMap model) {
        boolean isPassed = loginService.login(loginForm.getUsername(), loginForm.getPassword());
        if (isPassed) {
            return "unifiedLogin/afterlogin";
        }
        model.put("isLoginFail", true);
        return "unifiedLogin/login";
    }
}
