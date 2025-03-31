package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.forms.UserForm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


 


@Controller

public class PageController {

    @RequestMapping("/home")
    public String Home(Model model){

        System.out.println("Home Page Handler");
        //sending data to view
        model.addAttribute("name","substring technology");
        model.addAttribute("YoutubeChannel","Learn with technology");
        model.addAttribute("Github","https:/github.com/2611saurabh/cloneFootwear");
        
        return "home"; 
    }

    //about  rout

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", false);
        System.out.println("About Page Loading");
        return "about";
    }



    //services

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Service Page Loading");
        
        return "services";
    }

    @GetMapping("/login")
    public String loginPage() {
        return new String("login");
    }
    

    @GetMapping("/contact")
    public String contactPage() {
        return new String("contact");
    }
    

    @GetMapping("/register")
    public String registerPage(Model model) {
        UserForm userForm = new UserForm();
        //default data bhi daal skte hai
        userForm.setName("Saurabh");
        model.addAttribute("userForm", userForm);
        return new String("register");
    }
    

    // processing register

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processingRegister(@ModelAttribute UserForm userForm){
        System.out.println("do register");

        //here "redirect:/register" redirect use to go to page which written after that
        //fetech data from form
        //user form
        System.out.println(userForm);
        //validate data
        //save to database
        //userservice
        //messages = "Registration successful"
        return "redirect:/register";

    }

   


}
