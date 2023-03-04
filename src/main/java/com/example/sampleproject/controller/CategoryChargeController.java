package com.example.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleproject.Service.CategoryChargeService;
import com.example.sampleproject.model.CategoryCharge;



@RestController
@RequestMapping("/CategoryCharges")
public class CategoryChargeController {
	
	@Autowired
	private CategoryChargeService categoryChargeService;
	
	@PostMapping("/saveCategoryCharge")
	public ResponseEntity<CategoryCharge> addCategoryCharge(@RequestBody CategoryCharge categoryCharge){
		
		CategoryCharge saveCategoryCharge = categoryChargeService.addCategoryCharge(categoryCharge);
		
		return ResponseEntity.ok().body(saveCategoryCharge);
		
		
	}

}
