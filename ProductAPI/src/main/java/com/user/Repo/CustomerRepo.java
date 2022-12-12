package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	
	public Customer findByEmail(String email);
	
	
}
