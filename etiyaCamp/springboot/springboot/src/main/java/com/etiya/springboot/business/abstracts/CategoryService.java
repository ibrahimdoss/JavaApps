package com.etiya.springboot.business.abstracts;

import java.util.List;

import com.etiya.springboot.core.utilities.results.Result;
import com.etiya.springboot.entities.concretes.Category;

public interface CategoryService {
	
	List<Category> getAll();
	
	Result add(Category category);
}
