package com.orderservice.orderservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("productservice")
public interface OrderFeign {

    @RequestMapping(value="/getproduct",method = RequestMethod.GET)
    public String getProduct();
}
