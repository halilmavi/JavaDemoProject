package com.demo.hm.api.controllers;

import com.demo.hm.business.abstracts.ProductService;
import com.demo.hm.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductService productService;
   @GetMapping("/getAll")
    public List<Product> getAll(){
        return this.productService.getAll();
    }
}
