package com.etiya.northwindSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.northwindSpring.business.abstracts.CategoryService;
import com.etiya.northwindSpring.dataAccess.abstracts.CategoryDao;
import com.etiya.northwindSpring.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService {
	
	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Category> getAll() {
		return this.categoryDao.findAll();
	}
	

}
