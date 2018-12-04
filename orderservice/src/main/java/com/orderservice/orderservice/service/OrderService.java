package com.orderservice.orderservice.service;

import com.orderservice.orderservice.entity.Order;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

 public interface OrderService {
        Order getOrder();
}
