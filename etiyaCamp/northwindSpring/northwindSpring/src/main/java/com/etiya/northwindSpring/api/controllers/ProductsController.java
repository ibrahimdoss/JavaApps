package com.etiya.northwindSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.northwindSpring.business.abstracts.ProductService;
import com.etiya.northwindSpring.core.utilities.results.DataResult;
import com.etiya.northwindSpring.entities.concretes.Product;

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

	//@GetMapping("/sayhello")
	//public String sayHello() {
		//return "Hello";		
	//}
	
	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		
		//List<String> products = new ArrayList<String>();
		//products.add("Elma");
		//products.add("Armut");
		//return products;
		
		return this.productService.getAll();
	}
	
	@GetMapping("/getbyproductname")
	public List<Product> getByProductName(String productName) {
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getbycategory")
	public List<Product> getByCategory(int categoryId) {
		return this.productService.getByCategory(categoryId);
	}
	
	@GetMapping("/getbyid")
	public Product getById(int id) {
		return this.productService.getById(id);
	}
	
	

}
