package com.pk.simpleCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.pk.simpleCRUD.repositories")
@EntityScan("com.pk.simpleCRUD.domain")
@SpringBootApplication
public class SimpleCrudPkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudPkApplication.class, args);
	}

}
