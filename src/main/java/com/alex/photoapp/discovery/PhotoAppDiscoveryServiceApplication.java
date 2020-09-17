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
 *
 *  1. First start Eureka Discovery server ( PhotoAppDiscoveryServiceApplication.java app)
 *  2. Then starts PhotoAppApiUsersApplication application
 *  3. Open a browser and type => http://localhost:8010 will see the Eureka Dashboard
 *  4. You will see the application name users-ws
 *     settings are dome in application.properties for PhotoAppApiUsersApplication application
 *       spring.application.name=users-ws
 *  5. Click on running application status
 */
@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
	}

}
