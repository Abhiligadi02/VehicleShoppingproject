package com.springboot.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaOperation3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOperation3Application.class, args);
	}

}
