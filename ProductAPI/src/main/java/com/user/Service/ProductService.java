package com.user.Service;

import com.user.Model.Product;

public interface ProductService {

	public Product getProduct(Integer productID);
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product removeProduct(Product product);
}
