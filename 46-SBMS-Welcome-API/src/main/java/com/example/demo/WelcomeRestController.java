package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome to ASHOK IT...!!!";
		return msg;
	}

}
