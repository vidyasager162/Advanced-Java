package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TomcatController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!";
	}
}
