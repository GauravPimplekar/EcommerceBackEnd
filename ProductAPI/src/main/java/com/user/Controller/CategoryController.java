package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Exception.CategoryException;
import com.user.Model.Category;
import com.user.Service.CategoryService;

@RestController
public class CategoryController {

	
	@Autowired
	CategoryService cService;
	
	@PostMapping("/Category")
	public Category addCategory(@RequestBody Category category) throws CategoryException {
		
		return cService.addCategory(category);
	}
	
	@PutMapping("/Category")
	public Category updateCategory(@RequestBody Category category) throws CategoryException {
		
		return cService.updateCategory(category);
	}
	
	@DeleteMapping("/Category/{categoryName}")
	public Category deleteCategory(@PathVariable String categoryName) throws CategoryException {
		
		return cService.deleteCategory(categoryName);
	}
	
	@GetMapping("/Category")
	public List<Category> getCategoryList() throws CategoryException {
		
		return cService.getCategoryList();
	}
}
