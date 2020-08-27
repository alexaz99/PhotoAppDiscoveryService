package com.alex.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**

 This is a Spring Cloud Eureka Discovery Server

 http://localhost:8761
 http://localhost:8761/actuator

 Steps to making work with String Netflix Eureka Discovery Server

 1. Start up a Eureka server
 2. Have microservices register (publish) using Eureka client
 3. Have microservices locate (consume) using Eureka client

 Spring Apps Examples:
 https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples

 * @EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
	}

}
