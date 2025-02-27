package com.test.DemoApp.service;

import com.test.DemoApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List <Product>products = Arrays.asList(new Product(101,"1000",5000),new Product(102,"annaon",32222));

    public List<Product> getProducts(){
        return products;

    }
}
