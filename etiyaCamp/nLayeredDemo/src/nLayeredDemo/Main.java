package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: SPRÝNG IOC ÝLE ÇÖZÜLECEK.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,1,"Elma",12,50);
		Product product1 = new Product(1,3,"kiraz",12,50);

		productService.add(product);
		productService.add(product1);
	}

}
