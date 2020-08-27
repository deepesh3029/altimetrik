package com.altimetrik.app.restaurantinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class FoodManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodManagerServiceApplication.class, args);
	}

}
