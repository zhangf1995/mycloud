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
        return restTemplate.getForObject("http://server/mycloudTest/test1",String.class);
    }


    @RequestMapping("/test2")
    public String myTest2(){
        return "测试-.-";
    }

    @RequestMapping("/test3")
    public String myTest3(){
        return restTemplate.getForObject("http://server/mycloudTest/test2/{name}",String.class,"张三");
    }
}
