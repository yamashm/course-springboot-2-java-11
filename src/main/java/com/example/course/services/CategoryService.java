package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repostory;
	
	public List<Category> findAll(){
		return repostory.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repostory.findById(id);
		
		return obj.get();
	}
}
