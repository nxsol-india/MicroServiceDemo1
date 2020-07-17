package com.nxpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.nxpert.repository.RemoteRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientMicroserviceServerApplication {
	
	public static final String USER_SERVICE_URL = "http://USER-MICROSERVICE";
	public static final String COURSE_SERVICE_URL = "http://COURSE-MICROSERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(ClientMicroserviceServerApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public RemoteRepository Repository(){
		return new RemoteRepository(USER_SERVICE_URL,COURSE_SERVICE_URL);
	}
}
