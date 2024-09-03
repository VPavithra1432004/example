package com.boot.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingappApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greetings receive";
	}

}
