package com.example.todo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin("*") //security vec
public class HelloController {

    @GetMapping("/jaro")
    public String hello(){
        return "Čau lidi.";
    }

}
