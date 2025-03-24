package com.SpringBoot_73.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev
{
//    Method_1
//    @Autowired // It is called as Field Injection
    @Autowired
    private Computer comp;

//    Method_2 // This is called Constructor Injection
//    @Autowired -> Is By Default for the constructor
//    public Dev(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }

//    Method_3 // This is called Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }

    public void build()
    {
        comp.compile();
        System.out.println("Working on project...");
    }
}
