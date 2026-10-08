package com.example.devopsDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemo1Application.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Hello from DevOps Demo App!"; //Changed remotely
	}

	@GetMapping("/status")
	public String status() {
		return "Application is running fine.";
	}
}
