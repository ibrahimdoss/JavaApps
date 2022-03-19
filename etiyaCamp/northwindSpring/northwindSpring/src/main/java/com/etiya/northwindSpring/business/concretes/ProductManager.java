package com.etiya.northwindSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.northwindSpring.business.abstracts.ProductService;
import com.etiya.northwindSpring.core.utilities.results.DataResult;
import com.etiya.northwindSpring.core.utilities.results.SuccessDataResult;
import com.etiya.northwindSpring.dataAccess.abstracts.ProductDao;
import com.etiya.northwindSpring.entities.concretes.Product;

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
		
		List<Product> products = this.productDao.findAll();
		
		return new SuccessDataResult<List<Product>>(products, "ürünler başarıyla listelendi");
		
	}

	//@Override
	//public List<Product> getAll() {
		// TODO Auto-generated method stub
		//return this.productDao.findAll();
	//}
	
	@Override
	public List<Product> getByProductName(String productName){
		return this.productDao.getByProductName(productName);
	}

	@Override
	public Product getById(int id) {
		return this.productDao.getById(id);
	}

	@Override
	public List<Product> getByCategory(int categoryId) {
		return this.productDao.getByCategory_CategoryId(categoryId);
	}

}
