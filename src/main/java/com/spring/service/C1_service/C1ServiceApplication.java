package com.spring.service.C1_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class C1ServiceApplication {

	@Value("${service.instance.name}")
	private String instance;
	public static void main(String[] args) {
		SpringApplication.run(C1ServiceApplication.class, args);
	}
	
	@GetMapping(path="/")
	public String message() {
		return "Hello From " + instance;
	}

}
