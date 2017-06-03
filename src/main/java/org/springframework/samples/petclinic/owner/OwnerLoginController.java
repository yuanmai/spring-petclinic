//package org.springframework.samples.petclinic.owner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.Map;
//
///**
// * Created by IntelliJ IDEA.
// * User: jennifer.huang
// * Date: 6/2/2017
// */
//public class OwnerLoginController {
//    private final OwnerRepository owners;
//    @Autowired
//    public OwnerLoginController(OwnerRepository clinicService) {
//        this.owners = clinicService;
//    }
//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("owner", new Owner());
//        return "login/login";
//    }
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(Owner owner, BindingResult result, Map<String, Object> model)
//    {
//        Owner findResult = this.owners.findByLastNameAndPassword(owner.getLastName(), owner.getPassword());
//        if(null==findResult){
//            result.rejectValue("errorMessage", "notFound", "not found");
//            return "login/login";
//        }else{
//            return "redirect:/owners/"+findResult.getId();
//        }
//    }
//
//}
