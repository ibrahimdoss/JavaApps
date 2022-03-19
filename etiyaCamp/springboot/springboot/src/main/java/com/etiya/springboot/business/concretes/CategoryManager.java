package com.etiya.springboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.springboot.business.abstracts.CategoryService;
import com.etiya.springboot.core.utilities.business.BusinessRules;
import com.etiya.springboot.core.utilities.results.ErrorResult;
import com.etiya.springboot.core.utilities.results.Result;
import com.etiya.springboot.core.utilities.results.SuccessResult;
import com.etiya.springboot.dataAccess.abstracts.CategoryDao;
import com.etiya.springboot.entities.concretes.Category;

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



	@Override
	public Result add(Category category) {
		
		var result=BusinessRules.run(categoryNameCheck(category.getCategoryName()),
				checkCategoryCount(15));
		
		
		if(result!=null) {
			return result;
		}
		
		this.categoryDao.save(category);
		return new SuccessResult("Kategori Eklendi");
		
	}
		
	
	
	
	private Result categoryNameCheck(String categoryName) {
		
		if (this.categoryDao.existsCategoryByCategoryName(categoryName)) {
			return new ErrorResult("Kategori mevcut");
		}
		return new SuccessResult();
	}
	
	private Result checkCategoryCount(int limit) {
		
		if (this.categoryDao.count()> limit) {
			return new ErrorResult("Kategori sayısı 15'i geçemez");
		}
		
		return new SuccessResult();
	}
}
	
	
	


