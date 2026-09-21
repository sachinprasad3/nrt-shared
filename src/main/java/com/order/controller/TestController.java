package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@GetMapping("/hi/{msg}")
	public String createOrder(@RequestParam("msg") String msg) {
		
		String str = "Hi..."+msg; 
		
		return str;
	}
	
}
