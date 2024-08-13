package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="welcome-api")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
