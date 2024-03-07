package com.useproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UseproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseproductApplication.class, args);
	}
	@Bean
	RestTemplate resttemplate() {
		return new RestTemplate();
	}

}
