package org.springframework.samples.petclinic.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.RcUser;
import org.springframework.samples.petclinic.user.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    public String currentEmail;
    public String currentPhoneNumber;

    private final UserRepository userRepository;


    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String renderLogin(){
        return "login/first_form";
    }

    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public synchronized String login(@RequestParam String username){
        if(AccountUtils.isValidEmail(username)){
            currentEmail = username;
            return "redirect:login/email";
        }else{
            currentPhoneNumber = AccountUtils.parseAsCountryFormat(username);
            return "redirect:login/phone_number";
        }
    }


    @RequestMapping(value = "/login/email", method= RequestMethod.GET)
    public String renderEmailLogin(Map<String, Object> model){
        model.put("currentEmail", currentEmail);
        return "login/email_login";
    }

//    @RequestMapping(value={"email.json"})
//    public @ResponseBody String showEmailInfo(){
//        return currentEmail.get();
//    }

    @RequestMapping(value = "/login/email", method= RequestMethod.POST)
    public String emailLogin(@RequestParam String email,
                             @RequestParam String password){
        List<RcUser> searchResult = userRepository.findByEmailAndPassword(email,password);
        return searchResult.size() > 0 ? "redirect:success" : "redirect:fail";
    }

    @RequestMapping(value = "/login/phone_number", method= RequestMethod.GET)
    public String renderPhonNumberLogin(Map<String, Object> model){
        model.put("currentPhoneNumber", currentPhoneNumber);
        return "login/phone_number_login";
    }

    @RequestMapping(value = "/login/phone_number", method= RequestMethod.POST)
    public String phoneNumberLogin(@RequestParam String phoneNumber,
                                   @RequestParam String extension,
                                   @RequestParam String password){
        String plainPhoneNumber = AccountUtils.parseAsPlainNumber(phoneNumber);
        List<RcUser> searchResult = !StringUtils.hasText(extension)?userRepository.findByPhoneNumberAndPassword(plainPhoneNumber,password):userRepository.findByPhoneNumberExtAndPassword(plainPhoneNumber,password,extension);
        return !searchResult.isEmpty() ? "redirect:success" : "redirect:fail";
    }

    @RequestMapping(value = "/login/verify", method= RequestMethod.GET)
    public String verifyType() {
        return "redirect:/";
    }

    @RequestMapping(value = "/login/success", method= RequestMethod.GET)
    public String renderSuccessLogin(){
        return "login/success";
    }

    @RequestMapping(value = "/login/fail", method= RequestMethod.GET)
    public String renderFailLogin(){
        return "login/fail";
    }

}
