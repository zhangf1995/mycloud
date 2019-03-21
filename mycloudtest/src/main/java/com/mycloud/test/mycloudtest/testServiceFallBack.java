package com.mycloud.test.mycloudtest;

import org.springframework.stereotype.Component;

/**
 * @program: mycloud
 * @description: 熔断器断路回调类
 * @author: zf
 * @create: 2019-03-21 13:39
 **/
@Component
public class testServiceFallBack implements testService{
    @Override
    public String myTest3(String name) {
        return "error";
    }
}
