package com.etiya.springboot.api.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.springboot.business.abstracts.ProductService;
import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.core.utilities.results.ErrorDataResult;
import com.etiya.springboot.core.utilities.results.Result;
import com.etiya.springboot.entities.concretes.Product;
import com.etiya.springboot.entities.requests.CreateProductRequest;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		
		return this.productService.getAll();
	}
	
	@GetMapping("/getbyproductname")
	public DataResult<List<Product>> getByProductName(String productName) {
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getbycategory")
	public DataResult<List<Product>> getByCategory(int categoryId) {
		return this.productService.getByCategory(categoryId);
	}
	
	@GetMapping("/getbyproductnameorcategory")
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId) {
		return this.productService.getByProductNameOrCategory_CategoryId(productName, categoryId);
	}
	
	@GetMapping("/getbycategoryin")
	public DataResult<List<Product>> getByCategory_CategoryIdIn(int[] categories) {
		List<Integer> params = new ArrayList<Integer>();
		for (Integer category : categories) {
			params.add(category);
		}
		
		return this.productService.getByCategory_CategoryIdIn(params);
	}
	
	@GetMapping("/getbycontains")
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getbyproductnamestartswith")
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return this.productService.getByProductNameStartsWith(productName);
	}

	@GetMapping("/getbynameandcategory")
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		
		return this.productService.getByNameAndCategory(productName, categoryId);
	}
	
	
	
	/*
	 * @PostMapping("/add") public Result add(@RequestBody Product product) {
	 * 
	 * return this.productService.add(product); }
	 */
	 
	
	
	  @PostMapping("/add") public Result add(@Valid @RequestBody
	  CreateProductRequest createProductRequest)
	  
	  { return this.productService.add(createProductRequest); }
	 
	 
	
	
	
	
	
	
}
