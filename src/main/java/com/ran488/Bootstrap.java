package com.ran488;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:integration-flow.xml")
public class Bootstrap {

	/**
	 * Entry point into the Spring boot application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}

}
