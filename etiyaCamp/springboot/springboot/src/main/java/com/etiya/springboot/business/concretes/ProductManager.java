package com.etiya.springboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.springboot.business.abstracts.ProductService;
import com.etiya.springboot.core.utilities.business.BusinessRules;
import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.core.utilities.results.ErrorResult;
import com.etiya.springboot.core.utilities.results.Result;
import com.etiya.springboot.core.utilities.results.SuccessDataResult;
import com.etiya.springboot.core.utilities.results.SuccessResult;
import com.etiya.springboot.dataAccess.abstracts.ProductDao;
import com.etiya.springboot.entities.concretes.Category;
import com.etiya.springboot.entities.concretes.Product;
//import com.etiya.springboot.entities.dtos.ProductDetailDto;
import com.etiya.springboot.entities.requests.CreateProductRequest;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		List<Product> products= this.productDao.findAll();
		return new SuccessDataResult<List<Product>>(products,"ürünler listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductName(String productName) {
		List<Product> products= this.productDao.getByProductName(productName);
		return new SuccessDataResult<List<Product>>(products,"Ürün Adı Listelendi");
	}


	@Override
	public DataResult<List<Product>> getByCategory(int categoryId) {
		List<Product> products= this.productDao.getByCategory_CategoryId(categoryId);
		return new SuccessDataResult<List<Product>>(products,"category listelendi.");
	}


	@Override
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId) {
		List<Product> products= this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId);
		
		return new SuccessDataResult<List<Product>>(products,"Listelendi");
	}
	
	
	@Override
	public DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories) {
		List<Product> products = this.productDao.getByCategory_CategoryIdIn(categories);
		return new SuccessDataResult<List<Product>>(products, "ürünler başarıyla listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		List<Product> products= this.productDao.getByProductNameContains(productName);
		return new SuccessDataResult<List<Product>>(products,"ürünler başarıyla listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		List<Product> products= this.productDao.getByProductNameStartsWith(productName);
		
		return new SuccessDataResult<List<Product>>(products,"ürünler başarıyla listelendi");
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		List<Product>  products= this.productDao.getByNameAndCategory(productName, categoryId);
		return new SuccessDataResult<List<Product>>(products,"ürünler başarıyla listelendi");
	}

	/*
	 * @Override public DataResult<List<ProductDetailDto>>
	 * getProductWithCategoryDetails() {
	 * 
	 * List<ProductDetailDto> products =
	 * this.productDao.getProductWithCategoryDetails();
	 * 
	 * return new SuccessDataResult<List<ProductDetailDto>>(products,
	 * "ürünler başarıyla listelendi"); }
	 * 
	 */


	@Override
	public Result add(Product product) {
		
		var result=BusinessRules.run(productNameCheck(product.getProductName()),
				checkProductCountInCategory(product.getCategory().getCategoryId(), 10));
	
		if(result!=null) {
			return result;
		}
		
		this.productDao.save(product);
		return new SuccessResult("Ürün başarıyla eklendi");
		
		
	}

	private Result productNameCheck(String productName) {
		
		if (this.productDao.existsProductByProductName(productName)) {
			return new ErrorResult("Aynı isimde bir ürün mevcut!");
		}
		return new SuccessResult();
	}
	
	private Result checkProductCountInCategory(int caategoryId,int limit) {
		
		if (this.productDao.countByCategory_CategoryId(caategoryId)>limit) {
			
			return new ErrorResult("Ürün sayısı 10'u geçemez.");
		}
		return new SuccessResult();
		
	}


	@Override
	public Result add(CreateProductRequest createProductRequest) {
		
		Category category = new Category();
		category.setCategoryId(createProductRequest.getCategoryId());		
		
		
		
		Product product = new Product();
		product.setProductName(createProductRequest.getProductName());
		product.setQuantityPerUnit(createProductRequest.getQuantityPerUnit());
		product.setUnitPrice(createProductRequest.getUnitPrice());
		product.setUnitsInStock(createProductRequest.getUnitsInStock());
		product.setCategory(new Category());

		
		
		
		
		
		this.productDao.save(product);
		
		return new SuccessResult("ürün eklendi");
	}

	

	

}
