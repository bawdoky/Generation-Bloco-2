package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return " Hello Familia 41! ";
	}
	
	
	
	@GetMapping ("/2")
	public String hello2() {
		return " Olá Familia 41! ";
	}

}
