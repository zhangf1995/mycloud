package com.mycloud.test.mycloudtest;

import com.mycloud.test.ruleconfig.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@RibbonClient(name="server",configuration = MyRule.class)
public class MycloudtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudtestApplication.class, args);
	}

}
