package business.concretes;

import java.util.List;

import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.jdbc.JdbcProductDao;
import entities.concretes.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	public List<Product> getAll(){
		//iþ kurallarý yazýlýr
		return this.productDao.getAll();

	}
}
