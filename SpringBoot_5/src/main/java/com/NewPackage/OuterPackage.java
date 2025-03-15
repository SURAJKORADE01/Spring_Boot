package com.NewPackage;

import org.springframework.stereotype.Component;

@Component
public class OuterPackage
{
    public OuterPackage()
    {
        System.err.println("Object is created successfully...");
    }
}
