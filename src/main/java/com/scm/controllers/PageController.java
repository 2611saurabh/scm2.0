package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


 


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

    //about  route

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

   


}
