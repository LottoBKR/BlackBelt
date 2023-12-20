package com.bkr.blackbelt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bkr.blackbelt.models.User;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String homePage(@ModelAttribute("newUser") User user){
        return "home.jsp";
    }

}
