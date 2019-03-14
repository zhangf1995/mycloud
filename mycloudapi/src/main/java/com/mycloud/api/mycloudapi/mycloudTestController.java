package com.mycloud.api.mycloudapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
