package com.mycloud.test.mycloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MycloudtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudtestApplication.class, args);
	}

}
