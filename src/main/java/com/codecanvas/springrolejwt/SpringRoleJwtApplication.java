package com.codecanvas.springrolejwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringRoleJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRoleJwtApplication.class, args);
	}

}
