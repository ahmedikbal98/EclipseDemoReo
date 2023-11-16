package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/say")
	public ResponseEntity<String> sayHello() {
		
		return new ResponseEntity<String>("Hello Ikbal Ahmed", HttpStatus.OK);
	}

}
