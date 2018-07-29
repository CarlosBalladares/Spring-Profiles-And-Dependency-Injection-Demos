package com.example.SpringApp2.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello I was injected using a constructor";
    }
}
