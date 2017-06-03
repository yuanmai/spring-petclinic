package org.springframework.samples.petclinic.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.UserEntity;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.user.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {

    public String currentEmail;


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
            return "redirect:login/phone_number";
        }
    }


    @RequestMapping(value = "/login/email", method= RequestMethod.GET)
    public String renderEmailLogin(){

        return "login/email_login";
    }

//    @RequestMapping(value={"email.json"})
//    public @ResponseBody String showEmailInfo(){
//        return currentEmail.get();
//    }

    @RequestMapping(value = "/login/email", method= RequestMethod.POST)
    public String emailLogin(@RequestParam String email,
                             @RequestParam String password){
        if(email.equals(password)){
            return "redirect:success";
        }else{
            return "redirect:fail";
        }
    }

    @RequestMapping(value = "/login/phone_number", method= RequestMethod.GET)
    public String renderPhonNumberLogin(){
        return "login/phone_number_login";
    }

    @RequestMapping(value = "/login/phone_number", method= RequestMethod.POST)
    public String phoneNumberLogin(@RequestParam String phoneNumber,
                                   @RequestParam String password){
        if(phoneNumber.equals(password)){
            return "redirect:success";
        }else{
            return "redirect:fail";
        }
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
