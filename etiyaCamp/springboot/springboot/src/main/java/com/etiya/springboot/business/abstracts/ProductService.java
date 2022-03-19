package com.etiya.springboot.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.core.utilities.results.Result;
import com.etiya.springboot.entities.concretes.Product;
import com.etiya.springboot.entities.requests.CreateProductRequest;
//import com.etiya.springboot.entities.dtos.ProductDetailDto;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getByProductName(String productName);

	DataResult<List<Product>> getByCategory(int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories);
	  
	DataResult<List<Product>> getByProductNameContains(String productName);
	  
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	Result add(Product product);
	  
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	/*
	 * @Query("Select new com.etiya.springboot.entities.dtos.ProductDetailDto" +
	 * "(p.id, p.productName, c.categoryName) " +
	 * "From Category c Inner Join c.products p") DataResult<List<ProductDetailDto>>
	 * getProductWithCategoryDetails();
	 */
	  
	  //select p.productId,p.productName, c.categoryName  from Category c inner join Product p
	  //on c.categoryId = p.categoryId
		
	
	
	Result add(CreateProductRequest createProductRequest);
	

}
