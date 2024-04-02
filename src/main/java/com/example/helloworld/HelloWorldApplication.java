package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("hello")
	public String hello() {
		System.out.println("Enetered the hello method");
		return "Hello from Java Springboot";
	}
	
	@RequestMapping("bye")
	public String bye() {
		System.out.println("Enetered the Bye method");
		return "Bye from Java Springboot";
	}
}
