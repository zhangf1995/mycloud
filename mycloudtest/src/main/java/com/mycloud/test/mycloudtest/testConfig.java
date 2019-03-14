package com.mycloud.test.mycloudtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: mycloud
 * @description: test配置类
 * @author: zf
 * @create: 2019-03-14 14:39
 **/
@Configuration
public class testConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
