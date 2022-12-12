package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	public Admin findByEmail(String email);

}
