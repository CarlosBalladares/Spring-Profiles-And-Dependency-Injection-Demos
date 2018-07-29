package com.example.SpringApp2.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
public class GermanGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hallo";
    }
}
