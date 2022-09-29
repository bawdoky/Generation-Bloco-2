package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return " Olá mundo, \nMentalidade: Persistênci e Habilidade: Atenção aos detalhes! ";
	}
	
	
	
	@GetMapping ("/2")
	public String hello2() {
		return " Olá mundo,\nObjetivo de aprenizagem: Spring! ";
	}

}
