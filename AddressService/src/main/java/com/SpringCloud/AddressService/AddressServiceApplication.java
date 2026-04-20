package com.SpringCloud.AddressService;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.SpringCloud.AddressService.Entity")
@EnableJpaRepositories("com.SpringCloud.AddressService.Repository")

public class AddressServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
