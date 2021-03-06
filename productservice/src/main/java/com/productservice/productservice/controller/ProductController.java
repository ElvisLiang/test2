package com.productservice.productservice.controller;

import com.productservice.productservice.entity.Product;
import com.productservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value="/getproduct",method = RequestMethod.GET)
    public Product getProduct(){
        return  productService.getProduct();
    }
}
