package com.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Exception.OrderException;
import com.user.Model.Orders;
import com.user.Repo.OrderRepo;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo oRepo;

	@Override
	public Orders placeOrders(Orders order) throws OrderException {
		// TODO Auto-generated method stub
		
		if(order == null) {
			throw new OrderException("Order can not be null");
		}
		return oRepo.save(order);
	}

	@Override
	public Orders deleteOrders(Integer orderID) throws OrderException {
		// TODO Auto-generated method stub
		
		Orders order2 = oRepo.findById(orderID).orElseThrow(() -> new OrderException("Order Not available with ID : "+ orderID));
		
		oRepo.deleteById(orderID);
		return order2;
	}

	@Override
	public List<Orders> getAllOrders() throws OrderException {
		// TODO Auto-generated method stub
		List<Orders> list = oRepo.findAll();
		
		if(list.size() == 0) {
			throw new OrderException("Orders Not available in DataBase");
		}
		return list;
	}

}
