package com.example.SpringApp2.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello I was injected using a property";
    }
}
