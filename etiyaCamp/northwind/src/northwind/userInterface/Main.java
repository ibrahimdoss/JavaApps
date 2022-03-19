package northwind.userInterface;

import java.util.List;

import business.concretes.ProductManager;
import dataAccess.concretes.hibernate.HibernateProductDao;
import dataAccess.concretes.jdbc.JdbcProductDao;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		List<Product> products=productManager.getAll();
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
	}

}
