package com.belembr.catalogov1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belembr.catalogov1.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	public ResponseEntity<Category> findAll(){
		return null;
	}

}
