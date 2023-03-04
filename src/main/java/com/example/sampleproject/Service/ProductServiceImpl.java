package com.example.sampleproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleproject.dao.ProductRepository;
import com.example.sampleproject.model.Product;


@Service
public class ProductServiceImpl implements ProductService  {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}
	
	@Override
	public Product updateProductById(Product product) {
		
		return productRepository.save(product);
	}


	@Override
	public void deleteProductById(Integer productId) {
		
		productRepository.deleteById(productId);

	}

	@Override
	public Product getProductByID(Integer productID) {
		
		return productRepository.getById(productID);
	}
	






	

}
