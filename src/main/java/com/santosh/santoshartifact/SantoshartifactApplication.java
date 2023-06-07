package com.santosh.santoshartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SantoshartifactApplication {

	@GetMapping("/path")
	public String welcome() {
		return "Welcome Santosh";
	}

	public static void main(String[] args) {
		SpringApplication.run(SantoshartifactApplication.class, args);
	}

}



