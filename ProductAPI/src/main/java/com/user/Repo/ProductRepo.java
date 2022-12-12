package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
