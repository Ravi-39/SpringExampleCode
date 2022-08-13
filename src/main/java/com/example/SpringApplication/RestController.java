package com.example.SpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/home")
public class RestController {
	
	
	
	
	@GetMapping("name")
	public String getName() {
	
		return "Ravi Shankar";
	}

}
