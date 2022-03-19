package com.etiya.northwindSpring.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.northwindSpring.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	//getBy || findBy
	List<Product> getByProductName(String productName);
	//select * from products where productName = @productName limit 1
	
	List<Product> getByCategory_CategoryId(int categoryId);	
	
	Product getById(int id);
}

//reflection

//postgre tablosu oluştur -> todo_app_db
//todos tablosu oluştur
//spring boot app oluştur
//swagger desteği getir
//getall
//getByUserId
//getByCompleted
