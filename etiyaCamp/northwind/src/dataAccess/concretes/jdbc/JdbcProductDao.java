package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class JdbcProductDao implements ProductDao{

	List<Product> products;
	
	public JdbcProductDao() {
		this.products=new ArrayList<Product>();
		this.products.add(new Product(1,1,"elma",5,"bir kasa",10));
	}
	
	@Override
	public List<Product> getAll() {
		return this.products;
	}

	@Override
	public void add(Product entity) {
		this.products.add(entity);
	}

	@Override
	public void update(Product entity) {
		
	}

	@Override
	public void delete(Product entity) {
		
	}

}
