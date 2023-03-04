package com.example.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleproject.Service.CategoryChargeService;
import com.example.sampleproject.Service.ProductService;
import com.example.sampleproject.model.CategoryCharge;
import com.example.sampleproject.model.Product;
import com.example.sampleproject.model.ProductRes;



@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryChargeService categoryChargeService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product saveProduct = productService.addProduct(product);
		return ResponseEntity.ok().body(saveProduct);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<Product> updateProductById(@RequestBody Product product){
		Product updatePro = productService.updateProductById(product);
		return ResponseEntity.ok().body(updatePro);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable("id") Integer productId) {
		productService.deleteProductById(productId);
		return "Deleted Sucessfully !!";
	}
	
	@GetMapping("details/{id}")
	public ResponseEntity<ProductRes> getProductById(@PathVariable("id") Integer productId) {
		Product prod = productService.getProductByID(productId);
		CategoryCharge categoryCharge = categoryChargeService.getCategoryChargeById(productId);
		prod.setCategoryCharge(categoryCharge);
		ProductRes productRes = new ProductRes(prod);
		return ResponseEntity.ok().body(productRes);
	}
	
	
	
}
