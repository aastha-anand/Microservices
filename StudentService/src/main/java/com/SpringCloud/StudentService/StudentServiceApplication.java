package com.SpringCloud.StudentService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.SpringCloud.StudentService.Entity")
@EnableJpaRepositories("com.SpringCloud.StudentService.Repository")
@EnableFeignClients("com.SpringCloud.StudentService.FeignClientInterface")

public class StudentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentServiceApplication.class, args);
	}


}
