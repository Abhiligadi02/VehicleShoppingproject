package com.springboot.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurecaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServer1Application.class, args);
	}

}
