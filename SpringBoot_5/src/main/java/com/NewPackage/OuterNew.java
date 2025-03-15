package com.NewPackage;

import org.springframework.stereotype.Component;

@Component
public class OuterNew
{
    public OuterNew()
    {
        System.err.println("OuterNew class's object is created...");
    }
}
