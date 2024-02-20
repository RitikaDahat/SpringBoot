package com.validation.SpringValidation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @GetMapping("/form")
    public String openForm(){
        ModelAndView modelAndView = new ModelAndView("form"); // "form" is the name of your HTML file
        System.out.println("opening form");
        return "form";
    }
}
