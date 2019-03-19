package com.mycloud.test.ruleconfig;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

/**
 * @program: mycloud
 * @description: 我的ribbon负载均衡自定义规则
 * @author: zf
 * @create: 2019-03-19 14:51
 **/
public class MyRule extends AbstractLoadBalancerRule{
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        return null;
    }
}
