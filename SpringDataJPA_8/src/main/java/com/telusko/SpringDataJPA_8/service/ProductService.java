package com.telusko.SpringDataJPA_8.service;

import com.telusko.SpringDataJPA_8.repository.ProductData;
import com.telusko.SpringDataJPA_8.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepo repo;

    public List<ProductData> getProducts()
    {
        return repo.findAll();
    }

    public ProductData getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new ProductData());
    }

    public void addProduct(ProductData prod)
    {
        repo.save(prod);
    }

    public void updateDataIntoDatabase(ProductData prodData)
    {
        repo.save(prodData);
    }

    public void deleteDataFromDatabase(int prodID)
    {
        repo.deleteById(prodID);
    }
}
