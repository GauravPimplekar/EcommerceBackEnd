package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Exception.AdminException;
import com.user.Exception.CustomerException;
import com.user.Exception.LoginException;
import com.user.Model.LoginCustomer;
import com.user.Model.LoginDTO;
import com.user.Service.LoginService;

@RestController
public class LoginController {

	
	@Autowired
	LoginService lService;
	
	@PostMapping("/LogIn/{role}")
	public LoginCustomer loginService(@RequestBody LoginDTO dto, @PathVariable String role) throws LoginException, CustomerException, AdminException {
		
		return lService.loginCustomer(dto, role);
	}
	
	
	@GetMapping("/LogOut/{key}")
	public LoginCustomer logOutService(@PathVariable String key) throws LoginException {
		
		return lService.logoutCustomer(key);
	}
}
