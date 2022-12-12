package com.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Exception.CustomerException;
import com.user.Model.Customer;
import com.user.Repo.CustomerRepo;
import com.user.Repo.LoginRepo;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo cRepo;
	
	@Autowired
	LoginRepo lRepo;
	
	
	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		
		if(customer == null) {
			throw new CustomerException("Add validate Customer details");
		}
		
		return cRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Customer customer2 = cRepo.findById(customer.getId()).orElseThrow(() -> new CustomerException("Customer Not Found for updatation"));
		return cRepo.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		
		Customer customer = cRepo.findById(customerId).orElseThrow(() -> new CustomerException("Customer Not Found for updatation"));
		
		return customer;
	}
	
	
	@Override
	public List<Customer> getCustomerList() throws CustomerException {
		// TODO Auto-generated method stub
		
		List<Customer> list = cRepo.findAll();
		
		if(list.size() == 0) {
			throw new CustomerException("Customers Not available");
		}
		
		return list;
	}
	
	
	@Override
	public Customer deleteCustomer(String email) throws CustomerException {
		// TODO Auto-generated method stub
		
		Customer customer = cRepo.findByEmail(email);
		
		if(customer == null) {
			throw new CustomerException("Customers Not available with Email : "+email);
		}
		
		cRepo.deleteById(customer.getId());
		
		return customer;
	}

}
