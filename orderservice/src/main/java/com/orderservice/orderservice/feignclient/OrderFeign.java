package com.orderservice.orderservice.feignclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderservice.orderservice.fallback.orderfallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "productservice",fallback = orderfallback.class)
public interface OrderFeign {

    @RequestMapping(value="/getproduct",method = RequestMethod.GET)
    public Map getProduct();

}
