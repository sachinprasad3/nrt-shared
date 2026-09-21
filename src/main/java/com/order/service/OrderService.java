//package com.order.service;
//
//import java.time.LocalDateTime;
//
//import org.springframework.stereotype.Service;
//
//import com.order.dto.CreateOrderRequest;
//import com.order.entity.Order;
//import com.order.entity.Order.OrderStatus;
//import com.order.repository.OrderRepository;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class OrderService {
//	
//	private final OrderRepository orderRepository;
//	
//	public Order createOrder(CreateOrderRequest request) {
//		Order order = Order.builder()
//							.productId(request.productId())
//							.quantity(request.quantity())
//							.price(request.amount())
//							.status(OrderStatus.CREATED)
//							.createdAt(LocalDateTime.now())
//							.build();
//		
//		return orderRepository.save(order);
//	}
//	
//}
