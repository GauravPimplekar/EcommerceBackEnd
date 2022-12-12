package com.user.Service;

import java.util.List;

import com.user.Exception.OrderException;
import com.user.Model.Orders;

public interface OrderService {

	public Orders placeOrders(Orders order) throws OrderException;
	
	public Orders deleteOrders(Integer orderID) throws OrderException;
	
	public List<Orders> getAllOrders() throws OrderException;
}
