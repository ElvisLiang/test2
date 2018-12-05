package com.orderservice.orderservice.serviceimpl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.orderservice.orderservice.entity.Order;
import com.orderservice.orderservice.feignclient.OrderFeign;
import com.orderservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

/*    @Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private OrderFeign orderFeign;
    @Override
    @HystrixCommand(fallbackMethod = "getProduct2",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "10000")})
    public Order getOrder() {
      // String object = restTe mplate.getForObject("http://productservice/getproduct",String.class);
        Map<String,Object> product = orderFeign.getProduct();
        Order order = new Order();
        order.setId(1);
        order.setNum(1);
        order.setPid(Integer.parseInt(product.get("id").toString()));
        order.setPrices(Double.parseDouble(product.get("price").toString()));
        order.setProductname(product.get("name").toString());
        order.setUsername("Elvis");
       return order;
    }


    public Order getProduct2(){
        System.out.println("------------------------------报错了！！！！！！！！！！！！！！！");
        return null;
    }

}
