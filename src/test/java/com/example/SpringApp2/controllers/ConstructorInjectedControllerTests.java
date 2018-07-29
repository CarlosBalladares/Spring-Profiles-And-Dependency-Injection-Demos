package com.example.SpringApp2.controllers;

import com.example.SpringApp2.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTests {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        //assertEquals(1,2);
        assertEquals(GreetingServiceImpl.MESSAGE, constructorInjectedController.sayHello());
    }
}
