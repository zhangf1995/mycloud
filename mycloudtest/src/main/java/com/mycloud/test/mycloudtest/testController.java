package com.mycloud.test.mycloudtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: mycloud
 * @description: 测试一哈
 * @author: zf
 * @create: 2019-03-14 14:59
 **/
@RestController
@RequestMapping(value = "/test")
public class testController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test1")
    public String mytest(){
        return restTemplate.getForObject("http://127.0.0.1:8001/mycloudTest/test1",String.class);
    }

}
