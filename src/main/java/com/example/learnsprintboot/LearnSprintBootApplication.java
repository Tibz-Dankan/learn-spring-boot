package com.example.learnsprintboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnSprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSprintBootApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello world";
	}

}
