package com.orderservice.orderservice.controller;

import com.orderservice.orderservice.entity.Order;
import com.orderservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder")
    public Order getOrder(){
       return orderService.getOrder();

    }
}
