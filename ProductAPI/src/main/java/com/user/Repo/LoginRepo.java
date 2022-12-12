package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.LoginCustomer;

public interface LoginRepo extends JpaRepository<LoginCustomer, Integer> {

		
	public LoginCustomer findByUuid(String key);
}
