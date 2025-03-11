package com.SpringBootWithProject.Spring_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
    @GetMapping("/")
    public String hello()
    {
        return "Hello, Welcome to project...";
    }
}
