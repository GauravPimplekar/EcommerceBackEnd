package com.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Exception.CategoryException;
import com.user.Model.Category;
import com.user.Repo.CategoryRepo;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo cRepo;
	
	
	@Override
	public Category addCategory(Category cat) throws CategoryException {
		// TODO Auto-generated method stub
		
		if(cat == null) {
			throw new CategoryException("Please add Proper details");
		}
		
		return cRepo.save(cat);
	}

	@Override
	public Category updateCategory(Category cat) throws CategoryException {
		// TODO Auto-generated method stub
		
		Category cat2 = cRepo.findById(cat.getCategoryID()).orElseThrow(() -> new CategoryException("Category Not Available for updation"));
		
		return cRepo.save(cat);
	}

	@Override
	public Category deleteCategory(String categoryName) throws CategoryException {
		// TODO Auto-generated method stub
		
		Category category = cRepo.findByCategoryName(categoryName);
		if(category == null) {
			throw new CategoryException("Category Not available for deletation");
		}
		cRepo.deleteById(category.getCategoryID());
		return category;
	}

	@Override
	public List<Category> getCategoryList() throws CategoryException {
		// TODO Auto-generated method stub
		
		List<Category> list = cRepo.findAll();
		
		if(list.size() == 0) {
			throw new CategoryException("No Category Available in DataBase");
		}
		
		return list;
	}

}
