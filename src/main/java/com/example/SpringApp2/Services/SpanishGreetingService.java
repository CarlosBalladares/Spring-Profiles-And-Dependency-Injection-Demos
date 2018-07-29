package com.example.SpringApp2.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String greet() {
        return "Hola";
    }
}
