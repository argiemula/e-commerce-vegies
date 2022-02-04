package com.society.developer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.developer.models.Product;
import com.society.developer.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAllProduct(){
		return productRepo.findAll();
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	
	public void removeProductById(Long id) {
		productRepo.deleteById(id);
	}
	
	public Optional<Product> findProductById(Long id){
		return productRepo.findById(id);
	}
	
	public List<Product> findAllProductByCategoryId(int id){
		return productRepo.findAllCategoryById(id);
	}
}
