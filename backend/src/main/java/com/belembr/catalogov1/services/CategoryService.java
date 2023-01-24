package com.belembr.catalogov1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belembr.catalogov1.entities.Category;
import com.belembr.catalogov1.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		
		return categoryRepository.findAll();
		
	} 

}
