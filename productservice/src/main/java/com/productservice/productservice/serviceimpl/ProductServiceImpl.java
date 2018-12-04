package com.productservice.productservice.serviceimpl;

import com.productservice.productservice.dao.StatusProduct;
import com.productservice.productservice.entity.Product;
import com.productservice.productservice.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProduct() {

        return StatusProduct.getProduct();
    }
}
