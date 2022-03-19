package com.etiya.northwindSpring.business.abstracts;

import java.util.List;

import com.etiya.northwindSpring.core.utilities.results.DataResult;
import com.etiya.northwindSpring.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	
	List<Product> getByProductName(String productName);
	
	Product getById(int id);
	
	List<Product> getByCategory(int categoryId);

}

//Orders - list orders
//Employees
//Join Order And Employees -->> Order listelendiginde Employee gelsin
//Result - Data Result
