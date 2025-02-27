package com.test.DemoApp.controller;

import com.test.DemoApp.model.Product;
import com.test.DemoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {
@Autowired
 ProductService service;


    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();

    }

}
