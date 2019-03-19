package com.mycloud.test.mycloudtest;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    //@LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

/*    @Bean
    public IRule myRule(){
        return new RandomRule();
    }*/
}
