package com.mycloud.api.mycloudapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @program: mycloud
 * @description: 测试接口
 * @author: zf
 * @create: 2019-03-14 14:45
 **/
@RestController
@RequestMapping(value = "/mycloudTest")
public class mycloudTestController {

    @RequestMapping(value = "/test1")
    public String test1(){
        return "这是我的第一个test";
    }

    @RequestMapping(value = "/test2/{name}")
    public String test2(@PathVariable("name") String name){
        System.out.println(name);
        return "这个名字叫"+name;
    }
}
