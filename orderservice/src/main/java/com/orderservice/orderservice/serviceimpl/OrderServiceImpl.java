package com.orderservice.orderservice.serviceimpl;

import com.orderservice.orderservice.entity.Order;
import com.orderservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order getOrder() {
       String object = restTemplate.getForObject("http://localhost:8586/getproduct",String.class);
       return null;
    }
}
