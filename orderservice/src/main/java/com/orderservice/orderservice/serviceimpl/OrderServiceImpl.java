package com.orderservice.orderservice.serviceimpl;

import com.orderservice.orderservice.entity.Order;
import com.orderservice.orderservice.feignclient.OrderFeign;
import com.orderservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OrderServiceImpl implements OrderService{

/*    @Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private OrderFeign orderFeign;
    @Override
    public Order getOrder() {
      // String object = restTemplate.getForObject("http://productservice/getproduct",String.class);
        String str = orderFeign.getProduct();
        System.out.print(str);
       return null;
    }

}
