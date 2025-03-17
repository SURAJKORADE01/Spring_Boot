package com.SpringBoot_6.SpringBoot_6.service;

import com.SpringBoot_6.SpringBoot_6.model.Product;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class Service
{
    List<Product> products = Arrays.asList(new Product(101, "Samsung", 90000.00),
            new Product(102, "IPhone 15",150000.00),
            new Product(103, "Realme", 40000.00));

    public List<Product> getAllProducts()
    {
        return products;
    }
}
