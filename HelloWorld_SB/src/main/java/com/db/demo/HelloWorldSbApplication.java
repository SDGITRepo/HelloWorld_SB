package com.db.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSbApplication.class, args);
		System.out.println("This is first spring boot projec");
	}

}
