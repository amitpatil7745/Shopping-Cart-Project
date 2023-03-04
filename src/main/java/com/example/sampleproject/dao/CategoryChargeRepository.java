package com.example.sampleproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sampleproject.model.CategoryCharge;


@Repository
public interface CategoryChargeRepository extends JpaRepository<CategoryCharge, Integer> {

}
