package com.smart_contact_manager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/hello")
	public String hello() {
		return "Hello Developers this text is Coming from Spring Boot Backend";
	}
}
