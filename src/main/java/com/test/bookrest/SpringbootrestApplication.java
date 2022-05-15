package com.test.bookrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.test.dao")
@EntityScan("com.test.Entity")
@ComponentScan({"com.test.bookrest","com.test.controller","com.test.dao.BookRepository","com.test.services"})
public class SpringbootrestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestApplication.class, args);
	}
}
//@ComponentScan({"com.test.bookrest",
//"com.test.controller","com.test.dao","com.test.services"})