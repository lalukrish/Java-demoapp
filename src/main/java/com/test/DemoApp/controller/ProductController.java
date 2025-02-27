package com.test.DemoApp.controller;

import com.test.DemoApp.model.Product;
import com.test.DemoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {
@Autowired
 ProductService service;


    @GetMapping ("/products")
    public List<Product> getProducts(){
        return service.getProducts();

    }
    @GetMapping("/products/{prodId}")
    public  Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }
 @PutMapping("/product")
    public  void  updateProduct(@RequestBody Product prod){
     System.out.println(prod);

     service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);

    }
}
