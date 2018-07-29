package com.example.SpringApp2.controllers;

import com.example.SpringApp2.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;


    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        //System.out.println("hello");
        return "foo";
    }
}
