package com.ariel.ApiHexagonalExample.Infrastructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages =  "com.ariel.ApiHexagonalExample.Infrastructure")
@EntityScan(basePackages = "com.ariel.ApiHexagonalExample.Domain")
public class SpringBootService {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootService.class, args);
	}

}
