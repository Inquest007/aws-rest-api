package com.example.demo.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Awscntrlr {
	
	@GetMapping("/aws")
	public String awsFirst(){
		return "Welcome to AWS!!"; }
	
	@GetMapping("/")
	public String hello() {
		return "Hello Welcome Sanju!!";
	}

	

}
