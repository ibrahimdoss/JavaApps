package com.etiya.springboot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etiya.springboot.entities.concretes.Category;

@Repository
public interface CategoryDao  extends JpaRepository<Category, Integer>{
	
	boolean existsCategoryByCategoryName(String categoryName);

}	
