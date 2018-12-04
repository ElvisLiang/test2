package com.productservice.productservice.dao;

import com.productservice.productservice.entity.Product;

public class StatusProduct {
    public static Product getProduct(){
        Product product = new Product(1,"手机",13);
        return product;
    }

}
