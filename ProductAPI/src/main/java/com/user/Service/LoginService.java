package com.user.Service;

import com.user.Exception.AdminException;
import com.user.Exception.CustomerException;
import com.user.Exception.LoginException;
import com.user.Model.LoginCustomer;
import com.user.Model.LoginDTO;

public interface LoginService {

	
	public LoginCustomer loginCustomer(LoginDTO dto, String role) throws LoginException, CustomerException, AdminException;
	
	public LoginCustomer logoutCustomer(String key) throws LoginException;
}
