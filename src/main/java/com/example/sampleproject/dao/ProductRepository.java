package com.example.sampleproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sampleproject.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
