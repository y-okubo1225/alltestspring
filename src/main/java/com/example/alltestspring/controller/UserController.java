package com.example.alltestspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String thymeleafCheck(Model model) {

        model.addAttribute("message","Hello World");
        return "search.html";
    }
    
}
