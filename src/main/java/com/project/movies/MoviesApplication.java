package com.project.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {
	public String PORT=System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
}
