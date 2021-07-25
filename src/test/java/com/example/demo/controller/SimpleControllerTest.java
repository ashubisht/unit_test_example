package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleControllerTest {

    // SEE THE SIMPLE HANDLER
    // SUPPRESS THE INITIALIZER BLOCK

    private SimpleController simpleController;

    @BeforeTestClass
    public void setUp(){
        simpleController = new SimpleController();
    }

    @BeforeTestExecution
    public void prepare(){
        System.out.printf("Inside prepare");
    }

    @Test
    public void testHelloWorlsResturnsExcatResponse() {
        simpleController = new SimpleController(); // COMMENT THIS LINE
        String response = simpleController.helloWorld();
        Assertions.assertEquals("Hello World! This is a cool application", response); // This fails if new is not used
    }

}