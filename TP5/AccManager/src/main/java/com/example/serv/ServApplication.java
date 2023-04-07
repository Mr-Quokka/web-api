package com.example.serv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.example.serv")
@EnableJpaRepositories
@SpringBootApplication
public class ServApplication {

	public static void main(String[] args) {
            SpringApplication.run(ServApplication.class, args);
	}

}
