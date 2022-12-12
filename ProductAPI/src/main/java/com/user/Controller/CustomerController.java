package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Exception.CustomerException;
import com.user.Model.Customer;
import com.user.Service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService cService;
	
	@PostMapping("/Customer")
	public Customer registerCustomer(@RequestBody Customer customer) throws CustomerException {
		
		
		return cService.registerCustomer(customer);
	}
	
	@PutMapping("/Customer")
	public Customer updateCustomer(@RequestBody Customer customer) throws CustomerException {
		
		return cService.updateCustomer(customer);
	}
	
	@DeleteMapping("/Customer/{email}")
	public Customer deleteCustomer(@PathVariable String email) throws CustomerException {
		
		return cService.deleteCustomer(email);
	}
	
	@GetMapping("/Customer/{customerID}")
	public Customer getCustomerById(@PathVariable Integer customerID) throws CustomerException {
		
		return cService.getCustomerById(customerID);
	}
	
	@GetMapping("/Customer")
	public List<Customer> getCustomerList() throws CustomerException{
		
		return cService.getCustomerList();
	}
}
