package com.xi.cor.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping("/world")
    public String greetWorld(){
        return "Hello World";
    }

    @GetMapping("/person")
    public String greetTo(@RequestParam String name){
         return "Hello " + name;
    }
}
