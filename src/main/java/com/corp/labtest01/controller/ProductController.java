package com.corp.labtest01.controller;

import com.corp.labtest01.model.Product;
import com.corp.labtest01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/product")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/product/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
}
