package com.mycloud.eureka.two.eurekaclienttwo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mycloud
 * @description: test
 * @author: zf
 * @create: 2019-03-19 09:34
 **/
@RestController
@RequestMapping(value = "/mycloudTest")
public class clientTwoTest {
    @RequestMapping(value = "/test1")
    public String test1(){
        return "这是我的第一个test";
    }

    @RequestMapping(value = "/test2/{name}")
    public String test2(@PathVariable("name") String name){
        System.out.println(name);
        return "client-two这个名字叫"+name;
    }
}
