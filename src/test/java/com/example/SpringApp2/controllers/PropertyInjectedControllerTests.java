package com.example.SpringApp2.controllers;

import com.example.SpringApp2.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTests {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.propertyGreetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        //assertEquals(1,2);
        assertEquals(GreetingServiceImpl.MESSAGE, propertyInjectedController.sayHello());
    }
}
