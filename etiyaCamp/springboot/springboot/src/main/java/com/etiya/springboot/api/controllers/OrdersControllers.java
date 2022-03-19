package com.etiya.springboot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.springboot.business.abstracts.OrderService;
import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.entities.concretes.Order;

@RestController
@RequestMapping("/api/orders")
public class OrdersControllers {
	
	private OrderService orderService;
	
	@Autowired
	public OrdersControllers(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Order>> getAll() {
		
		return this.orderService.getAll();
	}
	

}
