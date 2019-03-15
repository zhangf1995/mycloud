package com.eureka.service.mycloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MycloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudEurekaServerApplication.class, args);
	}

}
