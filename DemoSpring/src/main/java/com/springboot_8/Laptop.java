package com.springboot_8;

public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("Laptop class object is created successfully...");
    }

    public void compile()
    {
        System.out.println("Compiling in Laptop...");
    }
}
