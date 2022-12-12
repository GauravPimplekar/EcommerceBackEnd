package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.Product;
import com.user.Service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService pService;
	
	
	@PostMapping("/addProdut")
	public Product addProduct(@RequestBody Product product) {
		
		return pService.addProduct(product);
	}
	
	
	@GetMapping("/getProduct/{productID}")
	public Product getProduct(@PathVariable Integer productID) {
		
		return pService.getProduct(productID);
	}
}
