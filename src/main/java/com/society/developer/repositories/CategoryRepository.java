package com.society.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.society.developer.models.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
