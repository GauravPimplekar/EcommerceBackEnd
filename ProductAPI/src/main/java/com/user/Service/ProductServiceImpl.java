package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Model.Product;
import com.user.Repo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo pRepo;

	@Override
	public Product addProduct(Product product) {
		
		return pRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return null;
	}

	@Override
	public Product removeProduct(Product product) {
		
		return null;
	}

	@Override
	public Product getProduct(Integer productID) {
		
		return pRepo.findById(productID).get();
	}

}
