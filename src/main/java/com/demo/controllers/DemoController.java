package com.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return ">>> Hello , Welcome";
	}
}
