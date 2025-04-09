package com.orangehub.javacodespace.springapp.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/springapp")
public class SpringAppResource {
    
    @GetMapping("/startup")
    public String printApplicationServerStartup() {
        return "Server Started Successfully!";
    }
    
}
