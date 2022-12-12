package com.user.Service;

import java.util.List;

import com.user.Exception.CategoryException;
import com.user.Model.Category;

public interface CategoryService {

	
	public Category addCategory(Category cat) throws CategoryException;
	
	public Category updateCategory(Category cat) throws CategoryException;
	
	public Category deleteCategory(String categoryName) throws CategoryException;
	
	public List<Category> getCategoryList() throws CategoryException;
	
}
