package com.SpringBoot_73.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{
    public void compile()
    {
        System.out.println("Desktop is running with speed 3.2 GHz");
    }
}
