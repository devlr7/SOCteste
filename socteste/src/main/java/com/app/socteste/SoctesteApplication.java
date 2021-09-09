package com.app.socteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication (scanBasePackages = {"com.app.socteste.controller"})
@EntityScan(basePackages = {"com.app.socteste.model" })
@EnableAutoConfiguration
public class SoctesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoctesteApplication.class, args);
		
	}

}
