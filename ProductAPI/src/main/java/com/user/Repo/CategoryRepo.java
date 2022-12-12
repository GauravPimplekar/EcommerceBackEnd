package com.user.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	public Category findByCategoryName(String categoryName);
}
