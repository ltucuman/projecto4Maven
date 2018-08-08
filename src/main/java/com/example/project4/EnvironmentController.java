package com.example.project4;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {
    @Autowired
    private Environment environment;

    @GetMapping("/environment")
    public String env(){
        return "estoy en el ambiente:"+ environment.getActiveProfiles()[0];
    }
}
