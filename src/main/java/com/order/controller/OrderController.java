//package com.order.controller;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.order.dto.CreateOrderRequest;
//import com.order.entity.Order;
//import com.order.service.OrderService;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@RequestMapping("/api/orders")
//@Slf4j
//@RequiredArgsConstructor
//public class OrderController {
//	
//	private final OrderService orderService;
//	
//	@PostMapping
//	public Order createOrder(@RequestBody CreateOrderRequest request) {
//		
//		return orderService.createOrder(request);
//	}
//	
//}
