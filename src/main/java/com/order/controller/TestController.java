package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@GetMapping("/hi")
	public String createOrder(@RequestParam("msg") String msg) {
		
		String str = "Hi..."+msg; 
		
		return str;
	}
	
	@GetMapping("/hello")
	public String helloMsg(@RequestParam("msg") String msg) {
		
		String str = "Hello My Dear..."+msg; 
		
		return str;
	}
	
	@GetMapping("/say-my-name")
	public String helloMsg2() {
		
		String str = "SHAZAM...."; 
		
		return str;
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		
		String str = "Welcome here for CI/CD with aws and jenkins"; 
		
		return str;
	}
}
