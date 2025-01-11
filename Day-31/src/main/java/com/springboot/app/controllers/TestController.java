package com.springboot.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/user")
	public String userAccess() {
		return "User Page";
	}

	@GetMapping("/hr")
	public String hrAccess() {
		return "HR Page.";
	}

	@GetMapping("/admin")
	public String adminAccess() {
		return "Admin Page.";
	}
}
