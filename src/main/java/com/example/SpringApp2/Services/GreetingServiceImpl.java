package com.example.SpringApp2.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

    public static String MESSAGE = "hello";
    @Override
    public String greet() {
        return MESSAGE;
    }
}
