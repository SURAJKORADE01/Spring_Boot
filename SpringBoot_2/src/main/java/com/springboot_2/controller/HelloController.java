package com.springboot_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/home")
    public String hello()
    {
        return "Hello Spring Boot...";
    }

    @GetMapping("/")
    public String sayName()
    {
        return "Hello Suraj Korade...";
    }
}
