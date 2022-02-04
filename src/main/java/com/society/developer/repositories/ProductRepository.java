package com.society.developer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.society.developer.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	public List<Product> findAllCategoryById(int id);
}
