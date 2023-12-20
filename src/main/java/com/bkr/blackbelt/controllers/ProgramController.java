package com.bkr.blackbelt.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/programs")
public class ProgramController {

    @GetMapping("")
    public String dashboard(HttpSession session){
        return "programs/dashboard.jsp";
    }
}
