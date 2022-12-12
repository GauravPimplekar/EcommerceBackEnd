package com.user.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Exception.AdminException;
import com.user.Exception.CustomerException;
import com.user.Exception.LoginException;
import com.user.Model.Admin;
import com.user.Model.Customer;
import com.user.Model.LoginCustomer;
import com.user.Model.LoginDTO;
import com.user.Repo.AdminRepo;
import com.user.Repo.CustomerRepo;
import com.user.Repo.LoginRepo;

import net.bytebuddy.utility.RandomString;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	CustomerRepo cRepo;
	
	@Autowired
	LoginRepo lRepo;
	
	@Autowired
	AdminRepo aRepo;
	
	
	@Override
	public LoginCustomer loginCustomer(LoginDTO dto, String role) throws CustomerException, AdminException {
		// TODO Auto-generated method stub
		String key = RandomString.make(8);
		
		if(role.equals("Customer")) {
			
			Customer cust = cRepo.findByEmail(dto.getEmail());
			
			if(cust == null) {
				throw new CustomerException("Customer Not Found with Email : "+ dto.getEmail());
			}
			
			LoginCustomer login = new LoginCustomer(cust.getId(), key, LocalDateTime.now(),role);
			
			return lRepo.save(login);
		}
		
		if(role.equals("Admin")) {
			
			Admin admin= aRepo.findByEmail(dto.getEmail());
			
			if(admin == null) {
				throw new AdminException("Admin Not Found with Email : "+ dto.getEmail());
			}
			
			
			LoginCustomer login = new LoginCustomer(admin.getId(), key, LocalDateTime.now(),role);
			return lRepo.save(login);
		}
		return null;
	}

	@Override
	public LoginCustomer logoutCustomer(String key) throws LoginException {
		// TODO Auto-generated method stub
		
		LoginCustomer login = lRepo.findByUuid(key);
		
		if(login == null) {
			throw new LoginException("Customer Not Login With Key : "+ key);
		}
		
		if(login.getRole().equals("admin")) {
			aRepo.deleteById(login.getUserId());
		}
		else {
			
			lRepo.deleteById(login.getUserId());
		}
		
		return login;
	}

}
