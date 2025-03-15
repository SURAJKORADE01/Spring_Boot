package com.SpringBoot_5.SpringBoot_5;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class Config
{
    public Config()
    {
        System.err.println("Object is successfully created...");
    }

//    @RequestMapping(value = "home", method = RequestMethod.GET)
    @GetMapping("/home")
    public String hello()
    {
        return "Hello Spring Boot...!";
    }

    @GetMapping("/hello")
    public String hello_2()
    {
        return "Suraj Korade";
    }
}
