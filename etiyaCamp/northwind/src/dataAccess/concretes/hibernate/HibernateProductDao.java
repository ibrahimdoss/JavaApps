package dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

List<Product> products;
	
	public HibernateProductDao() {
		this.products=new ArrayList<Product>();
		this.products.add(new Product(1,1,"incir",5,"bir kasa",10));
		this.products.add(new Product(2,1,"üzüm",5,"bir kasa",10));

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
