package com.example.project4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class IndexController {

    @GetMapping
    public String showHello(){
        //model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
        return "hello";
    }
}