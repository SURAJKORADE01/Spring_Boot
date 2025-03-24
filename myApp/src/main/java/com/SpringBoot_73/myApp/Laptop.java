package com.SpringBoot_73.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer
{
    public void compile()
    {
        System.out.println("Compiling....");
    }

    public void build()
    {
        System.out.println("Building of application is started...");
    }
}
