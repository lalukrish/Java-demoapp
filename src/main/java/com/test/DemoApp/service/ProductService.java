package com.test.DemoApp.service;

import com.test.DemoApp.model.Product;
import com.test.DemoApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List <Product>products =new ArrayList<>(
//            Arrays.asList(new Product(101,"1000",5000),new Product(102,"annaon",32222))
//    );


    public List<Product> getProducts(){
        //   return products;
        return  repo.findAll();

    }

    public Product getProductById(int prodId) {
       // return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();
        return repo.findById(prodId).orElseGet(() -> new Product(0, "Unknown", 0));
    }

    public void addProduct(Product prod) {
        //products.add(prod);
        System.out.println(prod);
        repo.save(prod);

    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdId()==prod.getProdId())
//                index=i;
//
//        products.set(index,prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdId()==prodId)
//                index=i;
//        products.remove(index );
        repo.deleteById(prodId);
    }
}
