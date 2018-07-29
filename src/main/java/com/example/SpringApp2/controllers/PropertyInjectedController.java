package com.example.SpringApp2.controllers;

import com.example.SpringApp2.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService propertyGreetingService;

    public String sayHello(){
        return propertyGreetingService.greet();
    }
}
