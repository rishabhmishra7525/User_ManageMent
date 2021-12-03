package com.neosoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackController {

	@GetMapping("/userservice")
	public String userService() {
		return "user Service is down";
	}
	@GetMapping("/departmentservice")
	public String departMentService() {
		return "departMentService Service is down";
	}
	@GetMapping("/lib")
	public String libraryService() {
		return "departMentService Service is down";
	}
}
