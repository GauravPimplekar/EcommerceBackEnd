package com.user.Service;

import java.util.List;

import com.user.Exception.CustomerException;
import com.user.Model.Customer;

public interface CustomerService {

	
	public Customer registerCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer) throws CustomerException;
	
	public Customer getCustomerById(Integer customerId) throws CustomerException;
	
	public List<Customer> getCustomerList() throws CustomerException;
	
	public Customer deleteCustomer(String email)  throws CustomerException;
	
}
