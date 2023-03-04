package com.example.sampleproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleproject.dao.CategoryChargeRepository;
import com.example.sampleproject.model.CategoryCharge;


@Service
public class CategoryChargeServiceImpl implements CategoryChargeService {
	
	@Autowired
	private CategoryChargeRepository categoryChargeRepository;

	@Override
	public CategoryCharge addCategoryCharge(CategoryCharge categoryCharge) {
		
		return categoryChargeRepository.save(categoryCharge);
	}

	@Override
	public CategoryCharge getCategoryChargeById(int id) {
		
		return categoryChargeRepository.getById(id);
	}
	

}
