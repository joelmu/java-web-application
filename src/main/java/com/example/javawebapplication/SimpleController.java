package com.example.javawebapplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
