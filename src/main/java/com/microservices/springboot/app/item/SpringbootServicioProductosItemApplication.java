package com.microservices.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioProductosItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductosItemApplication.class, args);
	}
}
