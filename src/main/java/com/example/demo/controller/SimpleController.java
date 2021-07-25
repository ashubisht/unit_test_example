package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    // This block is even more bad. Like kinda super bad. Even this I know :D
    static{
        System.out.println("This is static initializer block");
    }

    // THIS BELOW BLOCK IS BAD. I KNOW!
    {
        System.out.printf("This is an initializer block. Can we suppress this?" + System.lineSeparator() +
                "What if this app connects to external components in this block" + System.lineSeparator()) ;
    }

    private String template = "This is a cool application";

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World! " + template;
    }

}
