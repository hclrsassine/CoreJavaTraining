package com.rachid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RachidController {
	
	@GetMapping("/")//restful endpoints
	public String display()
	{
		return "Welcome to world of spring boot";
	}
}
