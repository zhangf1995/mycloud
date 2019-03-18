package com.mycloud.eureka.server.two.mycloudeurekaservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MycloudEurekaServerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudEurekaServerTwoApplication.class, args);
	}

}
