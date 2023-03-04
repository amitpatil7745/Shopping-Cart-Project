package com.example.sampleproject.Service;

import com.example.sampleproject.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product updateProductById(Product product);
	
	public void deleteProductById(Integer productId);
	
	public Product getProductByID(Integer productID);
	
	

}
