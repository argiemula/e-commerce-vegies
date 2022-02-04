package com.society.developer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.developer.models.Category;
import com.society.developer.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAllCategory(){
		return categoryRepo.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepo.save(category);
	}
	
	public void removeCategoryById(int id) {
		categoryRepo.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id) {
		return categoryRepo.findById(id);
	}
}
