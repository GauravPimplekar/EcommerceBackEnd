package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Exception.OrderException;
import com.user.Model.Orders;
import com.user.Service.OrderService;

@RestController
public class OrderController {

	
	@Autowired
	OrderService oService;
	
	@PostMapping("/Orders")
	public Orders placeOrder(@RequestBody Orders order) throws OrderException {
		
		return oService.placeOrders(order);
	}
	
	@DeleteMapping("/Orders/{orderID}")
	public Orders deleteOrder(@PathVariable Integer orderID) throws OrderException {
		
		return oService.deleteOrders(orderID);
	}
	
	
	@GetMapping("/Orders")
	public List<Orders> getAllOrders() throws OrderException{
		
		return oService.getAllOrders();
	}
}
