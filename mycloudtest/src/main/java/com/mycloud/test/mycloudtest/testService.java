package com.mycloud.test.mycloudtest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server",fallback = testServiceFallBack.class)
public interface testService {
    @RequestMapping(value="/mycloudTest/test2/{name}")
    public String myTest3(@PathVariable("name") String name);
}
