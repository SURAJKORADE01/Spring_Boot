package com.SpringBoot_6.SpringBoot_6.controller;

import com.SpringBoot_6.SpringBoot_6.model.Product;
import com.SpringBoot_6.SpringBoot_6.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController

//In case of Spring Boot MVC -> Instead of RestController we have to use Controller
@org.springframework.stereotype.Controller

public class Controller
{
    @Autowired
    Service service;

    @GetMapping("/products")
    public String productList(Model model)
    {
//        service.getAllProducts() -> ithuen data yenar aani ui toh data "products" ne access karnar
        model.addAttribute("products", service.getAllProducts());
        return "products"; // view name -> html file name
//        create one file inside resources -> template -> with name products
    }
}
