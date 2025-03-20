package com.telusko.SpringDataJPA_8.controller;

import com.telusko.SpringDataJPA_8.repository.ProductData;
import com.telusko.SpringDataJPA_8.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<ProductData> getProducts()
    {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public ProductData getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addDataIntoProduct(@RequestBody ProductData prodData)
    {
//        System.out.println(prodData);
        service.addProduct(prodData);
    }

    @PutMapping("/products")
    public void updateData(@RequestBody ProductData prodData)
    {
        service.updateDataIntoDatabase(prodData);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteData(@PathVariable int prodID)
    {
        service.deleteDataFromDatabase(prodID);
    }
}
